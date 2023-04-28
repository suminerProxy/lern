package okio.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedInts;
import com.sobot.network.http.SobotOkHttpUtils;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import h.c.a.a.a;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Buffer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0012\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a>\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\f2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020#*\u00020\u000bH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010'\u001a\u00020&*\u00020\u000bH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b+\u0010\"\u001a\u001c\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010,\u001a\u00020\fH\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u00100\u001a\u00020/*\u00020\u000bH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020/*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b2\u00103\u001a0\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u001c\u00109\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b;\u0010:\u001a\u001c\u0010=\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010<\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b=\u0010>\u001a\u001c\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b6\u0010@\u001a,\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u0010A\u001a\u0014\u0010B\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010B\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bB\u0010D\u001a\u001c\u0010F\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u001c\u0010H\u001a\u00020/*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bH\u0010I\u001a,\u0010F\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bF\u0010J\u001a\u0014\u0010K\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bK\u0010\"\u001a\u0014\u0010L\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bL\u0010\"\u001a\u0014\u0010M\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010M\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bM\u0010O\u001a\u001c\u0010P\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\bP\u0010Q\u001a$\u0010H\u001a\u00020/*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bH\u0010R\u001a\u001c\u0010T\u001a\u00020\f*\u00020\u000b2\u0006\u0010E\u001a\u00020SH\u0080\b¢\u0006\u0004\bT\u0010U\u001a\u001c\u0010V\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bV\u0010\u0010\u001a\u0016\u0010W\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010Z\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010Y\u001a\u00020\fH\u0080\b¢\u0006\u0004\bZ\u0010\u0010\u001a\u0014\u0010[\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b[\u0010*\u001a,\u0010_\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b_\u0010`\u001a\u001c\u0010b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010a\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bb\u0010c\u001a\u001c\u0010e\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020dH\u0080\b¢\u0006\u0004\be\u0010f\u001a$\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020d2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010g\u001a\u001c\u0010i\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010h\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bi\u0010c\u001a\u001c\u0010k\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010j\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bk\u0010c\u001a\u001c\u0010m\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010l\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bm\u0010c\u001a\u001c\u0010n\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\bn\u0010:\u001a$\u00106\u001a\u00020/*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010R\u001a$\u0010F\u001a\u00020\f*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bF\u0010o\u001a,\u0010q\u001a\u00020\f*\u00020\u000b2\u0006\u0010h\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010p\u001a\u00020\fH\u0080\b¢\u0006\u0004\bq\u0010r\u001a$\u0010q\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bq\u0010s\u001a$\u0010u\u001a\u00020\f*\u00020\u000b2\u0006\u0010t\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bu\u0010s\u001a4\u0010v\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bv\u0010w\u001a\u001e\u0010z\u001a\u00020\b*\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010xH\u0080\b¢\u0006\u0004\bz\u0010{\u001a\u0014\u0010|\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b|\u0010*\u001a\u0014\u0010}\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0004\b}\u0010~\u001a\u0014\u0010\u007f\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u007f\u0010N\u001a\u001d\u0010\u007f\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001\"!\u0010\u0081\u0001\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0019\u0010\u0085\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0019\u0010\u0087\u0001\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0019\u0010\u0089\u0001\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001¨\u0006\u008a\u0001"}, d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lokio/Segment;I[BII)Z", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", "(Lokio/Buffer;J)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lokio/Options;", a.t, "selectTruncated", "selectPrefix", "(Lokio/Buffer;Lokio/Options;Z)I", "out", Constants.FLAG_TAG_OFFSET, "byteCount", "commonCopyTo", "(Lokio/Buffer;Lokio/Buffer;JJ)Lokio/Buffer;", "commonCompleteSegmentByteCount", "(Lokio/Buffer;)J", "", "commonReadByte", "(Lokio/Buffer;)B", "", "commonReadShort", "(Lokio/Buffer;)S", "commonReadInt", "(Lokio/Buffer;)I", "commonReadLong", "pos", "commonGet", "(Lokio/Buffer;J)B", "", "commonClear", "(Lokio/Buffer;)V", "commonSkip", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "commonWrite", "(Lokio/Buffer;Lokio/ByteString;II)Lokio/Buffer;", am.aE, "commonWriteDecimalLong", "(Lokio/Buffer;J)Lokio/Buffer;", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lokio/Buffer;I)Lokio/Segment;", MessageKey.MSG_SOURCE, "(Lokio/Buffer;[B)Lokio/Buffer;", "(Lokio/Buffer;[BII)Lokio/Buffer;", "commonReadByteArray", "(Lokio/Buffer;)[B", "(Lokio/Buffer;J)[B", "sink", "commonRead", "(Lokio/Buffer;[B)I", "commonReadFully", "(Lokio/Buffer;[B)V", "(Lokio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lokio/Buffer;)Lokio/ByteString;", "(Lokio/Buffer;J)Lokio/ByteString;", "commonSelect", "(Lokio/Buffer;Lokio/Options;)I", "(Lokio/Buffer;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/Buffer;Lokio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lokio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "(Lokio/Buffer;Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lokio/Buffer;I)Lokio/Buffer;", "Lokio/Source;", "commonWriteAll", "(Lokio/Buffer;Lokio/Source;)J", "(Lokio/Buffer;Lokio/Source;J)Lokio/Buffer;", "b", "commonWriteByte", am.aB, "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "(Lokio/Buffer;Lokio/Buffer;J)J", "toIndex", "commonIndexOf", "(Lokio/Buffer;BJJ)J", "(Lokio/Buffer;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lokio/Buffer;JLokio/ByteString;II)Z", "", "other", "commonEquals", "(Lokio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lokio/Buffer;)Lokio/Buffer;", "commonSnapshot", "(Lokio/Buffer;I)Lokio/ByteString;", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_DIGIT_START", "J", "OVERFLOW_ZONE", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class BufferKt {
    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull Buffer buffer) {
        buffer.skip(buffer.size());
    }

    public static final long commonCompleteSegmentByteCount(@NotNull Buffer buffer) {
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.throwNpe();
        }
        int i2 = segment2.limit;
        return (i2 >= 8192 || !segment2.owner) ? size : size - (i2 - segment2.pos);
    }

    @NotNull
    public static final Buffer commonCopy(@NotNull Buffer buffer) {
        Buffer buffer2 = new Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            if (segment3 == null) {
                Intrinsics.throwNpe();
            }
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final Buffer commonCopyTo(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j2, long j3) {
        Util.checkOffsetAndCount(buffer.size(), j2, j3);
        if (j3 == 0) {
            return buffer;
        }
        buffer2.setSize$okio(buffer2.size() + j3);
        Segment segment = buffer.head;
        while (true) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            segment = segment.next;
        }
        while (j3 > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment sharedCopy = segment.sharedCopy();
            int i4 = sharedCopy.pos + ((int) j2);
            sharedCopy.pos = i4;
            sharedCopy.limit = Math.min(i4 + ((int) j3), sharedCopy.limit);
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer2.head = sharedCopy;
            } else {
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                Segment segment3 = segment2.prev;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                segment3.push(sharedCopy);
            }
            j3 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j2 = 0;
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull Buffer buffer, @Nullable Object obj) {
        if (buffer == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer2 = (Buffer) obj;
            if (buffer.size() != buffer2.size()) {
                return false;
            }
            if (buffer.size() == 0) {
                return true;
            }
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment2.pos;
            long j2 = 0;
            while (j2 < buffer.size()) {
                long min = Math.min(segment.limit - i2, segment2.limit - i3);
                long j3 = 0;
                while (j3 < min) {
                    int i4 = i2 + 1;
                    int i5 = i3 + 1;
                    if (segment.data[i2] != segment2.data[i3]) {
                        return false;
                    }
                    j3++;
                    i2 = i4;
                    i3 = i5;
                }
                if (i2 == segment.limit) {
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    i2 = segment.pos;
                }
                if (i3 == segment2.limit) {
                    segment2 = segment2.next;
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                    i3 = segment2.pos;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    public static final byte commonGet(@NotNull Buffer buffer, long j2) {
        Util.checkOffsetAndCount(buffer.size(), j2, 1L);
        Segment segment = buffer.head;
        if (segment != null) {
            if (buffer.size() - j2 < j2) {
                long size = buffer.size();
                while (size > j2) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    size -= segment.limit - segment.pos;
                }
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                return segment.data[(int) ((segment.pos + j2) - size)];
            }
            long j3 = 0;
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 > j2) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j3 = j4;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((segment.pos + j2) - j3)];
        }
        Segment segment2 = null;
        Intrinsics.throwNpe();
        return segment2.data[(int) ((segment2.pos + j2) - (-1))];
    }

    public static final int commonHashCode(@NotNull Buffer buffer) {
        Segment segment = buffer.head;
        if (segment != null) {
            int i2 = 1;
            do {
                int i3 = segment.limit;
                for (int i4 = segment.pos; i4 < i3; i4++) {
                    i2 = (i2 * 31) + segment.data[i4];
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
            } while (segment != buffer.head);
            return i2;
        }
        return 0;
    }

    public static final long commonIndexOf(@NotNull Buffer buffer, byte b, long j2, long j3) {
        Segment segment;
        int i2;
        long j4 = 0;
        if (0 <= j2 && j3 >= j2) {
            if (j3 > buffer.size()) {
                j3 = buffer.size();
            }
            if (j2 == j3 || (segment = buffer.head) == null) {
                return -1L;
            }
            if (buffer.size() - j2 < j2) {
                j4 = buffer.size();
                while (j4 > j2) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j4 -= segment.limit - segment.pos;
                }
                if (segment != null) {
                    while (j4 < j3) {
                        byte[] bArr = segment.data;
                        int min = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
                        i2 = (int) ((segment.pos + j2) - j4);
                        while (i2 < min) {
                            if (bArr[i2] != b) {
                                i2++;
                            }
                        }
                        j4 += segment.limit - segment.pos;
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j2 = j4;
                    }
                }
                return -1L;
            }
            while (true) {
                long j5 = (segment.limit - segment.pos) + j4;
                if (j5 > j2) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j4 = j5;
            }
            if (segment != null) {
                while (j4 < j3) {
                    byte[] bArr2 = segment.data;
                    int min2 = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
                    i2 = (int) ((segment.pos + j2) - j4);
                    while (i2 < min2) {
                        if (bArr2[i2] != b) {
                            i2++;
                        }
                    }
                    j4 += segment.limit - segment.pos;
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j2 = j4;
                }
            }
            return -1L;
            return (i2 - segment.pos) + j4;
        }
        throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
    }

    public static final long commonIndexOfElement(@NotNull Buffer buffer, @NotNull ByteString byteString, long j2) {
        int i2;
        int i3;
        long j3 = 0;
        if (j2 >= 0) {
            Segment segment = buffer.head;
            if (segment != null) {
                if (buffer.size() - j2 < j2) {
                    j3 = buffer.size();
                    while (j3 > j2) {
                        segment = segment.prev;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j3 -= segment.limit - segment.pos;
                    }
                    if (segment != null) {
                        if (byteString.size() == 2) {
                            byte b = byteString.getByte(0);
                            byte b2 = byteString.getByte(1);
                            while (j3 < buffer.size()) {
                                byte[] bArr = segment.data;
                                i2 = (int) ((segment.pos + j2) - j3);
                                int i4 = segment.limit;
                                while (i2 < i4) {
                                    byte b3 = bArr[i2];
                                    if (b3 != b && b3 != b2) {
                                        i2++;
                                    }
                                    i3 = segment.pos;
                                }
                                j3 += segment.limit - segment.pos;
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j2 = j3;
                            }
                        } else {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            while (j3 < buffer.size()) {
                                byte[] bArr2 = segment.data;
                                i2 = (int) ((segment.pos + j2) - j3);
                                int i5 = segment.limit;
                                while (i2 < i5) {
                                    byte b4 = bArr2[i2];
                                    for (byte b5 : internalArray$okio) {
                                        if (b4 == b5) {
                                            i3 = segment.pos;
                                        }
                                    }
                                    i2++;
                                }
                                j3 += segment.limit - segment.pos;
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j2 = j3;
                            }
                        }
                    }
                    return -1L;
                }
                while (true) {
                    long j4 = (segment.limit - segment.pos) + j3;
                    if (j4 > j2) {
                        break;
                    }
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j3 = j4;
                }
                if (segment != null) {
                    if (byteString.size() == 2) {
                        byte b6 = byteString.getByte(0);
                        byte b7 = byteString.getByte(1);
                        while (j3 < buffer.size()) {
                            byte[] bArr3 = segment.data;
                            i2 = (int) ((segment.pos + j2) - j3);
                            int i6 = segment.limit;
                            while (i2 < i6) {
                                byte b8 = bArr3[i2];
                                if (b8 != b6 && b8 != b7) {
                                    i2++;
                                }
                                i3 = segment.pos;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j2 = j3;
                        }
                    } else {
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        while (j3 < buffer.size()) {
                            byte[] bArr4 = segment.data;
                            i2 = (int) ((segment.pos + j2) - j3);
                            int i7 = segment.limit;
                            while (i2 < i7) {
                                byte b9 = bArr4[i2];
                                for (byte b10 : internalArray$okio2) {
                                    if (b9 == b10) {
                                        i3 = segment.pos;
                                    }
                                }
                                i2++;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j2 = j3;
                        }
                    }
                }
                return -1L;
                return (i2 - i3) + j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    public static final boolean commonRangeEquals(@NotNull Buffer buffer, long j2, @NotNull ByteString byteString, int i2, int i3) {
        if (j2 < 0 || i2 < 0 || i3 < 0 || buffer.size() - j2 < i3 || byteString.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (buffer.getByte(i4 + j2) != byteString.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(@NotNull Buffer buffer, @NotNull Sink sink) {
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final byte commonReadByte(@NotNull Buffer buffer) {
        if (buffer.size() != 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            int i4 = i2 + 1;
            byte b = segment.data[i2];
            buffer.setSize$okio(buffer.size() - 1);
            if (i4 == i3) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return b;
        }
        throw new EOFException();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer buffer) {
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer buffer) {
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c7 A[EDGE_INSN: B:113:0x00c7->B:106:0x00c7 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r17) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = buffer.read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b2 A[EDGE_INSN: B:96:0x00b2->B:91:0x00b2 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) {
        /*
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbc
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L14
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L14:
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1a:
            if (r8 >= r9) goto L9c
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2b
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2b
            int r11 = r10 - r11
            goto L45
        L2b:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3a
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3a
        L35:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L45
        L3a:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7d
            goto L35
        L45:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L55
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1a
        L55:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L7d:
            if (r0 == 0) goto L81
            r1 = 1
            goto L9c
        L81:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L9c:
            if (r8 != r9) goto Laa
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool r7 = okio.SegmentPool.INSTANCE
            r7.recycle(r6)
            goto Lac
        Laa:
            r6.pos = r8
        Lac:
            if (r1 != 0) goto Lb2
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        Lb2:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lbc:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull Buffer buffer) {
        if (buffer.size() >= 4) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 4) {
                return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            buffer.setSize$okio(buffer.size() - 4);
            if (i9 == i3) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i9;
            }
            return i10;
        }
        throw new EOFException();
    }

    public static final long commonReadLong(@NotNull Buffer buffer) {
        if (buffer.size() >= 8) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 8) {
                return ((buffer.readInt() & UnsignedInts.INT_MASK) << 32) | (UnsignedInts.INT_MASK & buffer.readInt());
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            long j2 = ((bArr[i2] & 255) << 56) | ((bArr[i4] & 255) << 48) | ((bArr[i5] & 255) << 40) | ((bArr[i6] & 255) << 32) | ((bArr[i7] & 255) << 24) | ((bArr[i8] & 255) << 16);
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            long j3 = j2 | ((bArr[i9] & 255) << 8) | (bArr[i10] & 255);
            buffer.setSize$okio(buffer.size() - 8);
            if (i11 == i3) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i11;
            }
            return j3;
        }
        throw new EOFException();
    }

    public static final short commonReadShort(@NotNull Buffer buffer) {
        if (buffer.size() >= 2) {
            Segment segment = buffer.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            int i3 = segment.limit;
            if (i3 - i2 < 2) {
                return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
            }
            byte[] bArr = segment.data;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            buffer.setSize$okio(buffer.size() - 2);
            if (i5 == i3) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull Buffer buffer, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (buffer.size() >= j2) {
                if (i2 == 0) {
                    return "";
                }
                Segment segment = buffer.head;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                int i3 = segment.pos;
                if (i3 + j2 > segment.limit) {
                    return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j2), 0, 0, 3, null);
                }
                int i4 = (int) j2;
                String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i3, i3 + i4);
                segment.pos += i4;
                buffer.setSize$okio(buffer.size() - j2);
                if (segment.pos == segment.limit) {
                    buffer.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
                return commonToUtf8String;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    public static final int commonReadUtf8CodePoint(@NotNull Buffer buffer) {
        int i2;
        int i3;
        int i4;
        if (buffer.size() != 0) {
            byte b = buffer.getByte(0L);
            if ((b & 128) == 0) {
                i2 = b & Byte.MAX_VALUE;
                i4 = 0;
                i3 = 1;
            } else if ((b & 224) == 192) {
                i2 = b & Ascii.US;
                i3 = 2;
                i4 = 128;
            } else if ((b & 240) == 224) {
                i2 = b & 15;
                i3 = 3;
                i4 = 2048;
            } else if ((b & 248) != 240) {
                buffer.skip(1L);
                return 65533;
            } else {
                i2 = b & 7;
                i3 = 4;
                i4 = 65536;
            }
            long j2 = i3;
            if (buffer.size() >= j2) {
                for (int i5 = 1; i5 < i3; i5++) {
                    long j3 = i5;
                    byte b2 = buffer.getByte(j3);
                    if ((b2 & 192) != 128) {
                        buffer.skip(j3);
                        return 65533;
                    }
                    i2 = (i2 << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                }
                buffer.skip(j2);
                if (i2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
                    return 65533;
                }
                return i2;
            }
            throw new EOFException("size < " + i3 + ": " + buffer.size() + " (to read code point prefixed 0x" + Util.toHexString(b) + ')');
        }
        throw new EOFException();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull Buffer buffer) {
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull Buffer buffer, long j2) {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            byte b = (byte) 10;
            long indexOf = buffer.indexOf(b, 0L, j3);
            if (indexOf != -1) {
                return readUtf8Line(buffer, indexOf);
            }
            if (j3 < buffer.size() && buffer.getByte(j3 - 1) == ((byte) 13) && buffer.getByte(j3) == b) {
                return readUtf8Line(buffer, j3);
            }
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j2) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    public static final int commonSelect(@NotNull Buffer buffer, @NotNull Options options) {
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(@NotNull Buffer buffer, long j2) {
        while (j2 > 0) {
            Segment segment = buffer.head;
            if (segment != null) {
                int min = (int) Math.min(j2, segment.limit - segment.pos);
                long j3 = min;
                buffer.setSize$okio(buffer.size() - j3);
                j2 -= j3;
                int i2 = segment.pos + min;
                segment.pos = i2;
                if (i2 == segment.limit) {
                    buffer.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer buffer) {
        if (buffer.size() <= ((long) Integer.MAX_VALUE)) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull Buffer buffer, int i2) {
        boolean z = true;
        if ((i2 < 1 || i2 > 8192) ? false : false) {
            Segment segment = buffer.head;
            if (segment == null) {
                Segment take = SegmentPool.INSTANCE.take();
                buffer.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment segment2 = segment.prev;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.INSTANCE.take()) : segment2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull ByteString byteString, int i2, int i3) {
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer buffer, ByteString byteString, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = byteString.size();
        }
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull Buffer buffer, @NotNull Source source) {
        long j2 = 0;
        while (true) {
            long read = source.read(buffer, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @NotNull
    public static final Buffer commonWriteByte(@NotNull Buffer buffer, int i2) {
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        writableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteDecimalLong(@NotNull Buffer buffer, long j2) {
        int i2;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 == 0) {
            return buffer.writeByte(48);
        }
        boolean z = false;
        int i4 = 1;
        if (i3 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        }
        if (j2 < 100000000) {
            if (j2 >= SobotOkHttpUtils.DEFAULT_MILLISECONDS) {
                i2 = j2 < 1000000 ? j2 < IndexSeeker.MIN_TIME_BETWEEN_POINTS_US ? 5 : 6 : j2 < 10000000 ? 7 : 8;
            } else if (j2 >= 100) {
                i2 = j2 < 1000 ? 3 : 4;
            } else if (j2 >= 10) {
                i4 = 2;
            }
            i4 = i2;
        } else if (j2 < 1000000000000L) {
            if (j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i4 = j2 < C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i2 = j2 < 100000000000L ? 11 : 12;
                i4 = i2;
            }
        } else if (j2 >= 1000000000000000L) {
            i4 = j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 < 10000000000000L) {
            i4 = 13;
        } else {
            i2 = j2 < 100000000000000L ? 14 : 15;
            i4 = i2;
        }
        if (z) {
            i4++;
        }
        Segment writableSegment$okio = buffer.writableSegment$okio(i4);
        byte[] bArr = writableSegment$okio.data;
        int i5 = writableSegment$okio.limit + i4;
        while (j2 != 0) {
            long j3 = 10;
            i5--;
            bArr[i5] = getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr[i5 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i4;
        buffer.setSize$okio(buffer.size() + i4);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer buffer, long j2) {
        if (j2 == 0) {
            return buffer.writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = buffer.writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = getHEX_DIGIT_BYTES()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        writableSegment$okio.limit += i2;
        buffer.setSize$okio(buffer.size() + i2);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteInt(@NotNull Buffer buffer, int i2) {
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        writableSegment$okio.limit = i6 + 1;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteLong(@NotNull Buffer buffer, long j2) {
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        writableSegment$okio.limit = i9 + 1;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteShort(@NotNull Buffer buffer, int i2) {
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        writableSegment$okio.limit = i4 + 1;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final Buffer commonWriteUtf8(@NotNull Buffer buffer, @NotNull String str, int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (!(i3 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
            }
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    Segment writableSegment$okio = buffer.writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i4 = writableSegment$okio.limit - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = writableSegment$okio.limit;
                    int i7 = (i4 + i5) - i6;
                    writableSegment$okio.limit = i6 + i7;
                    buffer.setSize$okio(buffer.size() + i7);
                    i2 = i5;
                } else {
                    if (charAt < 2048) {
                        Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i8 = writableSegment$okio2.limit;
                        bArr2[i8] = (byte) ((charAt >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                        writableSegment$okio2.limit = i8 + 2;
                        buffer.setSize$okio(buffer.size() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i11 = writableSegment$okio3.limit;
                            bArr3[i11] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                            writableSegment$okio3.limit = i11 + 4;
                            buffer.setSize$okio(buffer.size() + 4);
                            i2 += 2;
                        } else {
                            buffer.writeByte(63);
                            i2 = i9;
                        }
                    } else {
                        Segment writableSegment$okio4 = buffer.writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i12 = writableSegment$okio4.limit;
                        bArr4[i12] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i12 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr4[i12 + 2] = (byte) ((charAt & '?') | 128);
                        writableSegment$okio4.limit = i12 + 3;
                        buffer.setSize$okio(buffer.size() + 3);
                    }
                    i2++;
                }
            }
            return buffer;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }

    @NotNull
    public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer buffer, int i2) {
        if (i2 < 128) {
            buffer.writeByte(i2);
        } else if (i2 < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i3 = writableSegment$okio.limit;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            writableSegment$okio.limit = i3 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            buffer.writeByte(63);
        } else if (i2 < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i4 = writableSegment$okio2.limit;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            writableSegment$okio2.limit = i4 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else if (i2 <= 1114111) {
            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i5 = writableSegment$okio3.limit;
            bArr3[i5] = (byte) ((i2 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            writableSegment$okio3.limit = i5 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i2));
        }
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i2, @NotNull byte[] bArr, int i3, int i4) {
        int i5 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i2 = segment.pos;
                i5 = segment.limit;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull Buffer buffer, long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (buffer.getByte(j3) == ((byte) 13)) {
                String readUtf8 = buffer.readUtf8(j3);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j2);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(@NotNull Buffer buffer, long j2, @NotNull Function2<? super Segment, ? super Long, ? extends T> function2) {
        Segment segment = buffer.head;
        if (segment != null) {
            if (buffer.size() - j2 < j2) {
                long size = buffer.size();
                while (size > j2) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    size -= segment.limit - segment.pos;
                }
                return function2.invoke(segment, Long.valueOf(size));
            }
            long j3 = 0;
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 > j2) {
                    return function2.invoke(segment, Long.valueOf(j3));
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j3 = j4;
            }
        } else {
            return function2.invoke(null, -1L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0055, code lost:
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0057, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0058, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    public static final int commonRead(@NotNull Buffer buffer, @NotNull byte[] bArr, int i2, int i3) {
        Util.checkOffsetAndCount(bArr.length, i2, i3);
        Segment segment = buffer.head;
        if (segment != null) {
            int min = Math.min(i3, segment.limit - segment.pos);
            byte[] bArr2 = segment.data;
            int i4 = segment.pos;
            ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i2, i4, i4 + min);
            segment.pos += min;
            buffer.setSize$okio(buffer.size() - min);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer buffer, long j2) {
        if (j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (buffer.size() >= j2) {
                byte[] bArr = new byte[(int) j2];
                buffer.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer buffer, long j2) {
        if (j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE)) {
            if (buffer.size() >= j2) {
                if (j2 >= 4096) {
                    ByteString snapshot = buffer.snapshot((int) j2);
                    buffer.skip(j2);
                    return snapshot;
                }
                return new ByteString(buffer.readByteArray(j2));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j2).toString());
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull byte[] bArr) {
        return buffer.write(bArr, 0, bArr.length);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull byte[] bArr, int i2, int i3) {
        long j2 = i3;
        Util.checkOffsetAndCount(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i4 - i2, 8192 - writableSegment$okio.limit);
            int i5 = i2 + min;
            ArraysKt___ArraysJvmKt.copyInto(bArr, writableSegment$okio.data, writableSegment$okio.limit, i2, i5);
            writableSegment$okio.limit += min;
            i2 = i5;
        }
        buffer.setSize$okio(buffer.size() + j2);
        return buffer;
    }

    public static final void commonReadFully(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j2) {
        if (buffer.size() >= j2) {
            buffer2.write(buffer, j2);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer buffer, int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(buffer.size(), 0L, i2);
        Segment segment = buffer.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i6 = segment.limit;
            int i7 = segment.pos;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = buffer.head;
        int i8 = 0;
        while (i3 < i2) {
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            bArr[i8] = segment2.data;
            i3 += segment2.limit - segment2.pos;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.pos;
            segment2.shared = true;
            i8++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer buffer, @NotNull Source source, long j2) {
        while (j2 > 0) {
            long read = source.read(buffer, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j2) {
        if (j2 >= 0) {
            if (buffer.size() == 0) {
                return -1L;
            }
            if (j2 > buffer.size()) {
                j2 = buffer.size();
            }
            buffer2.write(buffer, j2);
            return j2;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    public static final void commonWrite(@NotNull Buffer buffer, @NotNull Buffer buffer2, long j2) {
        Segment segment;
        Segment segment2;
        if (buffer2 != buffer) {
            Util.checkOffsetAndCount(buffer2.size(), 0L, j2);
            while (j2 > 0) {
                Segment segment3 = buffer2.head;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = segment3.limit;
                if (buffer2.head == null) {
                    Intrinsics.throwNpe();
                }
                if (j2 < i2 - segment.pos) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        if (segment4 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment2 = segment4.prev;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.owner) {
                        if ((segment2.limit + j2) - (segment2.shared ? 0 : segment2.pos) <= 8192) {
                            Segment segment5 = buffer2.head;
                            if (segment5 == null) {
                                Intrinsics.throwNpe();
                            }
                            segment5.writeTo(segment2, (int) j2);
                            buffer2.setSize$okio(buffer2.size() - j2);
                            buffer.setSize$okio(buffer.size() + j2);
                            return;
                        }
                    }
                    Segment segment6 = buffer2.head;
                    if (segment6 == null) {
                        Intrinsics.throwNpe();
                    }
                    buffer2.head = segment6.split((int) j2);
                }
                Segment segment7 = buffer2.head;
                if (segment7 == null) {
                    Intrinsics.throwNpe();
                }
                long j3 = segment7.limit - segment7.pos;
                buffer2.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    if (segment8 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment9 = segment8.prev;
                    if (segment9 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment9.push(segment7).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j3);
                buffer.setSize$okio(buffer.size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static final long commonIndexOf(@NotNull Buffer buffer, @NotNull ByteString byteString, long j2) {
        long j3;
        int i2;
        long j4 = j2;
        boolean z = true;
        if (byteString.size() > 0) {
            long j5 = 0;
            if (j4 >= 0) {
                Segment segment = buffer.head;
                if (segment != null) {
                    if (buffer.size() - j4 < j4) {
                        j3 = buffer.size();
                        while (j3 > j4) {
                            segment = segment.prev;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j3 -= segment.limit - segment.pos;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size = byteString.size();
                            long size2 = (buffer.size() - size) + 1;
                            while (j3 < size2) {
                                byte[] bArr = segment.data;
                                int min = (int) Math.min(segment.limit, (segment.pos + size2) - j3);
                                i2 = (int) ((segment.pos + j4) - j3);
                                while (i2 < min) {
                                    if (bArr[i2] != b || !rangeEquals(segment, i2 + 1, internalArray$okio, 1, size)) {
                                        i2++;
                                    }
                                }
                                j3 += segment.limit - segment.pos;
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j4 = j3;
                            }
                            return -1L;
                        }
                        return -1L;
                    }
                    while (true) {
                        long j6 = (segment.limit - segment.pos) + j5;
                        if (j6 > j4) {
                            break;
                        }
                        boolean z2 = z;
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j5 = j6;
                        z = z2;
                    }
                    if (segment != null) {
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        byte b2 = internalArray$okio2[0];
                        int size3 = byteString.size();
                        long size4 = (buffer.size() - size3) + 1;
                        j3 = j5;
                        while (j3 < size4) {
                            byte[] bArr2 = segment.data;
                            long j7 = size4;
                            int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j3);
                            i2 = (int) ((segment.pos + j4) - j3);
                            while (i2 < min2) {
                                if (bArr2[i2] == b2 && rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size3)) {
                                }
                                i2++;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            size4 = j7;
                            j4 = j3;
                        }
                        return -1L;
                    }
                    return -1L;
                    return (i2 - segment.pos) + j3;
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }
}
