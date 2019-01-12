// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/exporttask.proto

package com.jw.platform.pcm.m4910.f010.microservice;

/**
 * Protobuf type {@code exporttask.WshExportTaskListTplReq}
 */
public  final class WshExportTaskListTplReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:exporttask.WshExportTaskListTplReq)
    WshExportTaskListTplReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WshExportTaskListTplReq.newBuilder() to construct.
  private WshExportTaskListTplReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WshExportTaskListTplReq() {
    etplId_ = 0;
    etplName_ = "";
    etplTag_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WshExportTaskListTplReq(
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

            etplId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            etplName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            etplTag_ = s;
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
    return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskListTplReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskListTplReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.class, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.Builder.class);
  }

  public static final int ETPLID_FIELD_NUMBER = 1;
  private int etplId_;
  /**
   * <code>int32 etplId = 1;</code>
   */
  public int getEtplId() {
    return etplId_;
  }

  public static final int ETPLNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object etplName_;
  /**
   * <code>string etplName = 2;</code>
   */
  public java.lang.String getEtplName() {
    java.lang.Object ref = etplName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etplName_ = s;
      return s;
    }
  }
  /**
   * <code>string etplName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEtplNameBytes() {
    java.lang.Object ref = etplName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etplName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ETPLTAG_FIELD_NUMBER = 3;
  private volatile java.lang.Object etplTag_;
  /**
   * <code>string etplTag = 3;</code>
   */
  public java.lang.String getEtplTag() {
    java.lang.Object ref = etplTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etplTag_ = s;
      return s;
    }
  }
  /**
   * <code>string etplTag = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEtplTagBytes() {
    java.lang.Object ref = etplTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etplTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (etplId_ != 0) {
      output.writeInt32(1, etplId_);
    }
    if (!getEtplNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, etplName_);
    }
    if (!getEtplTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, etplTag_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (etplId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, etplId_);
    }
    if (!getEtplNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, etplName_);
    }
    if (!getEtplTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, etplTag_);
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
    if (!(obj instanceof com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq)) {
      return super.equals(obj);
    }
    com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq other = (com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq) obj;

    boolean result = true;
    result = result && (getEtplId()
        == other.getEtplId());
    result = result && getEtplName()
        .equals(other.getEtplName());
    result = result && getEtplTag()
        .equals(other.getEtplTag());
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
    hash = (37 * hash) + ETPLID_FIELD_NUMBER;
    hash = (53 * hash) + getEtplId();
    hash = (37 * hash) + ETPLNAME_FIELD_NUMBER;
    hash = (53 * hash) + getEtplName().hashCode();
    hash = (37 * hash) + ETPLTAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtplTag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parseFrom(
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
  public static Builder newBuilder(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq prototype) {
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
   * Protobuf type {@code exporttask.WshExportTaskListTplReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exporttask.WshExportTaskListTplReq)
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskListTplReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskListTplReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.class, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.Builder.class);
    }

    // Construct using com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.newBuilder()
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
      etplId_ = 0;

      etplName_ = "";

      etplTag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.internal_static_exporttask_WshExportTaskListTplReq_descriptor;
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq getDefaultInstanceForType() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq build() {
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq buildPartial() {
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq result = new com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq(this);
      result.etplId_ = etplId_;
      result.etplName_ = etplName_;
      result.etplTag_ = etplTag_;
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
      if (other instanceof com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq) {
        return mergeFrom((com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq other) {
      if (other == com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.getDefaultInstance()) return this;
      if (other.getEtplId() != 0) {
        setEtplId(other.getEtplId());
      }
      if (!other.getEtplName().isEmpty()) {
        etplName_ = other.etplName_;
        onChanged();
      }
      if (!other.getEtplTag().isEmpty()) {
        etplTag_ = other.etplTag_;
        onChanged();
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
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int etplId_ ;
    /**
     * <code>int32 etplId = 1;</code>
     */
    public int getEtplId() {
      return etplId_;
    }
    /**
     * <code>int32 etplId = 1;</code>
     */
    public Builder setEtplId(int value) {
      
      etplId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 etplId = 1;</code>
     */
    public Builder clearEtplId() {
      
      etplId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object etplName_ = "";
    /**
     * <code>string etplName = 2;</code>
     */
    public java.lang.String getEtplName() {
      java.lang.Object ref = etplName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etplName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string etplName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEtplNameBytes() {
      java.lang.Object ref = etplName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etplName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string etplName = 2;</code>
     */
    public Builder setEtplName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      etplName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string etplName = 2;</code>
     */
    public Builder clearEtplName() {
      
      etplName_ = getDefaultInstance().getEtplName();
      onChanged();
      return this;
    }
    /**
     * <code>string etplName = 2;</code>
     */
    public Builder setEtplNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      etplName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object etplTag_ = "";
    /**
     * <code>string etplTag = 3;</code>
     */
    public java.lang.String getEtplTag() {
      java.lang.Object ref = etplTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etplTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string etplTag = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEtplTagBytes() {
      java.lang.Object ref = etplTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etplTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string etplTag = 3;</code>
     */
    public Builder setEtplTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      etplTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string etplTag = 3;</code>
     */
    public Builder clearEtplTag() {
      
      etplTag_ = getDefaultInstance().getEtplTag();
      onChanged();
      return this;
    }
    /**
     * <code>string etplTag = 3;</code>
     */
    public Builder setEtplTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      etplTag_ = value;
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


    // @@protoc_insertion_point(builder_scope:exporttask.WshExportTaskListTplReq)
  }

  // @@protoc_insertion_point(class_scope:exporttask.WshExportTaskListTplReq)
  private static final com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq();
  }

  public static com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WshExportTaskListTplReq>
      PARSER = new com.google.protobuf.AbstractParser<WshExportTaskListTplReq>() {
    @java.lang.Override
    public WshExportTaskListTplReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WshExportTaskListTplReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WshExportTaskListTplReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WshExportTaskListTplReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
