package okio;

import com.sobot.network.http.model.SobotProgress;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import h.c.a.a.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealBufferedSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\bl\u0010mJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\b\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J'\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\b\u0010&J\u0017\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020'H\u0016¢\u0006\u0004\b\b\u0010(J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010)J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u00100J\u0017\u00103\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00103\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00105J\u0011\u00106\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b6\u0010/J\u000f\u00107\u001a\u00020-H\u0016¢\u0006\u0004\b7\u0010/J\u0017\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00100J\u000f\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020;H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010:J\u000f\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010BJ\u000f\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010BJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010\u000fJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010KJ'\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010MJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0015H\u0016¢\u0006\u0004\bH\u0010OJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010PJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0015H\u0016¢\u0006\u0004\bR\u0010OJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bR\u0010PJ\u001f\u0010S\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0015H\u0016¢\u0006\u0004\bS\u0010TJ/\u0010S\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\bS\u0010VJ\u000f\u0010W\u001a\u00020\u0001H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010\fJ\u000f\u0010]\u001a\u00020\rH\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020-H\u0016¢\u0006\u0004\bb\u0010/R\u0016\u0010d\u001a\u00020c8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001d\u0010\u0003\u001a\u00020\u00028Ö\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bk\u0010^\u001a\u0004\bj\u0010\u0004¨\u0006n"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "exhausted", "()Z", "", "require", "(J)V", SobotProgress.REQUEST, "(J)Z", "", "readByte", "()B", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", a.t, "", "select", "(Lokio/Options;)I", "", "readByteArray", "()[B", "(J)[B", "([B)I", "readFully", "([B)V", Constants.FLAG_TAG_OFFSET, "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "()I", "", "readShort", "()S", "readShortLe", "readInt", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "b", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "peek", "()Lokio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "toString", "Lokio/Source;", MessageKey.MSG_SOURCE, "Lokio/Source;", "bufferField", "Lokio/Buffer;", "closed", "Z", "getBuffer", "buffer$annotations", "<init>", "(Lokio/Source;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealBufferedSource implements BufferedSource {
    @JvmField
    @NotNull
    public final Buffer bufferField;
    @JvmField
    public boolean closed;
    @JvmField
    @NotNull
    public final Source source;

    public RealBufferedSource(@NotNull Source source) {
    }

    public static /* synthetic */ void buffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString) {
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr) {
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) {
    }

    @Override // okio.BufferedSource
    public byte readByte() {
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] bArr) {
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
    }

    @Override // okio.BufferedSource
    public int readInt() {
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
    }

    @Override // okio.BufferedSource
    public long readLong() {
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
    }

    @Override // okio.BufferedSource
    public short readShort() {
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j2, @NotNull Charset charset) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() {
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
    }

    @Override // okio.BufferedSource
    public void require(long j2) {
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) {
    }

    @Override // okio.BufferedSource
    public void skip(long j2) {
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
    }

    @NotNull
    public String toString() {
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j2) {
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString, long j2) {
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j2) {
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString) {
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString, int i2, int i3) {
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j2, long j3) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j2) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j2) {
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j2) {
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer buffer, long j2) {
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr, int i2, int i3) {
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString, long j2) {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
    }
}
