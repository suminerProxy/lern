package okio.internal;

import com.tencent.android.tpush.common.Constants;
import h.c.a.a.a;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealBufferedSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010\u0005\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\b\u0005\u0010\"\u001a$\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010'*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010-\u001a\u00020'*\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00104\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010/\u001a\u0014\u00105\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u0010/\u001a\u0014\u00106\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00107\u001a\u0014\u0010:\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00107\u001a\u001c\u0010;\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b;\u0010\f\u001a,\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010@\u001a$\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010A\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010B\u001a$\u0010D\u001a\u00020\u0003*\u00020\u00002\u0006\u0010C\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bD\u0010B\u001a4\u0010F\u001a\u00020\u0007*\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010I\u001a\u00020H*\u00020\u0000H\u0080\b¢\u0006\u0004\bI\u0010J\u001a\u0014\u0010K\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010)¨\u0006Q"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/Buffer;", "sink", "", "byteCount", "commonRead", "(Lokio/RealBufferedSource;Lokio/Buffer;J)J", "", "commonExhausted", "(Lokio/RealBufferedSource;)Z", "", "commonRequire", "(Lokio/RealBufferedSource;J)V", "commonRequest", "(Lokio/RealBufferedSource;J)Z", "", "commonReadByte", "(Lokio/RealBufferedSource;)B", "Lokio/ByteString;", "commonReadByteString", "(Lokio/RealBufferedSource;)Lokio/ByteString;", "(Lokio/RealBufferedSource;J)Lokio/ByteString;", "Lokio/Options;", a.t, "", "commonSelect", "(Lokio/RealBufferedSource;Lokio/Options;)I", "", "commonReadByteArray", "(Lokio/RealBufferedSource;)[B", "(Lokio/RealBufferedSource;J)[B", "commonReadFully", "(Lokio/RealBufferedSource;[B)V", Constants.FLAG_TAG_OFFSET, "(Lokio/RealBufferedSource;[BII)I", "(Lokio/RealBufferedSource;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/RealBufferedSource;Lokio/Sink;)J", "", "commonReadUtf8", "(Lokio/RealBufferedSource;)Ljava/lang/String;", "(Lokio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "(Lokio/RealBufferedSource;)I", "", "commonReadShort", "(Lokio/RealBufferedSource;)S", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "(Lokio/RealBufferedSource;)J", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", "b", "fromIndex", "toIndex", "commonIndexOf", "(Lokio/RealBufferedSource;BJJ)J", "bytes", "(Lokio/RealBufferedSource;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "(Lokio/RealBufferedSource;JLokio/ByteString;II)Z", "Lokio/BufferedSource;", "commonPeek", "(Lokio/RealBufferedSource;)Lokio/BufferedSource;", "commonClose", "(Lokio/RealBufferedSource;)V", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSource;)Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource, byte b, long j2, long j3) {
    }

    public static final long commonIndexOfElement(@NotNull RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j2) {
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource realBufferedSource, long j2, @NotNull ByteString byteString, int i2, int i3) {
    }

    public static final long commonRead(@NotNull RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j2) {
    }

    public static final long commonReadAll(@NotNull RealBufferedSource realBufferedSource, @NotNull Sink sink) {
    }

    public static final byte commonReadByte(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    public static final long commonReadDecimalLong(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource, @NotNull byte[] bArr) {
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final int commonReadInt(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final long commonReadLong(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final short commonReadShort(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource realBufferedSource) {
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    public static final boolean commonRequest(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    public static final void commonRequire(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    public static final int commonSelect(@NotNull RealBufferedSource realBufferedSource, @NotNull Options options) {
    }

    public static final void commonSkip(@NotNull RealBufferedSource realBufferedSource, long j2) {
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource) {
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource) {
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j2) {
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j2) {
    }

    public static final int commonRead(@NotNull RealBufferedSource realBufferedSource, @NotNull byte[] bArr, int i2, int i3) {
    }
}
