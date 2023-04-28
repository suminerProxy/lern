package okio.internal;

import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* compiled from: RealBufferedSink.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001a\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001f\u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010 \u001a\u00020\fH\u0080\b¢\u0006\u0004\b!\u0010\u0018\u001a\u001c\u0010#\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b#\u0010\u0018\u001a\u001c\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b$\u0010\u0018\u001a\u001c\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b&\u0010\u0018\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010\u0018\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b+\u0010*\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b,\u0010*\u001a\u001c\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00100\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010/\u001a\u0014\u00101\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00105\u001a\u000204*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "", "commonWrite", "(Lokio/RealBufferedSink;Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "Lokio/BufferedSink;", "(Lokio/RealBufferedSink;Lokio/ByteString;)Lokio/BufferedSink;", "", Constants.FLAG_TAG_OFFSET, "(Lokio/RealBufferedSink;Lokio/ByteString;II)Lokio/BufferedSink;", "", "string", "commonWriteUtf8", "(Lokio/RealBufferedSink;Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Lokio/RealBufferedSink;Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "commonWriteUtf8CodePoint", "(Lokio/RealBufferedSink;I)Lokio/BufferedSink;", "", "(Lokio/RealBufferedSink;[B)Lokio/BufferedSink;", "(Lokio/RealBufferedSink;[BII)Lokio/BufferedSink;", "Lokio/Source;", "commonWriteAll", "(Lokio/RealBufferedSink;Lokio/Source;)J", "(Lokio/RealBufferedSink;Lokio/Source;J)Lokio/BufferedSink;", "b", "commonWriteByte", am.aB, "commonWriteShort", "commonWriteShortLe", "i", "commonWriteInt", "commonWriteIntLe", am.aE, "commonWriteLong", "(Lokio/RealBufferedSink;J)Lokio/BufferedSink;", "commonWriteLongLe", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "commonEmitCompleteSegments", "(Lokio/RealBufferedSink;)Lokio/BufferedSink;", "commonEmit", "commonFlush", "(Lokio/RealBufferedSink;)V", "commonClose", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSink;)Lokio/Timeout;", "commonToString", "(Lokio/RealBufferedSink;)Ljava/lang/String;", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealBufferedSinkKt {
    public static final void commonClose(@NotNull RealBufferedSink realBufferedSink) {
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull RealBufferedSink realBufferedSink) {
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull RealBufferedSink realBufferedSink) {
    }

    public static final void commonFlush(@NotNull RealBufferedSink realBufferedSink) {
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSink realBufferedSink) {
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSink realBufferedSink) {
    }

    public static final void commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull Buffer buffer, long j2) {
    }

    public static final long commonWriteAll(@NotNull RealBufferedSink realBufferedSink, @NotNull Source source) {
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull RealBufferedSink realBufferedSink, long j2) {
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull RealBufferedSink realBufferedSink, long j2) {
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull RealBufferedSink realBufferedSink, long j2) {
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull RealBufferedSink realBufferedSink, long j2) {
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull RealBufferedSink realBufferedSink, @NotNull String str) {
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull RealBufferedSink realBufferedSink, int i2) {
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull ByteString byteString) {
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull RealBufferedSink realBufferedSink, @NotNull String str, int i2, int i3) {
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull ByteString byteString, int i2, int i3) {
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull byte[] bArr) {
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull byte[] bArr, int i2, int i3) {
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull RealBufferedSink realBufferedSink, @NotNull Source source, long j2) {
    }
}
