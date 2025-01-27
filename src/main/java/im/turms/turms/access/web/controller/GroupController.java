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

package im.turms.turms.access.web.controller;

import im.turms.turms.access.web.util.ResponseFactory;
import im.turms.turms.annotation.web.RequiredPermission;
import im.turms.turms.common.DateTimeUtil;
import im.turms.turms.common.PageUtil;
import im.turms.turms.common.TurmsStatusCode;
import im.turms.turms.constant.AdminPermission;
import im.turms.turms.constant.DivideBy;
import im.turms.turms.pojo.domain.Group;
import im.turms.turms.pojo.domain.GroupType;
import im.turms.turms.pojo.dto.AddGroupDTO;
import im.turms.turms.pojo.dto.AddGroupTypeDTO;
import im.turms.turms.pojo.dto.UpdateGroupDTO;
import im.turms.turms.pojo.dto.UpdateGroupTypeDTO;
import im.turms.turms.service.group.GroupService;
import im.turms.turms.service.group.GroupTypeService;
import im.turms.turms.service.message.MessageService;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static im.turms.turms.common.Constants.*;

@RestController
@RequestMapping("/groups")
public class GroupController {
    private final GroupService groupService;
    private final GroupTypeService groupTypeService;
    private final MessageService messageService;
    private final PageUtil pageUtil;
    private final DateTimeUtil dateTimeUtil;

    public GroupController(GroupService groupService, GroupTypeService groupTypeService, PageUtil pageUtil, MessageService messageService, DateTimeUtil dateTimeUtil) {
        this.groupService = groupService;
        this.groupTypeService = groupTypeService;
        this.pageUtil = pageUtil;
        this.messageService = messageService;
        this.dateTimeUtil = dateTimeUtil;
    }

    @GetMapping
    @RequiredPermission(AdminPermission.GROUP_QUERY)
    public Mono<ResponseEntity> getGroupsInformation(
            @RequestParam(required = false) Long id,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size
    ) {
        if (id != null) {
            Mono<Group> group = groupService.queryGroupById(id);
            return ResponseFactory.okWhenTruthy(group);
        } else {
            size = pageUtil.getSize(size);
            Flux<Group> groups = groupService.queryGroups(page, size);
            return ResponseFactory.okWhenTruthy(groups);
        }
    }

    @PostMapping
    @RequiredPermission(AdminPermission.GROUP_CREATE)
    public Mono<ResponseEntity> addGroup(@RequestBody AddGroupDTO addGroupDTO) {
        Long ownerId = addGroupDTO.getOwnerId();
        Mono<Group> createdGroup = groupService.authAndCreateGroup(
                addGroupDTO.getCreatorId(),
                ownerId != null ? ownerId : addGroupDTO.getCreatorId(),
                addGroupDTO.getName(),
                addGroupDTO.getIntro(),
                addGroupDTO.getAnnouncement(),
                addGroupDTO.getProfilePictureUrl(),
                addGroupDTO.getMinimumScore(),
                addGroupDTO.getTypeId(),
                addGroupDTO.getMuteEndDate(),
                addGroupDTO.getActive());
        return ResponseFactory.okWhenTruthy(createdGroup);
    }

    @PutMapping
    @RequiredPermission(AdminPermission.GROUP_UPDATE)
    public Mono<ResponseEntity> updateGroup(
            @RequestParam Long groupId,
            @RequestBody UpdateGroupDTO updateGroupDTO) {
        Mono<Boolean> updated = groupService.updateGroup(
                groupId,
                updateGroupDTO.getMuteEndDate(),
                updateGroupDTO.getName(),
                updateGroupDTO.getUrl(),
                updateGroupDTO.getIntro(),
                updateGroupDTO.getAnnouncement(),
                updateGroupDTO.getMinimumScore(),
                updateGroupDTO.getTypeId(),
                updateGroupDTO.getSuccessorId(),
                updateGroupDTO.getQuitAfterTransfer());
        return ResponseFactory.acknowledged(updated);
    }

    @DeleteMapping
    @RequiredPermission(AdminPermission.GROUP_DELETE)
    public Mono<ResponseEntity> deleteGroup(
            @RequestParam Long groupId,
            @RequestParam(required = false) Boolean logicalDelete) {
        Mono<Boolean> deleted = groupService.deleteGroupAndGroupMembers(groupId, logicalDelete);
        return ResponseFactory.acknowledged(deleted);
    }

    @GetMapping("/types")
    @RequiredPermission(AdminPermission.GROUP_TYPE_QUERY)
    public Mono<ResponseEntity> getGroupTypes() {
        Flux<GroupType> groupTypes = groupTypeService.getGroupTypes();
        return ResponseFactory.okWhenTruthy(groupTypes);
    }

