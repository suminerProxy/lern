package okio;

import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Utf8.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a8\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u0016\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a8\u0010\u0019\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u0019\u0010\u0017\u001a8\u0010\u001a\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a8\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001b\u001a8\u0010\u001d\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001b\"\u0016\u0010\u001e\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0016\u0010 \u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0016\u0010!\u001a\u00020\u00188\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0016\u0010#\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0016\u0010$\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0016\u0010%\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0016\u0010'\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0016\u0010(\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"", "", "beginIndex", "endIndex", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "Lkotlin/Function1;", "", "yield", "processUtf8Bytes", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V", "", "processUtf8CodePoints", "([BIILkotlin/jvm/functions/Function1;)V", "", "processUtf16Chars", "process2Utf8Bytes", "([BIILkotlin/jvm/functions/Function1;)I", "process3Utf8Bytes", "process4Utf8Bytes", "MASK_2BYTES", "I", "MASK_3BYTES", "REPLACEMENT_CHARACTER", "C", "MASK_4BYTES", "LOG_SURROGATE_HEADER", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CODE_POINT", "HIGH_SURROGATE_HEADER", "okio"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "Utf8")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i2) {
    }

    public static final boolean isUtf8Continuation(byte b) {
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
    }

    public static final void processUtf16Chars(@NotNull byte[] bArr, int i2, int i3, @NotNull Function1<? super Character, Unit> function1) {
    }

    public static final void processUtf8Bytes(@NotNull String str, int i2, int i3, @NotNull Function1<? super Byte, Unit> function1) {
    }

    public static final void processUtf8CodePoints(@NotNull byte[] bArr, int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
    }

    @JvmOverloads
    @JvmName(name = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE)
    public static final long size(@NotNull String str) {
    }

    @JvmOverloads
    @JvmName(name = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE)
    public static final long size(@NotNull String str, int i2) {
    }

    @JvmOverloads
    @JvmName(name = MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE)
    public static final long size(@NotNull String str, int i2, int i3) {
    }

    public static /* synthetic */ long size$default(String str, int i2, int i3, int i4, Object obj) {
    }
}
