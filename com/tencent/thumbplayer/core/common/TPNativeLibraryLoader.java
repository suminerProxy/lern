package com.tencent.thumbplayer.core.common;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativeLibraryLoader {
    private static final String DEFAULT_LIB_PLAYER_CORE_VERSION = "2.27.0.1016.min";
    private static final String MAIN_PLAYER_CORE_VERSION = "2.27.0";
    private static boolean mIsLibLoaded = false;
    private static Object mIsLibLoadedLock = null;
    private static final String mLibIjkPlayerCorePrefix = "ijkhlscache-master";
    private static ITPNativeLibraryExternalLoader mLibLoader = null;
    private static final boolean mLibNameHasArchSuffix = false;
    private static final String mLibPlayerCorePrefix = "TPCore-master";
    private static final int mPlayerCoreSupportMinAndroidAPILevel = 14;

    private static native String _getPlayerCoreVersion();

    public static String getLibVersion() {
    }

    public static String getPlayerCoreVersion() {
    }

    public static boolean isLibLoaded() {
    }

    private static boolean isMatchJavaAndPlayerCore(String str, String str2) {
    }

    private static boolean loadLib(Context context) {
    }

    private static boolean loadLibDefault(String str, Context context) {
    }

    public static void loadLibIfNeeded(Context context) {
    }

    public static void setLibLoader(ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader) {
    }
}
