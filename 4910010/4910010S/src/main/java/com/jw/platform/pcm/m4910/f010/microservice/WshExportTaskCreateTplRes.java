// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/exporttask.proto

package com.jw.platform.pcm.m4910.f010.microservice;

/**
 * Protobuf type {@code exporttask.WshExportTaskCreateTplRes}
 */
public  final class WshExportTaskCreateTplRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:exporttask.WshExportTaskCreateTplRes)
    WshExportTaskCreateTplResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WshExportTaskCreateTplRes.newBuilder() to construct.
  private WshExportTaskCreateTplRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WshExportTaskCreateTplRes() {
    errCode_ = "";
    errMsg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WshExportTaskCreateTplRes(
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

            errCode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errMsg_ = s;
            break;
          }
          case 26: {
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
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
    return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskCreateTplRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskCreateTplRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.class, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.Builder.class);
  }

  public static final int ERRCODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object errCode_;
  /**
   * <code>string errCode = 1;</code>
   */
  public java.lang.String getErrCode() {
    java.lang.Object ref = errCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errCode_ = s;
      return s;
    }
  }
  /**
   * <code>string errCode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getErrCodeBytes() {
    java.lang.Object ref = errCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRMSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object errMsg_;
  /**
   * <code>string errMsg = 2;</code>
   */
  public java.lang.String getErrMsg() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string errMsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrMsgBytes() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl data_;
  /**
   * <code>.exporttask.WshExportTpl data = 3;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.exporttask.WshExportTpl data = 3;</code>
   */
  public com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl getData() {
    return data_ == null ? com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.getDefaultInstance() : data_;
  }
  /**
   * <code>.exporttask.WshExportTpl data = 3;</code>
   */
  public com.jw.platform.pcm.m4910.f010.microservice.WshExportTplOrBuilder getDataOrBuilder() {
    return getData();
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
    if (!getErrCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, errCode_);
    }
    if (!getErrMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errMsg_);
    }
    if (data_ != null) {
      output.writeMessage(3, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, errCode_);
    }
    if (!getErrMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errMsg_);
    }
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getData());
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
    if (!(obj instanceof com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes)) {
      return super.equals(obj);
    }
    com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes other = (com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes) obj;

    boolean result = true;
    result = result && getErrCode()
        .equals(other.getErrCode());
    result = result && getErrMsg()
        .equals(other.getErrMsg());
    result = result && (hasData() == other.hasData());
    if (hasData()) {
      result = result && getData()
          .equals(other.getData());
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
    hash = (37 * hash) + ERRCODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrCode().hashCode();
    hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
    hash = (53 * hash) + getErrMsg().hashCode();
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parseFrom(
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
  public static Builder newBuilder(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes prototype) {
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
   * Protobuf type {@code exporttask.WshExportTaskCreateTplRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exporttask.WshExportTaskCreateTplRes)
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskCreateTplRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskCreateTplRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.class, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.Builder.class);
    }

    // Construct using com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.newBuilder()
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
      errCode_ = "";

      errMsg_ = "";

      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskCreateTplRes_descriptor;
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes getDefaultInstanceForType() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes build() {
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes buildPartial() {
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes result = new com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes(this);
      result.errCode_ = errCode_;
      result.errMsg_ = errMsg_;
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes) {
        return mergeFrom((com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes other) {
      if (other == com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.getDefaultInstance()) return this;
      if (!other.getErrCode().isEmpty()) {
        errCode_ = other.errCode_;
        onChanged();
      }
      if (!other.getErrMsg().isEmpty()) {
        errMsg_ = other.errMsg_;
        onChanged();
      }
      if (other.hasData()) {
        mergeData(other.getData());
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
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object errCode_ = "";
    /**
     * <code>string errCode = 1;</code>
     */
    public java.lang.String getErrCode() {
      java.lang.Object ref = errCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getErrCodeBytes() {
      java.lang.Object ref = errCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errCode = 1;</code>
     */
    public Builder setErrCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errCode = 1;</code>
     */
    public Builder clearErrCode() {
      
      errCode_ = getDefaultInstance().getErrCode();
      onChanged();
      return this;
    }
    /**
     * <code>string errCode = 1;</code>
     */
    public Builder setErrCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object errMsg_ = "";
    /**
     * <code>string errMsg = 2;</code>
     */
    public java.lang.String getErrMsg() {
      java.lang.Object ref = errMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrMsgBytes() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder setErrMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder clearErrMsg() {
      
      errMsg_ = getDefaultInstance().getErrMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder setErrMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errMsg_ = value;
      onChanged();
      return this;
    }

    private com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl data_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl, com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder, com.jw.platform.pcm.m4910.f010.microservice.WshExportTplOrBuilder> dataBuilder_;
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public Builder setData(com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public Builder setData(
        com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public Builder mergeData(com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTplOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.exporttask.WshExportTpl data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl, com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder, com.jw.platform.pcm.m4910.f010.microservice.WshExportTplOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl, com.jw.platform.pcm.m4910.f010.microservice.WshExportTpl.Builder, com.jw.platform.pcm.m4910.f010.microservice.WshExportTplOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:exporttask.WshExportTaskCreateTplRes)
  }

  // @@protoc_insertion_point(class_scope:exporttask.WshExportTaskCreateTplRes)
  private static final com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes();
  }

  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WshExportTaskCreateTplRes>
      PARSER = new com.google.protobuf.AbstractParser<WshExportTaskCreateTplRes>() {
    @java.lang.Override
    public WshExportTaskCreateTplRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WshExportTaskCreateTplRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WshExportTaskCreateTplRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WshExportTaskCreateTplRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
