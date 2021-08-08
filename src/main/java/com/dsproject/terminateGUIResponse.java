// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package com.dsproject;

/**
 * Protobuf type {@code terminateGUIResponse}
 */
public  final class terminateGUIResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:terminateGUIResponse)
    terminateGUIResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use terminateGUIResponse.newBuilder() to construct.
  private terminateGUIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private terminateGUIResponse() {
    tgresponse_ = "";
    tgresponsecode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private terminateGUIResponse(
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

            tgresponse_ = s;
            break;
          }
          case 16: {

            tgresponsecode_ = input.readInt32();
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
    return com.dsproject.PollutantGUIImpl.internal_static_terminateGUIResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dsproject.PollutantGUIImpl.internal_static_terminateGUIResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dsproject.terminateGUIResponse.class, com.dsproject.terminateGUIResponse.Builder.class);
  }

  public static final int TGRESPONSE_FIELD_NUMBER = 1;
  private volatile java.lang.Object tgresponse_;
  /**
   * <code>string tgresponse = 1;</code>
   */
  public java.lang.String getTgresponse() {
    java.lang.Object ref = tgresponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tgresponse_ = s;
      return s;
    }
  }
  /**
   * <code>string tgresponse = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTgresponseBytes() {
    java.lang.Object ref = tgresponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tgresponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TGRESPONSECODE_FIELD_NUMBER = 2;
  private int tgresponsecode_;
  /**
   * <code>int32 tgresponsecode = 2;</code>
   */
  public int getTgresponsecode() {
    return tgresponsecode_;
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
    if (!getTgresponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tgresponse_);
    }
    if (tgresponsecode_ != 0) {
      output.writeInt32(2, tgresponsecode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTgresponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tgresponse_);
    }
    if (tgresponsecode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, tgresponsecode_);
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
    if (!(obj instanceof com.dsproject.terminateGUIResponse)) {
      return super.equals(obj);
    }
    com.dsproject.terminateGUIResponse other = (com.dsproject.terminateGUIResponse) obj;

    boolean result = true;
    result = result && getTgresponse()
        .equals(other.getTgresponse());
    result = result && (getTgresponsecode()
        == other.getTgresponsecode());
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
    hash = (37 * hash) + TGRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getTgresponse().hashCode();
    hash = (37 * hash) + TGRESPONSECODE_FIELD_NUMBER;
    hash = (53 * hash) + getTgresponsecode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dsproject.terminateGUIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.terminateGUIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dsproject.terminateGUIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.terminateGUIResponse parseFrom(
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
  public static Builder newBuilder(com.dsproject.terminateGUIResponse prototype) {
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
   * Protobuf type {@code terminateGUIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:terminateGUIResponse)
      com.dsproject.terminateGUIResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dsproject.PollutantGUIImpl.internal_static_terminateGUIResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dsproject.PollutantGUIImpl.internal_static_terminateGUIResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dsproject.terminateGUIResponse.class, com.dsproject.terminateGUIResponse.Builder.class);
    }

    // Construct using com.dsproject.terminateGUIResponse.newBuilder()
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
      tgresponse_ = "";

      tgresponsecode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dsproject.PollutantGUIImpl.internal_static_terminateGUIResponse_descriptor;
    }

    @java.lang.Override
    public com.dsproject.terminateGUIResponse getDefaultInstanceForType() {
      return com.dsproject.terminateGUIResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dsproject.terminateGUIResponse build() {
      com.dsproject.terminateGUIResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dsproject.terminateGUIResponse buildPartial() {
      com.dsproject.terminateGUIResponse result = new com.dsproject.terminateGUIResponse(this);
      result.tgresponse_ = tgresponse_;
      result.tgresponsecode_ = tgresponsecode_;
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
      if (other instanceof com.dsproject.terminateGUIResponse) {
        return mergeFrom((com.dsproject.terminateGUIResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dsproject.terminateGUIResponse other) {
      if (other == com.dsproject.terminateGUIResponse.getDefaultInstance()) return this;
      if (!other.getTgresponse().isEmpty()) {
        tgresponse_ = other.tgresponse_;
        onChanged();
      }
      if (other.getTgresponsecode() != 0) {
        setTgresponsecode(other.getTgresponsecode());
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
      com.dsproject.terminateGUIResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dsproject.terminateGUIResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tgresponse_ = "";
    /**
     * <code>string tgresponse = 1;</code>
     */
    public java.lang.String getTgresponse() {
      java.lang.Object ref = tgresponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tgresponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tgresponse = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTgresponseBytes() {
      java.lang.Object ref = tgresponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tgresponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tgresponse = 1;</code>
     */
    public Builder setTgresponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tgresponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tgresponse = 1;</code>
     */
    public Builder clearTgresponse() {
      
      tgresponse_ = getDefaultInstance().getTgresponse();
      onChanged();
      return this;
    }
    /**
     * <code>string tgresponse = 1;</code>
     */
    public Builder setTgresponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tgresponse_ = value;
      onChanged();
      return this;
    }

    private int tgresponsecode_ ;
    /**
     * <code>int32 tgresponsecode = 2;</code>
     */
    public int getTgresponsecode() {
      return tgresponsecode_;
    }
    /**
     * <code>int32 tgresponsecode = 2;</code>
     */
    public Builder setTgresponsecode(int value) {
      
      tgresponsecode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 tgresponsecode = 2;</code>
     */
    public Builder clearTgresponsecode() {
      
      tgresponsecode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:terminateGUIResponse)
  }

  // @@protoc_insertion_point(class_scope:terminateGUIResponse)
  private static final com.dsproject.terminateGUIResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dsproject.terminateGUIResponse();
  }

  public static com.dsproject.terminateGUIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<terminateGUIResponse>
      PARSER = new com.google.protobuf.AbstractParser<terminateGUIResponse>() {
    @java.lang.Override
    public terminateGUIResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new terminateGUIResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<terminateGUIResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<terminateGUIResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dsproject.terminateGUIResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
