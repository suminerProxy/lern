package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.util.MediaClock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    @Nullable
    private T decoder;
    private DecoderCounters decoderCounters;
    @Nullable
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;
    private final DecoderInputBuffer flagsOnlyBuffer;
    @Nullable
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    @Nullable
    private SimpleOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    @Nullable
    private DrmSession sourceDrmSession;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AudioSinkListener implements AudioSink.Listener {
        public final /* synthetic */ DecoderAudioRenderer this$0;

        private AudioSinkListener(final DecoderAudioRenderer this$0) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSinkError(Exception audioSinkError) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferEmptying() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferFull(long j2) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionAdvancing(long playoutStartSystemTimeMs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        }

        public /* synthetic */ AudioSinkListener(DecoderAudioRenderer decoderAudioRenderer, AnonymousClass1 anonymousClass1) {
        }
    }

    public DecoderAudioRenderer() {
    }

    public static /* synthetic */ AudioRendererEventListener.EventDispatcher access$100(DecoderAudioRenderer decoderAudioRenderer) {
    }

    private boolean drainOutputBuffer() throws ExoPlaybackException, DecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException {
    }

    private boolean feedInputBuffer() throws DecoderException, ExoPlaybackException {
    }

    private void flushDecoder() throws ExoPlaybackException {
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
    }

    private void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
    }

    private void processEndOfStream() throws AudioSink.WriteException {
    }

    private void releaseDecoder() {
    }

    private void setDecoderDrmSession(@Nullable DrmSession session) {
    }

    private void setSourceDrmSession(@Nullable DrmSession session) {
    }

    private void updateCurrentPosition() {
    }

    public DecoderReuseEvaluation canReuseDecoder(String decoderName, Format oldFormat, Format newFormat) {
    }

    public abstract T createDecoder(Format format, @Nullable ExoMediaCrypto mediaCrypto) throws DecoderException;

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean enableKeepAudioTrackOnSeek) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
    }

    public abstract Format getOutputFormat(T decoder);

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
    }

    public final int getSinkFormatSupport(Format format) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
    }

    @CallSuper
    public void onPositionDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
    }

    public void onQueueInputBuffer(DecoderInputBuffer buffer) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public final boolean sinkSupportsFormat(Format format) {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
    }

    public abstract int supportsFormatInternal(Format format);

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, AudioProcessor... audioProcessors) {
    }

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, @Nullable AudioCapabilities audioCapabilities, AudioProcessor... audioProcessors) {
    }

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, AudioSink audioSink) {
    }
}
