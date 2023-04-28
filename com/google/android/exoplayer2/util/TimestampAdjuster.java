package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    @GuardedBy("this")
    private long firstSampleTimestampUs;
    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs;
    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long firstSampleTimestampUs) {
    }

    public static long ptsToUs(long pts) {
    }

    public static long usToNonWrappedPts(long us) {
    }

    public static long usToWrappedPts(long us) {
    }

    public synchronized long adjustSampleTimestamp(long timeUs) {
    }

    public synchronized long adjustTsTimestamp(long pts90Khz) {
    }

    public synchronized long getFirstSampleTimestampUs() {
    }

    public synchronized long getLastAdjustedTimestampUs() {
    }

    public synchronized long getTimestampOffsetUs() {
    }

    public synchronized void reset(long firstSampleTimestampUs) {
    }

    public synchronized void sharedInitializeOrWait(boolean canInitialize, long nextSampleTimestampUs) throws InterruptedException {
    }
}