    @PostMapping("/types")
    @RequiredPermission(AdminPermission.GROUP_TYPE_CREATE)
    public Mono<ResponseEntity> addGroupType(@RequestBody AddGroupTypeDTO addGroupTypeDTO) {
        Mono<GroupType> addedGroupType = groupTypeService.addGroupType(addGroupTypeDTO.getName(),
                addGroupTypeDTO.getGroupSizeLimit(),
                addGroupTypeDTO.getInvitationStrategy(),
                addGroupTypeDTO.getJoinStrategy(),
                addGroupTypeDTO.getGroupInfoUpdateStrategy(),
                addGroupTypeDTO.getMemberInfoUpdateStrategy(),
                addGroupTypeDTO.getGuestSpeakable(),
                addGroupTypeDTO.getSelfInfoUpdatable(),
                addGroupTypeDTO.getEnableReadReceipt(),
                addGroupTypeDTO.getMessageEditable());
        return ResponseFactory.okWhenTruthy(addedGroupType);
    }

    @PutMapping("/types")
    @RequiredPermission(AdminPermission.GROUP_TYPE_QUERY)
    public Mono<ResponseEntity> updateGroupType(
            @RequestParam Long typeId,
            @RequestBody UpdateGroupTypeDTO updateGroupTypeDTO) {
        Mono<Boolean> updated = groupTypeService.updateGroupType(
                typeId,
                updateGroupTypeDTO.getName(),
                updateGroupTypeDTO.getGroupSizeLimit(),
                updateGroupTypeDTO.getInvitationStrategy(),
                updateGroupTypeDTO.getJoinStrategy(),
                updateGroupTypeDTO.getGroupInfoUpdateStrategy(),
                updateGroupTypeDTO.getMemberInfoUpdateStrategy(),
                updateGroupTypeDTO.getGuestSpeakable(),
                updateGroupTypeDTO.getSelfInfoUpdatable(),
                updateGroupTypeDTO.getEnableReadReceipt(),
                updateGroupTypeDTO.getMessageEditable());
        return ResponseFactory.acknowledged(updated);
    }

    @DeleteMapping("/types")
    public Mono<ResponseEntity> deleteGroupType(@RequestParam Long groupTypeId) {
        Mono<Boolean> deleted = groupTypeService.deleteGroupType(groupTypeId);
        return ResponseFactory.acknowledged(deleted);
    }

    @GetMapping("/count")
    public Mono<ResponseEntity> countGroups(
            @RequestParam(required = false) Date createdStartDate,
            @RequestParam(required = false) Date createdEndDate,
            @RequestParam(required = false) Date deletedStartDate,
            @RequestParam(required = false) Date deletedEndDate,
            @RequestParam(required = false) Date sentMessageStartDate,
            @RequestParam(required = false) Date sentMessageEndDate,
            @RequestParam(defaultValue = "NOOP") DivideBy divideBy) {
        if (divideBy == null || divideBy == DivideBy.NOOP) {
            List<Mono<Pair<String, Long>>> counts = new LinkedList<>();
            if (deletedStartDate != null || deletedEndDate != null) {
                counts.add(groupService.countDeletedGroups(
                        deletedStartDate,
                        deletedEndDate)
                        .map(total -> Pair.of(DELETED_GROUPS, total)));
            }
            if (sentMessageStartDate != null || sentMessageEndDate != null) {
                counts.add(messageService.countGroupsThatSentMessages(
                        sentMessageStartDate,
                        sentMessageEndDate)
                        .map(total -> Pair.of(GROUPS_THAT_SENT_MESSAGES, total)));
            }
            if (counts.isEmpty() || createdStartDate != null || createdEndDate != null) {
                counts.add(groupService.countCreatedGroups(
                        createdStartDate,
                        createdEndDate)
                        .map(total -> Pair.of(CREATED_GROUPS, total)));
            }
            return ResponseFactory.collectCountResults(counts);
        } else {
            List<Mono<Pair<String, List<Map<String, ?>>>>> counts = new LinkedList<>();
            if (deletedStartDate != null && deletedEndDate != null) {
                counts.add(dateTimeUtil.checkAndQueryBetweenDate(
                        DELETED_GROUPS,
                        deletedStartDate,
                        deletedEndDate,
                        divideBy,
                        groupService::countDeletedGroups));
            }
            if (sentMessageStartDate != null && sentMessageEndDate != null) {
                counts.add(dateTimeUtil.checkAndQueryBetweenDate(
                        GROUPS_THAT_SENT_MESSAGES,
                        sentMessageStartDate,
                        sentMessageEndDate,
                        divideBy,
                        messageService::countGroupsThatSentMessages));
            }
            if (createdStartDate != null && createdEndDate != null) {
                counts.add(dateTimeUtil.checkAndQueryBetweenDate(
                        CREATED_GROUPS,
                        createdStartDate,
                        createdEndDate,
                        divideBy,
                        groupService::countCreatedGroups));
            }
            if (counts.isEmpty()) {
                return ResponseFactory.code(TurmsStatusCode.ILLEGAL_ARGUMENTS);
            }
            return ResponseFactory.collectCountResults(counts);
        }
    }
}
