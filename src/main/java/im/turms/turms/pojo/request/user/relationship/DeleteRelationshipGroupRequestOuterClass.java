// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/delete_relationship_group_request.proto

package im.turms.turms.pojo.request.user.relationship;

public final class DeleteRelationshipGroupRequestOuterClass {
  private DeleteRelationshipGroupRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_DeleteRelationshipGroupRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_DeleteRelationshipGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\nArequest/user/relationship/delete_relat" +
                    "ionship_group_request.proto\022\016im.turms.pr" +
                    "oto\032\036google/protobuf/wrappers.proto\"n\n\036D" +
                    "eleteRelationshipGroupRequest\022\023\n\013group_i" +
                    "ndex\030\001 \001(\005\0227\n\022target_group_index\030\002 \001(\0132\033" +
                    ".google.protobuf.Int32ValueB1\n-im.turms." +
                    "turms.pojo.request.user.relationshipP\001b\006" +
                    "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_DeleteRelationshipGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_DeleteRelationshipGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_DeleteRelationshipGroupRequest_descriptor,
        new java.lang.String[] { "GroupIndex", "TargetGroupIndex", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
