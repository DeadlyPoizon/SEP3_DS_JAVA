// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrugerService.proto

package GRPC.bruger;

/**
 * Protobuf type {@code GRPC.bruger.getDepotFraID}
 */
public  final class getDepotFraID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GRPC.bruger.getDepotFraID)
    getDepotFraIDOrBuilder {
  // Use getDepotFraID.newBuilder() to construct.
  private getDepotFraID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getDepotFraID() {
    depotID_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private getDepotFraID(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            depotID_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GRPC.bruger.BrugerServiceOuterClass.internal_static_GRPC_bruger_getDepotFraID_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GRPC.bruger.BrugerServiceOuterClass.internal_static_GRPC_bruger_getDepotFraID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GRPC.bruger.getDepotFraID.class, GRPC.bruger.getDepotFraID.Builder.class);
  }

  public static final int DEPOTID_FIELD_NUMBER = 1;
  private int depotID_;
  /**
   * <code>int32 depotID = 1;</code>
   */
  public int getDepotID() {
    return depotID_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (depotID_ != 0) {
      output.writeInt32(1, depotID_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (depotID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, depotID_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GRPC.bruger.getDepotFraID)) {
      return super.equals(obj);
    }
    GRPC.bruger.getDepotFraID other = (GRPC.bruger.getDepotFraID) obj;

    boolean result = true;
    result = result && (getDepotID()
        == other.getDepotID());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEPOTID_FIELD_NUMBER;
    hash = (53 * hash) + getDepotID();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GRPC.bruger.getDepotFraID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GRPC.bruger.getDepotFraID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GRPC.bruger.getDepotFraID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GRPC.bruger.getDepotFraID parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GRPC.bruger.getDepotFraID prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code GRPC.bruger.getDepotFraID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GRPC.bruger.getDepotFraID)
      GRPC.bruger.getDepotFraIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GRPC.bruger.BrugerServiceOuterClass.internal_static_GRPC_bruger_getDepotFraID_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GRPC.bruger.BrugerServiceOuterClass.internal_static_GRPC_bruger_getDepotFraID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GRPC.bruger.getDepotFraID.class, GRPC.bruger.getDepotFraID.Builder.class);
    }

    // Construct using GRPC.bruger.getDepotFraID.newBuilder()
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
    public Builder clear() {
      super.clear();
      depotID_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GRPC.bruger.BrugerServiceOuterClass.internal_static_GRPC_bruger_getDepotFraID_descriptor;
    }

    public GRPC.bruger.getDepotFraID getDefaultInstanceForType() {
      return GRPC.bruger.getDepotFraID.getDefaultInstance();
    }

    public GRPC.bruger.getDepotFraID build() {
      GRPC.bruger.getDepotFraID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GRPC.bruger.getDepotFraID buildPartial() {
      GRPC.bruger.getDepotFraID result = new GRPC.bruger.getDepotFraID(this);
      result.depotID_ = depotID_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GRPC.bruger.getDepotFraID) {
        return mergeFrom((GRPC.bruger.getDepotFraID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GRPC.bruger.getDepotFraID other) {
      if (other == GRPC.bruger.getDepotFraID.getDefaultInstance()) return this;
      if (other.getDepotID() != 0) {
        setDepotID(other.getDepotID());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GRPC.bruger.getDepotFraID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GRPC.bruger.getDepotFraID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int depotID_ ;
    /**
     * <code>int32 depotID = 1;</code>
     */
    public int getDepotID() {
      return depotID_;
    }
    /**
     * <code>int32 depotID = 1;</code>
     */
    public Builder setDepotID(int value) {
      
      depotID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 depotID = 1;</code>
     */
    public Builder clearDepotID() {
      
      depotID_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:GRPC.bruger.getDepotFraID)
  }

  // @@protoc_insertion_point(class_scope:GRPC.bruger.getDepotFraID)
  private static final GRPC.bruger.getDepotFraID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GRPC.bruger.getDepotFraID();
  }

  public static GRPC.bruger.getDepotFraID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getDepotFraID>
      PARSER = new com.google.protobuf.AbstractParser<getDepotFraID>() {
    public getDepotFraID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new getDepotFraID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getDepotFraID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getDepotFraID> getParserForType() {
    return PARSER;
  }

  public GRPC.bruger.getDepotFraID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

