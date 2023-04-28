package com.tencent.youtu.liveness;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YTCommonInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f14508a = true;
    private static String b = "YTCommon";
    private static int c = 1;

    public static int a(String str, String str2) {
    }

    public static native long getEndTime();

    public static native int[] getSDKList();

    public static native String getSDKNameByID(int i2);

    public static native String getVersion();

    private static native int nativeGetDeviceInfo(a aVar);

    private static native int nativeInitAuthByAssets(String str, String str2);

    private static native int nativeInitAuthByString(String str, String str2);

    private static native int nativeInitAuthForQQ();

    private static native void nativePrintAuthResult(int i2);

    private static native void nativeSetEnableLog(int i2);
}
