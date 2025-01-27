// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/check_group_join_questions_answers_request.proto

package im.turms.turms.pojo.request.group.enrollment;

/**
 * Protobuf type {@code im.turms.proto.CheckGroupJoinQuestionsAnswersRequest}
 */
public  final class CheckGroupJoinQuestionsAnswersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.CheckGroupJoinQuestionsAnswersRequest)
    CheckGroupJoinQuestionsAnswersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckGroupJoinQuestionsAnswersRequest.newBuilder() to construct.
  private CheckGroupJoinQuestionsAnswersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckGroupJoinQuestionsAnswersRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckGroupJoinQuestionsAnswersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckGroupJoinQuestionsAnswersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              questionIdAndAnswer_ = com.google.protobuf.MapField.newMapField(
                  QuestionIdAndAnswerDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Long, java.lang.String>
            questionIdAndAnswer__ = input.readMessage(
                QuestionIdAndAnswerDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            questionIdAndAnswer_.getMutableMap().put(
                questionIdAndAnswer__.getKey(), questionIdAndAnswer__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.CheckGroupJoinQuestionsAnswersRequest)
  private static final im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest DEFAULT_INSTANCE;

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
          int number) {
    switch (number) {
      case 1:
        return internalGetQuestionIdAndAnswer();
      default:
        throw new RuntimeException(
                "Invalid map field number: " + number);
    }
  }

  static {
    DEFAULT_INSTANCE = new im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest();
  }

  public static final int QUESTION_ID_AND_ANSWER_FIELD_NUMBER = 1;

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_descriptor;
  }

  private com.google.protobuf.MapField<
          java.lang.Long, java.lang.String> questionIdAndAnswer_;

  private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
  internalGetQuestionIdAndAnswer() {
    if (questionIdAndAnswer_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
              QuestionIdAndAnswerDefaultEntryHolder.defaultEntry);
    }
    return questionIdAndAnswer_;
  }

  public int getQuestionIdAndAnswerCount() {
    return internalGetQuestionIdAndAnswer().getMap().size();
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  /**
   * Use {@link #getQuestionIdAndAnswerMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, java.lang.String> getQuestionIdAndAnswer() {
    return getQuestionIdAndAnswerMap();
  }

  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  public java.util.Map<java.lang.Long, java.lang.String> getQuestionIdAndAnswerMap() {
    return internalGetQuestionIdAndAnswer().getMap();
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetQuestionIdAndAnswer(),
        QuestionIdAndAnswerDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Long, java.lang.String> entry
         : internalGetQuestionIdAndAnswer().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, java.lang.String>
      questionIdAndAnswer__ = QuestionIdAndAnswerDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(1, questionIdAndAnswer__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetQuestionIdAndAnswer().getMap().isEmpty()) {
      hash = (37 * hash) + QUESTION_ID_AND_ANSWER_FIELD_NUMBER;
      hash = (53 * hash) + internalGetQuestionIdAndAnswer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder(im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.class, im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.Builder.class);
  }

  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  public boolean containsQuestionIdAndAnswer(
          long key) {

    return internalGetQuestionIdAndAnswer().getMap().containsKey(key);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  public java.lang.String getQuestionIdAndAnswerOrDefault(
          long key,
          java.lang.String defaultValue) {

    java.util.Map<java.lang.Long, java.lang.String> map =
            internalGetQuestionIdAndAnswer().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  public java.lang.String getQuestionIdAndAnswerOrThrow(
          long key) {

    java.util.Map<java.lang.Long, java.lang.String> map =
            internalGetQuestionIdAndAnswer().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest)) {
      return super.equals(obj);
    }
    im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest other = (im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest) obj;

    if (!internalGetQuestionIdAndAnswer().equals(
            other.internalGetQuestionIdAndAnswer())) return false;
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  private static final class QuestionIdAndAnswerDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.Long, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
                    .newDefaultInstance(
                            im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_QuestionIdAndAnswerEntry_descriptor,
                            com.google.protobuf.WireFormat.FieldType.INT64,
                            0L,
                            com.google.protobuf.WireFormat.FieldType.STRING,
                            "");
  }

  private static final com.google.protobuf.Parser<CheckGroupJoinQuestionsAnswersRequest>
          PARSER = new com.google.protobuf.AbstractParser<CheckGroupJoinQuestionsAnswersRequest>() {
    @java.lang.Override
    public CheckGroupJoinQuestionsAnswersRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckGroupJoinQuestionsAnswersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckGroupJoinQuestionsAnswersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckGroupJoinQuestionsAnswersRequest> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf type {@code im.turms.proto.CheckGroupJoinQuestionsAnswersRequest}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:im.turms.proto.CheckGroupJoinQuestionsAnswersRequest)
          im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOrBuilder {
    // Construct using im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
            int number) {
      switch (number) {
        case 1:
          return internalGetQuestionIdAndAnswer();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
            int number) {
      switch (number) {
        case 1:
          return internalGetMutableQuestionIdAndAnswer();
        default:
          throw new RuntimeException(
                  "Invalid map field number: " + number);
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.class, im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.Builder.class);
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableQuestionIdAndAnswer().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequestOuterClass.internal_static_im_turms_proto_CheckGroupJoinQuestionsAnswersRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest getDefaultInstanceForType() {
      return im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest build() {
      im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest buildPartial() {
      im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest result = new im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest(this);
      int from_bitField0_ = bitField0_;
      result.questionIdAndAnswer_ = internalGetQuestionIdAndAnswer();
      result.questionIdAndAnswer_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest) {
        return mergeFrom((im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest other) {
      if (other == im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest.getDefaultInstance())
        return this;
      internalGetMutableQuestionIdAndAnswer().mergeFrom(
              other.internalGetQuestionIdAndAnswer());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.turms.pojo.request.group.enrollment.CheckGroupJoinQuestionsAnswersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.String> questionIdAndAnswer_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
    internalGetQuestionIdAndAnswer() {
      if (questionIdAndAnswer_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            QuestionIdAndAnswerDefaultEntryHolder.defaultEntry);
      }
      return questionIdAndAnswer_;
    }
    private com.google.protobuf.MapField<java.lang.Long, java.lang.String>
    internalGetMutableQuestionIdAndAnswer() {
      onChanged();
      if (questionIdAndAnswer_ == null) {
        questionIdAndAnswer_ = com.google.protobuf.MapField.newMapField(
            QuestionIdAndAnswerDefaultEntryHolder.defaultEntry);
      }
      if (!questionIdAndAnswer_.isMutable()) {
        questionIdAndAnswer_ = questionIdAndAnswer_.copy();
      }
      return questionIdAndAnswer_;
    }

    public int getQuestionIdAndAnswerCount() {
      return internalGetQuestionIdAndAnswer().getMap().size();
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public boolean containsQuestionIdAndAnswer(
        long key) {

      return internalGetQuestionIdAndAnswer().getMap().containsKey(key);
    }
    /**
     * Use {@link #getQuestionIdAndAnswerMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.String> getQuestionIdAndAnswer() {
      return getQuestionIdAndAnswerMap();
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public java.util.Map<java.lang.Long, java.lang.String> getQuestionIdAndAnswerMap() {
      return internalGetQuestionIdAndAnswer().getMap();
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public java.lang.String getQuestionIdAndAnswerOrDefault(
        long key,
        java.lang.String defaultValue) {

      java.util.Map<java.lang.Long, java.lang.String> map =
          internalGetQuestionIdAndAnswer().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public java.lang.String getQuestionIdAndAnswerOrThrow(
        long key) {

      java.util.Map<java.lang.Long, java.lang.String> map =
          internalGetQuestionIdAndAnswer().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearQuestionIdAndAnswer() {
      internalGetMutableQuestionIdAndAnswer().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public Builder removeQuestionIdAndAnswer(
        long key) {

      internalGetMutableQuestionIdAndAnswer().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.String>
    getMutableQuestionIdAndAnswer() {
      return internalGetMutableQuestionIdAndAnswer().getMutableMap();
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */
    public Builder putQuestionIdAndAnswer(
        long key,
        java.lang.String value) {

      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableQuestionIdAndAnswer().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
     */

    public Builder putAllQuestionIdAndAnswer(
        java.util.Map<java.lang.Long, java.lang.String> values) {
      internalGetMutableQuestionIdAndAnswer().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.CheckGroupJoinQuestionsAnswersRequest)
  }

}

