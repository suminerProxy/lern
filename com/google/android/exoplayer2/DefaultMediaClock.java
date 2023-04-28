package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultMediaClock implements MediaClock {
    private boolean isUsingStandaloneClock;
    private final PlaybackParametersListener listener;
    @Nullable
    private MediaClock rendererClock;
    @Nullable
    private Renderer rendererClockSource;
    private final StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters newPlaybackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener listener, Clock clock) {
    }

    private boolean shouldUseStandaloneClock(boolean isReadingAhead) {
    }

    private void syncClocks(boolean isReadingAhead) {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
    }

    public void onRendererDisabled(Renderer renderer) {
    }

    public void onRendererEnabled(Renderer renderer) throws ExoPlaybackException {
    }

    public void resetPosition(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void start() {
    }

    public void stop() {
    }

    public long syncAndGetPositionUs(boolean isReadingAhead) {
    }
}
