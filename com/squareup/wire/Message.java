package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    public transient int cachedSerializedSize;
    public transient int hashCode;
    private final transient ByteString unknownFields;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        public transient Buffer unknownFieldsBuffer;
        public transient ByteString unknownFieldsByteString;
        public transient ProtoWriter unknownFieldsWriter;

        private void prepareForNewUnknownFields() {
        }

        public final Builder<M, B> addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) {
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
        }

        public final Builder<M, B> clearUnknownFields() {
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
    }

    public final ProtoAdapter<M> adapter() {
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
    }

    public abstract Builder<M, B> newBuilder();

    public String toString() {
    }

    public final ByteString unknownFields() {
    }

    public final M withoutUnknownFields() {
    }

    public final Object writeReplace() throws ObjectStreamException {
    }

    public final byte[] encode() {
    }

    public final void encode(OutputStream outputStream) throws IOException {
    }
}
