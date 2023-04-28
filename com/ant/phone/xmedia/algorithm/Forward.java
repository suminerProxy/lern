package com.ant.phone.xmedia.algorithm;

import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Forward {
    private static final String APMULTIMEDIA_SMART_CLIENT_COMPATIBLE = "APMULTIMEDIA_SMART_CLIENT_COMPATIBLE";
    private static final String CASE_ID = "UC-XM-C13";
    public static int ERROR_ASSEMBLE_FEATURE = 0;
    public static int ERROR_INTERNAL = 0;
    public static int ERROR_INVALID_PARAMS = 0;
    public static int ERROR_NONE = 0;
    public static final int FEATURE_DENSE_FLOAT = 1;
    public static final int FEATURE_DENSE_INT32 = 2;
    public static final int FEATURE_SPARSE = 0;
    private static final String FILL_INPUT_COST = "fillInputTime";
    private static final String FORWARD_COST = "forwardTime";
    private static final String GET_CONFIG_COST = "getCfgTime";
    private static final String LOAD_LIB_COST = "loadLibTime";
    private static final String RELEASE_COST = "releaseTime";
    private static final String TAG = "Forward";
    private static long getConfigCost;
    private i mEvents;
    private long mNativeInstance;
    private long mNativeSharedModel;
    private Options mOptions;
    private h mTimeEvent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public String patchFile;
        public int sampling;
        public String xnnConfig;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result {
        public float[] output;
        public int retCode;
    }

    private boolean initWithModel(String str, String str2, String str3) {
    }

    public static boolean isSupported(String str) {
    }

    private static Result makeResult(int i2) {
    }

    private void tracking() {
    }

    public boolean init(String str, String str2, String str3, Options options) {
    }

    public void release() {
    }

    @Deprecated
    public Result run(HashMap<String, HashMap<String, Object>> hashMap) {
    }

    @Deprecated
    public Result runV2(Map<String, Object> map) {
    }

    public Result runV3(String str) {
    }
}
