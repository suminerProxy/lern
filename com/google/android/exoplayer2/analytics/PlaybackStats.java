package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = null;
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    public static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exception) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        @Nullable
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int playbackState) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    public PlaybackStats(int playbackCount, long[] playbackStateDurationsMs, List<EventTimeAndPlaybackState> playbackStateHistory, List<long[]> mediaTimeHistory, long firstReportedTimeMs, int foregroundPlaybackCount, int abandonedBeforeReadyCount, int endedCount, int backgroundJoiningCount, long totalValidJoinTimeMs, int validJoinTimeCount, int totalPauseCount, int totalPauseBufferCount, int totalSeekCount, int totalRebufferCount, long maxRebufferTimeMs, int adPlaybackCount, List<EventTimeAndFormat> videoFormatHistory, List<EventTimeAndFormat> audioFormatHistory, long totalVideoFormatHeightTimeMs, long totalVideoFormatHeightTimeProduct, long totalVideoFormatBitrateTimeMs, long totalVideoFormatBitrateTimeProduct, long totalAudioFormatTimeMs, long totalAudioFormatBitrateTimeProduct, int initialVideoFormatHeightCount, int initialVideoFormatBitrateCount, int totalInitialVideoFormatHeight, long totalInitialVideoFormatBitrate, int initialAudioFormatBitrateCount, long totalInitialAudioFormatBitrate, long totalBandwidthTimeMs, long totalBandwidthBytes, long totalDroppedFrames, long totalAudioUnderruns, int fatalErrorPlaybackCount, int fatalErrorCount, int nonFatalErrorCount, List<EventTimeAndException> fatalErrorHistory, List<EventTimeAndException> nonFatalErrorHistory) {
    }

    public static PlaybackStats merge(PlaybackStats... playbackStats) {
    }

    public float getAbandonedBeforeReadyRatio() {
    }

    public float getAudioUnderrunRate() {
    }

    public float getDroppedFramesRate() {
    }

    public float getEndedRatio() {
    }

    public float getFatalErrorRate() {
    }

    public float getFatalErrorRatio() {
    }

    public float getJoinTimeRatio() {
    }

    public int getMeanAudioFormatBitrate() {
    }

    public int getMeanBandwidth() {
    }

    public long getMeanElapsedTimeMs() {
    }

    public int getMeanInitialAudioFormatBitrate() {
    }

    public int getMeanInitialVideoFormatBitrate() {
    }

    public int getMeanInitialVideoFormatHeight() {
    }

    public long getMeanJoinTimeMs() {
    }

    public float getMeanNonFatalErrorCount() {
    }

    public float getMeanPauseBufferCount() {
    }

    public float getMeanPauseCount() {
    }

    public long getMeanPausedTimeMs() {
    }

    public long getMeanPlayAndWaitTimeMs() {
    }

    public long getMeanPlayTimeMs() {
    }

    public float getMeanRebufferCount() {
    }

    public long getMeanRebufferTimeMs() {
    }

    public float getMeanSeekCount() {
    }

    public long getMeanSeekTimeMs() {
    }

    public long getMeanSingleRebufferTimeMs() {
    }

    public long getMeanSingleSeekTimeMs() {
    }

    public float getMeanTimeBetweenFatalErrors() {
    }

    public float getMeanTimeBetweenNonFatalErrors() {
    }

    public float getMeanTimeBetweenRebuffers() {
    }

    public int getMeanVideoFormatBitrate() {
    }

    public int getMeanVideoFormatHeight() {
    }

    public long getMeanWaitTimeMs() {
    }

    public long getMediaTimeMsAtRealtimeMs(long realtimeMs) {
    }

    public float getNonFatalErrorRate() {
    }

    public int getPlaybackStateAtTime(long realtimeMs) {
    }

    public long getPlaybackStateDurationMs(int playbackState) {
    }

    public float getRebufferRate() {
    }

    public float getRebufferTimeRatio() {
    }

    public float getSeekTimeRatio() {
    }

    public long getTotalElapsedTimeMs() {
    }

    public long getTotalJoinTimeMs() {
    }

    public long getTotalPausedTimeMs() {
    }

    public long getTotalPlayAndWaitTimeMs() {
    }

    public long getTotalPlayTimeMs() {
    }

    public long getTotalRebufferTimeMs() {
    }

    public long getTotalSeekTimeMs() {
    }

    public long getTotalWaitTimeMs() {
    }

    public float getWaitTimeRatio() {
    }
}
