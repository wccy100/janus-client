package protobuf;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.geekbrains.projectjanus.core.messages.MovementMessage.proto

public final class MovementMessage {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_outbox_setDirection_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_outbox_setDirection_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\025MovementMessage.proto\022\006outbox\"6\n\014setDi" +
                        "rection\022\022\n\ndirectionX\030\001 \002(\005\022\022\n\ndirection" +
                        "Y\030\002 \002(\005B<\n)com.geekbrains.projectjanus.c" +
                        "ore.messagesB\017MovementMessage"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_outbox_setDirection_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_outbox_setDirection_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_outbox_setDirection_descriptor,
                new java.lang.String[]{"DirectionX", "DirectionY",});
    }

    public MovementMessage() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    public interface setDirectionOrBuilder extends
            // @@protoc_insertion_point(interface_extends:outbox.setDirection)
            com.google.protobuf.MessageOrBuilder {
        /**
         * <code>required int32 directionX = 1;</code>
         */
        int getDirectionX();

        /**
         * <code>required int32 directionY = 2;</code>
         */
        int getDirectionY();

        /**
         * <code>required int32 directionX = 1;</code>
         */
        boolean hasDirectionX();

        /**
         * <code>required int32 directionY = 2;</code>
         */
        boolean hasDirectionY();
    }

    /**
     * Protobuf type {@code outbox.setDirection}
     */
    public static final class setDirection extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:outbox.setDirection)
            setDirectionOrBuilder {
        public static final int DIRECTIONX_FIELD_NUMBER = 1;
        public static final int DIRECTIONY_FIELD_NUMBER = 2;
        @java.lang.Deprecated
        public static final com.google.protobuf.Parser<setDirection>
                PARSER = new com.google.protobuf.AbstractParser<setDirection>() {
            public setDirection parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new setDirection(input, extensionRegistry);
            }
        };
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:outbox.setDirection)
        private static final MovementMessage.setDirection DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new MovementMessage.setDirection();
        }
        private int bitField0_;
        private int directionX_;
        private int directionY_;
        private byte memoizedIsInitialized = -1;

        // Use setDirection.newBuilder() to construct.
        private setDirection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private setDirection(
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
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            directionX_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            directionY_ = input.readInt32();
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

        private setDirection() {
            directionX_ = 0;
            directionY_ = 0;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MovementMessage.setDirection)) {
                return super.equals(obj);
            }
            MovementMessage.setDirection other = (MovementMessage.setDirection) obj;

            boolean result = true;
            result = result && (hasDirectionX() == other.hasDirectionX());
            if (hasDirectionX()) {
                result = result && (getDirectionX()
                        == other.getDirectionX());
            }
            result = result && (hasDirectionY() == other.hasDirectionY());
            if (hasDirectionY()) {
                result = result && (getDirectionY()
                        == other.getDirectionY());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        /**
         * <code>required int32 directionX = 1;</code>
         */
        public int getDirectionX() {
            return directionX_;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasDirectionX()) {
                hash = (37 * hash) + DIRECTIONX_FIELD_NUMBER;
                hash = (53 * hash) + getDirectionX();
            }
            if (hasDirectionY()) {
                hash = (37 * hash) + DIRECTIONY_FIELD_NUMBER;
                hash = (53 * hash) + getDirectionY();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_outbox_setDirection_descriptor;
        }        /**
         * <code>required int32 directionY = 2;</code>
         */
        public boolean hasDirectionY() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public MovementMessage.setDirection getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<setDirection> getParserForType() {
            return PARSER;
        }        /**
         * <code>required int32 directionY = 2;</code>
         */
        public int getDirectionY() {
            return directionY_;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_outbox_setDirection_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            MovementMessage.setDirection.class, MovementMessage.setDirection.Builder.class);
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasDirectionX()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDirectionY()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, directionX_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, directionY_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, directionX_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, directionY_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Builder newBuilder(MovementMessage.setDirection prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static MovementMessage.setDirection parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static MovementMessage.setDirection parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static MovementMessage.setDirection parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static MovementMessage.setDirection parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static MovementMessage.setDirection parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static MovementMessage.setDirection parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static MovementMessage.setDirection parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static MovementMessage.setDirection parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static MovementMessage.setDirection parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static MovementMessage.setDirection parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static MovementMessage.setDirection parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static MovementMessage.setDirection parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.google.protobuf.Parser<setDirection> parser() {
            return PARSER;
        }

        public static MovementMessage.setDirection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code outbox.setDirection}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:outbox.setDirection)
                MovementMessage.setDirectionOrBuilder {
            private int bitField0_;
            private int directionX_;
            private int directionY_;

            // Construct using com.geekbrains.projectjanus.core.messages.com.geekbrains.projectjanus.core.messages.MovementMessage.setDirection.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public MovementMessage.setDirection build() {
                MovementMessage.setDirection result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public MovementMessage.setDirection buildPartial() {
                MovementMessage.setDirection result = new MovementMessage.setDirection(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.directionX_ = directionX_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.directionY_ = directionY_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder clear() {
                super.clear();
                directionX_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                directionY_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return MovementMessage.internal_static_outbox_setDirection_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                MovementMessage.setDirection.class, MovementMessage.setDirection.Builder.class);
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return MovementMessage.internal_static_outbox_setDirection_descriptor;
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
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
                    int index, java.lang.Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            public final boolean isInitialized() {
                if (!hasDirectionX()) {
                    return false;
                }
                if (!hasDirectionY()) {
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof MovementMessage.setDirection) {
                    return mergeFrom((MovementMessage.setDirection) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(MovementMessage.setDirection other) {
                if (other == MovementMessage.setDirection.getDefaultInstance()) return this;
                if (other.hasDirectionX()) {
                    setDirectionX(other.getDirectionX());
                }
                if (other.hasDirectionY()) {
                    setDirectionY(other.getDirectionY());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                MovementMessage.setDirection parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (MovementMessage.setDirection) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }            public MovementMessage.setDirection getDefaultInstanceForType() {
                return MovementMessage.setDirection.getDefaultInstance();
            }

            /**
             * <code>required int32 directionX = 1;</code>
             */
            public Builder clearDirectionX() {
                bitField0_ = (bitField0_ & ~0x00000001);
                directionX_ = 0;
                onChanged();
                return this;
            }            /**
             * <code>required int32 directionX = 1;</code>
             */
            public boolean hasDirectionX() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required int32 directionY = 2;</code>
             */
            public Builder clearDirectionY() {
                bitField0_ = (bitField0_ & ~0x00000002);
                directionY_ = 0;
                onChanged();
                return this;
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return MovementMessage.internal_static_outbox_setDirection_descriptor;
            }            /**
             * <code>required int32 directionX = 1;</code>
             */
            public int getDirectionX() {
                return directionX_;
            }



            /**
             * <code>required int32 directionX = 1;</code>
             */
            public Builder setDirectionX(int value) {
                bitField0_ |= 0x00000001;
                directionX_ = value;
                onChanged();
                return this;
            }





            /**
             * <code>required int32 directionY = 2;</code>
             */
            public boolean hasDirectionY() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required int32 directionY = 2;</code>
             */
            public int getDirectionY() {
                return directionY_;
            }

            /**
             * <code>required int32 directionY = 2;</code>
             */
            public Builder setDirectionY(int value) {
                bitField0_ |= 0x00000002;
                directionY_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:outbox.setDirection)
        }



        /**
         * <code>required int32 directionX = 1;</code>
         */
        public boolean hasDirectionX() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }



    }

    // @@protoc_insertion_point(outer_class_scope)
}
