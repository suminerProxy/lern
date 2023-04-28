package com.tencent.thumbplayer.core.demuxer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativeJitterBufferConfig {
    private long mAdjustIntervalThresholdMs;
    private long mFrozenThresholdMs;
    private long mMaxIncreaseDurationMs;
    private long mMinDecreaseDurationMs;
    private long mPerDecreaseDurationMs;
    private long mPerIncreaseDurationMs;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {
        public static final long DEFAULT_ADJUST_INTERVAL_THRESHOLD_MS = 60000;
        public static final long DEFAULT_FROZEN_THRESHOLD_MS = 800;
        public static final long DEFAULT_MAX_DECREASE_DURATION_MS = 8000;
        public static final long DEFAULT_MIN_DECREASE_DURATION_MS = 2000;
        public static final long DEFAULT_PER_DECREASE_DURATION_MS = 500;
        public static final long DEFAULT_PER_INCREASE_DURATION_MS = 1000;
        private long mAdjustIntervalThresholdMs;
        private long mFrozenThresholdMs;
        private long mMaxIncreaseDurationMs;
        private long mMinDecreaseDurationMs;
        private long mPerDecreaseDurationMs;
        private long mPerIncreaseDurationMs;

        public final TPNativeJitterBufferConfig build() {
        }

        public final Builder setAdjustIntervalThresholdMs(long j2) {
        }

        public final Builder setFrozenThresholdMs(long j2) {
        }

        public final Builder setMaxIncreaseDurationMs(long j2) {
        }

        public final Builder setMinDecreaseDurationMs(long j2) {
        }

        public final Builder setPerDecreaseDurationMs(long j2) {
        }

        public final Builder setPerIncreaseDurationMs(long j2) {
        }
    }

    public TPNativeJitterBufferConfig(long j2, long j3, long j4, long j5, long j6, long j7) {
    }
}
