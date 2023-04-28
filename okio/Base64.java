package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: -Base64.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\f\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001c\u0010\u0007\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001c\u0010\u000b\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"", "", "decodeBase64ToArray", "(Ljava/lang/String;)[B", "map", "encodeBase64", "([B[B)Ljava/lang/String;", "BASE64_URL_SAFE", "[B", "getBASE64_URL_SAFE", "()[B", "BASE64", "getBASE64", "okio"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "-Base64")
/* renamed from: okio.-Base64  reason: invalid class name */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Base64 {
    @NotNull
    private static final byte[] BASE64;
    @NotNull
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    @Nullable
    public static final byte[] decodeBase64ToArray(@NotNull String str) {
        int i2;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt2 = str.charAt(i7);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i2 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i2 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i2 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i2 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i2 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i5 = (i5 << 6) | i2;
            i4++;
            if (i4 % 4 == 0) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 16);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i5 >> 8);
                bArr[i9] = (byte) i5;
                i6 = i9 + 1;
            }
        }
        int i10 = i4 % 4;
        if (i10 != 1) {
            if (i10 == 2) {
                bArr[i6] = (byte) ((i5 << 12) >> 16);
                i6++;
            } else if (i10 == 3) {
                int i11 = i5 << 6;
                int i12 = i6 + 1;
                bArr[i6] = (byte) (i11 >> 16);
                i6 = i12 + 1;
                bArr[i12] = (byte) (i11 >> 8);
            }
            if (i6 == i3) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }

    @NotNull
    public static final String encodeBase64(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr3[i3] = bArr2[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr3[i9] = bArr2[b3 & Utf8.REPLACEMENT_BYTE];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr3[i3] = bArr2[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i11] = b5;
            bArr3[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i12];
            int i13 = i3 + 1;
            bArr3[i3] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i14 + 1] = (byte) 61;
        }
        return Platform.toUtf8String(bArr3);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    @NotNull
    public static final byte[] getBASE64() {
        return BASE64;
    }

    @NotNull
    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
