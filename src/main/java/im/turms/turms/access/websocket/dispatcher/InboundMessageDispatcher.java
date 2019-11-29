/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.turms.access.websocket.dispatcher;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import im.turms.turms.annotation.websocket.TurmsRequestMapping;
import im.turms.turms.cluster.TurmsClusterManager;
import im.turms.turms.common.SessionUtil;
import im.turms.turms.common.TurmsLogger;
import im.turms.turms.common.TurmsStatusCode;
import im.turms.turms.constant.DeviceType;
import im.turms.turms.exception.TurmsBusinessException;
import im.turms.turms.plugin.ClientRequestHandler;
import im.turms.turms.plugin.TurmsPluginManager;
import im.turms.turms.pojo.bo.RequestResult;
import im.turms.turms.pojo.bo.TurmsRequestWrapper;
import im.turms.turms.pojo.notification.TurmsNotification;
import im.turms.turms.pojo.request.TurmsRequest;
import im.turms.turms.service.message.OutboundMessageService;
import im.turms.turms.service.user.onlineuser.OnlineUserService;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.socket.CloseStatus;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.function.Function;


@Service
public class InboundMessageDispatcher {
    private final OutboundMessageService outboundMessageService;
    private final OnlineUserService onlineUserService;
    private final TurmsClusterManager turmsClusterManager;
    private final TurmsPluginManager turmsPluginManager;
    private EnumMap<TurmsRequest.KindCase, Function<TurmsRequestWrapper, Mono<RequestResult>>> router;

    public InboundMessageDispatcher(ApplicationContext context, OutboundMessageService outboundMessageService, OnlineUserService onlineUserService, TurmsClusterManager turmsClusterManager, TurmsPluginManager turmsPluginManager) {
        router = new EnumMap<>(TurmsRequest.KindCase.class);
        this.outboundMessageService = outboundMessageService;
        Map<String, Object> beans = context.getBeansWithAnnotation(TurmsRequestMapping.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            Function<TurmsRequestWrapper, Mono<RequestResult>> callback = (Function<TurmsRequestWrapper, Mono<RequestResult>>) entry.getValue();
            TurmsRequestMapping mapping = getMapping(callback, entry.getKey());
            if (mapping != null) {
                router.put(mapping.value(), callback);
            }
        }
        this.onlineUserService = onlineUserService;
        this.turmsClusterManager = turmsClusterManager;
        this.turmsPluginManager = turmsPluginManager;
    }

    private TurmsRequestMapping getMapping(Function<TurmsRequestWrapper, Mono<RequestResult>> request, String methodName) {
        String className = request.getClass().getName().split("\\$")[0];
        try {
            Class<?> targetClass = getClass().getClassLoader().loadClass(className);
            return (TurmsRequestMapping) targetClass.getMethod(methodName).getAnnotations()[0];
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            return null;
        }
    }

    public Mono<WebSocketMessage> dispatch(@NotNull WebSocketSession session, @NotNull WebSocketMessage webSocketMessage) {
        Long userId = SessionUtil.getUserIdFromSession(session);
        DeviceType deviceType = SessionUtil.getDeviceTypeFromSession(session);
        if (userId != null) {
            if (!turmsClusterManager.isWorkable()) {
                onlineUserService.setLocalUserOffline(userId, CloseStatus.NOT_ACCEPTABLE);
                return Mono.empty();
            }
            onlineUserService.resetHeartbeatTimeout(userId, deviceType);
            switch (webSocketMessage.getType()) {
                case BINARY:
                    return handleBinaryMessage(webSocketMessage, session);
                case TEXT:
                case PING:
                case PONG:
                default:
                    return Mono.just(session.pongMessage(DataBufferFactory::allocateBuffer));
            }
        } else {
            session.close(CloseStatus.SERVER_ERROR).subscribe();
            throw new NoSuchElementException("UserId is missing in session");
        }
    }

    private Mono<Boolean> handleResultsForRecipients(
            @NotNull RequestResult requestResult,
            @NotNull WebSocketSession session,
            @Nullable Long requesterId) {
        TurmsRequest dataForRecipients = requestResult.getDataForRecipients();
        if (dataForRecipients != null && !requestResult.getRecipients().isEmpty()) {
            final byte[][] dataInBytes = new byte[1][1];
            WebSocketMessage messagesForRecipients = session
                    .binaryMessage(dataBufferFactory -> {
                        TurmsNotification.Builder builder = TurmsNotification
                                .newBuilder()
                                .setRelayedRequest(dataForRecipients);
                        if (requesterId != null) {
                            builder.setRequesterId(Int64Value.newBuilder().setValue(requesterId).build());
                        }
                        dataInBytes[0] = builder.buildPartial().toByteArray();
                        return dataBufferFactory.wrap(dataInBytes[0]);
                    });
            boolean onlyOneRecipient = requestResult.getRecipients().size() == 1;
            if (onlyOneRecipient) {
                Long recipientId = requestResult.getRecipients().iterator().next();
                return outboundMessageService.relayClientMessageToClient(
                        messagesForRecipients,
                        dataInBytes[0],
                        recipientId,
                        true);
            } else {
                List<Mono<Boolean>> monos = new LinkedList<>();
                for (Long recipientId : requestResult.getRecipients()) {
                    Mono<Boolean> mono = outboundMessageService.relayClientMessageToClient(
                            messagesForRecipients,
                            dataInBytes[0],
                            recipientId,
                            true);
                    monos.add(mono);
                }
                return Mono.zip(monos, results -> results)
                        .map(results -> BooleanUtils.and((Boolean[]) results));
            }
        } else {
            return Mono.just(true);
        }
    }

