// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package com.dsproject;

public final class PollutantGUIImpl {
  private PollutantGUIImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_displayGUIRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_displayGUIRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_displayGUIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_displayGUIResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_terminateGUIRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_terminateGUIRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_terminateGUIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_terminateGUIResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service2.proto\"&\n\021displayGUIRequest\022\021\n" +
      "\tdgmessage\030\001 \001(\t\"@\n\022displayGUIResponse\022\022" +
      "\n\ndgresponse\030\001 \001(\t\022\026\n\016dgresponsecode\030\002 \001" +
      "(\005\"(\n\023terminateGUIRequest\022\021\n\ttgmessage\030\001" +
      " \001(\t\"B\n\024terminateGUIResponse\022\022\n\ntgrespon" +
      "se\030\001 \001(\t\022\026\n\016tgresponsecode\030\002 \001(\0052\206\001\n\014Pol" +
      "lutantGUI\0227\n\ndisplayGUI\022\022.displayGUIRequ" +
      "est\032\023.displayGUIResponse\"\000\022=\n\014terminateG" +
      "UI\022\024.terminateGUIRequest\032\025.terminateGUIR" +
      "esponse\"\000B#\n\rcom.dsprojectB\020PollutantGUI" +
      "ImplP\001b\006proto3"
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
    internal_static_displayGUIRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_displayGUIRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_displayGUIRequest_descriptor,
        new java.lang.String[] { "Dgmessage", });
    internal_static_displayGUIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_displayGUIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_displayGUIResponse_descriptor,
        new java.lang.String[] { "Dgresponse", "Dgresponsecode", });
    internal_static_terminateGUIRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_terminateGUIRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_terminateGUIRequest_descriptor,
        new java.lang.String[] { "Tgmessage", });
    internal_static_terminateGUIResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_terminateGUIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_terminateGUIResponse_descriptor,
        new java.lang.String[] { "Tgresponse", "Tgresponsecode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}