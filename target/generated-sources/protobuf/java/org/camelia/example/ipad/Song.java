// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipad.proto

package org.camelia.example.ipad;

/**
 * Protobuf type {@code ipad.Song}
 */
public  final class Song extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ipad.Song)
    SongOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Song.newBuilder() to construct.
  private Song(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Song() {
    id_ = 0;
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Song(
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

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            org.camelia.example.ipad.Artist.Builder subBuilder = null;
            if (artist_ != null) {
              subBuilder = artist_.toBuilder();
            }
            artist_ = input.readMessage(org.camelia.example.ipad.Artist.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(artist_);
              artist_ = subBuilder.buildPartial();
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
    return org.camelia.example.ipad.IPadProto.internal_static_ipad_Song_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.camelia.example.ipad.IPadProto.internal_static_ipad_Song_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.camelia.example.ipad.Song.class, org.camelia.example.ipad.Song.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARTIST_FIELD_NUMBER = 3;
  private org.camelia.example.ipad.Artist artist_;
  /**
   * <code>.ipad.Artist artist = 3;</code>
   */
  public boolean hasArtist() {
    return artist_ != null;
  }
  /**
   * <code>.ipad.Artist artist = 3;</code>
   */
  public org.camelia.example.ipad.Artist getArtist() {
    return artist_ == null ? org.camelia.example.ipad.Artist.getDefaultInstance() : artist_;
  }
  /**
   * <code>.ipad.Artist artist = 3;</code>
   */
  public org.camelia.example.ipad.ArtistOrBuilder getArtistOrBuilder() {
    return getArtist();
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (artist_ != null) {
      output.writeMessage(3, getArtist());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (artist_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getArtist());
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
    if (!(obj instanceof org.camelia.example.ipad.Song)) {
      return super.equals(obj);
    }
    org.camelia.example.ipad.Song other = (org.camelia.example.ipad.Song) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && (hasArtist() == other.hasArtist());
    if (hasArtist()) {
      result = result && getArtist()
          .equals(other.getArtist());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasArtist()) {
      hash = (37 * hash) + ARTIST_FIELD_NUMBER;
      hash = (53 * hash) + getArtist().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.camelia.example.ipad.Song parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.ipad.Song parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.camelia.example.ipad.Song parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.ipad.Song parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.camelia.example.ipad.Song parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.camelia.example.ipad.Song parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.camelia.example.ipad.Song parseFrom(
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
  public static Builder newBuilder(org.camelia.example.ipad.Song prototype) {
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
   * Protobuf type {@code ipad.Song}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ipad.Song)
      org.camelia.example.ipad.SongOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.camelia.example.ipad.IPadProto.internal_static_ipad_Song_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.camelia.example.ipad.IPadProto.internal_static_ipad_Song_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.camelia.example.ipad.Song.class, org.camelia.example.ipad.Song.Builder.class);
    }

    // Construct using org.camelia.example.ipad.Song.newBuilder()
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
      id_ = 0;

      name_ = "";

      if (artistBuilder_ == null) {
        artist_ = null;
      } else {
        artist_ = null;
        artistBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.camelia.example.ipad.IPadProto.internal_static_ipad_Song_descriptor;
    }

    @java.lang.Override
    public org.camelia.example.ipad.Song getDefaultInstanceForType() {
      return org.camelia.example.ipad.Song.getDefaultInstance();
    }

    @java.lang.Override
    public org.camelia.example.ipad.Song build() {
      org.camelia.example.ipad.Song result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.camelia.example.ipad.Song buildPartial() {
      org.camelia.example.ipad.Song result = new org.camelia.example.ipad.Song(this);
      result.id_ = id_;
      result.name_ = name_;
      if (artistBuilder_ == null) {
        result.artist_ = artist_;
      } else {
        result.artist_ = artistBuilder_.build();
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
      if (other instanceof org.camelia.example.ipad.Song) {
        return mergeFrom((org.camelia.example.ipad.Song)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.camelia.example.ipad.Song other) {
      if (other == org.camelia.example.ipad.Song.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasArtist()) {
        mergeArtist(other.getArtist());
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
      org.camelia.example.ipad.Song parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.camelia.example.ipad.Song) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private org.camelia.example.ipad.Artist artist_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.camelia.example.ipad.Artist, org.camelia.example.ipad.Artist.Builder, org.camelia.example.ipad.ArtistOrBuilder> artistBuilder_;
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public boolean hasArtist() {
      return artistBuilder_ != null || artist_ != null;
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public org.camelia.example.ipad.Artist getArtist() {
      if (artistBuilder_ == null) {
        return artist_ == null ? org.camelia.example.ipad.Artist.getDefaultInstance() : artist_;
      } else {
        return artistBuilder_.getMessage();
      }
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public Builder setArtist(org.camelia.example.ipad.Artist value) {
      if (artistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artist_ = value;
        onChanged();
      } else {
        artistBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public Builder setArtist(
        org.camelia.example.ipad.Artist.Builder builderForValue) {
      if (artistBuilder_ == null) {
        artist_ = builderForValue.build();
        onChanged();
      } else {
        artistBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public Builder mergeArtist(org.camelia.example.ipad.Artist value) {
      if (artistBuilder_ == null) {
        if (artist_ != null) {
          artist_ =
            org.camelia.example.ipad.Artist.newBuilder(artist_).mergeFrom(value).buildPartial();
        } else {
          artist_ = value;
        }
        onChanged();
      } else {
        artistBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public Builder clearArtist() {
      if (artistBuilder_ == null) {
        artist_ = null;
        onChanged();
      } else {
        artist_ = null;
        artistBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public org.camelia.example.ipad.Artist.Builder getArtistBuilder() {
      
      onChanged();
      return getArtistFieldBuilder().getBuilder();
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    public org.camelia.example.ipad.ArtistOrBuilder getArtistOrBuilder() {
      if (artistBuilder_ != null) {
        return artistBuilder_.getMessageOrBuilder();
      } else {
        return artist_ == null ?
            org.camelia.example.ipad.Artist.getDefaultInstance() : artist_;
      }
    }
    /**
     * <code>.ipad.Artist artist = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.camelia.example.ipad.Artist, org.camelia.example.ipad.Artist.Builder, org.camelia.example.ipad.ArtistOrBuilder> 
        getArtistFieldBuilder() {
      if (artistBuilder_ == null) {
        artistBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.camelia.example.ipad.Artist, org.camelia.example.ipad.Artist.Builder, org.camelia.example.ipad.ArtistOrBuilder>(
                getArtist(),
                getParentForChildren(),
                isClean());
        artist_ = null;
      }
      return artistBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ipad.Song)
  }

  // @@protoc_insertion_point(class_scope:ipad.Song)
  private static final org.camelia.example.ipad.Song DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.camelia.example.ipad.Song();
  }

  public static org.camelia.example.ipad.Song getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Song>
      PARSER = new com.google.protobuf.AbstractParser<Song>() {
    @java.lang.Override
    public Song parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Song(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Song> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Song> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.camelia.example.ipad.Song getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

