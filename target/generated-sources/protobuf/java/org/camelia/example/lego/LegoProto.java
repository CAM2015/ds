// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lego.proto

package org.camelia.example.lego;

public final class LegoProto {
  private LegoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_LegoSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_LegoSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_LegoSet_NumberOfBricksPerSetEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_LegoSet_NumberOfBricksPerSetEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_ConstructedLegoToy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_ConstructedLegoToy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_ProductLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_ProductLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_LegoPieceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_LegoPieceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lego_LegoPieceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lego_LegoPieceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nlego.proto\022\004lego\032\033google/protobuf/empt" +
      "y.proto\"\304\001\n\007LegoSet\022\014\n\004name\030\001 \001(\t\022\023\n\013des" +
      "cription\030\002 \001(\t\022\016\n\006bricks\030\003 \001(\003\022I\n\030number" +
      "_of_bricks_per_set\030\004 \003(\0132\'.lego.LegoSet." +
      "NumberOfBricksPerSetEntry\032;\n\031NumberOfBri" +
      "cksPerSetEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\005:\0028\001\"\'\n\022ConstructedLegoToy\022\021\n\tcomplete" +
      "d\030\001 \001(\010\"\033\n\013ProductLine\022\014\n\004name\030\001 \001(\t\";\n\020" +
      "LegoPieceRequest\022\'\n\014product_line\030\001 \001(\0132\021" +
      ".lego.ProductLine\"#\n\021LegoPieceResponse\022\016" +
      "\n\006result\030\001 \001(\t2\211\001\n\013LegoService\0226\n\tbuildL" +
      "ego\022\r.lego.LegoSet\032\030.lego.ConstructedLeg" +
      "oToy\"\000\022B\n\tlegoPiece\022\026.lego.LegoPieceRequ" +
      "est\032\027.lego.LegoPieceResponse\"\000(\0010\001B\'\n\030or" +
      "g.camelia.example.legoB\tLegoProtoP\001b\006pro" +
      "to3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_lego_LegoSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lego_LegoSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_LegoSet_descriptor,
        new java.lang.String[] { "Name", "Description", "Bricks", "NumberOfBricksPerSet", });
    internal_static_lego_LegoSet_NumberOfBricksPerSetEntry_descriptor =
      internal_static_lego_LegoSet_descriptor.getNestedTypes().get(0);
    internal_static_lego_LegoSet_NumberOfBricksPerSetEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_LegoSet_NumberOfBricksPerSetEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_lego_ConstructedLegoToy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lego_ConstructedLegoToy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_ConstructedLegoToy_descriptor,
        new java.lang.String[] { "Completed", });
    internal_static_lego_ProductLine_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lego_ProductLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_ProductLine_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_lego_LegoPieceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lego_LegoPieceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_LegoPieceRequest_descriptor,
        new java.lang.String[] { "ProductLine", });
    internal_static_lego_LegoPieceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lego_LegoPieceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lego_LegoPieceResponse_descriptor,
        new java.lang.String[] { "Result", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
