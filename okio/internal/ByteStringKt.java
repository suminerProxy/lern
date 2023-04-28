package okio.internal;

import com.tencent.android.tpush.common.Constants;
import com.umeng.analytics.pro.am;
import h.a.a.a.a.i.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteString.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010 \u001a\u001c\u0010\"\u001a\u00020\u001d*\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010\"\u001a\u00020\u001d*\u00020\u00002\u0006\u0010!\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b\"\u0010$\u001a\u001c\u0010&\u001a\u00020\u001d*\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b&\u0010#\u001a\u001c\u0010&\u001a\u00020\u001d*\u00020\u00002\u0006\u0010%\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b&\u0010$\u001a$\u0010(\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\nH\u0080\b¢\u0006\u0004\b(\u0010)\u001a$\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\nH\u0080\b¢\u0006\u0004\b*\u0010+\u001a$\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\nH\u0080\b¢\u0006\u0004\b*\u0010)\u001a\u001e\u0010-\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010,H\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u0010/\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b/\u0010\u0014\u001a\u001c\u00100\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u0018\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b3\u00104\u001a$\u00105\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u0016\u00109\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b9\u00108\u001a\u0014\u0010:\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b:\u00108\u001a+\u0010>\u001a\u00020=*\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\b>\u0010?\u001a\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0014\u0010D\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bD\u0010\u0003\u001a\u001f\u0010G\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010H\"\u001c\u0010J\u001a\u00020I8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lokio/ByteString;", "", "commonUtf8", "(Lokio/ByteString;)Ljava/lang/String;", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "(Lokio/ByteString;II)Lokio/ByteString;", "pos", "", "commonGetByte", "(Lokio/ByteString;I)B", "commonGetSize", "(Lokio/ByteString;)I", "", "commonToByteArray", "(Lokio/ByteString;)[B", "commonInternalArray", Constants.FLAG_TAG_OFFSET, "other", "otherOffset", "byteCount", "", "commonRangeEquals", "(Lokio/ByteString;ILokio/ByteString;II)Z", "(Lokio/ByteString;I[BII)Z", g.f15702n, "commonStartsWith", "(Lokio/ByteString;Lokio/ByteString;)Z", "(Lokio/ByteString;[B)Z", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "(Lokio/ByteString;[BI)I", "commonLastIndexOf", "(Lokio/ByteString;Lokio/ByteString;I)I", "", "commonEquals", "(Lokio/ByteString;Ljava/lang/Object;)Z", "commonHashCode", "commonCompareTo", "(Lokio/ByteString;Lokio/ByteString;)I", "data", "commonOf", "([B)Lokio/ByteString;", "commonToByteString", "([BII)Lokio/ByteString;", "commonEncodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "commonDecodeBase64", "commonDecodeHex", "Lokio/Buffer;", "buffer", "", "commonWrite", "(Lokio/ByteString;Lokio/Buffer;II)V", "", am.aF, "decodeHexDigit", "(C)I", "commonToString", am.aB, "codePointCount", "codePointIndexToCharIndex", "([BI)I", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ByteStringKt {
    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] bArr, int i2) {
        return codePointIndexToCharIndex(bArr, i2);
    }

    public static final /* synthetic */ int access$decodeHexDigit(char c) {
        return decodeHexDigit(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x006b, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString byteString) {
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString byteString) {
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = byteString.getByte(i2) & 255;
            int i4 = byteString2.getByte(i2) & 255;
            if (i3 != i4) {
                return i3 < i4 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String str) {
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((decodeHexDigit(str.charAt(i3)) << 4) + decodeHexDigit(str.charAt(i3 + 1)));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String str) {
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(@NotNull ByteString byteString, @Nullable Object obj) {
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString byteString, int i2) {
        return byteString.getData$okio()[i2];
    }

    public static final int commonGetSize(@NotNull ByteString byteString) {
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString byteString) {
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString byteString) {
        byte[] data$okio;
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i2 = 0;
        for (byte b : byteString.getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i2) {
        int length = byteString.getData$okio().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(byteString.getData$okio(), max, bArr, 0, bArr.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString byteString) {
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString, @NotNull ByteString byteString2, int i2) {
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i2);
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i2, @NotNull ByteString byteString2, int i3, int i4) {
        return byteString2.rangeEquals(i3, byteString.getData$okio(), i2, i4);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString byteString, int i2, int i3) {
        if (i2 >= 0) {
            if (i3 <= byteString.getData$okio().length) {
                if (i3 - i2 >= 0) {
                    return (i2 == 0 && i3 == byteString.getData$okio().length) ? byteString : new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString.getData$okio(), i2, i3));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString byteString) {
        byte b;
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString byteString) {
        byte b;
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString byteString) {
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] bArr, int i2, int i3) {
        Util.checkOffsetAndCount(bArr.length, i2, i3);
        return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i2, i3 + i2));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString) {
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (codePointIndexToCharIndex == -1) {
            if (byteString.getData$okio().length <= 64) {
                return "[hex=" + byteString.hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(byteString.getData$okio().length);
            sb.append(" hex=");
            if (64 <= byteString.getData$okio().length) {
                sb.append((64 == byteString.getData$okio().length ? byteString : new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString.getData$okio(), 0, 64))).hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        String utf8 = byteString.utf8();
        if (utf8 != null) {
            String substring = utf8.substring(0, codePointIndexToCharIndex);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (codePointIndexToCharIndex < utf8.length()) {
                return "[size=" + byteString.getData$okio().length + " text=" + replace$default + "…]";
            }
            return "[text=" + replace$default + ']';
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString byteString) {
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(byteString.internalArray$okio());
            byteString.setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public static final void commonWrite(@NotNull ByteString byteString, @NotNull Buffer buffer, int i2, int i3) {
        buffer.write(byteString.getData$okio(), i2, i3);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i2) {
        for (int min = Math.min(i2, byteString.getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(byteString.getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i2, @NotNull byte[] bArr, int i3, int i4) {
        return i2 >= 0 && i2 <= byteString.getData$okio().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && Util.arrayRangeEquals(byteString.getData$okio(), i2, bArr, i3, i4);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }
}
