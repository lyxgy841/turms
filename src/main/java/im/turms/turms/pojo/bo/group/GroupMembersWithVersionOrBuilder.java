// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/group_members_with_version.proto

package im.turms.turms.pojo.bo.group;

public interface GroupMembersWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.GroupMembersWithVersion)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    java.util.List<im.turms.turms.pojo.bo.group.GroupMember>
    getGroupMembersList();

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    im.turms.turms.pojo.bo.group.GroupMember getGroupMembers(int index);

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    int getGroupMembersCount();

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    java.util.List<? extends im.turms.turms.pojo.bo.group.GroupMemberOrBuilder>
    getGroupMembersOrBuilderList();

    /**
     * <code>repeated .im.turms.proto.GroupMember group_members = 1;</code>
     */
    im.turms.turms.pojo.bo.group.GroupMemberOrBuilder getGroupMembersOrBuilder(
            int index);

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  boolean hasLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  com.google.protobuf.Int64Value getLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder();
}
