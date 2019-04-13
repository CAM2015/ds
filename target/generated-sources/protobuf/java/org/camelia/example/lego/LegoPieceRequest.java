// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lego.proto

package org.camelia.example.lego;

/**
 * Protobuf type {@code lego.LegoPieceRequest}
 */
public  final class LegoPieceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lego.LegoPieceRequest)
    LegoPieceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LegoPieceRequest.newBuilder() to construct.
  private LegoPieceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LegoPieceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LegoPieceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.camelia.example.lego.ProductLine.Builder subBuilder = null;
            if (productLine_ != null) {
              subBuilder = productLine_.toBuilder();
            }
            productLine_ = input.readMessage(org.camelia.example.lego.ProductLine.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(productLine_);
              productLine_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.camelia.example.lego.LegoPieceRequest.class, org.camelia.example.lego.LegoPieceRequest.Builder.class);
  }

  public static final int PRODUCT_LINE_FIELD_NUMBER = 1;
  private org.camelia.example.lego.ProductLine productLine_;
  /**
   * <code>.lego.ProductLine product_line = 1;</code>
   */
  public boolean hasProductLine() {
    return productLine_ != null;
  }
  /**
   * <code>.lego.ProductLine product_line = 1;</code>
   */
  public org.camelia.example.lego.ProductLine getProductLine() {
    return productLine_ == null ? org.camelia.example.lego.ProductLine.getDefaultInstance() : productLine_;
  }
  /**
   * <code>.lego.ProductLine product_line = 1;</code>
   */
  public org.camelia.example.lego.ProductLineOrBuilder getProductLineOrBuilder() {
    return getProductLine();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (productLine_ != null) {
      output.writeMessage(1, getProductLine());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productLine_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProductLine());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.camelia.example.lego.LegoPieceRequest)) {
      return super.equals(obj);
    }
    org.camelia.example.lego.LegoPieceRequest other = (org.camelia.example.lego.LegoPieceRequest) obj;

    boolean result = true;
    result = result && (hasProductLine() == other.hasProductLine());
    if (hasProductLine()) {
      result = result && getProductLine()
          .equals(other.getProductLine());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProductLine()) {
      hash = (37 * hash) + PRODUCT_LINE_FIELD_NUMBER;
      hash = (53 * hash) + getProductLine().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.lego.LegoPieceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.camelia.example.lego.LegoPieceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lego.LegoPieceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lego.LegoPieceRequest)
      org.camelia.example.lego.LegoPieceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.camelia.example.lego.LegoPieceRequest.class, org.camelia.example.lego.LegoPieceRequest.Builder.class);
    }

    // Construct using org.camelia.example.lego.LegoPieceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productLineBuilder_ == null) {
        productLine_ = null;
      } else {
        productLine_ = null;
        productLineBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_descriptor;
    }

    @java.lang.Override
    public org.camelia.example.lego.LegoPieceRequest getDefaultInstanceForType() {
      return org.camelia.example.lego.LegoPieceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.camelia.example.lego.LegoPieceRequest build() {
      org.camelia.example.lego.LegoPieceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.camelia.example.lego.LegoPieceRequest buildPartial() {
      org.camelia.example.lego.LegoPieceRequest result = new org.camelia.example.lego.LegoPieceRequest(this);
      if (productLineBuilder_ == null) {
        result.productLine_ = productLine_;
      } else {
        result.productLine_ = productLineBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.camelia.example.lego.LegoPieceRequest) {
        return mergeFrom((org.camelia.example.lego.LegoPieceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.camelia.example.lego.LegoPieceRequest other) {
      if (other == org.camelia.example.lego.LegoPieceRequest.getDefaultInstance()) return this;
      if (other.hasProductLine()) {
        mergeProductLine(other.getProductLine());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.camelia.example.lego.LegoPieceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.camelia.example.lego.LegoPieceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.camelia.example.lego.ProductLine productLine_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.camelia.example.lego.ProductLine, org.camelia.example.lego.ProductLine.Builder, org.camelia.example.lego.ProductLineOrBuilder> productLineBuilder_;
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public boolean hasProductLine() {
      return productLineBuilder_ != null || productLine_ != null;
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public org.camelia.example.lego.ProductLine getProductLine() {
      if (productLineBuilder_ == null) {
        return productLine_ == null ? org.camelia.example.lego.ProductLine.getDefaultInstance() : productLine_;
      } else {
        return productLineBuilder_.getMessage();
      }
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public Builder setProductLine(org.camelia.example.lego.ProductLine value) {
      if (productLineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productLine_ = value;
        onChanged();
      } else {
        productLineBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public Builder setProductLine(
        org.camelia.example.lego.ProductLine.Builder builderForValue) {
      if (productLineBuilder_ == null) {
        productLine_ = builderForValue.build();
        onChanged();
      } else {
        productLineBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public Builder mergeProductLine(org.camelia.example.lego.ProductLine value) {
      if (productLineBuilder_ == null) {
        if (productLine_ != null) {
          productLine_ =
            org.camelia.example.lego.ProductLine.newBuilder(productLine_).mergeFrom(value).buildPartial();
        } else {
          productLine_ = value;
        }
        onChanged();
      } else {
        productLineBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public Builder clearProductLine() {
      if (productLineBuilder_ == null) {
        productLine_ = null;
        onChanged();
      } else {
        productLine_ = null;
        productLineBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public org.camelia.example.lego.ProductLine.Builder getProductLineBuilder() {
      
      onChanged();
      return getProductLineFieldBuilder().getBuilder();
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    public org.camelia.example.lego.ProductLineOrBuilder getProductLineOrBuilder() {
      if (productLineBuilder_ != null) {
        return productLineBuilder_.getMessageOrBuilder();
      } else {
        return productLine_ == null ?
            org.camelia.example.lego.ProductLine.getDefaultInstance() : productLine_;
      }
    }
    /**
     * <code>.lego.ProductLine product_line = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.camelia.example.lego.ProductLine, org.camelia.example.lego.ProductLine.Builder, org.camelia.example.lego.ProductLineOrBuilder> 
        getProductLineFieldBuilder() {
      if (productLineBuilder_ == null) {
        productLineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.camelia.example.lego.ProductLine, org.camelia.example.lego.ProductLine.Builder, org.camelia.example.lego.ProductLineOrBuilder>(
                getProductLine(),
                getParentForChildren(),
                isClean());
        productLine_ = null;
      }
      return productLineBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lego.LegoPieceRequest)
  }

  // @@protoc_insertion_point(class_scope:lego.LegoPieceRequest)
  private static final org.camelia.example.lego.LegoPieceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.camelia.example.lego.LegoPieceRequest();
  }

  public static org.camelia.example.lego.LegoPieceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LegoPieceRequest>
      PARSER = new com.google.protobuf.AbstractParser<LegoPieceRequest>() {
    @java.lang.Override
    public LegoPieceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LegoPieceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LegoPieceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LegoPieceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.camelia.example.lego.LegoPieceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

