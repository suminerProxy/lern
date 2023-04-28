package okio;

import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: RealBufferedSink.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bQ\u0010RJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ'\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020 H\u0016¢\u0006\u0004\b\t\u0010!J'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\"J\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020#H\u0016¢\u0006\u0004\b\t\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010(J\u0017\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0017\u0010/\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u001aJ\u0017\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u001aJ\u0017\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00103J\u0017\u00106\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00103J\u000f\u00107\u001a\u00020\u0001H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0001H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bB\u0010>J\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010\u0003\u001a\u00020\u00028Ö\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010\u0004¨\u0006S"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "(Lokio/ByteString;)Lokio/BufferedSink;", "", Constants.FLAG_TAG_OFFSET, "(Lokio/ByteString;II)Lokio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/BufferedSink;", "Ljava/nio/charset/Charset;", "charset", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "", "([B)Lokio/BufferedSink;", "([BII)Lokio/BufferedSink;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lokio/Source;", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/BufferedSink;", "b", "writeByte", am.aB, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", am.aE, "writeLong", "(J)Lokio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "emitCompleteSegments", "()Lokio/BufferedSink;", "emit", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", "close", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "toString", "()Ljava/lang/String;", "Lokio/Sink;", "sink", "Lokio/Sink;", "bufferField", "Lokio/Buffer;", "closed", "Z", "getBuffer", "buffer$annotations", "<init>", "(Lokio/Sink;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealBufferedSink implements BufferedSink {
    @JvmField
    @NotNull
    public final Buffer bufferField;
    @JvmField
    public boolean closed;
    @JvmField
    @NotNull
    public final Sink sink;

    public RealBufferedSink(@NotNull Sink sink) {
    }

    public static /* synthetic */ void buffer$annotations() {
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer buffer() {
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink emit() {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink emitCompleteSegments() {
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
    }

    @NotNull
    public String toString() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) {
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeByte(int i2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeDecimalLong(long j2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeHexadecimalUnsignedLong(long j2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeInt(int i2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeIntLe(int i2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeLong(long j2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeLongLe(long j2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeShort(int i2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeShortLe(int i2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String str, @NotNull Charset charset) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String str) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8CodePoint(int i2) {
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeString(@NotNull String str, int i2, int i3, @NotNull Charset charset) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeUtf8(@NotNull String str, int i2, int i3) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull ByteString byteString) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull ByteString byteString, int i2, int i3) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] bArr) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] bArr, int i2, int i3) {
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull Source source, long j2) {
    }
}
