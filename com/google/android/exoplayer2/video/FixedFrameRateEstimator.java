package com.google.android.exoplayer2.video;

import androidx.annotation.VisibleForTesting;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    @VisibleForTesting
    public static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private Matcher candidateMatcher;
    private boolean candidateMatcherActive;
    private Matcher currentMatcher;
    private int framesWithoutSyncCount;
    private long lastFramePresentationTimeNs;
    private boolean switchToCandidateMatcherWhenSynced;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags;

        private static int getRecentFrameOutlierIndex(long frameCount) {
        }

        public long getFrameDurationNs() {
        }

        public long getMatchingFrameDurationSumNs() {
        }

        public boolean isLastFrameOutlier() {
        }

        public boolean isSynced() {
        }

        public void onNextFrame(long framePresentationTimeNs) {
        }

        public void reset() {
        }
    }

    public long getFrameDurationNs() {
    }

    public float getFrameRate() {
    }

    public int getFramesWithoutSyncCount() {
    }

    public long getMatchingFrameDurationSumNs() {
    }

    public boolean isSynced() {
    }

    public void onNextFrame(long framePresentationTimeNs) {
    }

    public void reset() {
    }
}
