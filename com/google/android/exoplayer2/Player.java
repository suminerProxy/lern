package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 25;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 19;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 20;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 15;
    public static final int COMMAND_GET_DEVICE_VOLUME = 22;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 17;
    public static final int COMMAND_GET_TEXT = 27;
    public static final int COMMAND_GET_TIMELINE = 16;
    public static final int COMMAND_GET_VOLUME = 21;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE_STOP = 2;
    public static final int COMMAND_SEEK_BACK = 10;
    public static final int COMMAND_SEEK_FORWARD = 11;
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 4;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 3;
    public static final int COMMAND_SEEK_TO_NEXT = 8;
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 6;
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_WINDOW = 9;
    public static final int COMMAND_SET_DEVICE_VOLUME = 24;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_SET_REPEAT_MODE = 14;
    public static final int COMMAND_SET_SHUFFLE_MODE = 13;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 12;
    public static final int COMMAND_SET_VIDEO_SURFACE = 26;
    public static final int COMMAND_SET_VOLUME = 23;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 14;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 19;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 15;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 16;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 17;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 18;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    @Deprecated
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Command {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Commands implements Bundleable {
        public static final Bundleable.Creator<Commands> CREATOR = null;
        public static final Commands EMPTY = null;
        private static final int FIELD_COMMANDS = 0;
        private final FlagSet flags;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = null;
            private final FlagSet.Builder flagsBuilder;

            public /* synthetic */ Builder(Commands commands, AnonymousClass1 anonymousClass1) {
            }

            public Builder add(int command) {
            }

            public Builder addAll(int... commands) {
            }

            public Builder addAllCommands() {
            }

            public Builder addIf(int command, boolean condition) {
            }

            public Commands build() {
            }

            public Builder remove(int command) {
            }

            public Builder removeAll(int... commands) {
            }

            public Builder removeIf(int command, boolean condition) {
            }

            public Builder() {
            }

            public Builder addAll(Commands commands) {
            }

            private Builder(Commands commands) {
            }
        }

        public /* synthetic */ Commands(FlagSet flagSet, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ Commands a(Bundle bundle) {
        }

        public static /* synthetic */ FlagSet access$000(Commands commands) {
        }

        private static Commands fromBundle(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public Builder buildUpon() {
        }

        public boolean contains(int command) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int get(int index) {
        }

        public int hashCode() {
        }

        public int size() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        private Commands(FlagSet flags) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Event {
    }

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {
        void onAvailableCommandsChanged(Commands availableCommands);

        void onEvents(Player player, Events events);

        void onIsLoadingChanged(boolean isLoading);

        void onIsPlayingChanged(boolean isPlaying);

        @Deprecated
        void onLoadingChanged(boolean isLoading);

        void onMaxSeekToPreviousPositionChanged(int maxSeekToPreviousPositionMs);

        void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onPlayWhenReadyChanged(boolean playWhenReady, int reason);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int playbackState);

        void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason);

        void onPlayerError(PlaybackException error);

        void onPlayerErrorChanged(@Nullable PlaybackException error);

        @Deprecated
        void onPlayerStateChanged(boolean playWhenReady, int playbackState);

        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata);

        @Deprecated
        void onPositionDiscontinuity(int reason);

        void onPositionDiscontinuity(PositionInfo oldPosition, PositionInfo newPosition, int reason);

        void onRepeatModeChanged(int repeatMode);

        void onSeekBackIncrementChanged(long seekBackIncrementMs);

        void onSeekForwardIncrementChanged(long seekForwardIncrementMs);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean shuffleModeEnabled);

        @Deprecated
        void onStaticMetadataChanged(List<Metadata> metadataList);

        void onTimelineChanged(Timeline timeline, int reason);

        void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Events {
        private final FlagSet flags;

        public Events(FlagSet flags) {
        }

        public boolean contains(int event) {
        }

        public boolean containsAny(int... events) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int get(int index) {
        }

        public int hashCode() {
        }

        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener extends VideoListener, AudioListener, TextOutput, MetadataOutput, DeviceListener, EventListener {
        void onAudioAttributesChanged(AudioAttributes audioAttributes);

        void onAudioSessionIdChanged(int audioSessionId);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onAvailableCommandsChanged(Commands availableCommands);

        void onCues(List<Cue> cues);

        void onDeviceInfoChanged(DeviceInfo deviceInfo);

        void onDeviceVolumeChanged(int volume, boolean muted);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onEvents(Player player, Events events);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onIsLoadingChanged(boolean isLoading);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onIsPlayingChanged(boolean isPlaying);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onMetadata(Metadata metadata);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayWhenReadyChanged(boolean playWhenReady, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackStateChanged(int playbackState);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayerError(PlaybackException error);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayerErrorChanged(@Nullable PlaybackException error);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPositionDiscontinuity(PositionInfo oldPosition, PositionInfo newPosition, int reason);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onRenderedFirstFrame();

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onRepeatModeChanged(int repeatMode);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onSeekBackIncrementChanged(long seekBackIncrementMs);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onSeekForwardIncrementChanged(long seekForwardIncrementMs);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onShuffleModeEnabledChanged(boolean shuffleModeEnabled);

        void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onSurfaceSizeChanged(int width, int height);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onTimelineChanged(Timeline timeline, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onVideoSizeChanged(VideoSize videoSize);

        void onVolumeChanged(float volume);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface MediaItemTransitionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PlaybackSuppressionReason {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PositionInfo implements Bundleable {
        public static final Bundleable.Creator<PositionInfo> CREATOR = null;
        private static final int FIELD_AD_GROUP_INDEX = 4;
        private static final int FIELD_AD_INDEX_IN_AD_GROUP = 5;
        private static final int FIELD_CONTENT_POSITION_MS = 3;
        private static final int FIELD_PERIOD_INDEX = 1;
        private static final int FIELD_POSITION_MS = 2;
        private static final int FIELD_WINDOW_INDEX = 0;
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final int periodIndex;
        @Nullable
        public final Object periodUid;
        public final long positionMs;
        public final int windowIndex;
        @Nullable
        public final Object windowUid;

        public PositionInfo(@Nullable Object windowUid, int windowIndex, @Nullable Object periodUid, int periodIndex, long positionMs, long contentPositionMs, int adGroupIndex, int adIndexInAdGroup) {
        }

        public static /* synthetic */ PositionInfo a(Bundle bundle) {
        }

        private static PositionInfo fromBundle(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface TimelineChangeReason {
    }

    @Deprecated
    void addListener(EventListener listener);

    void addListener(Listener listener);

    void addMediaItem(int index, MediaItem mediaItem);

    void addMediaItem(MediaItem mediaItem);

    void addMediaItems(int index, List<MediaItem> mediaItems);

    void addMediaItems(List<MediaItem> mediaItems);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@Nullable Surface surface);

    void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void decreaseDeviceVolume();

    Looper getApplicationLooper();

    AudioAttributes getAudioAttributes();

    Commands getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    List<Cue> getCurrentCues();

    long getCurrentLiveOffset();

    @Nullable
    Object getCurrentManifest();

    @Nullable
    MediaItem getCurrentMediaItem();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    @Deprecated
    List<Metadata> getCurrentStaticMetadata();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    DeviceInfo getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    int getMaxSeekToPreviousPosition();

    MediaItem getMediaItemAt(int index);

    int getMediaItemCount();

    MediaMetadata getMediaMetadata();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    MediaMetadata getPlaylistMetadata();

    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    VideoSize getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int command);

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int currentIndex, int newIndex);

    void moveMediaItems(int fromIndex, int toIndex, int newIndex);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    @Deprecated
    void removeListener(EventListener listener);

    void removeListener(Listener listener);

    void removeMediaItem(int index);

    void removeMediaItems(int fromIndex, int toIndex);

    void seekBack();

    void seekForward();

    void seekTo(int windowIndex, long positionMs);

    void seekTo(long positionMs);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int windowIndex);

    void seekToNext();

    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousWindow();

    void setDeviceMuted(boolean muted);

    void setDeviceVolume(int volume);

    void setMediaItem(MediaItem mediaItem);

    void setMediaItem(MediaItem mediaItem, long startPositionMs);

    void setMediaItem(MediaItem mediaItem, boolean resetPosition);

    void setMediaItems(List<MediaItem> mediaItems);

    void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs);

    void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition);

    void setPlayWhenReady(boolean playWhenReady);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlaybackSpeed(float speed);

    void setPlaylistMetadata(MediaMetadata mediaMetadata);

    void setRepeatMode(int repeatMode);

    void setShuffleModeEnabled(boolean shuffleModeEnabled);

    void setVideoSurface(@Nullable Surface surface);

    void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(float audioVolume);

    void stop();

    @Deprecated
    void stop(boolean reset);
}
