package com.tencent.imsdk.v2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMSDKConfig {
    public static final int V2TIM_LOG_DEBUG = 3;
    public static final int V2TIM_LOG_ERROR = 6;
    public static final int V2TIM_LOG_INFO = 4;
    public static final int V2TIM_LOG_NONE = 0;
    public static final int V2TIM_LOG_WARN = 5;
    private int logLevel = 3;
    private V2TIMLogListener v2TIMLogListener;

    public int getLogLevel() {
        return this.logLevel;
    }

    public V2TIMLogListener getLogListener() {
        return this.v2TIMLogListener;
    }

    public void setLogLevel(int i2) {
        this.logLevel = i2;
    }

    public void setLogListener(V2TIMLogListener v2TIMLogListener) {
        this.v2TIMLogListener = v2TIMLogListener;
    }
}
