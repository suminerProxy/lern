package com.google.android.exoplayer2.transformer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.transformer.Muxer;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Transformer {
    public static final int PROGRESS_STATE_AVAILABLE = 1;
    public static final int PROGRESS_STATE_NO_TRANSFORMATION = 4;
    public static final int PROGRESS_STATE_UNAVAILABLE = 2;
    public static final int PROGRESS_STATE_WAITING_FOR_AVAILABILITY = 0;
    private final Clock clock;
    private final Context context;
    private Listener listener;
    private final Looper looper;
    private final MediaSourceFactory mediaSourceFactory;
    private final Muxer.Factory muxerFactory;
    @Nullable
    private MuxerWrapper muxerWrapper;
    @Nullable
    private SimpleExoPlayer player;
    private int progressState;
    private final Transformation transformation;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private Clock clock;
        private Context context;
        private boolean flattenForSlowMotion;
        private Listener listener;
        private Looper looper;
        private MediaSourceFactory mediaSourceFactory;
        private Muxer.Factory muxerFactory;
        private String outputMimeType;
        private boolean removeAudio;
        private boolean removeVideo;

        /* renamed from: com.google.android.exoplayer2.transformer.Transformer$Builder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Listener {
            public AnonymousClass1(final Builder this$0) {
            }

            @Override // com.google.android.exoplayer2.transformer.Transformer.Listener
            public /* synthetic */ void onTransformationCompleted(MediaItem mediaItem) {
            }

            @Override // com.google.android.exoplayer2.transformer.Transformer.Listener
            public /* synthetic */ void onTransformationError(MediaItem mediaItem, Exception exc) {
            }
        }

        public /* synthetic */ Builder(Transformer transformer, AnonymousClass1 anonymousClass1) {
        }

        public Transformer build() {
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
        }

        public Builder setContext(Context context) {
        }

        public Builder setFlattenForSlowMotion(boolean flattenForSlowMotion) {
        }

        public Builder setListener(Listener listener) {
        }

        public Builder setLooper(Looper looper) {
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
        }

        @VisibleForTesting
        public Builder setMuxerFactory(Muxer.Factory muxerFactory) {
        }

        public Builder setOutputMimeType(String outputMimeType) {
        }

        public Builder setRemoveAudio(boolean removeAudio) {
        }

        public Builder setRemoveVideo(boolean removeVideo) {
        }

        public Builder() {
        }

        private Builder(Transformer transformer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onTransformationCompleted(MediaItem inputMediaItem);

        void onTransformationError(MediaItem inputMediaItem, Exception exception);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ProgressState {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class TransformerAnalyticsListener implements AnalyticsListener {
        private final MediaItem mediaItem;
        private final MuxerWrapper muxerWrapper;
        public final /* synthetic */ Transformer this$0;

        public TransformerAnalyticsListener(final Transformer this$0, MediaItem mediaItem, MuxerWrapper muxerWrapper) {
        }

        private void handleTransformationEnded(@Nullable Exception exception) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i2, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i2, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i2, String str, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i2, Format format) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i2, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int state) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException error) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int reason) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j2, int i2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i2, int i3, int i4, float f2) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TransformerRenderersFactory implements RenderersFactory {
        private final TransformerMediaClock mediaClock;
        private final MuxerWrapper muxerWrapper;
        private final Transformation transformation;

        public TransformerRenderersFactory(MuxerWrapper muxerWrapper, Transformation transformation) {
        }

        @Override // com.google.android.exoplayer2.RenderersFactory
        public Renderer[] createRenderers(Handler eventHandler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textRendererOutput, MetadataOutput metadataRendererOutput) {
        }
    }

    public /* synthetic */ Transformer(Context context, MediaSourceFactory mediaSourceFactory, Muxer.Factory factory, Transformation transformation, Listener listener, Looper looper, Clock clock, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Context access$000(Transformer transformer) {
    }

    public static /* synthetic */ MediaSourceFactory access$100(Transformer transformer) {
    }

    public static /* synthetic */ SimpleExoPlayer access$1000(Transformer transformer) {
    }

    public static /* synthetic */ void access$1100(Transformer transformer, boolean z) {
    }

    public static /* synthetic */ Muxer.Factory access$200(Transformer transformer) {
    }

    public static /* synthetic */ Transformation access$300(Transformer transformer) {
    }

    public static /* synthetic */ Listener access$400(Transformer transformer) {
    }

    public static /* synthetic */ Looper access$500(Transformer transformer) {
    }

    public static /* synthetic */ Clock access$600(Transformer transformer) {
    }

    public static /* synthetic */ int access$900(Transformer transformer) {
    }

    public static /* synthetic */ int access$902(Transformer transformer, int i2) {
    }

    private void releaseResources(boolean forCancellation) {
    }

    private void verifyApplicationThread() {
    }

    public Builder buildUpon() {
    }

    public void cancel() {
    }

    public Looper getApplicationLooper() {
    }

    public int getProgress(ProgressHolder progressHolder) {
    }

    public void setListener(Listener listener) {
    }

    public void startTransformation(MediaItem mediaItem, String path) throws IOException {
    }

    private Transformer(Context context, MediaSourceFactory mediaSourceFactory, Muxer.Factory muxerFactory, Transformation transformation, Listener listener, Looper looper, Clock clock) {
    }

    @RequiresApi(26)
    public void startTransformation(MediaItem mediaItem, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
    }

    private void startTransformation(MediaItem mediaItem, Muxer muxer) {
    }
}
