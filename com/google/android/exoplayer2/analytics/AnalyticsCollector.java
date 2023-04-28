package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AnalyticsCollector implements Player.Listener, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaPeriodQueueTracker {
        @Nullable
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue;
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines;
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
        }

        public static /* synthetic */ ImmutableList access$000(MediaPeriodQueueTracker mediaPeriodQueueTracker) {
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelinesBuilder, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline preferredTimeline) {
        }

        @Nullable
        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue, @Nullable MediaSource.MediaPeriodId playingMediaPeriod, Timeline.Period period) {
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object playerPeriodUid, boolean isPlayingAd, int playerAdGroupIndex, int playerAdIndexInAdGroup, int playerNextAdGroupIndex) {
        }

        private void updateMediaPeriodTimelines(Timeline preferredTimeline) {
        }

        @Nullable
        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
        }

        @Nullable
        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
        }

        @Nullable
        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Nullable
        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
        }

        @Nullable
        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
        }

        public void onPositionDiscontinuity(Player player) {
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> queue, @Nullable MediaSource.MediaPeriodId readingPeriod, Player player) {
        }

        public void onTimelineChanged(Player player) {
        }
    }

    public AnalyticsCollector(Clock clock) {
    }

    public static /* synthetic */ void A(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void B(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void C(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void D(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void E(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void F(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void G(AnalyticsListener.EventTime eventTime, Metadata metadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void H(AnalyticsListener.EventTime eventTime, boolean z, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void I(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void J(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void K(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void L(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void M(AnalyticsListener.EventTime eventTime, boolean z, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void N(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void O(AnalyticsListener.EventTime eventTime, int i2, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void P(AnalyticsListener.EventTime eventTime, Object obj, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void Q(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void R(AnalyticsListener.EventTime eventTime, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void S(AnalyticsListener.EventTime eventTime, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void T(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void U(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void V(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void W(AnalyticsListener.EventTime eventTime, List list, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void X(AnalyticsListener.EventTime eventTime, int i2, int i3, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void Y(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void Z(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void a(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    public static /* synthetic */ void a0(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void b(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void b0(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void c(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void c0(AnalyticsListener.EventTime eventTime, String str, long j2, long j3, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void d(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void d0(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void e(AnalyticsListener.EventTime eventTime, String str, long j2, long j3, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void e0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void f(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void f0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void g(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void g0(AnalyticsListener.EventTime eventTime, long j2, int i2, AnalyticsListener analyticsListener) {
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
    }

    public static /* synthetic */ void h(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void h0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void i(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void i0(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void j(AnalyticsListener.EventTime eventTime, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void j0(AnalyticsListener.EventTime eventTime, float f2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void k(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void k0(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void l(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    private /* synthetic */ void l0() {
    }

    public static /* synthetic */ void m(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void n(AnalyticsListener.EventTime eventTime, Player.Commands commands, AnalyticsListener analyticsListener) {
    }

    private /* synthetic */ void n0(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    public static /* synthetic */ void o(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void p(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void q(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void r(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void s(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void t(AnalyticsListener.EventTime eventTime, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void u(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void v(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void w(AnalyticsListener.EventTime eventTime, int i2, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void x(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void y(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void z(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    @CallSuper
    public void addListener(AnalyticsListener listener) {
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public /* synthetic */ void m0() {
    }

    public final void notifySeekStarted() {
    }

    public /* synthetic */ void o0(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioCodecError(Exception audioCodecError) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderReleased(String decoderName) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters counters) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters counters) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public /* synthetic */ void onAudioInputFormatChanged(Format format) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioPositionAdvancing(long playoutStartSystemTimeMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onAudioSessionIdChanged(int audioSessionId) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkError(Exception audioSinkError) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onAvailableCommandsChanged(Player.Commands availableCommands) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
    public /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
    public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int count, long elapsedMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onIsLoadingChanged(boolean isLoading) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onIsPlayingChanged(boolean isPlaying) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onMaxSeekToPreviousPositionChanged(int maxSeekToPreviousPositionMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackStateChanged(int playbackState) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerError(PlaybackException error) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onPlaylistMetadataChanged(MediaMetadata playlistMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPositionDiscontinuity(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Object output, long renderTimeMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onSeekBackIncrementChanged(long seekBackIncrementMs) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onSeekForwardIncrementChanged(long seekForwardIncrementMs) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public final void onStaticMetadataChanged(List<Metadata> metadataList) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public void onSurfaceSizeChanged(int width, int height) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, int reason) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoCodecError(Exception videoCodecError) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderReleased(String decoderName) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters counters) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters counters) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public /* synthetic */ void onVideoInputFormatChanged(Format format) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public /* synthetic */ void onVideoSizeChanged(int i2, int i3, int i4, float f2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public final void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onVolumeChanged(float volume) {
    }

    @CallSuper
    public void release() {
    }

    @CallSuper
    public void removeListener(AnalyticsListener listener) {
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int eventFlag, ListenerSet.Event<AnalyticsListener> eventInvocation) {
    }

    @CallSuper
    public void setPlayer(Player player, Looper looper) {
    }

    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> queue, @Nullable MediaSource.MediaPeriodId readingPeriod) {
    }

    private AnalyticsListener.EventTime generateEventTime(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
