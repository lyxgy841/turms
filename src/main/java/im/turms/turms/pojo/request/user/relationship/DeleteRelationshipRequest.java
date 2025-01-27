// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/delete_relationship_request.proto

package im.turms.turms.pojo.request.user.relationship;

/**
 * Protobuf type {@code im.turms.proto.DeleteRelationshipRequest}
 */
public  final class DeleteRelationshipRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.DeleteRelationshipRequest)
    DeleteRelationshipRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRelationshipRequest.newBuilder() to construct.
  private DeleteRelationshipRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRelationshipRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRelationshipRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteRelationshipRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            relatedUserId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (groupIndex_ != null) {
              subBuilder = groupIndex_.toBuilder();
            }
            groupIndex_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(groupIndex_);
              groupIndex_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (targetGroupIndex_ != null) {
              subBuilder = targetGroupIndex_.toBuilder();
            }
            targetGroupIndex_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetGroupIndex_);
              targetGroupIndex_ = subBuilder.buildPartial();
            }

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

  // @@protoc_insertion_point(class_scope:im.turms.proto.DeleteRelationshipRequest)
  private static final im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest();
  }

  public static final int RELATED_USER_ID_FIELD_NUMBER = 1;
  private long relatedUserId_;

  /**
   * <code>int64 related_user_id = 1;</code>
   *
   * @return The relatedUserId.
   */
  public long getRelatedUserId() {
    return relatedUserId_;
  }

  public static final int GROUP_INDEX_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value groupIndex_;
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return Whether the groupIndex field is set.
   */
  public boolean hasGroupIndex() {
    return groupIndex_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return The groupIndex.
   */
  public com.google.protobuf.Int32Value getGroupIndex() {
    return groupIndex_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : groupIndex_;
  }
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getGroupIndexOrBuilder() {
    return getGroupIndex();
  }

  public static final int TARGET_GROUP_INDEX_FIELD_NUMBER = 3;
  private com.google.protobuf.Int32Value targetGroupIndex_;
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   * @return Whether the targetGroupIndex field is set.
   */
  public boolean hasTargetGroupIndex() {
    return targetGroupIndex_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   * @return The targetGroupIndex.
   */
  public com.google.protobuf.Int32Value getTargetGroupIndex() {
    return targetGroupIndex_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : targetGroupIndex_;
  }
  /**
   * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getTargetGroupIndexOrBuilder() {
    return getTargetGroupIndex();
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
    if (relatedUserId_ != 0L) {
      output.writeInt64(1, relatedUserId_);
    }
    if (groupIndex_ != null) {
      output.writeMessage(2, getGroupIndex());
    }
    if (targetGroupIndex_ != null) {
      output.writeMessage(3, getTargetGroupIndex());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (relatedUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, relatedUserId_);
    }
    if (groupIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroupIndex());
    }
    if (targetGroupIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(3, getTargetGroupIndex());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOuterClass.internal_static_im_turms_proto_DeleteRelationshipRequest_descriptor;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RELATED_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRelatedUserId());
    if (hasGroupIndex()) {
      hash = (37 * hash) + GROUP_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getGroupIndex().hashCode();
    }
    if (hasTargetGroupIndex()) {
      hash = (37 * hash) + TARGET_GROUP_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTargetGroupIndex().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
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

  public static im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOuterClass.internal_static_im_turms_proto_DeleteRelationshipRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.class, im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.Builder.class);
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest)) {
      return super.equals(obj);
    }
    im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest other = (im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest) obj;

    if (getRelatedUserId()
            != other.getRelatedUserId()) return false;
    if (hasGroupIndex() != other.hasGroupIndex()) return false;
    if (hasGroupIndex()) {
      if (!getGroupIndex()
              .equals(other.getGroupIndex())) return false;
    }
    if (hasTargetGroupIndex() != other.hasTargetGroupIndex()) return false;
    if (hasTargetGroupIndex()) {
      if (!getTargetGroupIndex()
              .equals(other.getTargetGroupIndex())) return false;
    }
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRelationshipRequest>
          PARSER = new com.google.protobuf.AbstractParser<DeleteRelationshipRequest>() {
    @java.lang.Override
    public DeleteRelationshipRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteRelationshipRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteRelationshipRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRelationshipRequest> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf type {@code im.turms.proto.DeleteRelationshipRequest}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:im.turms.proto.DeleteRelationshipRequest)
          im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOrBuilder {
    // Construct using im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOuterClass.internal_static_im_turms_proto_DeleteRelationshipRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOuterClass.internal_static_im_turms_proto_DeleteRelationshipRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.class, im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.Builder.class);
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
      relatedUserId_ = 0L;

      if (groupIndexBuilder_ == null) {
        groupIndex_ = null;
      } else {
        groupIndex_ = null;
        groupIndexBuilder_ = null;
      }
      if (targetGroupIndexBuilder_ == null) {
        targetGroupIndex_ = null;
      } else {
        targetGroupIndex_ = null;
        targetGroupIndexBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequestOuterClass.internal_static_im_turms_proto_DeleteRelationshipRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest getDefaultInstanceForType() {
      return im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest build() {
      im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest buildPartial() {
      im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest result = new im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest(this);
      result.relatedUserId_ = relatedUserId_;
      if (groupIndexBuilder_ == null) {
        result.groupIndex_ = groupIndex_;
      } else {
        result.groupIndex_ = groupIndexBuilder_.build();
      }
      if (targetGroupIndexBuilder_ == null) {
        result.targetGroupIndex_ = targetGroupIndex_;
      } else {
        result.targetGroupIndex_ = targetGroupIndexBuilder_.build();
      }
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
      if (other instanceof im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest) {
        return mergeFrom((im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest other) {
      if (other == im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest.getDefaultInstance())
        return this;
      if (other.getRelatedUserId() != 0L) {
        setRelatedUserId(other.getRelatedUserId());
      }
      if (other.hasGroupIndex()) {
        mergeGroupIndex(other.getGroupIndex());
      }
      if (other.hasTargetGroupIndex()) {
        mergeTargetGroupIndex(other.getTargetGroupIndex());
      }
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
      im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.turms.pojo.request.user.relationship.DeleteRelationshipRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long relatedUserId_ ;
    /**
     * <code>int64 related_user_id = 1;</code>
     * @return The relatedUserId.
     */
    public long getRelatedUserId() {
      return relatedUserId_;
    }
    /**
     * <code>int64 related_user_id = 1;</code>
     * @param value The relatedUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRelatedUserId(long value) {

      relatedUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 related_user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelatedUserId() {

      relatedUserId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value groupIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> groupIndexBuilder_;
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     * @return Whether the groupIndex field is set.
     */
    public boolean hasGroupIndex() {
      return groupIndexBuilder_ != null || groupIndex_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     * @return The groupIndex.
     */
    public com.google.protobuf.Int32Value getGroupIndex() {
      if (groupIndexBuilder_ == null) {
        return groupIndex_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : groupIndex_;
      } else {
        return groupIndexBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public Builder setGroupIndex(com.google.protobuf.Int32Value value) {
      if (groupIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupIndex_ = value;
        onChanged();
      } else {
        groupIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public Builder setGroupIndex(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (groupIndexBuilder_ == null) {
        groupIndex_ = builderForValue.build();
        onChanged();
      } else {
        groupIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public Builder mergeGroupIndex(com.google.protobuf.Int32Value value) {
      if (groupIndexBuilder_ == null) {
        if (groupIndex_ != null) {
          groupIndex_ =
            com.google.protobuf.Int32Value.newBuilder(groupIndex_).mergeFrom(value).buildPartial();
        } else {
          groupIndex_ = value;
        }
        onChanged();
      } else {
        groupIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public Builder clearGroupIndex() {
      if (groupIndexBuilder_ == null) {
        groupIndex_ = null;
        onChanged();
      } else {
        groupIndex_ = null;
        groupIndexBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public com.google.protobuf.Int32Value.Builder getGroupIndexBuilder() {

      onChanged();
      return getGroupIndexFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getGroupIndexOrBuilder() {
      if (groupIndexBuilder_ != null) {
        return groupIndexBuilder_.getMessageOrBuilder();
      } else {
        return groupIndex_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : groupIndex_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value group_index = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>
        getGroupIndexFieldBuilder() {
      if (groupIndexBuilder_ == null) {
        groupIndexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getGroupIndex(),
                getParentForChildren(),
                isClean());
        groupIndex_ = null;
      }
      return groupIndexBuilder_;
    }

    private com.google.protobuf.Int32Value targetGroupIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> targetGroupIndexBuilder_;
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     * @return Whether the targetGroupIndex field is set.
     */
    public boolean hasTargetGroupIndex() {
      return targetGroupIndexBuilder_ != null || targetGroupIndex_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     * @return The targetGroupIndex.
     */
    public com.google.protobuf.Int32Value getTargetGroupIndex() {
      if (targetGroupIndexBuilder_ == null) {
        return targetGroupIndex_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : targetGroupIndex_;
      } else {
        return targetGroupIndexBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public Builder setTargetGroupIndex(com.google.protobuf.Int32Value value) {
      if (targetGroupIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetGroupIndex_ = value;
        onChanged();
      } else {
        targetGroupIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public Builder setTargetGroupIndex(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (targetGroupIndexBuilder_ == null) {
        targetGroupIndex_ = builderForValue.build();
        onChanged();
      } else {
        targetGroupIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public Builder mergeTargetGroupIndex(com.google.protobuf.Int32Value value) {
      if (targetGroupIndexBuilder_ == null) {
        if (targetGroupIndex_ != null) {
          targetGroupIndex_ =
            com.google.protobuf.Int32Value.newBuilder(targetGroupIndex_).mergeFrom(value).buildPartial();
        } else {
          targetGroupIndex_ = value;
        }
        onChanged();
      } else {
        targetGroupIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public Builder clearTargetGroupIndex() {
      if (targetGroupIndexBuilder_ == null) {
        targetGroupIndex_ = null;
        onChanged();
      } else {
        targetGroupIndex_ = null;
        targetGroupIndexBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public com.google.protobuf.Int32Value.Builder getTargetGroupIndexBuilder() {

      onChanged();
      return getTargetGroupIndexFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getTargetGroupIndexOrBuilder() {
      if (targetGroupIndexBuilder_ != null) {
        return targetGroupIndexBuilder_.getMessageOrBuilder();
      } else {
        return targetGroupIndex_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : targetGroupIndex_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value target_group_index = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>
        getTargetGroupIndexFieldBuilder() {
      if (targetGroupIndexBuilder_ == null) {
        targetGroupIndexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getTargetGroupIndex(),
                getParentForChildren(),
                isClean());
        targetGroupIndex_ = null;
      }
      return targetGroupIndexBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.DeleteRelationshipRequest)
  }

}

