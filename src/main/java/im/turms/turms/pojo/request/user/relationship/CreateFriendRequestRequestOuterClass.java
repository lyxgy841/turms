// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/create_friend_request_request.proto

package im.turms.turms.pojo.request.user.relationship;

public final class CreateFriendRequestRequestOuterClass {
  private CreateFriendRequestRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_CreateFriendRequestRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_CreateFriendRequestRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n=request/user/relationship/create_frien" +
                    "d_request_request.proto\022\016im.turms.proto\"" +
                    "C\n\032CreateFriendRequestRequest\022\024\n\014recipie" +
                    "nt_id\030\001 \001(\003\022\017\n\007content\030\002 \001(\tB1\n-im.turms" +
                    ".turms.pojo.request.user.relationshipP\001b" +
                    "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_turms_proto_CreateFriendRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_CreateFriendRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_CreateFriendRequestRequest_descriptor,
        new java.lang.String[] { "RecipientId", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
