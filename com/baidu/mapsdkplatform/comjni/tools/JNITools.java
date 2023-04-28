package com.baidu.mapsdkplatform.comjni.tools;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JNITools {
    public static native boolean CoordinateEncryptEx(float f2, float f3, String str, Object obj);

    public static native boolean CoordinateEncryptMc(float f2, float f3, Object obj);

    public static native void GetDistanceByMC(Object obj);

    public static native String GetToken();

    public static native boolean TransGeoStr2ComplexPt(Object obj);

    public static native boolean TransGeoStr2Pt(Object obj);

    public static native void TransNodeStr2Pt(Object obj);

    public static native double[] baiduToGcj(double d2, double d3);

    public static native double[] gcjToBaidu(double d2, double d3);

    public static native String getAESSaltKey(String str);

    public static native String getAESViKey(String str);

    public static native int initClass(Object obj, int i2);

    public static native void openLogEnable(boolean z, int i2);

    public static native double[] wgsToBaidu(double d2, double d3);
}
