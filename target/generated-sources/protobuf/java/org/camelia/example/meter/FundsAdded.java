// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meter.proto

package org.camelia.example.meter;

/**
 * Protobuf type {@code meter.FundsAdded}
 */
public  final class FundsAdded extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meter.FundsAdded)
    FundsAddedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FundsAdded.newBuilder() to construct.
  private FundsAdded(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FundsAdded() {
    amount_ = 0D;
    message_ = "";
    fromAccountId_ = 0;
    toAccountId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FundsAdded(
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
          case 9: {

            amount_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 24: {

            fromAccountId_ = input.readInt32();
            break;
          }
          case 32: {

            toAccountId_ = input.readInt32();
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
    return org.camelia.example.meter.MeterProto.internal_static_meter_FundsAdded_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.camelia.example.meter.MeterProto.internal_static_meter_FundsAdded_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.camelia.example.meter.FundsAdded.class, org.camelia.example.meter.FundsAdded.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private double amount_;
  /**
   * <code>double amount = 1;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_ACCOUNT_ID_FIELD_NUMBER = 3;
  private int fromAccountId_;
  /**
   * <code>int32 from_account_id = 3;</code>
   */
  public int getFromAccountId() {
    return fromAccountId_;
  }

  public static final int TO_ACCOUNT_ID_FIELD_NUMBER = 4;
  private int toAccountId_;
  /**
   * <code>int32 to_account_id = 4;</code>
   */
  public int getToAccountId() {
    return toAccountId_;
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
    if (amount_ != 0D) {
      output.writeDouble(1, amount_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (fromAccountId_ != 0) {
      output.writeInt32(3, fromAccountId_);
    }
    if (toAccountId_ != 0) {
      output.writeInt32(4, toAccountId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, amount_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (fromAccountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fromAccountId_);
    }
    if (toAccountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, toAccountId_);
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
    if (!(obj instanceof org.camelia.example.meter.FundsAdded)) {
      return super.equals(obj);
    }
    org.camelia.example.meter.FundsAdded other = (org.camelia.example.meter.FundsAdded) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getFromAccountId()
        == other.getFromAccountId());
    result = result && (getToAccountId()
        == other.getToAccountId());
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + FROM_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFromAccountId();
    hash = (37 * hash) + TO_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getToAccountId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.camelia.example.meter.FundsAdded parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.meter.FundsAdded parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.FundsAdded parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.FundsAdded parseFrom(
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
  public static Builder newBuilder(org.camelia.example.meter.FundsAdded prototype) {
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
   * Protobuf type {@code meter.FundsAdded}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meter.FundsAdded)
      org.camelia.example.meter.FundsAddedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_FundsAdded_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_FundsAdded_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.camelia.example.meter.FundsAdded.class, org.camelia.example.meter.FundsAdded.Builder.class);
    }

    // Construct using org.camelia.example.meter.FundsAdded.newBuilder()
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
      amount_ = 0D;

      message_ = "";

      fromAccountId_ = 0;

      toAccountId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_FundsAdded_descriptor;
    }

    @java.lang.Override
    public org.camelia.example.meter.FundsAdded getDefaultInstanceForType() {
      return org.camelia.example.meter.FundsAdded.getDefaultInstance();
    }

    @java.lang.Override
    public org.camelia.example.meter.FundsAdded build() {
      org.camelia.example.meter.FundsAdded result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.camelia.example.meter.FundsAdded buildPartial() {
      org.camelia.example.meter.FundsAdded result = new org.camelia.example.meter.FundsAdded(this);
      result.amount_ = amount_;
      result.message_ = message_;
      result.fromAccountId_ = fromAccountId_;
      result.toAccountId_ = toAccountId_;
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
      if (other instanceof org.camelia.example.meter.FundsAdded) {
        return mergeFrom((org.camelia.example.meter.FundsAdded)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.camelia.example.meter.FundsAdded other) {
      if (other == org.camelia.example.meter.FundsAdded.getDefaultInstance()) return this;
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getFromAccountId() != 0) {
        setFromAccountId(other.getFromAccountId());
      }
      if (other.getToAccountId() != 0) {
        setToAccountId(other.getToAccountId());
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
      org.camelia.example.meter.FundsAdded parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.camelia.example.meter.FundsAdded) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double amount_ ;
    /**
     * <code>double amount = 1;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double amount = 1;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double amount = 1;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private int fromAccountId_ ;
    /**
     * <code>int32 from_account_id = 3;</code>
     */
    public int getFromAccountId() {
      return fromAccountId_;
    }
    /**
     * <code>int32 from_account_id = 3;</code>
     */
    public Builder setFromAccountId(int value) {
      
      fromAccountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 from_account_id = 3;</code>
     */
    public Builder clearFromAccountId() {
      
      fromAccountId_ = 0;
      onChanged();
      return this;
    }

    private int toAccountId_ ;
    /**
     * <code>int32 to_account_id = 4;</code>
     */
    public int getToAccountId() {
      return toAccountId_;
    }
    /**
     * <code>int32 to_account_id = 4;</code>
     */
    public Builder setToAccountId(int value) {
      
      toAccountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 to_account_id = 4;</code>
     */
    public Builder clearToAccountId() {
      
      toAccountId_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:meter.FundsAdded)
  }

  // @@protoc_insertion_point(class_scope:meter.FundsAdded)
  private static final org.camelia.example.meter.FundsAdded DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.camelia.example.meter.FundsAdded();
  }

  public static org.camelia.example.meter.FundsAdded getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FundsAdded>
      PARSER = new com.google.protobuf.AbstractParser<FundsAdded>() {
    @java.lang.Override
    public FundsAdded parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FundsAdded(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FundsAdded> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FundsAdded> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.camelia.example.meter.FundsAdded getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

