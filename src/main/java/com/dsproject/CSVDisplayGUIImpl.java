// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package com.dsproject;

public final class CSVDisplayGUIImpl {
  private CSVDisplayGUIImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_displayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_displayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_displayResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_displayResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service1.proto\"!\n\016displayRequest\022\017\n\007di" +
      "splay\030\001 \001(\t\"=\n\017displayResponse\022\022\n\ndrResp" +
      "onse\030\001 \001(\t\022\026\n\016drResponseCode\030\002 \001(\005\"\036\n\ttd" +
      "Request\022\021\n\tterminate\030\001 \001(\t\"9\n\ntdResponse" +
      "\022\023\n\013terResponse\030\001 \001(\t\022\026\n\016trResponseCode\030" +
      "\002 \001(\0052k\n\ndisplayCSV\022.\n\007display\022\017.display" +
      "Request\032\020.displayResponse\"\000\022-\n\020terminate" +
      "Display\022\n.tdRequest\032\013.tdResponse\"\000B$\n\rco" +
      "m.dsprojectB\021CSVDisplayGUIImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_displayRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_displayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_displayRequest_descriptor,
        new java.lang.String[] { "Display", });
    internal_static_displayResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_displayResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_displayResponse_descriptor,
        new java.lang.String[] { "DrResponse", "DrResponseCode", });
    internal_static_tdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdRequest_descriptor,
        new java.lang.String[] { "Terminate", });
    internal_static_tdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdResponse_descriptor,
        new java.lang.String[] { "TerResponse", "TrResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
