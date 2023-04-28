package com.tencent.liteav.base.util;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CommonUtil {
    private static long mNativeNtpServiceDelegate;
    private static a sCallback;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2, String str);
    }

    public static boolean equals(Object obj, Object obj2) {
    }

    public static String getFileExtension(String str) {
    }

    public static long getNetworkTimestamp() {
    }

    public static String getSDKVersionStr() {
    }

    private static native long nativeCreate();

    private static native long nativeGetNetworkTimestamp(long j2);

    public static native String nativeGetSDKVersion();

    private static boolean nativeNtpServiceDelegateHasBeenCreated() {
    }

    private static native int nativeSetGlobalEnv(String str);

    private static native boolean nativeSetSocks5Proxy(String str, int i2, String str2, String str3);

    private static native int nativeUpdateNetworkTime(long j2);

    @CalledByNative
    public static void onUpdateNetworkTime(int i2, String str) {
    }

    public static int setGlobalEnv(String str) {
    }

    public static boolean setSocks5Proxy(String str, int i2, String str2, String str3) {
    }

    public static void setUpdateNetworkTimeCallback(a aVar) {
    }

    public static int updateNetworkTime() {
    }
}
