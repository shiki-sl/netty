// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

package com.shiki.proto;

/**
 * Protobuf type {@code com.shiki.proto.MyResponseList}
 */
public  final class MyResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.shiki.proto.MyResponseList)
    MyResponseListOrBuilder {
  // Use MyResponseList.newBuilder() to construct.
  private MyResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MyResponseList() {
    myRequestStream_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MyResponseList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              myRequestStream_ = new java.util.ArrayList<MyRequestStream>();
              mutable_bitField0_ |= 0x00000001;
            }
            myRequestStream_.add(
                input.readMessage(MyRequestStream.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        myRequestStream_ = java.util.Collections.unmodifiableList(myRequestStream_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PersonProto.internal_static_com_shiki_proto_MyResponseList_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PersonProto.internal_static_com_shiki_proto_MyResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MyResponseList.class, Builder.class);
  }

  public static final int MYREQUESTSTREAM_FIELD_NUMBER = 1;
  private java.util.List<MyRequestStream> myRequestStream_;
  /**
   * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
   */
  public java.util.List<MyRequestStream> getMyRequestStreamList() {
    return myRequestStream_;
  }
  /**
   * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
   */
  public java.util.List<? extends MyRequestStreamOrBuilder> 
      getMyRequestStreamOrBuilderList() {
    return myRequestStream_;
  }
  /**
   * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
   */
  public int getMyRequestStreamCount() {
    return myRequestStream_.size();
  }
  /**
   * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
   */
  public MyRequestStream getMyRequestStream(int index) {
    return myRequestStream_.get(index);
  }
  /**
   * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
   */
  public MyRequestStreamOrBuilder getMyRequestStreamOrBuilder(
      int index) {
    return myRequestStream_.get(index);
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
    for (int i = 0; i < myRequestStream_.size(); i++) {
      output.writeMessage(1, myRequestStream_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < myRequestStream_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, myRequestStream_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MyResponseList)) {
      return super.equals(obj);
    }
    MyResponseList other = (MyResponseList) obj;

    boolean result = true;
    result = result && getMyRequestStreamList()
        .equals(other.getMyRequestStreamList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getMyRequestStreamCount() > 0) {
      hash = (37 * hash) + MYREQUESTSTREAM_FIELD_NUMBER;
      hash = (53 * hash) + getMyRequestStreamList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MyResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MyResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MyResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MyResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MyResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MyResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MyResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MyResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MyResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MyResponseList parseFrom(
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
  public static Builder newBuilder(MyResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.shiki.proto.MyResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.shiki.proto.MyResponseList)
      com.shiki.proto.MyResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersonProto.internal_static_com_shiki_proto_MyResponseList_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersonProto.internal_static_com_shiki_proto_MyResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MyResponseList.class, Builder.class);
    }

    // Construct using com.shiki.proto.MyResponseList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMyRequestStreamFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (myRequestStreamBuilder_ == null) {
        myRequestStream_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        myRequestStreamBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PersonProto.internal_static_com_shiki_proto_MyResponseList_descriptor;
    }

    public MyResponseList getDefaultInstanceForType() {
      return MyResponseList.getDefaultInstance();
    }

    public MyResponseList build() {
      MyResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public MyResponseList buildPartial() {
      MyResponseList result = new MyResponseList(this);
      int from_bitField0_ = bitField0_;
      if (myRequestStreamBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          myRequestStream_ = java.util.Collections.unmodifiableList(myRequestStream_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.myRequestStream_ = myRequestStream_;
      } else {
        result.myRequestStream_ = myRequestStreamBuilder_.build();
      }
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
      if (other instanceof MyResponseList) {
        return mergeFrom((MyResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MyResponseList other) {
      if (other == MyResponseList.getDefaultInstance()) return this;
      if (myRequestStreamBuilder_ == null) {
        if (!other.myRequestStream_.isEmpty()) {
          if (myRequestStream_.isEmpty()) {
            myRequestStream_ = other.myRequestStream_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMyRequestStreamIsMutable();
            myRequestStream_.addAll(other.myRequestStream_);
          }
          onChanged();
        }
      } else {
        if (!other.myRequestStream_.isEmpty()) {
          if (myRequestStreamBuilder_.isEmpty()) {
            myRequestStreamBuilder_.dispose();
            myRequestStreamBuilder_ = null;
            myRequestStream_ = other.myRequestStream_;
            bitField0_ = (bitField0_ & ~0x00000001);
            myRequestStreamBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMyRequestStreamFieldBuilder() : null;
          } else {
            myRequestStreamBuilder_.addAllMessages(other.myRequestStream_);
          }
        }
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
      MyResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MyResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<MyRequestStream> myRequestStream_ =
      java.util.Collections.emptyList();
    private void ensureMyRequestStreamIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        myRequestStream_ = new java.util.ArrayList<MyRequestStream>(myRequestStream_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        MyRequestStream, MyRequestStream.Builder, MyRequestStreamOrBuilder> myRequestStreamBuilder_;

    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public java.util.List<MyRequestStream> getMyRequestStreamList() {
      if (myRequestStreamBuilder_ == null) {
        return java.util.Collections.unmodifiableList(myRequestStream_);
      } else {
        return myRequestStreamBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public int getMyRequestStreamCount() {
      if (myRequestStreamBuilder_ == null) {
        return myRequestStream_.size();
      } else {
        return myRequestStreamBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public MyRequestStream getMyRequestStream(int index) {
      if (myRequestStreamBuilder_ == null) {
        return myRequestStream_.get(index);
      } else {
        return myRequestStreamBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder setMyRequestStream(
        int index, MyRequestStream value) {
      if (myRequestStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMyRequestStreamIsMutable();
        myRequestStream_.set(index, value);
        onChanged();
      } else {
        myRequestStreamBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder setMyRequestStream(
        int index, MyRequestStream.Builder builderForValue) {
      if (myRequestStreamBuilder_ == null) {
        ensureMyRequestStreamIsMutable();
        myRequestStream_.set(index, builderForValue.build());
        onChanged();
      } else {
        myRequestStreamBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder addMyRequestStream(MyRequestStream value) {
      if (myRequestStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMyRequestStreamIsMutable();
        myRequestStream_.add(value);
        onChanged();
      } else {
        myRequestStreamBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder addMyRequestStream(
        int index, MyRequestStream value) {
      if (myRequestStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMyRequestStreamIsMutable();
        myRequestStream_.add(index, value);
        onChanged();
      } else {
        myRequestStreamBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder addMyRequestStream(
        MyRequestStream.Builder builderForValue) {
      if (myRequestStreamBuilder_ == null) {
        ensureMyRequestStreamIsMutable();
        myRequestStream_.add(builderForValue.build());
        onChanged();
      } else {
        myRequestStreamBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder addMyRequestStream(
        int index, MyRequestStream.Builder builderForValue) {
      if (myRequestStreamBuilder_ == null) {
        ensureMyRequestStreamIsMutable();
        myRequestStream_.add(index, builderForValue.build());
        onChanged();
      } else {
        myRequestStreamBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder addAllMyRequestStream(
        Iterable<? extends MyRequestStream> values) {
      if (myRequestStreamBuilder_ == null) {
        ensureMyRequestStreamIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, myRequestStream_);
        onChanged();
      } else {
        myRequestStreamBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder clearMyRequestStream() {
      if (myRequestStreamBuilder_ == null) {
        myRequestStream_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        myRequestStreamBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public Builder removeMyRequestStream(int index) {
      if (myRequestStreamBuilder_ == null) {
        ensureMyRequestStreamIsMutable();
        myRequestStream_.remove(index);
        onChanged();
      } else {
        myRequestStreamBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public MyRequestStream.Builder getMyRequestStreamBuilder(
        int index) {
      return getMyRequestStreamFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public MyRequestStreamOrBuilder getMyRequestStreamOrBuilder(
        int index) {
      if (myRequestStreamBuilder_ == null) {
        return myRequestStream_.get(index);  } else {
        return myRequestStreamBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public java.util.List<? extends MyRequestStreamOrBuilder> 
         getMyRequestStreamOrBuilderList() {
      if (myRequestStreamBuilder_ != null) {
        return myRequestStreamBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(myRequestStream_);
      }
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public MyRequestStream.Builder addMyRequestStreamBuilder() {
      return getMyRequestStreamFieldBuilder().addBuilder(
          MyRequestStream.getDefaultInstance());
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public MyRequestStream.Builder addMyRequestStreamBuilder(
        int index) {
      return getMyRequestStreamFieldBuilder().addBuilder(
          index, MyRequestStream.getDefaultInstance());
    }
    /**
     * <code>repeated .com.shiki.proto.MyRequestStream myRequestStream = 1;</code>
     */
    public java.util.List<MyRequestStream.Builder> 
         getMyRequestStreamBuilderList() {
      return getMyRequestStreamFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        MyRequestStream, MyRequestStream.Builder, MyRequestStreamOrBuilder> 
        getMyRequestStreamFieldBuilder() {
      if (myRequestStreamBuilder_ == null) {
        myRequestStreamBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            MyRequestStream, MyRequestStream.Builder, MyRequestStreamOrBuilder>(
                myRequestStream_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        myRequestStream_ = null;
      }
      return myRequestStreamBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.shiki.proto.MyResponseList)
  }

  // @@protoc_insertion_point(class_scope:com.shiki.proto.MyResponseList)
  private static final MyResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MyResponseList();
  }

  public static MyResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MyResponseList>
      PARSER = new com.google.protobuf.AbstractParser<MyResponseList>() {
    public MyResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MyResponseList> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MyResponseList> getParserForType() {
    return PARSER;
  }

  public MyResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
