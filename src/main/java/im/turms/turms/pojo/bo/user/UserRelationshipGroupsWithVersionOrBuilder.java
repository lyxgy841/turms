// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_relationship_groups_with_version.proto

package im.turms.turms.pojo.bo.user;

public interface UserRelationshipGroupsWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UserRelationshipGroupsWithVersion)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    java.util.List<im.turms.turms.pojo.bo.user.UserRelationshipGroup>
    getUserRelationshipGroupsList();

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    im.turms.turms.pojo.bo.user.UserRelationshipGroup getUserRelationshipGroups(int index);

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    int getUserRelationshipGroupsCount();

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    java.util.List<? extends im.turms.turms.pojo.bo.user.UserRelationshipGroupOrBuilder>
    getUserRelationshipGroupsOrBuilderList();

    /**
     * <code>repeated .im.turms.proto.UserRelationshipGroup user_relationship_groups = 1;</code>
     */
    im.turms.turms.pojo.bo.user.UserRelationshipGroupOrBuilder getUserRelationshipGroupsOrBuilder(
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
