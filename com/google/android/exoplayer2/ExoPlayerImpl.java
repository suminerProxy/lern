package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    @Nullable
    private final AnalyticsCollector analyticsCollector;
    private final Looper applicationLooper;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    public final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final ExoPlayerImplInternal internalPlayer;
    private final ListenerSet<Player.EventListener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSourceFactory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final Timeline.Period period;
    public final Player.Commands permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private MediaMetadata playlistMetadata;
    private final Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private Timeline timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object uid, Timeline timeline) {
        }

        public static /* synthetic */ Timeline access$002(MediaSourceHolderSnapshot mediaSourceHolderSnapshot, Timeline timeline) {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Timeline getTimeline() {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Object getUid() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(Renderer[] renderers, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, @Nullable AnalyticsCollector analyticsCollector, boolean useLazyPreparation, SeekParameters seekParameters, long seekBackIncrementMs, long seekForwardIncrementMs, LivePlaybackSpeedControl livePlaybackSpeedControl, long releaseTimeoutMs, boolean pauseAtEndOfMediaItems, Clock clock, Looper applicationLooper, @Nullable Player wrappingPlayer, Player.Commands additionalPermanentAvailableCommands) {
    }

    public static /* synthetic */ void A(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void B(PlaybackInfo playbackInfo, int i2, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void C(int i2, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void a(Player player, Player.EventListener eventListener, FlagSet flagSet) {
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int index, List<MediaSource> mediaSources) {
    }

    private /* synthetic */ void b(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private Timeline createMaskingTimeline() {
    }

    private List<MediaSource> createMediaSources(List<MediaItem> mediaItems) {
    }

    private /* synthetic */ void d(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo, PlaybackInfo oldPlaybackInfo, boolean positionDiscontinuity, int positionDiscontinuityReason, boolean timelineChanged) {
    }

    private /* synthetic */ void f(Player.EventListener eventListener) {
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
    }

    private int getCurrentWindowIndexInternal() {
    }

    @Nullable
    private Pair<Object, Long> getPeriodPositionAfterTimelineChanged(Timeline oldTimeline, Timeline newTimeline) {
    }

    @Nullable
    private Pair<Object, Long> getPeriodPositionOrMaskWindowPosition(Timeline timeline, int windowIndex, long windowPositionMs) {
    }

    private Player.PositionInfo getPositionInfo(long discontinuityWindowStartPositionUs) {
    }

    private Player.PositionInfo getPreviousPositionInfo(int positionDiscontinuityReason, PlaybackInfo oldPlaybackInfo, int oldMaskingWindowIndex) {
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
    }

    public static /* synthetic */ void h(Player.EventListener eventListener) {
    }

    private void handlePlaybackInfo(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private /* synthetic */ void i(Player.EventListener eventListener) {
    }

    private static boolean isPlaying(PlaybackInfo playbackInfo) {
    }

    public static /* synthetic */ void k(int i2, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void l(boolean z, Player.EventListener eventListener) {
    }

    private /* synthetic */ void m(Player.EventListener eventListener) {
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, Timeline timeline, @Nullable Pair<Object, Long> periodPosition) {
    }

    public static /* synthetic */ void o(MediaItem mediaItem, int i2, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void p(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId periodId, long positionUs) {
    }

    public static /* synthetic */ void q(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void r(PlaybackInfo playbackInfo, TrackSelectionArray trackSelectionArray, Player.EventListener eventListener) {
    }

    private PlaybackInfo removeMediaItemsInternal(int fromIndex, int toIndex) {
    }

    private void removeMediaSourceHolders(int fromIndex, int toIndexExclusive) {
    }

    public static /* synthetic */ void s(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    private void setMediaSourcesInternal(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs, boolean resetToDefaultPosition) {
    }

    public static /* synthetic */ void t(MediaMetadata mediaMetadata, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void u(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    private void updateAvailableCommands() {
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo, int timelineChangeReason, int playWhenReadyChangeReason, boolean seekProcessed, boolean positionDiscontinuity, int positionDiscontinuityReason, long discontinuityWindowStartPositionUs, int oldMaskingWindowIndex) {
    }

    public static /* synthetic */ void v(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void w(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void x(PlaybackInfo playbackInfo, int i2, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void y(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    public static /* synthetic */ void z(PlaybackInfo playbackInfo, Player.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int index, List<MediaItem> mediaItems) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<MediaSource> mediaSources) {
    }

    public /* synthetic */ void c(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(@Nullable Surface surface) {
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

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
    }

    public /* synthetic */ void e(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
    }

    public void experimentalSetForegroundModeTimeoutMs(long timeoutMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
    }

    public /* synthetic */ void g(Player.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
    }

    @Override // com.google.android.exoplayer2.Player
    public AudioAttributes getAudioAttributes() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.AudioComponent getAudioComponent() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Clock getClock() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
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
    public /* bridge */ /* synthetic */ List getCurrentCues() {
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

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.DeviceComponent getDeviceComponent() {
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
    public MediaMetadata getMediaMetadata() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.MetadataComponent getMetadataComponent() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
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
    public /* bridge */ /* synthetic */ PlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int index) {
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

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.TextComponent getTextComponent() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public TrackSelector getTrackSelector() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.VideoComponent getVideoComponent() {
    }

    @Override // com.google.android.exoplayer2.Player
    public VideoSize getVideoSize() {
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void increaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isDeviceMuted() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
    }

    public /* synthetic */ void j(Player.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int fromIndex, int toIndex, int newFromIndex) {
    }

    public /* synthetic */ void n(Player.EventListener eventListener) {
    }

    public void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int fromIndex, int toIndex) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void retry() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int windowIndex, long positionMs) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceMuted(boolean muted) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceVolume(int volume) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean foregroundMode) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean playWhenReady) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata playlistMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
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
    public void stop(boolean reset) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.EventListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int index, MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int index, List<MediaSource> mediaSources) {
    }

    @Override // com.google.android.exoplayer2.Player
    public ImmutableList<Cue> getCurrentCues() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.EventListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition) {
    }

    public void setPlayWhenReady(boolean playWhenReady, int playbackSuppressionReason, int playWhenReadyChangeReason) {
    }

    public void stop(boolean reset, @Nullable ExoPlaybackException error) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState) {
    }
}
