// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_relationships_with_version.proto

package im.turms.turms.pojo.bo.user;

public interface UserRelationshipsWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UserRelationshipsWithVersion)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    java.util.List<im.turms.turms.pojo.bo.user.UserRelationship>
    getUserRelationshipsList();

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    im.turms.turms.pojo.bo.user.UserRelationship getUserRelationships(int index);

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    int getUserRelationshipsCount();

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    java.util.List<? extends im.turms.turms.pojo.bo.user.UserRelationshipOrBuilder>
    getUserRelationshipsOrBuilderList();

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    im.turms.turms.pojo.bo.user.UserRelationshipOrBuilder getUserRelationshipsOrBuilder(
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
