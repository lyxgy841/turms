// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/file/audio_file.proto

package im.turms.turms.pojo.bo.file;

public final class AudioFileOuterClass {
  private AudioFileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_AudioFile_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_AudioFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_AudioFile_Description_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_AudioFile_Description_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n\033model/file/audio_file.proto\022\016im.turms." +
                    "proto\032\036google/protobuf/wrappers.proto\"\227\002" +
                    "\n\tAudioFile\022:\n\013description\030\001 \001(\0132%.im.tu" +
                    "rms.proto.AudioFile.Description\022)\n\004data\030" +
                    "\002 \001(\0132\033.google.protobuf.BytesValue\032\242\001\n\013D" +
                    "escription\022\013\n\003url\030\001 \001(\t\022-\n\010duration\030\002 \001(" +
                    "\0132\033.google.protobuf.Int32Value\022)\n\004size\030\003" +
                    " \001(\0132\033.google.protobuf.Int32Value\022,\n\006for" +
                    "mat\030\004 \001(\0132\034.google.protobuf.StringValueB" +
                    "\037\n\033im.turms.turms.pojo.bo.fileP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_AudioFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_AudioFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_AudioFile_descriptor,
        new java.lang.String[] { "Description", "Data", });
    internal_static_im_turms_proto_AudioFile_Description_descriptor =
      internal_static_im_turms_proto_AudioFile_descriptor.getNestedTypes().get(0);
    internal_static_im_turms_proto_AudioFile_Description_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_AudioFile_Description_descriptor,
        new java.lang.String[] { "Url", "Duration", "Size", "Format", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
