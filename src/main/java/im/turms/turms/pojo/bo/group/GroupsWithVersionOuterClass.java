// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/groups_with_version.proto

package im.turms.turms.pojo.bo.group;

public final class GroupsWithVersionOuterClass {
  private GroupsWithVersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_GroupsWithVersion_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_GroupsWithVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n%model/group/groups_with_version.proto\022" +
                    "\016im.turms.proto\032\036google/protobuf/wrapper" +
                    "s.proto\032\027model/group/group.proto\"r\n\021Grou" +
                    "psWithVersion\022%\n\006groups\030\001 \003(\0132\025.im.turms" +
                    ".proto.Group\0226\n\021last_updated_date\030\002 \001(\0132" +
                    "\033.google.protobuf.Int64ValueB \n\034im.turms" +
                    ".turms.pojo.bo.groupP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[]{
                com.google.protobuf.WrappersProto.getDescriptor(),
                im.turms.turms.pojo.bo.group.GroupOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_GroupsWithVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_GroupsWithVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_GroupsWithVersion_descriptor,
        new java.lang.String[] { "Groups", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.turms.pojo.bo.group.GroupOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
