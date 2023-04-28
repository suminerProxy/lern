package okio;

import com.tencent.android.tpush.common.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.SegmentedByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedByteString.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020'0I\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bS\u0010TJ\u000f\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001aH\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020\u001aH\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J'\u00100\u001a\u00020/2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aH\u0010¢\u0006\u0004\b6\u00107J/\u0010;\u001a\u00020:2\u0006\u00104\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010<J/\u0010;\u001a\u00020:2\u0006\u00104\u001a\u00020\u001a2\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010=J\u001f\u0010?\u001a\u00020\u001a2\u0006\u00108\u001a\u00020'2\u0006\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u001a2\u0006\u00108\u001a\u00020'2\u0006\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010C\u001a\u00020'H\u0010¢\u0006\u0004\bB\u0010)J\u001a\u0010E\u001a\u00020:2\b\u00108\u001a\u0004\u0018\u00010DH\u0096\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001aH\u0016¢\u0006\u0004\bG\u0010%J\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\rR\"\u0010J\u001a\b\u0012\u0004\u0012\u00020'0I8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "toByteString", "()Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "", "write", "(Ljava/io/OutputStream;)V", "Lokio/Buffer;", "buffer", Constants.FLAG_TAG_OFFSET, "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "", "segments", "[[B", "getSegments$okio", "()[[B", "", "directory", "[I", "getDirectory$okio", "()[I", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class SegmentedByteString extends ByteString {
    @NotNull
    private final transient int[] directory;
    @NotNull
    private final transient byte[][] segments;

    public SegmentedByteString(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        if (byteString != null) {
            return byteString;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        Intrinsics.checkExpressionValueIsNotNull(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @NotNull
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @NotNull
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            messageDigest.update(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkExpressionValueIsNotNull(digest, "digest.digest()");
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    @NotNull
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            byte[] bArr = getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        setHashCode$okio(i3);
        return i3;
    }

    @Override // okio.ByteString
    @NotNull
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String str, @NotNull ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory$okio()[length + i2];
                int i5 = getDirectory$okio()[i2];
                mac.update(getSegments$okio()[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            byte[] doFinal = mac.doFinal();
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@NotNull byte[] bArr, int i2) {
        return toByteString().indexOf(bArr, i2);
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i2) {
        Util.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i2, 1L);
        int segment = SegmentedByteStringKt.segment(this, i2);
        return getSegments$okio()[segment][(i2 - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@NotNull byte[] bArr, int i2) {
        return toByteString().lastIndexOf(bArr, i2);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, @NotNull ByteString byteString, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = SegmentedByteStringKt.segment(this, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i5, (getDirectory$okio()[segment] - i6) + i6) - i2;
            if (!byteString.rangeEquals(i3, getSegments$okio()[segment], i7 + (i2 - i6), min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString substring(int i2, int i3) {
        if (i2 >= 0) {
            if (!(i3 <= size())) {
                throw new IllegalArgumentException(("endIndex=" + i3 + " > length(" + size() + ')').toString());
            }
            int i4 = i3 - i2;
            if (i4 >= 0) {
                if (i2 == 0 && i3 == size()) {
                    return this;
                }
                if (i2 == i3) {
                    return ByteString.EMPTY;
                }
                int segment = SegmentedByteStringKt.segment(this, i2);
                int segment2 = SegmentedByteStringKt.segment(this, i3 - 1);
                byte[][] bArr = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(getSegments$okio(), segment, segment2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (segment <= segment2) {
                    int i5 = 0;
                    int i6 = segment;
                    while (true) {
                        iArr[i5] = Math.min(getDirectory$okio()[i6] - i2, i4);
                        int i7 = i5 + 1;
                        iArr[i5 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i6];
                        if (i6 == segment2) {
                            break;
                        }
                        i6++;
                        i5 = i7;
                    }
                }
                int i8 = segment != 0 ? getDirectory$okio()[segment - 1] : 0;
                int length = bArr.length;
                iArr[length] = iArr[length] + (i2 - i8);
                return new SegmentedByteString(bArr, iArr);
            }
            throw new IllegalArgumentException(("endIndex=" + i3 + " < beginIndex=" + i2).toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            int i7 = i6 - i3;
            ArraysKt___ArraysJvmKt.copyInto(getSegments$okio()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@NotNull OutputStream outputStream) throws IOException {
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            outputStream.write(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int i2, int i3) {
        int i4 = i3 + i2;
        int segment = SegmentedByteStringKt.segment(this, i2);
        while (i2 < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, (getDirectory$okio()[segment] - i5) + i5) - i2;
            int i7 = i6 + (i2 - i5);
            Segment segment2 = new Segment(getSegments$okio()[segment], i7, i7 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                Segment segment4 = segment3.prev;
                if (segment4 == null) {
                    Intrinsics.throwNpe();
                }
                segment4.push(segment2);
            }
            i2 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + size());
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, @NotNull byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = SegmentedByteStringKt.segment(this, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i5, (getDirectory$okio()[segment] - i6) + i6) - i2;
            if (!Util.arrayRangeEquals(getSegments$okio()[segment], i7 + (i2 - i6), bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }
}
