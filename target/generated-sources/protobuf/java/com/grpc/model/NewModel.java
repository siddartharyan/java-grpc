// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/NewModel.proto

package com.grpc.model;

public final class NewModel {
  private NewModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Apartment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Apartment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025common/NewModel.proto\022\006common\032\022common/" +
      "House.proto\"7\n\tApartment\022\014\n\004name\030\001 \001(\t\022\034" +
      "\n\005house\030\002 \003(\0132\r.common.HouseB\022\n\016com.grpc" +
      ".modelP\001b\006proto3"
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
          com.grpc.model.HouseOuterClass.getDescriptor(),
        }, assigner);
    internal_static_common_Apartment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_Apartment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Apartment_descriptor,
        new java.lang.String[] { "Name", "House", });
    com.grpc.model.HouseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
