// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meter.proto

package org.camelia.example.meter;

/**
 * Protobuf type {@code meter.AccountInfo}
 */
public  final class AccountInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meter.AccountInfo)
    AccountInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountInfo.newBuilder() to construct.
  private AccountInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountInfo() {
    accountId_ = 0;
    amount_ = 0D;
    balance_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccountInfo(
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
          case 8: {

            accountId_ = input.readInt32();
            break;
          }
          case 17: {

            amount_ = input.readDouble();
            break;
          }
          case 25: {

            balance_ = input.readDouble();
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
    return org.camelia.example.meter.MeterProto.internal_static_meter_AccountInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.camelia.example.meter.MeterProto.internal_static_meter_AccountInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.camelia.example.meter.AccountInfo.class, org.camelia.example.meter.AccountInfo.Builder.class);
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
  private int accountId_;
  /**
   * <code>int32 account_id = 1;</code>
   */
  public int getAccountId() {
    return accountId_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <code>double amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int BALANCE_FIELD_NUMBER = 3;
  private double balance_;
  /**
   * <code>double balance = 3;</code>
   */
  public double getBalance() {
    return balance_;
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
    if (accountId_ != 0) {
      output.writeInt32(1, accountId_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    if (balance_ != 0D) {
      output.writeDouble(3, balance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, accountId_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
    }
    if (balance_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, balance_);
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
    if (!(obj instanceof org.camelia.example.meter.AccountInfo)) {
      return super.equals(obj);
    }
    org.camelia.example.meter.AccountInfo other = (org.camelia.example.meter.AccountInfo) obj;

    boolean result = true;
    result = result && (getAccountId()
        == other.getAccountId());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
    result = result && (
        java.lang.Double.doubleToLongBits(getBalance())
        == java.lang.Double.doubleToLongBits(
            other.getBalance()));
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
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBalance()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.camelia.example.meter.AccountInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.meter.AccountInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.AccountInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.meter.AccountInfo parseFrom(
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
  public static Builder newBuilder(org.camelia.example.meter.AccountInfo prototype) {
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
   * Protobuf type {@code meter.AccountInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meter.AccountInfo)
      org.camelia.example.meter.AccountInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_AccountInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_AccountInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.camelia.example.meter.AccountInfo.class, org.camelia.example.meter.AccountInfo.Builder.class);
    }

    // Construct using org.camelia.example.meter.AccountInfo.newBuilder()
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
      accountId_ = 0;

      amount_ = 0D;

      balance_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.camelia.example.meter.MeterProto.internal_static_meter_AccountInfo_descriptor;
    }

    @java.lang.Override
    public org.camelia.example.meter.AccountInfo getDefaultInstanceForType() {
      return org.camelia.example.meter.AccountInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.camelia.example.meter.AccountInfo build() {
      org.camelia.example.meter.AccountInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.camelia.example.meter.AccountInfo buildPartial() {
      org.camelia.example.meter.AccountInfo result = new org.camelia.example.meter.AccountInfo(this);
      result.accountId_ = accountId_;
      result.amount_ = amount_;
      result.balance_ = balance_;
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
      if (other instanceof org.camelia.example.meter.AccountInfo) {
        return mergeFrom((org.camelia.example.meter.AccountInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.camelia.example.meter.AccountInfo other) {
      if (other == org.camelia.example.meter.AccountInfo.getDefaultInstance()) return this;
      if (other.getAccountId() != 0) {
        setAccountId(other.getAccountId());
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (other.getBalance() != 0D) {
        setBalance(other.getBalance());
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
      org.camelia.example.meter.AccountInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.camelia.example.meter.AccountInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int accountId_ ;
    /**
     * <code>int32 account_id = 1;</code>
     */
    public int getAccountId() {
      return accountId_;
    }
    /**
     * <code>int32 account_id = 1;</code>
     */
    public Builder setAccountId(int value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 account_id = 1;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <code>double amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private double balance_ ;
    /**
     * <code>double balance = 3;</code>
     */
    public double getBalance() {
      return balance_;
    }
    /**
     * <code>double balance = 3;</code>
     */
    public Builder setBalance(double value) {
      
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double balance = 3;</code>
     */
    public Builder clearBalance() {
      
      balance_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:meter.AccountInfo)
  }

  // @@protoc_insertion_point(class_scope:meter.AccountInfo)
  private static final org.camelia.example.meter.AccountInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.camelia.example.meter.AccountInfo();
  }

  public static org.camelia.example.meter.AccountInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountInfo>
      PARSER = new com.google.protobuf.AbstractParser<AccountInfo>() {
    @java.lang.Override
    public AccountInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccountInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccountInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.camelia.example.meter.AccountInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
