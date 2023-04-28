package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    @Nullable
    private static Method getIBinderMethod;
    @Nullable
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    @Nullable
    public static IBinder getBinder(Bundle bundle, @Nullable String key) {
    }

    @Nullable
    private static IBinder getBinderByReflection(Bundle bundle, @Nullable String key) {
    }

    public static void putBinder(Bundle bundle, @Nullable String key, @Nullable IBinder binder) {
    }

    private static void putBinderByReflection(Bundle bundle, @Nullable String key, @Nullable IBinder binder) {
    }
}
