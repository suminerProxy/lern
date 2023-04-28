package com.tencent.thumbplayer.core.common;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativeLog {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARN = 3;
    private static final String TAG = "PlayerCore";
    private static ITPNativeLogCallback mLogCallback;

    @TPMethodCalledByNative
    private static void onPrintLog(int i2, byte[] bArr, int i3, byte[] bArr2, int i4) {
    }

    public static void printLog(int i2, String str) {
    }

    public static void printLog(int i2, String str, String str2) {
    }

    public static void printLogDefault(int i2, String str, String str2) {
    }

    public static void setLogCallback(ITPNativeLogCallback iTPNativeLogCallback) {
    }
}