    /**
     * Transfers RequestResult to WebSocketMessage.
     * Scenario 1: Mono<RequestResult> return a RequestResult object -> TurmsStatusCode.getCode()
     * Scenario 2: Mono<RequestResult> is Mono.empty() -> TurmsStatusCode.NO_CONTENT
     * Scenario 3: Mono<RequestResult> throw a TurmsBusinessException -> TurmsStatusCode.getCode()
     * Scenario 3: Mono<RequestResult> throw an exception of other types -> TurmsStatusCode.SERVER_INTERNAL_ERROR
     */
    private Mono<WebSocketMessage> handleResult(
            @NotNull WebSocketSession session,
            @NotNull Mono<RequestResult> result,
            @Nullable Long requestId,
            @Nullable Long requesterId) {
        return result
                .defaultIfEmpty(RequestResult.NOT_FOUND)
                .onErrorResume(throwable -> {
                    if (throwable instanceof TurmsBusinessException) {
                        TurmsStatusCode code = ((TurmsBusinessException) throwable).getCode();
                        RequestResult requestResult = RequestResult.status(code);
                        return Mono.just(requestResult);
                    } else {
                        TurmsLogger.logThrowable(throwable);
                        return Mono.just(RequestResult.status(TurmsStatusCode.SERVER_INTERNAL_ERROR));
                    }
                })
                .flatMap(requestResult -> {
                    if (requestResult == RequestResult.NOT_FOUND) {
                        if (requestId != null) {
                            TurmsNotification response = TurmsNotification.newBuilder()
                                    .setCode(Int32Value.newBuilder()
                                            .setValue(TurmsStatusCode.NO_CONTENT.getBusinessCode()).build())
                                    .setRequestId(Int64Value.newBuilder().setValue(requestId).build())
                                    .build();
                            return Mono.just(session.binaryMessage(dataBufferFactory -> dataBufferFactory
                                    .wrap(response.toByteArray())));
                        } else {
                            return Mono.empty();
                        }
                    } else {
                        return handleResultsForRecipients(requestResult, session, requesterId)
                                .flatMap(success -> {
                                    if (requestId != null) {
                                        if (success == null || !success) {
                                            requestResult.setCode(TurmsStatusCode.RECIPIENTS_OFFLINE);
                                        }
                                        TurmsNotification.Builder builder = TurmsNotification.newBuilder()
                                                .setCode(Int32Value.newBuilder()
                                                        .setValue(requestResult.getCode().getBusinessCode()).build())
                                                .setRequestId(Int64Value.newBuilder().setValue(requestId).build());
                                        if (requestResult.getDataForRequester() != null) {
                                            builder.setData(requestResult.getDataForRequester());
                                        }
                                        TurmsNotification response = builder.build();
                                        return Mono.just(session.binaryMessage(dataBufferFactory -> dataBufferFactory.wrap(response.toByteArray())));
                                    } else {
                                        return Mono.empty();
                                    }
                                });
                    }
                });
    }

    public Mono<WebSocketMessage> handleBinaryMessage(@NotNull WebSocketMessage message, @NotNull WebSocketSession
            session) {
        Long userId = SessionUtil.getUserIdFromSession(session);
        DeviceType deviceType = SessionUtil.getDeviceTypeFromSession(session);
        DataBuffer payload = message.getPayload();
        if (payload.capacity() == 0) {
            return Mono.empty();
        }
        try {
            TurmsRequest request = TurmsRequest.parseFrom(payload.asByteBuffer());
            if (request.getKindCase() != TurmsRequest.KindCase.KIND_NOT_SET) {
                Function<TurmsRequestWrapper, Mono<RequestResult>> handler = router.get(request.getKindCase());
                if (handler != null) {
                    Mono<TurmsRequestWrapper> wrapperMono = Mono.just(new TurmsRequestWrapper(
                            request, userId, deviceType, message, session));
                    if (turmsClusterManager.getTurmsProperties().getPlugin().isEnabled()) {
                        List<ClientRequestHandler> handlerList = turmsPluginManager.getClientRequestHandlerList();
                        for (ClientRequestHandler clientRequestHandler : handlerList) {
                            wrapperMono = wrapperMono.flatMap(clientRequestHandler::transform);
                        }
                    }
                    Mono<RequestResult> result = wrapperMono.flatMap(requestWrapper -> {
                        Mono<RequestResult> requestResultMono = Mono.empty();
                        if (turmsClusterManager.getTurmsProperties().getPlugin().isEnabled()) {
                            List<ClientRequestHandler> handlerList = turmsPluginManager.getClientRequestHandlerList();
                            for (ClientRequestHandler clientRequestHandler : handlerList) {
                                requestResultMono = requestResultMono
                                        .switchIfEmpty(clientRequestHandler.handleTurmsRequest(requestWrapper));
                            }
                        }
                        return requestResultMono.switchIfEmpty(handler.apply(requestWrapper));
                    });
                    Long requestId = request.hasRequestId() ? request.getRequestId().getValue() : null;
                    return handleResult(session, result, requestId, userId);
                } else {
                    onlineUserService.getLocalOnlineUserManager(userId).setOfflineByDeviceType(deviceType, CloseStatus.NOT_ACCEPTABLE);
                }
            } else {
                onlineUserService.getLocalOnlineUserManager(userId).setOfflineByDeviceType(deviceType, CloseStatus.BAD_DATA);
            }
        } catch (Exception e) {
            onlineUserService.getLocalOnlineUserManager(userId).setOfflineByDeviceType(deviceType, CloseStatus.BAD_DATA);
        }
        return Mono.empty();
    }
}