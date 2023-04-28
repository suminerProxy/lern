package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 1016;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1037;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1009;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1013;
    public static final int EVENT_AUDIO_DISABLED = 1014;
    public static final int EVENT_AUDIO_ENABLED = 1008;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1010;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1011;
    public static final int EVENT_AUDIO_SESSION_ID = 1015;
    public static final int EVENT_AUDIO_SINK_ERROR = 1018;
    public static final int EVENT_AUDIO_UNDERRUN = 1012;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 14;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1031;
    public static final int EVENT_DRM_KEYS_REMOVED = 1034;
    public static final int EVENT_DRM_KEYS_RESTORED = 1033;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1030;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1032;
    public static final int EVENT_DRM_SESSION_RELEASED = 1035;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1023;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 19;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 15;
    public static final int EVENT_METADATA = 1007;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYER_RELEASED = 1036;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 16;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_RENDERED_FIRST_FRAME = 1027;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 17;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 18;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 1017;
    @Deprecated
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 1029;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1038;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1021;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1024;
    public static final int EVENT_VIDEO_DISABLED = 1025;
    public static final int EVENT_VIDEO_ENABLED = 1020;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1026;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1022;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 1028;
    public static final int EVENT_VOLUME_CHANGED = 1019;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface EventFlags {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventTime {
        @Nullable
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long realtimeMs, Timeline timeline, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long eventPlaybackPositionMs, Timeline currentTimeline, int currentWindowIndex, @Nullable MediaSource.MediaPeriodId currentMediaPeriodId, long currentPlaybackPositionMs, long totalBufferedDurationMs) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Events {
        private final SparseArray<EventTime> eventTimes;
        private final FlagSet flags;

        public Events(FlagSet flags, SparseArray<EventTime> eventTimes) {
        }

        public boolean contains(int event) {
        }

        public boolean containsAny(int... events) {
        }

        public int get(int index) {
        }

        public EventTime getEventTime(int event) {
        }

        public int size() {
        }
    }

    void onAudioAttributesChanged(EventTime eventTime, AudioAttributes audioAttributes);

    void onAudioCodecError(EventTime eventTime, Exception audioCodecError);

    @Deprecated
    void onAudioDecoderInitialized(EventTime eventTime, String decoderName, long initializationDurationMs);

    void onAudioDecoderInitialized(EventTime eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onAudioDecoderReleased(EventTime eventTime, String decoderName);

    void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    @Deprecated
    void onAudioInputFormatChanged(EventTime eventTime, Format format);

    void onAudioInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(EventTime eventTime, long playoutStartSystemTimeMs);

    void onAudioSessionIdChanged(EventTime eventTime, int audioSessionId);

    void onAudioSinkError(EventTime eventTime, Exception audioSinkError);

    void onAudioUnderrun(EventTime eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

    void onAvailableCommandsChanged(EventTime eventTime, Player.Commands availableCommands);

    void onBandwidthEstimate(EventTime eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate);

    @Deprecated
    void onDecoderDisabled(EventTime eventTime, int trackType, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderEnabled(EventTime eventTime, int trackType, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderInitialized(EventTime eventTime, int trackType, String decoderName, long initializationDurationMs);

    @Deprecated
    void onDecoderInputFormatChanged(EventTime eventTime, int trackType, Format format);

    void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(EventTime eventTime);

    void onDrmKeysRemoved(EventTime eventTime);

    void onDrmKeysRestored(EventTime eventTime);

    @Deprecated
    void onDrmSessionAcquired(EventTime eventTime);

    void onDrmSessionAcquired(EventTime eventTime, int state);

    void onDrmSessionManagerError(EventTime eventTime, Exception error);

    void onDrmSessionReleased(EventTime eventTime);

    void onDroppedVideoFrames(EventTime eventTime, int droppedFrames, long elapsedMs);

    void onEvents(Player player, Events events);

    void onIsLoadingChanged(EventTime eventTime, boolean isLoading);

    void onIsPlayingChanged(EventTime eventTime, boolean isPlaying);

    void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled);

    void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    void onLoadingChanged(EventTime eventTime, boolean isLoading);

    void onMaxSeekToPreviousPositionChanged(EventTime eventTime, int maxSeekToPreviousPositionMs);

    void onMediaItemTransition(EventTime eventTime, @Nullable MediaItem mediaItem, int reason);

    void onMediaMetadataChanged(EventTime eventTime, MediaMetadata mediaMetadata);

    void onMetadata(EventTime eventTime, Metadata metadata);

    void onPlayWhenReadyChanged(EventTime eventTime, boolean playWhenReady, int reason);

    void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters);

    void onPlaybackStateChanged(EventTime eventTime, int state);

    void onPlaybackSuppressionReasonChanged(EventTime eventTime, int playbackSuppressionReason);

    void onPlayerError(EventTime eventTime, PlaybackException error);

    void onPlayerReleased(EventTime eventTime);

    @Deprecated
    void onPlayerStateChanged(EventTime eventTime, boolean playWhenReady, int playbackState);

    void onPlaylistMetadataChanged(EventTime eventTime, MediaMetadata playlistMetadata);

    @Deprecated
    void onPositionDiscontinuity(EventTime eventTime, int reason);

    void onPositionDiscontinuity(EventTime eventTime, Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason);

    void onRenderedFirstFrame(EventTime eventTime, Object output, long renderTimeMs);

    void onRepeatModeChanged(EventTime eventTime, int repeatMode);

    void onSeekBackIncrementChanged(EventTime eventTime, long seekBackIncrementMs);

    void onSeekForwardIncrementChanged(EventTime eventTime, long seekForwardIncrementMs);

    @Deprecated
    void onSeekProcessed(EventTime eventTime);

    @Deprecated
    void onSeekStarted(EventTime eventTime);

    void onShuffleModeChanged(EventTime eventTime, boolean shuffleModeEnabled);

    void onSkipSilenceEnabledChanged(EventTime eventTime, boolean skipSilenceEnabled);

    @Deprecated
    void onStaticMetadataChanged(EventTime eventTime, List<Metadata> metadataList);

    void onSurfaceSizeChanged(EventTime eventTime, int width, int height);

    void onTimelineChanged(EventTime eventTime, int reason);

    void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroups, TrackSelectionArray trackSelections);

    void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData);

    void onVideoCodecError(EventTime eventTime, Exception videoCodecError);

    @Deprecated
    void onVideoDecoderInitialized(EventTime eventTime, String decoderName, long initializationDurationMs);

    void onVideoDecoderInitialized(EventTime eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onVideoDecoderReleased(EventTime eventTime, String decoderName);

    void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(EventTime eventTime, long totalProcessingOffsetUs, int frameCount);

    @Deprecated
    void onVideoInputFormatChanged(EventTime eventTime, Format format);

    void onVideoInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    @Deprecated
    void onVideoSizeChanged(EventTime eventTime, int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);

    void onVideoSizeChanged(EventTime eventTime, VideoSize videoSize);

    void onVolumeChanged(EventTime eventTime, float volume);
}
