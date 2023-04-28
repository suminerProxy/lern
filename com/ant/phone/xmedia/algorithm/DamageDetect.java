package com.ant.phone.xmedia.algorithm;

import com.ant.phone.xmedia.algorithm.Classify;
import com.ant.phone.xmedia.algorithm.Detect;
import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import h.c.a.a.h.a;
import h.c.a.a.h.b;
import h.c.a.a.h.f;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DamageDetect {
    private static final String CASE_ID = "UC-XM-C14";
    public static final String EXTRA_DATA_IMAGE = "image";
    public static final String L0_COMPATIBLE = "APMULTIMEDIA_DAMAGE_DETECT_L0_COMPATIBLE";
    public static final String L1_COMPATIBLE = "APMULTIMEDIA_DAMAGE_DETECT_L1_COMPATIBLE";
    private static final String TAG = "DamageDetect";
    private ByteBuffer mBuffer;
    private long mCurrentTime;
    private i mEvents;
    private HashMap<String, Object> mExtraData;
    private int mFormat;
    private int mFrameCount;
    private int mHeight;
    private Result mLastResult;
    private long mNativeInstance;
    private Options mOptions;
    private h mTimeEvent;
    private int mWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public String algoConfig;
        public int imageOutput;
        public int newWay;
        public int sampling;
        public int timeInterval;
        public String xnnConfig;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result {
        public double SSIM;
        public Detect.Result[] damageDetect;
        public double[] darkHorse;
        public Classify.Result[] multiTask;
        public Detect.Result[] partsDetect;
    }

    private static boolean bundleAvailable(String str) {
    }

    private boolean checkInterval() {
    }

    public static boolean isSupported(String str) {
    }

    private native long nativeInit(String[] strArr, String str, int i2, int i3);

    private native void nativeRelease();

    private native Result nativeRun(ByteBuffer byteBuffer, int i2, int i3, int i4, float[] fArr, int i5);

    private void putBufferData(b bVar) {
    }

    private void tracking() {
    }

    public Object getExtraData(String str) {
    }

    public boolean init(String str, String str2, String[] strArr, Options options) {
    }

    public void release() {
    }

    public Result run(a aVar, float[] fArr, int i2) {
    }

    private void putBufferData(f fVar) {
    }
}
