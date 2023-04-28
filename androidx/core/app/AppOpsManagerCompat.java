package androidx.core.app;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static int noteOp(@NonNull Context context, @NonNull String str, int i2, @NonNull String str2) {
    }

    public static int noteOpNoThrow(@NonNull Context context, @NonNull String str, int i2, @NonNull String str2) {
    }

    public static int noteProxyOp(@NonNull Context context, @NonNull String str, @NonNull String str2) {
    }

    public static int noteProxyOpNoThrow(@NonNull Context context, @NonNull String str, @NonNull String str2) {
    }

    @Nullable
    public static String permissionToOp(@NonNull String str) {
    }
}
