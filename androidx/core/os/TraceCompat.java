package androidx.core.os;

import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TraceCompat {
    private static final String TAG = "TraceCompat";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    private TraceCompat() {
    }

    public static void beginAsyncSection(@NonNull String str, int i2) {
    }

    public static void beginSection(@NonNull String str) {
    }

    public static void endAsyncSection(@NonNull String str, int i2) {
    }

    public static void endSection() {
    }

    public static boolean isEnabled() {
    }

    public static void setCounter(@NonNull String str, int i2) {
    }
}
