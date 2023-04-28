package com.ant.phone.xmedia.algorithm;

import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import h.c.a.a.h.a;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SmileDetect {
    private static final String CASE_ID = "UC-XM-C12";
    private static final String EXTRA_DATA_MAX_SMILE_CONF = "maxSmileConf";
    private static final String EXTRA_DATA_SMILE_COUNT = "smileCount";
    private static final String SMILE_LABEL = "smile";
    private static String TAG = "SmileDetect";
    private static final String XMEDIA_FACE_DETECT_COMPATIBLE = "XMEDIA_FACE_DETECT_COMPATIBLE";
    private long mCurrentTime;
    private i mEvents;
    private int mFrameCount;
    private float mLastResult;
    private float mMaxSmileConf;
    private long mNativeInstance;
    private Options mOptions;
    private int mSmileCount;
    private h mTimeEvent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public int sampling;
        public int timeInterval;
        public String xnnConfig;
    }

    private boolean checkInterval() {
    }

    public static boolean isSupported(String str) {
    }

    private void tracking() {
    }

    public boolean init(String str, String str2, String str3, Options options) {
    }

    public void release() {
    }

    public float run(a aVar, float[] fArr, int i2, Map<String, Object> map) {
    }
}
