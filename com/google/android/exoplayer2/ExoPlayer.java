package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AudioComponent {
        @Deprecated
        void addAudioListener(AudioListener listener);

        void clearAuxEffectInfo();

        AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        boolean getSkipSilenceEnabled();

        float getVolume();

        @Deprecated
        void removeAudioListener(AudioListener listener);

        void setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus);

        void setAudioSessionId(int audioSessionId);

        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        void setSkipSilenceEnabled(boolean skipSilenceEnabled);

        void setVolume(float audioVolume);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AudioOffloadListener {
        void onExperimentalOffloadSchedulingEnabledChanged(boolean offloadSchedulingEnabled);

        void onExperimentalSleepingForOffloadChanged(boolean sleepingForOffload);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DeviceComponent {
        @Deprecated
        void addDeviceListener(DeviceListener listener);

        void decreaseDeviceVolume();

        DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        void increaseDeviceVolume();

        boolean isDeviceMuted();

        @Deprecated
        void removeDeviceListener(DeviceListener listener);

        void setDeviceMuted(boolean muted);

        void setDeviceVolume(int volume);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MetadataComponent {
        @Deprecated
        void addMetadataOutput(MetadataOutput output);

        @Deprecated
        void removeMetadataOutput(MetadataOutput output);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TextComponent {
        @Deprecated
        void addTextOutput(TextOutput listener);

        List<Cue> getCurrentCues();

        @Deprecated
        void removeTextOutput(TextOutput listener);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface VideoComponent {
        @Deprecated
        void addVideoListener(VideoListener listener);

        void clearCameraMotionListener(CameraMotionListener listener);

        void clearVideoFrameMetadataListener(VideoFrameMetadataListener listener);

        void clearVideoSurface();

        void clearVideoSurface(@Nullable Surface surface);

        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void clearVideoTextureView(@Nullable TextureView textureView);

        int getVideoScalingMode();

        VideoSize getVideoSize();

        @Deprecated
        void removeVideoListener(VideoListener listener);

        void setCameraMotionListener(CameraMotionListener listener);

        void setVideoFrameMetadataListener(VideoFrameMetadataListener listener);

        void setVideoScalingMode(int videoScalingMode);

        void setVideoSurface(@Nullable Surface surface);

        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAudioOffloadListener(AudioOffloadListener listener);

    void addMediaSource(int index, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int index, List<MediaSource> mediaSources);

    void addMediaSources(List<MediaSource> mediaSources);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled);

    @Nullable
    AudioComponent getAudioComponent();

    Clock getClock();

    @Nullable
    DeviceComponent getDeviceComponent();

    @Nullable
    MetadataComponent getMetadataComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException getPlayerError();

    @Override // com.google.android.exoplayer2.Player
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    int getRendererCount();

    int getRendererType(int index);

    SeekParameters getSeekParameters();

    @Nullable
    TextComponent getTextComponent();

    @Nullable
    TrackSelector getTrackSelector();

    @Nullable
    VideoComponent getVideoComponent();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState);

    void removeAudioOffloadListener(AudioOffloadListener listener);

    @Deprecated
    void retry();

    void setForegroundMode(boolean foregroundMode);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long startPositionMs);

    void setMediaSource(MediaSource mediaSource, boolean resetPosition);

    void setMediaSources(List<MediaSource> mediaSources);

    void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs);

    void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition);

    void setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems);

    void setSeekParameters(@Nullable SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private AnalyticsCollector analyticsCollector;
        private BandwidthMeter bandwidthMeter;
        private boolean buildCalled;
        private Clock clock;
        private LivePlaybackSpeedControl livePlaybackSpeedControl;
        private LoadControl loadControl;
        private Looper looper;
        private MediaSourceFactory mediaSourceFactory;
        private boolean pauseAtEndOfMediaItems;
        private long releaseTimeoutMs;
        private final Renderer[] renderers;
        private SeekParameters seekParameters;
        private long setForegroundModeTimeoutMs;
        private TrackSelector trackSelector;
        private boolean useLazyPreparation;

        public Builder(Context context, Renderer... renderers) {
        }

        public ExoPlayer build() {
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long timeoutMs) {
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
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

        public Builder setReleaseTimeoutMs(long releaseTimeoutMs) {
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
        }

        public Builder setUseLazyPreparation(boolean useLazyPreparation) {
        }

        public Builder(Renderer[] renderers, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter) {
        }
    }
}
