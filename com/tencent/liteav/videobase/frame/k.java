package com.tencent.liteav.videobase.frame;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class k {
    private static final String TAG = "RefCounted";
    private long mLastUsedTimestamp;
    private final g mRecycler;
    private final AtomicInteger mRefCnt;
    private String mStackTrace;

    public k(g gVar) {
    }

    public void finalize() throws Throwable {
    }

    public long getLastUsedTimestamp() {
    }

    public void release() {
    }

    public int retain() {
    }

    public void updateLastUsedTimestamp(long j2) {
    }
}
