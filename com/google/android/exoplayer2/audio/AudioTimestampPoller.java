package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    @Nullable
    private final AudioTimestampV19 audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    @RequiresApi(19)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AudioTimestampV19 {
        private final AudioTimestamp audioTimestamp;
        private final AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampV19(AudioTrack audioTrack) {
        }

        public long getTimestampPositionFrames() {
        }

        public long getTimestampSystemTimeUs() {
        }

        public boolean maybeUpdateTimestamp() {
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
    }

    private void updateState(int state) {
    }

    public void acceptTimestamp() {
    }

    @TargetApi(19)
    public long getTimestampPositionFrames() {
    }

    @TargetApi(19)
    public long getTimestampSystemTimeUs() {
    }

    public boolean hasAdvancingTimestamp() {
    }

    public boolean hasTimestamp() {
    }

    @TargetApi(19)
    public boolean maybePollTimestamp(long systemTimeUs) {
    }

    public void rejectTimestamp() {
    }

    public void reset() {
    }
}
