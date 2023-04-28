package com.google.android.exoplayer2;

import com.google.android.exoplayer2.MediaItem;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private float fallbackMaxPlaybackSpeed;
        private float fallbackMinPlaybackSpeed;
        private long maxLiveOffsetErrorUsForUnitSpeed;
        private float minPossibleLiveOffsetSmoothingFactor;
        private long minUpdateIntervalMs;
        private float proportionalControlFactorUs;
        private long targetLiveOffsetIncrementOnRebufferUs;

        public DefaultLivePlaybackSpeedControl build() {
        }

        public Builder setFallbackMaxPlaybackSpeed(float fallbackMaxPlaybackSpeed) {
        }

        public Builder setFallbackMinPlaybackSpeed(float fallbackMinPlaybackSpeed) {
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long maxLiveOffsetErrorMsForUnitSpeed) {
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float minPossibleLiveOffsetSmoothingFactor) {
        }

        public Builder setMinUpdateIntervalMs(long minUpdateIntervalMs) {
        }

        public Builder setProportionalControlFactor(float proportionalControlFactor) {
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long targetLiveOffsetIncrementOnRebufferMs) {
        }
    }

    public /* synthetic */ DefaultLivePlaybackSpeedControl(float f2, float f3, long j2, float f4, long j3, long j4, float f5, AnonymousClass1 anonymousClass1) {
    }

    private void adjustTargetLiveOffsetUs(long liveOffsetUs) {
    }

    private void maybeResetTargetLiveOffsetUs() {
    }

    private static long smooth(long smoothedValue, long newValue, float smoothingFactor) {
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long liveOffsetUs, long bufferedDurationUs) {
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long liveOffsetUs, long bufferedDurationUs) {
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long liveOffsetUs) {
    }

    private DefaultLivePlaybackSpeedControl(float fallbackMinPlaybackSpeed, float fallbackMaxPlaybackSpeed, long minUpdateIntervalMs, float proportionalControlFactor, long maxLiveOffsetErrorUsForUnitSpeed, long targetLiveOffsetRebufferDeltaUs, float minPossibleLiveOffsetSmoothingFactor) {
    }
}
