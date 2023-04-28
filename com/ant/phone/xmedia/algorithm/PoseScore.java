package com.ant.phone.xmedia.algorithm;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoseScore {
    private static final String TAG = "PoseScore";
    private long mNativeInstance;
    private Options mOptions;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public String algoConfig;
        public int angleThreshold;
        public float normalScale;
        public boolean roughCheck;
        public String xnnConfig;
    }

    private native long nativeInit(String[] strArr, String str, String str2);

    private native void nativeRelease();

    private native int nativeRun(float[] fArr, int i2, int i3, int i4);

    public boolean init(String str, String str2, String[] strArr, Options options) {
    }

    public void release() {
    }

    public int run(float[] fArr, int i2, int i3, int i4) {
    }
}
