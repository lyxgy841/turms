// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/member/delete_group_member_request.proto

package im.turms.turms.pojo.request;

public final class DeleteGroupMemberRequestOuterClass {
  private DeleteGroupMemberRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_DeleteGroupMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_DeleteGroupMemberRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6request/group/member/delete_group_memb" +
      "er_request.proto\022\016im.turms.proto\032\036google" +
      "/protobuf/wrappers.proto\"\261\001\n\030DeleteGroup" +
      "MemberRequest\022\020\n\010group_id\030\001 \001(\003\022\027\n\017group" +
      "_member_id\030\002 \001(\003\0221\n\014successor_id\030\003 \001(\0132\033" +
      ".google.protobuf.Int64Value\0227\n\023quit_afte" +
      "r_transfer\030\004 \001(\0132\032.google.protobuf.BoolV" +
      "alueB\037\n\033im.turms.turms.pojo.requestP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_DeleteGroupMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_DeleteGroupMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_DeleteGroupMemberRequest_descriptor,
        new java.lang.String[] { "GroupId", "GroupMemberId", "SuccessorId", "QuitAfterTransfer", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}