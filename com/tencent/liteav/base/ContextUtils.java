package com.tencent.liteav.base;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import androidx.annotation.Nullable;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.annotations.MainDex;

@JNINamespace("base::android")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContextUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ContextUtils";
    private static Context sApplicationContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SharedPreferences f11415a;

        public static /* synthetic */ SharedPreferences a() {
        }

        public static /* synthetic */ SharedPreferences a(SharedPreferences sharedPreferences) {
        }
    }

    public static /* synthetic */ SharedPreferences access$000() {
    }

    @Nullable
    public static Activity activityFromContext(@Nullable Context context) {
    }

    private static SharedPreferences fetchAppSharedPreferences() {
    }

    public static SharedPreferences getAppSharedPreferences() {
    }

    public static AssetManager getApplicationAssets() {
    }

    public static Context getApplicationContext() {
    }

    @MainDex
    public static void initApplicationContext(Context context) {
    }

    @VisibleForTesting
    public static void initApplicationContextForTests(Context context) {
    }

    @CalledByNative
    public static void initContextFromNative(String str) {
    }

    private static void initJavaSideApplicationContext(Context context) {
    }

    public static boolean isIsolatedProcess() {
    }

    public static void setDataDirectorySuffix(String str) {
    }
}
