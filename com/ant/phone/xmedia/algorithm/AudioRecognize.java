package com.ant.phone.xmedia.algorithm;

import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AudioRecognize {
    private static final String CASE_ID = "UC-XM-C15";
    private static final String TAG = "AudioRecognize";
    private static final String XMEDIA_TRAFFIC_VOICE_COMPATIBLE = "XMEDIA_TRAFFIC_VOICE_COMPATIBLE";
    private static boolean isLoaded;
    private i mEvents;
    private boolean mInited;
    private h mTimeEvent;

    private String getModelPath(String[] strArr, String str) {
    }

    public static boolean isSupported(String str) {
    }

    private static boolean loadNativeLib() {
    }

    private native int nativeFree();

    private native int nativeGenWav(String str);

    private native String nativeGetVersion();

    private native int nativeInit(String str, String str2, String str3);

    private native int nativeProcess(short[] sArr, float[] fArr);

    private native int nativeSave(String str);

    private native int nativeTest();

    public int genWav(String str) {
    }

    public String getVersion() {
    }

    public boolean init(String str, String str2, String[] strArr) {
    }

    public void release() {
    }

    public int run(short[] sArr, float[] fArr) {
    }

    public int save(String str) {
    }

    public int test() {
    }
}
