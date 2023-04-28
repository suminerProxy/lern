package com.google.android.exoplayer2;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    private final long fastForwardIncrementMs;
    private final boolean rewindAndFastForwardIncrementsSet;
    private final long rewindIncrementMs;

    public DefaultControlDispatcher() {
    }

    private static void seekToOffset(Player player, long offsetMs) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchFastForward(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchNext(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrepare(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchPrevious(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchRewind(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int windowIndex, long positionMs) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean playWhenReady) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlaybackParameters(Player player, PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean reset) {
    }

    public long getFastForwardIncrementMs(Player player) {
    }

    public long getRewindIncrementMs(Player player) {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isFastForwardEnabled() {
    }

    @Override // com.google.android.exoplayer2.ControlDispatcher
    public boolean isRewindEnabled() {
    }

    public DefaultControlDispatcher(long fastForwardIncrementMs, long rewindIncrementMs) {
    }
}
