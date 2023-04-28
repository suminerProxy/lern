package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long MODE_SWITCH_SMOOTHING_DURATION_US = 1000000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    @Nullable
    private AudioTimestampPoller audioTimestampPoller;
    @Nullable
    private AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;
    @Nullable
    private Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPosition;
    private boolean lastSampleUsedGetTimestampMode;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private boolean notifiedPositionIncreasing;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long previousModePositionUs;
    private long previousModeSystemTimeUs;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onInvalidLatency(long latencyUs);

        void onPositionAdvancing(long playoutStartSystemTimeMs);

        void onPositionFramesMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void onSystemTimeUsMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void onUnderrun(int bufferSize, long bufferSizeMs);
    }

    public AudioTrackPositionTracker(Listener listener) {
    }

    private boolean forceHasPendingData() {
    }

    private long framesToDurationUs(long frameCount) {
    }

    private long getPlaybackHeadPosition() {
    }

    private long getPlaybackHeadPositionUs() {
    }

    private void maybePollAndCheckTimestamp(long systemTimeUs, long playbackPositionUs) {
    }

    private void maybeSampleSyncParams() {
    }

    private void maybeUpdateLatency(long systemTimeUs) {
    }

    private static boolean needsPassthroughWorkarounds(int outputEncoding) {
    }

    private void resetSyncParams() {
    }

    public int getAvailableBufferSize(long writtenBytes) {
    }

    public long getCurrentPositionUs(boolean sourceEnded) {
    }

    public long getPendingBufferDurationMs(long writtenFrames) {
    }

    public void handleEndOfStream(long writtenFrames) {
    }

    public boolean hasPendingData(long writtenFrames) {
    }

    public boolean isPlaying() {
    }

    public boolean isStalled(long writtenFrames) {
    }

    public boolean mayHandleBuffer(long writtenFrames) {
    }

    public boolean pause() {
    }

    public void reset() {
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean isPassthrough, int outputEncoding, int outputPcmFrameSize, int bufferSize) {
    }

    public void setAudioTrackPlaybackSpeed(float audioTrackPlaybackSpeed) {
    }

    public void start() {
    }
}
