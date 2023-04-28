package com.umeng.commonsdk.statistics.internal;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class StatTracer implements b {
    private static final String KEY_CLIENT_REQUEST_FAILED = "failed_requests ";
    private static final String KEY_CLIENT_REQUEST_LATENCY = "last_request_spent_ms";
    private static final String KEY_CLIENT_REQUEST_SUCCESS = "successful_request";
    private static final String KEY_CLIENT_REQUEST_TIME = "last_request_time";
    private static final String KEY_FIRST_ACTIVATE_TIME = "first_activate_time";
    private static final String KEY_LAST_REQ = "last_req";
    private static Context mContext;
    private final int MAX_REQUEST_LIMIT;
    private long firstActivateTime;
    private long lastRequestTime;
    public int mFailedRequest;
    private int mLastRequestLatency;
    public long mLastSuccessfulRequestTime;
    public int mSuccessfulRequest;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final StatTracer f15341a = null;

        private a() {
        }
    }

    public /* synthetic */ StatTracer(AnonymousClass1 anonymousClass1) {
    }

    public static StatTracer getInstance(Context context) {
    }

    private void init() {
    }

    public long getFirstActivateTime() {
    }

    public long getLastReqTime() {
    }

    public int getLastRequestLatency() {
    }

    public boolean isFirstRequest() {
    }

    public void logFailedRequest() {
    }

    public void logRequestEnd() {
    }

    public void logRequestStart() {
    }

    public void logSuccessfulRequest(boolean z) {
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestEnd() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestFailed() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestStart() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestSucceed(boolean z) {
    }

    public void saveSate() {
    }

    private StatTracer() {
    }
}
