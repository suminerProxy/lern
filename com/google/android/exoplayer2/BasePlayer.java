package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BasePlayer implements Player {
    public final Timeline.Window window;

    private int getRepeatModeForNavigation() {
    }

    private void seekToOffset(long offsetMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(int index, MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearMediaItems() {
    }

    public Player.Commands getAvailableCommands(Player.Commands permanentAvailableCommands) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getBufferedPercentage() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentLiveOffset() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public final Object getCurrentManifest() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public final MediaItem getCurrentMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaItem getMediaItemAt(int index) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getMediaItemCount() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getNextWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPreviousWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCommandAvailable(int command) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentWindowDynamic() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentWindowLive() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentWindowSeekable() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItem(int currentIndex, int newIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void next() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void play() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void previous() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItem(int index) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekBack() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekForward() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(long positionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackSpeed(float speed) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition(int windowIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem, boolean resetPosition) {
    }
}
