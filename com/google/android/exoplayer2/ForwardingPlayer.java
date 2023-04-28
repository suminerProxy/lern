package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ForwardingPlayer implements Player {
    private final Player player;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ForwardingEventListener implements Player.EventListener {
        private final Player.EventListener eventListener;
        private final ForwardingPlayer forwardingPlayer;

        public /* synthetic */ ForwardingEventListener(ForwardingPlayer forwardingPlayer, Player.EventListener eventListener, AnonymousClass1 anonymousClass1) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onAvailableCommandsChanged(Player.Commands availableCommands) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsPlayingChanged(boolean isPlaying) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onMaxSeekToPreviousPositionChanged(int maxSeekToPreviousPositionMs) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(PlaybackException error) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerErrorChanged(@Nullable PlaybackException error) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int repeatMode) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekBackIncrementChanged(long seekBackIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekForwardIncrementChanged(long seekForwardIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        @Deprecated
        public void onStaticMetadataChanged(List<Metadata> metadataList) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
        }

        private ForwardingEventListener(ForwardingPlayer forwardingPlayer, Player.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ForwardingListener extends ForwardingEventListener implements Player.Listener {
        private final Player.Listener listener;

        public ForwardingListener(ForwardingPlayer forwardingPlayer, Player.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public void onAudioSessionIdChanged(int audioSessionId) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> cues) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public void onDeviceVolumeChanged(int volume, boolean muted) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onSurfaceSizeChanged(int width, int height) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public void onVolumeChanged(float volume) {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        }
    }

    public ForwardingPlayer(Player player) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.EventListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearMediaItems() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
    }

    @Override // com.google.android.exoplayer2.Player
    public AudioAttributes getAudioAttributes() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getBufferedPercentage() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
    }

    @Override // com.google.android.exoplayer2.Player
    public List<Cue> getCurrentCues() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentLiveOffset() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Object getCurrentManifest() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public MediaItem getCurrentMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public List<Metadata> getCurrentStaticMetadata() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public DeviceInfo getDeviceInfo() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMaxSeekToPreviousPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaItem getMediaItemAt(int index) {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMediaItemCount() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getNextWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public PlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPreviousWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public VideoSize getVideoSize() {
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void increaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCommandAvailable(int command) {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentWindowDynamic() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentWindowLive() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentWindowSeekable() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isDeviceMuted() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlaying() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItem(int currentIndex, int newIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int fromIndex, int toIndex, int newIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void next() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void pause() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void play() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void previous() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.EventListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItem(int index) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int fromIndex, int toIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekBack() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekForward() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(long positionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceMuted(boolean muted) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceVolume(int volume) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean playWhenReady) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackSpeed(float speed) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurface(@Nullable Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float audioVolume) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(int index, MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int index, List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(@Nullable Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int windowIndex, long positionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition(int windowIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean reset) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs) {
    }
}
