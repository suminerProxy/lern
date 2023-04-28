package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AudioBecomingNoisyManager;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.MetadataComponent, ExoPlayer.DeviceComponent {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    private static final String TAG = "SimpleExoPlayer";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;
    @Nullable
    private DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;
    @Nullable
    private Format audioFormat;
    private final CopyOnWriteArraySet<AudioListener> audioListeners;
    private int audioSessionId;
    private float audioVolume;
    @Nullable
    private CameraMotionListener cameraMotionListener;
    private final ComponentListener componentListener;
    private final ConditionVariable constructorFinished;
    private List<Cue> currentCues;
    private final long detachSurfaceTimeoutMs;
    private DeviceInfo deviceInfo;
    private final CopyOnWriteArraySet<DeviceListener> deviceListeners;
    private final FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private boolean isPriorityTaskManagerRegistered;
    @Nullable
    private AudioTrack keepSessionIdAudioTrack;
    private final CopyOnWriteArraySet<MetadataOutput> metadataOutputs;
    @Nullable
    private Surface ownedSurface;
    private final ExoPlayerImpl player;
    private boolean playerReleased;
    @Nullable
    private PriorityTaskManager priorityTaskManager;
    public final Renderer[] renderers;
    private boolean skipSilenceEnabled;
    @Nullable
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private final StreamVolumeManager streamVolumeManager;
    private int surfaceHeight;
    @Nullable
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private int surfaceWidth;
    private final CopyOnWriteArraySet<TextOutput> textOutputs;
    @Nullable
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    @Nullable
    private DecoderCounters videoDecoderCounters;
    @Nullable
    private Format videoFormat;
    @Nullable
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final CopyOnWriteArraySet<VideoListener> videoListeners;
    @Nullable
    private Object videoOutput;
    private int videoScalingMode;
    private VideoSize videoSize;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private AnalyticsCollector analyticsCollector;
        private AudioAttributes audioAttributes;
        private BandwidthMeter bandwidthMeter;
        private boolean buildCalled;
        private Clock clock;
        private final Context context;
        private long detachSurfaceTimeoutMs;
        private long foregroundModeTimeoutMs;
        private boolean handleAudioBecomingNoisy;
        private boolean handleAudioFocus;
        private LivePlaybackSpeedControl livePlaybackSpeedControl;
        private LoadControl loadControl;
        private Looper looper;
        private MediaSourceFactory mediaSourceFactory;
        private boolean pauseAtEndOfMediaItems;
        @Nullable
        private PriorityTaskManager priorityTaskManager;
        private long releaseTimeoutMs;
        private final RenderersFactory renderersFactory;
        private long seekBackIncrementMs;
        private long seekForwardIncrementMs;
        private SeekParameters seekParameters;
        private boolean skipSilenceEnabled;
        private TrackSelector trackSelector;
        private boolean useLazyPreparation;
        private int videoScalingMode;
        private int wakeMode;

        public Builder(Context context) {
        }

        public static /* synthetic */ Context access$000(Builder builder) {
        }

        public static /* synthetic */ AnalyticsCollector access$100(Builder builder) {
        }

        public static /* synthetic */ RenderersFactory access$1000(Builder builder) {
        }

        public static /* synthetic */ TrackSelector access$1100(Builder builder) {
        }

        public static /* synthetic */ MediaSourceFactory access$1200(Builder builder) {
        }

        public static /* synthetic */ LoadControl access$1300(Builder builder) {
        }

        public static /* synthetic */ BandwidthMeter access$1400(Builder builder) {
        }

        public static /* synthetic */ boolean access$1500(Builder builder) {
        }

        public static /* synthetic */ SeekParameters access$1600(Builder builder) {
        }

        public static /* synthetic */ long access$1700(Builder builder) {
        }

        public static /* synthetic */ long access$1800(Builder builder) {
        }

        public static /* synthetic */ LivePlaybackSpeedControl access$1900(Builder builder) {
        }

        public static /* synthetic */ PriorityTaskManager access$200(Builder builder) {
        }

        public static /* synthetic */ long access$2000(Builder builder) {
        }

        public static /* synthetic */ boolean access$2100(Builder builder) {
        }

        public static /* synthetic */ Clock access$2200(Builder builder) {
        }

        public static /* synthetic */ long access$2300(Builder builder) {
        }

        public static /* synthetic */ boolean access$2400(Builder builder) {
        }

        public static /* synthetic */ boolean access$2500(Builder builder) {
        }

        public static /* synthetic */ int access$2600(Builder builder) {
        }

        public static /* synthetic */ AudioAttributes access$300(Builder builder) {
        }

        public static /* synthetic */ int access$400(Builder builder) {
        }

        public static /* synthetic */ boolean access$500(Builder builder) {
        }

        public static /* synthetic */ long access$600(Builder builder) {
        }

        public static /* synthetic */ Looper access$900(Builder builder) {
        }

        public SimpleExoPlayer build() {
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long timeoutMs) {
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus) {
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
        }

        public Builder setDetachSurfaceTimeoutMs(long detachSurfaceTimeoutMs) {
        }

        public Builder setHandleAudioBecomingNoisy(boolean handleAudioBecomingNoisy) {
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
        }

        public Builder setLoadControl(LoadControl loadControl) {
        }

        public Builder setLooper(Looper looper) {
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
        }

        public Builder setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
        }

        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        }

        public Builder setReleaseTimeoutMs(long releaseTimeoutMs) {
        }

        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long seekBackIncrementMs) {
        }

        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long seekForwardIncrementMs) {
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
        }

        public Builder setSkipSilenceEnabled(boolean skipSilenceEnabled) {
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
        }

        public Builder setUseLazyPreparation(boolean useLazyPreparation) {
        }

        public Builder setVideoScalingMode(int videoScalingMode) {
        }

        public Builder setWakeMode(int wakeMode) {
        }

        public Builder(Context context, RenderersFactory renderersFactory) {
        }

        public Builder(Context context, ExtractorsFactory extractorsFactory) {
        }

        public Builder(Context context, RenderersFactory renderersFactory, ExtractorsFactory extractorsFactory) {
        }

        public Builder(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, Player.EventListener, ExoPlayer.AudioOffloadListener {
        public final /* synthetic */ SimpleExoPlayer this$0;

        private ComponentListener(final SimpleExoPlayer this$0) {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int playerCommand) {
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception audioCodecError) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String decoderName) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters counters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters counters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long playoutStartSystemTimeMs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception audioSinkError) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> cues) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int count, long elapsed) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean sleepingForOffload) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object output, long renderTimeMs) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int streamType) {
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(int streamVolume, boolean streamMuted) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(Exception videoCodecError) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String decoderName) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters counters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters counters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float volumeMultiplier) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
        }

        public /* synthetic */ ComponentListener(SimpleExoPlayer simpleExoPlayer, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 7;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 6;
        @Nullable
        private CameraMotionListener cameraMotionListener;
        @Nullable
        private CameraMotionListener internalCameraMotionListener;
        @Nullable
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;
        @Nullable
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int messageType, @Nullable Object message) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long timeUs, float[] rotation) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long presentationTimeUs, long releaseTimeNs, Format format, @Nullable MediaFormat mediaFormat) {
        }

        public /* synthetic */ FrameMetadataListener(AnonymousClass1 anonymousClass1) {
        }
    }

    @Deprecated
    public SimpleExoPlayer(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector, boolean useLazyPreparation, Clock clock, Looper applicationLooper) {
    }

    public static /* synthetic */ DecoderCounters access$2702(SimpleExoPlayer simpleExoPlayer, DecoderCounters decoderCounters) {
    }

    public static /* synthetic */ AnalyticsCollector access$2800(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ Format access$2902(SimpleExoPlayer simpleExoPlayer, Format format) {
    }

    public static /* synthetic */ VideoSize access$3002(SimpleExoPlayer simpleExoPlayer, VideoSize videoSize) {
    }

    public static /* synthetic */ CopyOnWriteArraySet access$3100(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ Object access$3200(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ DecoderCounters access$3302(SimpleExoPlayer simpleExoPlayer, DecoderCounters decoderCounters) {
    }

    public static /* synthetic */ Format access$3402(SimpleExoPlayer simpleExoPlayer, Format format) {
    }

    public static /* synthetic */ boolean access$3500(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ boolean access$3502(SimpleExoPlayer simpleExoPlayer, boolean z) {
    }

    public static /* synthetic */ void access$3600(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ List access$3702(SimpleExoPlayer simpleExoPlayer, List list) {
    }

    public static /* synthetic */ CopyOnWriteArraySet access$3800(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ ExoPlayerImpl access$3900(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ CopyOnWriteArraySet access$4000(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ boolean access$4100(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ void access$4200(SimpleExoPlayer simpleExoPlayer, Object obj) {
    }

    public static /* synthetic */ void access$4300(SimpleExoPlayer simpleExoPlayer, int i2, int i3) {
    }

    public static /* synthetic */ void access$4400(SimpleExoPlayer simpleExoPlayer, SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void access$4500(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ int access$4600(boolean z, int i2) {
    }

    public static /* synthetic */ void access$4700(SimpleExoPlayer simpleExoPlayer, boolean z, int i2, int i3) {
    }

    public static /* synthetic */ StreamVolumeManager access$4800(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ DeviceInfo access$4900(StreamVolumeManager streamVolumeManager) {
    }

    public static /* synthetic */ DeviceInfo access$5000(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ DeviceInfo access$5002(SimpleExoPlayer simpleExoPlayer, DeviceInfo deviceInfo) {
    }

    public static /* synthetic */ CopyOnWriteArraySet access$5100(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ PriorityTaskManager access$5200(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ boolean access$5300(SimpleExoPlayer simpleExoPlayer) {
    }

    public static /* synthetic */ boolean access$5302(SimpleExoPlayer simpleExoPlayer, boolean z) {
    }

    public static /* synthetic */ void access$5400(SimpleExoPlayer simpleExoPlayer) {
    }

    private static DeviceInfo createDeviceInfo(StreamVolumeManager streamVolumeManager) {
    }

    private static int getPlayWhenReadyChangeReason(boolean playWhenReady, int playerCommand) {
    }

    private int initializeKeepSessionIdAudioTrack(int audioSessionId) {
    }

    private void maybeNotifySurfaceSizeChanged(int width, int height) {
    }

    private void notifySkipSilenceEnabledChanged() {
    }

    private void removeSurfaceCallbacks() {
    }

    private void sendRendererMessage(int trackType, int messageType, @Nullable Object payload) {
    }

    private void sendVolumeToRenderers() {
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder nonVideoOutputSurfaceHolder) {
    }

    private void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
    }

    private void setVideoOutputInternal(@Nullable Object videoOutput) {
    }

    private void updatePlayWhenReady(boolean playWhenReady, int playerCommand, int playWhenReadyChangeReason) {
    }

    private void updateWakeAndWifiLock() {
    }

    private void verifyApplicationThread() {
    }

    public void addAnalyticsListener(AnalyticsListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    @Deprecated
    public void addAudioListener(AudioListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public void addDeviceListener(DeviceListener listener) {
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

    @Override // com.google.android.exoplayer2.ExoPlayer.MetadataComponent
    @Deprecated
    public void addMetadataOutput(MetadataOutput output) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.TextComponent
    @Deprecated
    public void addTextOutput(TextOutput listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    @Deprecated
    public void addVideoListener(VideoListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener listener) {
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

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
    }

    public AnalyticsCollector getAnalyticsCollector() {
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

    @Nullable
    public DecoderCounters getAudioDecoderCounters() {
    }

    @Nullable
    public Format getAudioFormat() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
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
    public List<Cue> getCurrentCues() {
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

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
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

    @Nullable
    public DecoderCounters getVideoDecoderCounters() {
    }

    @Nullable
    public Format getVideoFormat() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
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

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int fromIndex, int toIndex, int newIndex) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
    }

    public void removeAnalyticsListener(AnalyticsListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    @Deprecated
    public void removeAudioListener(AudioListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public void removeDeviceListener(DeviceListener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int fromIndex, int toIndex) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.MetadataComponent
    @Deprecated
    public void removeMetadataOutput(MetadataOutput output) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.TextComponent
    @Deprecated
    public void removeTextOutput(TextOutput listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    @Deprecated
    public void removeVideoListener(VideoListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void retry() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int windowIndex, long positionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(int audioSessionId) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener listener) {
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

    public void setHandleAudioBecomingNoisy(boolean handleAudioBecomingNoisy) {
    }

    @Deprecated
    public void setHandleWakeLock(boolean handleWakeLock) {
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
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
    }

    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
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

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean skipSilenceEnabled) {
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean throwsWhenUsingWrongThread) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int videoScalingMode) {
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

    public void setWakeMode(int wakeMode) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void stop(boolean reset) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int index, MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int index, List<MediaSource> mediaSources) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(@Nullable Surface surface) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void addListener(Player.EventListener listener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void removeListener(Player.EventListener listener) {
    }

    public SimpleExoPlayer(Builder builder) {
    }
}
