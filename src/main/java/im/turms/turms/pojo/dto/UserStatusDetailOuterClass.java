// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto/user/user_status_detail.proto

package im.turms.turms.pojo.dto;

public final class UserStatusDetailOuterClass {
  private UserStatusDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UserStatusDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UserStatusDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!dto/user/user_status_detail.proto\022\016im." +
      "turms.proto\032\032constant/user_status.proto\032" +
      "\032constant/device_type.proto\"\214\001\n\020UserStat" +
      "usDetail\022\017\n\007user_id\030\001 \001(\003\022/\n\013user_status" +
      "\030\002 \001(\0162\032.im.turms.proto.UserStatus\0226\n\022us" +
      "ing_device_types\030\003 \003(\0162\032.im.turms.proto." +
      "DeviceTypeB\033\n\027im.turms.turms.pojo.dtoP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.turms.turms.constant.UserStatusOuterClass.getDescriptor(),
          im.turms.turms.constant.DeviceTypeOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UserStatusDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UserStatusDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UserStatusDetail_descriptor,
        new java.lang.String[] { "UserId", "UserStatus", "UsingDeviceTypes", });
    im.turms.turms.constant.UserStatusOuterClass.getDescriptor();
    im.turms.turms.constant.DeviceTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}