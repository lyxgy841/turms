// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/groups_with_version.proto

package im.turms.turms.pojo.bo.group;

/**
 * Protobuf type {@code im.turms.proto.GroupsWithVersion}
 */
public  final class GroupsWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.GroupsWithVersion)
    GroupsWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupsWithVersion.newBuilder() to construct.
  private GroupsWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupsWithVersion() {
    groups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
    return new GroupsWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.GroupsWithVersion)
  private static final im.turms.turms.pojo.bo.group.GroupsWithVersion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new im.turms.turms.pojo.bo.group.GroupsWithVersion();
  }

  private java.util.List<im.turms.turms.pojo.bo.group.Group> groups_;

  public static final int GROUPS_FIELD_NUMBER = 1;

  private GroupsWithVersion(
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
              groups_ = new java.util.ArrayList<im.turms.turms.pojo.bo.group.Group>();
              mutable_bitField0_ |= 0x00000001;
            }
            groups_.add(
                    input.readMessage(im.turms.turms.pojo.bo.group.Group.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (lastUpdatedDate_ != null) {
              subBuilder = lastUpdatedDate_.toBuilder();
            }
            lastUpdatedDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdatedDate_);
              lastUpdatedDate_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        groups_ = java.util.Collections.unmodifiableList(groups_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return im.turms.turms.pojo.bo.group.GroupsWithVersionOuterClass.internal_static_im_turms_proto_GroupsWithVersion_descriptor;
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  public int getGroupsCount() {
    return groups_.size();
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value lastUpdatedDate_;

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   *
   * @return Whether the lastUpdatedDate field is set.
   */
  public boolean hasLastUpdatedDate() {
    return lastUpdatedDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  public com.google.protobuf.Int64Value getLastUpdatedDate() {
    return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
    return getLastUpdatedDate();
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
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(1, groups_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      output.writeMessage(2, getLastUpdatedDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groups_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(2, getLastUpdatedDate());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
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
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder(im.turms.turms.pojo.bo.group.GroupsWithVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static im.turms.turms.pojo.bo.group.GroupsWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return im.turms.turms.pojo.bo.group.GroupsWithVersionOuterClass.internal_static_im_turms_proto_GroupsWithVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    im.turms.turms.pojo.bo.group.GroupsWithVersion.class, im.turms.turms.pojo.bo.group.GroupsWithVersion.Builder.class);
  }

  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  public java.util.List<im.turms.turms.pojo.bo.group.Group> getGroupsList() {
    return groups_;
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  public java.util.List<? extends im.turms.turms.pojo.bo.group.GroupOrBuilder>
  getGroupsOrBuilderList() {
    return groups_;
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
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  public im.turms.turms.pojo.bo.group.Group getGroups(int index) {
    return groups_.get(index);
  }

  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  public im.turms.turms.pojo.bo.group.GroupOrBuilder getGroupsOrBuilder(
          int index) {
    return groups_.get(index);
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof im.turms.turms.pojo.bo.group.GroupsWithVersion)) {
      return super.equals(obj);
    }
    im.turms.turms.pojo.bo.group.GroupsWithVersion other = (im.turms.turms.pojo.bo.group.GroupsWithVersion) obj;

    if (!getGroupsList()
            .equals(other.getGroupsList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (!getLastUpdatedDate()
              .equals(other.getLastUpdatedDate())) return false;
    }
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public im.turms.turms.pojo.bo.group.GroupsWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupsWithVersion>
          PARSER = new com.google.protobuf.AbstractParser<GroupsWithVersion>() {
    @java.lang.Override
    public GroupsWithVersion parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupsWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupsWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupsWithVersion> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf type {@code im.turms.proto.GroupsWithVersion}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:im.turms.proto.GroupsWithVersion)
          im.turms.turms.pojo.bo.group.GroupsWithVersionOrBuilder {
    private java.util.List<im.turms.turms.pojo.bo.group.Group> groups_ =
            java.util.Collections.emptyList();
    private com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.turms.pojo.bo.group.Group, im.turms.turms.pojo.bo.group.Group.Builder, im.turms.turms.pojo.bo.group.GroupOrBuilder> groupsBuilder_;

    // Construct using im.turms.turms.pojo.bo.group.GroupsWithVersion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getGroupsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        groupsBuilder_.clear();
      }
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }
      return this;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return im.turms.turms.pojo.bo.group.GroupsWithVersionOuterClass.internal_static_im_turms_proto_GroupsWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return im.turms.turms.pojo.bo.group.GroupsWithVersionOuterClass.internal_static_im_turms_proto_GroupsWithVersion_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      im.turms.turms.pojo.bo.group.GroupsWithVersion.class, im.turms.turms.pojo.bo.group.GroupsWithVersion.Builder.class);
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return im.turms.turms.pojo.bo.group.GroupsWithVersionOuterClass.internal_static_im_turms_proto_GroupsWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.turms.pojo.bo.group.GroupsWithVersion getDefaultInstanceForType() {
      return im.turms.turms.pojo.bo.group.GroupsWithVersion.getDefaultInstance();
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
    public im.turms.turms.pojo.bo.group.GroupsWithVersion build() {
      im.turms.turms.pojo.bo.group.GroupsWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.turms.pojo.bo.group.GroupsWithVersion buildPartial() {
      im.turms.turms.pojo.bo.group.GroupsWithVersion result = new im.turms.turms.pojo.bo.group.GroupsWithVersion(this);
      int from_bitField0_ = bitField0_;
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
      if (lastUpdatedDateBuilder_ == null) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
      } else {
        result.lastUpdatedDate_ = lastUpdatedDateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.turms.pojo.bo.group.GroupsWithVersion) {
        return mergeFrom((im.turms.turms.pojo.bo.group.GroupsWithVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    private int bitField0_;

    public Builder mergeFrom(im.turms.turms.pojo.bo.group.GroupsWithVersion other) {
      if (other == im.turms.turms.pojo.bo.group.GroupsWithVersion.getDefaultInstance()) return this;
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupsBuilder_ =
                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                            getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
          }
        }
      }
      if (other.hasLastUpdatedDate()) {
        mergeLastUpdatedDate(other.getLastUpdatedDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      im.turms.turms.pojo.bo.group.GroupsWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.turms.pojo.bo.group.GroupsWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groups_ = new java.util.ArrayList<im.turms.turms.pojo.bo.group.Group>(groups_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public java.util.List<im.turms.turms.pojo.bo.group.Group> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public im.turms.turms.pojo.bo.group.Group getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder setGroups(
            int index, im.turms.turms.pojo.bo.group.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder setGroups(
            int index, im.turms.turms.pojo.bo.group.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder addGroups(im.turms.turms.pojo.bo.group.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder addGroups(
            int index, im.turms.turms.pojo.bo.group.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder addGroups(
            im.turms.turms.pojo.bo.group.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder addGroups(
            int index, im.turms.turms.pojo.bo.group.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder addAllGroups(
            java.lang.Iterable<? extends im.turms.turms.pojo.bo.group.Group> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public im.turms.turms.pojo.bo.group.Group.Builder getGroupsBuilder(
            int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public im.turms.turms.pojo.bo.group.GroupOrBuilder getGroupsOrBuilder(
            int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public java.util.List<? extends im.turms.turms.pojo.bo.group.GroupOrBuilder>
    getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public im.turms.turms.pojo.bo.group.Group.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
              im.turms.turms.pojo.bo.group.Group.getDefaultInstance());
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public im.turms.turms.pojo.bo.group.Group.Builder addGroupsBuilder(
            int index) {
      return getGroupsFieldBuilder().addBuilder(
              index, im.turms.turms.pojo.bo.group.Group.getDefaultInstance());
    }

    /**
     * <code>repeated .im.turms.proto.Group groups = 1;</code>
     */
    public java.util.List<im.turms.turms.pojo.bo.group.Group.Builder>
    getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.turms.pojo.bo.group.Group, im.turms.turms.pojo.bo.group.Group.Builder, im.turms.turms.pojo.bo.group.GroupOrBuilder>
    getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                im.turms.turms.pojo.bo.group.Group, im.turms.turms.pojo.bo.group.Group.Builder, im.turms.turms.pojo.bo.group.GroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
    }

    private com.google.protobuf.Int64Value lastUpdatedDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> lastUpdatedDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    public boolean hasLastUpdatedDate() {
      return lastUpdatedDateBuilder_ != null || lastUpdatedDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    public com.google.protobuf.Int64Value getLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      } else {
        return lastUpdatedDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdatedDate_ = value;
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder mergeLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (lastUpdatedDate_ != null) {
          lastUpdatedDate_ =
            com.google.protobuf.Int64Value.newBuilder(lastUpdatedDate_).mergeFrom(value).buildPartial();
        } else {
          lastUpdatedDate_ = value;
        }
        onChanged();
      } else {
        lastUpdatedDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder clearLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
        onChanged();
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getLastUpdatedDateBuilder() {

      onChanged();
      return getLastUpdatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
      if (lastUpdatedDateBuilder_ != null) {
        return lastUpdatedDateBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdatedDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      }
    }

    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
    getLastUpdatedDateFieldBuilder() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getLastUpdatedDate(),
                getParentForChildren(),
                isClean());
        lastUpdatedDate_ = null;
      }
      return lastUpdatedDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.GroupsWithVersion)
  }

}

