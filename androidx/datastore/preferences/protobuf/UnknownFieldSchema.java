package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class UnknownFieldSchema<T, B> {
    public abstract void addFixed32(B b, int i2, int i3);

    public abstract void addFixed64(B b, int i2, long j2);

    public abstract void addGroup(B b, int i2, T t);

    public abstract void addLengthDelimited(B b, int i2, ByteString byteString);

    public abstract void addVarint(B b, int i2, long j2);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t);

    public abstract int getSerializedSizeAsMessageSet(T t);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t, T t2);

    public final void mergeFrom(B b, Reader reader) throws IOException {
    }

    public final boolean mergeOneFieldFrom(B b, Reader reader) throws IOException {
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b);

    public abstract void setToMessage(Object obj, T t);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b);

    public abstract void writeAsMessageSetTo(T t, Writer writer) throws IOException;

    public abstract void writeTo(T t, Writer writer) throws IOException;
}
