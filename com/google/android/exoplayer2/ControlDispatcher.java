package com.google.android.exoplayer2;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ControlDispatcher {
    boolean dispatchFastForward(Player player);

    boolean dispatchNext(Player player);

    boolean dispatchPrepare(Player player);

    boolean dispatchPrevious(Player player);

    boolean dispatchRewind(Player player);

    boolean dispatchSeekTo(Player player, int windowIndex, long positionMs);

    boolean dispatchSetPlayWhenReady(Player player, boolean playWhenReady);

    boolean dispatchSetPlaybackParameters(Player player, PlaybackParameters playbackParameters);

    boolean dispatchSetRepeatMode(Player player, int repeatMode);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean shuffleModeEnabled);

    boolean dispatchStop(Player player, boolean reset);

    boolean isFastForwardEnabled();

    boolean isRewindEnabled();
}
