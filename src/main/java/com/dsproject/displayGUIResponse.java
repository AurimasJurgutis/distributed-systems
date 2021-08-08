// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package com.dsproject;

/**
 * Protobuf type {@code displayGUIResponse}
 */
public  final class displayGUIResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:displayGUIResponse)
    displayGUIResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use displayGUIResponse.newBuilder() to construct.
  private displayGUIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private displayGUIResponse() {
    dgresponse_ = "";
    dgresponsecode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private displayGUIResponse(
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

            dgresponse_ = s;
            break;
          }
          case 16: {

            dgresponsecode_ = input.readInt32();
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
    return com.dsproject.PollutantGUIImpl.internal_static_displayGUIResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dsproject.PollutantGUIImpl.internal_static_displayGUIResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dsproject.displayGUIResponse.class, com.dsproject.displayGUIResponse.Builder.class);
  }

  public static final int DGRESPONSE_FIELD_NUMBER = 1;
  private volatile java.lang.Object dgresponse_;
  /**
   * <code>string dgresponse = 1;</code>
   */
  public java.lang.String getDgresponse() {
    java.lang.Object ref = dgresponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dgresponse_ = s;
      return s;
    }
  }
  /**
   * <code>string dgresponse = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDgresponseBytes() {
    java.lang.Object ref = dgresponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dgresponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DGRESPONSECODE_FIELD_NUMBER = 2;
  private int dgresponsecode_;
  /**
   * <code>int32 dgresponsecode = 2;</code>
   */
  public int getDgresponsecode() {
    return dgresponsecode_;
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
    if (!getDgresponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dgresponse_);
    }
    if (dgresponsecode_ != 0) {
      output.writeInt32(2, dgresponsecode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDgresponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dgresponse_);
    }
    if (dgresponsecode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dgresponsecode_);
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
    if (!(obj instanceof com.dsproject.displayGUIResponse)) {
      return super.equals(obj);
    }
    com.dsproject.displayGUIResponse other = (com.dsproject.displayGUIResponse) obj;

    boolean result = true;
    result = result && getDgresponse()
        .equals(other.getDgresponse());
    result = result && (getDgresponsecode()
        == other.getDgresponsecode());
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
    hash = (37 * hash) + DGRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getDgresponse().hashCode();
    hash = (37 * hash) + DGRESPONSECODE_FIELD_NUMBER;
    hash = (53 * hash) + getDgresponsecode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dsproject.displayGUIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.displayGUIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dsproject.displayGUIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.displayGUIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dsproject.displayGUIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dsproject.displayGUIResponse parseFrom(
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
  public static Builder newBuilder(com.dsproject.displayGUIResponse prototype) {
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
   * Protobuf type {@code displayGUIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:displayGUIResponse)
      com.dsproject.displayGUIResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dsproject.PollutantGUIImpl.internal_static_displayGUIResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dsproject.PollutantGUIImpl.internal_static_displayGUIResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dsproject.displayGUIResponse.class, com.dsproject.displayGUIResponse.Builder.class);
    }

    // Construct using com.dsproject.displayGUIResponse.newBuilder()
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
      dgresponse_ = "";

      dgresponsecode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dsproject.PollutantGUIImpl.internal_static_displayGUIResponse_descriptor;
    }

    @java.lang.Override
    public com.dsproject.displayGUIResponse getDefaultInstanceForType() {
      return com.dsproject.displayGUIResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.dsproject.displayGUIResponse build() {
      com.dsproject.displayGUIResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dsproject.displayGUIResponse buildPartial() {
      com.dsproject.displayGUIResponse result = new com.dsproject.displayGUIResponse(this);
      result.dgresponse_ = dgresponse_;
      result.dgresponsecode_ = dgresponsecode_;
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
      if (other instanceof com.dsproject.displayGUIResponse) {
        return mergeFrom((com.dsproject.displayGUIResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dsproject.displayGUIResponse other) {
      if (other == com.dsproject.displayGUIResponse.getDefaultInstance()) return this;
      if (!other.getDgresponse().isEmpty()) {
        dgresponse_ = other.dgresponse_;
        onChanged();
      }
      if (other.getDgresponsecode() != 0) {
        setDgresponsecode(other.getDgresponsecode());
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
      com.dsproject.displayGUIResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dsproject.displayGUIResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dgresponse_ = "";
    /**
     * <code>string dgresponse = 1;</code>
     */
    public java.lang.String getDgresponse() {
      java.lang.Object ref = dgresponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dgresponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dgresponse = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDgresponseBytes() {
      java.lang.Object ref = dgresponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dgresponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dgresponse = 1;</code>
     */
    public Builder setDgresponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dgresponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dgresponse = 1;</code>
     */
    public Builder clearDgresponse() {
      
      dgresponse_ = getDefaultInstance().getDgresponse();
      onChanged();
      return this;
    }
    /**
     * <code>string dgresponse = 1;</code>
     */
    public Builder setDgresponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dgresponse_ = value;
      onChanged();
      return this;
    }

    private int dgresponsecode_ ;
    /**
     * <code>int32 dgresponsecode = 2;</code>
     */
    public int getDgresponsecode() {
      return dgresponsecode_;
    }
    /**
     * <code>int32 dgresponsecode = 2;</code>
     */
    public Builder setDgresponsecode(int value) {
      
      dgresponsecode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dgresponsecode = 2;</code>
     */
    public Builder clearDgresponsecode() {
      
      dgresponsecode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:displayGUIResponse)
  }

  // @@protoc_insertion_point(class_scope:displayGUIResponse)
  private static final com.dsproject.displayGUIResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dsproject.displayGUIResponse();
  }

  public static com.dsproject.displayGUIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<displayGUIResponse>
      PARSER = new com.google.protobuf.AbstractParser<displayGUIResponse>() {
    @java.lang.Override
    public displayGUIResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new displayGUIResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<displayGUIResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<displayGUIResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dsproject.displayGUIResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

