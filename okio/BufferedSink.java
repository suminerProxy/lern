package okio;

import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedSink.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\b\u0010\u0010J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H&¢\u0006\u0004\b\b\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH&¢\u0006\u0004\b'\u0010 J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b-\u0010 J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0000H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0000H&¢\u0006\u0004\b9\u00108J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<R\u0016\u0010\u0004\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005¨\u0006>"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "Lokio/ByteString;", "byteString", "write", "(Lokio/ByteString;)Lokio/BufferedSink;", "", Constants.FLAG_TAG_OFFSET, "byteCount", "(Lokio/ByteString;II)Lokio/BufferedSink;", "", MessageKey.MSG_SOURCE, "([B)Lokio/BufferedSink;", "([BII)Lokio/BufferedSink;", "Lokio/Source;", "", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/BufferedSink;", "Ljava/nio/charset/Charset;", "charset", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "b", "writeByte", am.aB, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", am.aE, "writeLong", "(J)Lokio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "", "flush", "()V", "emit", "()Lokio/BufferedSink;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "getBuffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    Buffer buffer();

    @NotNull
    BufferedSink emit() throws IOException;

    @NotNull
    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    Buffer getBuffer();

    @NotNull
    OutputStream outputStream();

    @NotNull
    BufferedSink write(@NotNull ByteString byteString) throws IOException;

    @NotNull
    BufferedSink write(@NotNull ByteString byteString, int i2, int i3) throws IOException;

    @NotNull
    BufferedSink write(@NotNull Source source, long j2) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr, int i2, int i3) throws IOException;

    long writeAll(@NotNull Source source) throws IOException;

    @NotNull
    BufferedSink writeByte(int i2) throws IOException;

    @NotNull
    BufferedSink writeDecimalLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeInt(int i2) throws IOException;

    @NotNull
    BufferedSink writeIntLe(int i2) throws IOException;

    @NotNull
    BufferedSink writeLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeLongLe(long j2) throws IOException;

    @NotNull
    BufferedSink writeShort(int i2) throws IOException;

    @NotNull
    BufferedSink writeShortLe(int i2) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String str, int i2, int i3, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str, int i2, int i3) throws IOException;

    @NotNull
    BufferedSink writeUtf8CodePoint(int i2) throws IOException;
}
