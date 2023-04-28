package com.ant.phone.xmedia.algorithm;

import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import h.c.a.a.h.a;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Classify {
    private static final String CASE_ID = "UC-XM-C02";
    private static final String TAG = "Classify";
    private i mEvents;
    private int mFrameCount;
    private long mNativeInstance;
    private Options mOptions;
    private h mTimeEvent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public int sampling;
        public String xnnConfig;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result {
        public float conf;
        public String label;
    }

    public static boolean isSupported(String str) {
    }

    private void tracking() {
    }

    public boolean init(String str, String str2, String str3, Options options) {
    }

    public void release() {
    }

    public List<Result> run(a aVar, float[] fArr, int i2) {
    }
}
