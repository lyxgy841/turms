// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/delete_group_request.proto

package im.turms.turms.pojo.request.group;

public final class DeleteGroupRequestOuterClass {
  private DeleteGroupRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_DeleteGroupRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_DeleteGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n(request/group/delete_group_request.pro" +
                    "to\022\016im.turms.proto\"&\n\022DeleteGroupRequest" +
                    "\022\020\n\010group_id\030\001 \001(\003B%\n!im.turms.turms.poj" +
                    "o.request.groupP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_turms_proto_DeleteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_DeleteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_DeleteGroupRequest_descriptor,
        new java.lang.String[] { "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
