package com.arthenica.mobileffmpeg;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AbiDetect {

    /* renamed from: a  reason: collision with root package name */
    public static final String f925a = "arm-v7a";
    public static final String b = "arm-v7a-neon";
    private static boolean c;

    private AbiDetect() {
    }

    public static String a() {
    }

    public static void b(boolean z) {
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();
}
