package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: GzipSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\"\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b\"\u0016\u0010\u000f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r\"\u0016\u0010\u0011\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b\"\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"", "bit", "", "getBit", "(II)Z", "Lokio/Source;", "Lokio/GzipSource;", "gzip", "(Lokio/Source;)Lokio/GzipSource;", "", "SECTION_TRAILER", "B", "FNAME", "I", "SECTION_DONE", "FHCRC", "FEXTRA", "FCOMMENT", "SECTION_HEADER", "SECTION_BODY", "okio"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "-GzipSourceExtensions")
/* renamed from: okio.-GzipSourceExtensions  reason: invalid class name */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    public static final /* synthetic */ boolean access$getBit(int i2, int i3) {
    }

    private static final boolean getBit(int i2, int i3) {
    }

    @NotNull
    public static final GzipSource gzip(@NotNull Source source) {
    }
}
