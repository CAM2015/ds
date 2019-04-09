// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lego.proto

package org.camelia.example.lego;

/**
 * Protobuf enum {@code lego.ProductLine}
 */
public enum ProductLine
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEGO_CITY = 0;</code>
   */
  LEGO_CITY(0),
  /**
   * <code>LEGO_STAR_WARS = 1;</code>
   */
  LEGO_STAR_WARS(1),
  /**
   * <code>LEGO_CLASSIC = 2;</code>
   */
  LEGO_CLASSIC(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEGO_CITY = 0;</code>
   */
  public static final int LEGO_CITY_VALUE = 0;
  /**
   * <code>LEGO_STAR_WARS = 1;</code>
   */
  public static final int LEGO_STAR_WARS_VALUE = 1;
  /**
   * <code>LEGO_CLASSIC = 2;</code>
   */
  public static final int LEGO_CLASSIC_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProductLine valueOf(int value) {
    return forNumber(value);
  }

  public static ProductLine forNumber(int value) {
    switch (value) {
      case 0: return LEGO_CITY;
      case 1: return LEGO_STAR_WARS;
      case 2: return LEGO_CLASSIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductLine>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProductLine> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProductLine>() {
          public ProductLine findValueByNumber(int number) {
            return ProductLine.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.camelia.example.lego.LegoProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProductLine[] VALUES = values();

  public static ProductLine valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProductLine(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:lego.ProductLine)
}

