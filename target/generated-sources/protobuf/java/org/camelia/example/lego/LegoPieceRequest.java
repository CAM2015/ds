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
    color_ = "";
    material_ = "";
    shape_ = com.google.protobuf.LazyStringArrayList.EMPTY;
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
            java.lang.String s = input.readStringRequireUtf8();

            color_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            material_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              shape_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            shape_.add(s);
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              brick_ = com.google.protobuf.MapField.newMapField(
                  BrickDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            brick__ = input.readMessage(
                BrickDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            brick_.getMutableMap().put(
                brick__.getKey(), brick__.getValue());
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        shape_ = shape_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetBrick();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.camelia.example.lego.LegoPieceRequest.class, org.camelia.example.lego.LegoPieceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int COLOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object color_;
  /**
   * <code>string color = 1;</code>
   */
  public java.lang.String getColor() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      color_ = s;
      return s;
    }
  }
  /**
   * <code>string color = 1;</code>
   */
  public com.google.protobuf.ByteString
      getColorBytes() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      color_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MATERIAL_FIELD_NUMBER = 2;
  private volatile java.lang.Object material_;
  /**
   * <code>string material = 2;</code>
   */
  public java.lang.String getMaterial() {
    java.lang.Object ref = material_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      material_ = s;
      return s;
    }
  }
  /**
   * <code>string material = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMaterialBytes() {
    java.lang.Object ref = material_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      material_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHAPE_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList shape_;
  /**
   * <code>repeated string shape = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getShapeList() {
    return shape_;
  }
  /**
   * <code>repeated string shape = 3;</code>
   */
  public int getShapeCount() {
    return shape_.size();
  }
  /**
   * <code>repeated string shape = 3;</code>
   */
  public java.lang.String getShape(int index) {
    return shape_.get(index);
  }
  /**
   * <code>repeated string shape = 3;</code>
   */
  public com.google.protobuf.ByteString
      getShapeBytes(int index) {
    return shape_.getByteString(index);
  }

  public static final int BRICK_FIELD_NUMBER = 4;
  private static final class BrickDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.camelia.example.lego.LegoProto.internal_static_lego_LegoPieceRequest_BrickEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> brick_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetBrick() {
    if (brick_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BrickDefaultEntryHolder.defaultEntry);
    }
    return brick_;
  }

  public int getBrickCount() {
    return internalGetBrick().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; brick = 4;</code>
   */

  public boolean containsBrick(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetBrick().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBrickMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getBrick() {
    return getBrickMap();
  }
  /**
   * <code>map&lt;string, string&gt; brick = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getBrickMap() {
    return internalGetBrick().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; brick = 4;</code>
   */

  public java.lang.String getBrickOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBrick().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; brick = 4;</code>
   */

  public java.lang.String getBrickOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBrick().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getColorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, color_);
    }
    if (!getMaterialBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, material_);
    }
    for (int i = 0; i < shape_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shape_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBrick(),
        BrickDefaultEntryHolder.defaultEntry,
        4);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getColorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, color_);
    }
    if (!getMaterialBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, material_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < shape_.size(); i++) {
        dataSize += computeStringSizeNoTag(shape_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getShapeList().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetBrick().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      brick__ = BrickDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, brick__);
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
    result = result && getColor()
        .equals(other.getColor());
    result = result && getMaterial()
        .equals(other.getMaterial());
    result = result && getShapeList()
        .equals(other.getShapeList());
    result = result && internalGetBrick().equals(
        other.internalGetBrick());
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
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor().hashCode();
    hash = (37 * hash) + MATERIAL_FIELD_NUMBER;
    hash = (53 * hash) + getMaterial().hashCode();
    if (getShapeCount() > 0) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShapeList().hashCode();
    }
    if (!internalGetBrick().getMap().isEmpty()) {
      hash = (37 * hash) + BRICK_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBrick().hashCode();
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

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetBrick();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableBrick();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
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
      color_ = "";

      material_ = "";

      shape_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableBrick().clear();
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
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.color_ = color_;
      result.material_ = material_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        shape_ = shape_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.shape_ = shape_;
      result.brick_ = internalGetBrick();
      result.brick_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (!other.getColor().isEmpty()) {
        color_ = other.color_;
        onChanged();
      }
      if (!other.getMaterial().isEmpty()) {
        material_ = other.material_;
        onChanged();
      }
      if (!other.shape_.isEmpty()) {
        if (shape_.isEmpty()) {
          shape_ = other.shape_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureShapeIsMutable();
          shape_.addAll(other.shape_);
        }
        onChanged();
      }
      internalGetMutableBrick().mergeFrom(
          other.internalGetBrick());
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
    private int bitField0_;

    private java.lang.Object color_ = "";
    /**
     * <code>string color = 1;</code>
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string color = 1;</code>
     */
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder setColor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder clearColor() {
      
      color_ = getDefaultInstance().getColor();
      onChanged();
      return this;
    }
    /**
     * <code>string color = 1;</code>
     */
    public Builder setColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      color_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object material_ = "";
    /**
     * <code>string material = 2;</code>
     */
    public java.lang.String getMaterial() {
      java.lang.Object ref = material_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        material_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string material = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMaterialBytes() {
      java.lang.Object ref = material_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        material_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string material = 2;</code>
     */
    public Builder setMaterial(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      material_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string material = 2;</code>
     */
    public Builder clearMaterial() {
      
      material_ = getDefaultInstance().getMaterial();
      onChanged();
      return this;
    }
    /**
     * <code>string material = 2;</code>
     */
    public Builder setMaterialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      material_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList shape_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureShapeIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        shape_ = new com.google.protobuf.LazyStringArrayList(shape_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getShapeList() {
      return shape_.getUnmodifiableView();
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public int getShapeCount() {
      return shape_.size();
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public java.lang.String getShape(int index) {
      return shape_.get(index);
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public com.google.protobuf.ByteString
        getShapeBytes(int index) {
      return shape_.getByteString(index);
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public Builder setShape(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureShapeIsMutable();
      shape_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public Builder addShape(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureShapeIsMutable();
      shape_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public Builder addAllShape(
        java.lang.Iterable<java.lang.String> values) {
      ensureShapeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, shape_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public Builder clearShape() {
      shape_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string shape = 3;</code>
     */
    public Builder addShapeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureShapeIsMutable();
      shape_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> brick_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetBrick() {
      if (brick_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BrickDefaultEntryHolder.defaultEntry);
      }
      return brick_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableBrick() {
      onChanged();;
      if (brick_ == null) {
        brick_ = com.google.protobuf.MapField.newMapField(
            BrickDefaultEntryHolder.defaultEntry);
      }
      if (!brick_.isMutable()) {
        brick_ = brick_.copy();
      }
      return brick_;
    }

    public int getBrickCount() {
      return internalGetBrick().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public boolean containsBrick(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBrick().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBrickMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getBrick() {
      return getBrickMap();
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getBrickMap() {
      return internalGetBrick().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public java.lang.String getBrickOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBrick().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public java.lang.String getBrickOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBrick().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBrick() {
      internalGetMutableBrick().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public Builder removeBrick(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBrick().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableBrick() {
      return internalGetMutableBrick().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */
    public Builder putBrick(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBrick().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; brick = 4;</code>
     */

    public Builder putAllBrick(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableBrick().getMutableMap()
          .putAll(values);
      return this;
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

