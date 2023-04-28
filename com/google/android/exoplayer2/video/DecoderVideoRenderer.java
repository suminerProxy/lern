package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;
    @Nullable
    private Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder;
    public DecoderCounters decoderCounters;
    @Nullable
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final TimedValueQueue<Format> formatQueue;
    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private VideoDecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;
    @Nullable
    private Object output;
    private VideoDecoderOutputBuffer outputBuffer;
    @Nullable
    private VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    @Nullable
    private Surface outputSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;
    @Nullable
    private VideoSize reportedVideoSize;
    @Nullable
    private DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;

    public DecoderVideoRenderer(long allowedJoiningTimeMs, @Nullable Handler eventHandler, @Nullable VideoRendererEventListener eventListener, int maxDroppedFramesToNotify) {
    }

    private void clearRenderedFirstFrame() {
    }

    private void clearReportedVideoSize() {
    }

    private boolean drainOutputBuffer(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException, DecoderException {
    }

    private boolean feedInputBuffer() throws DecoderException, ExoPlaybackException {
    }

    private boolean hasOutput() {
    }

    private static boolean isBufferLate(long earlyUs) {
    }

    private static boolean isBufferVeryLate(long earlyUs) {
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
    }

    private void maybeNotifyDroppedFrames() {
    }

    private void maybeNotifyRenderedFirstFrame() {
    }

    private void maybeNotifyVideoSizeChanged(int width, int height) {
    }

    private void maybeRenotifyRenderedFirstFrame() {
    }

    private void maybeRenotifyVideoSizeChanged() {
    }

    private void onOutputChanged() {
    }

    private void onOutputRemoved() {
    }

    private void onOutputReset() {
    }

    private boolean processOutputBuffer(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException, DecoderException {
    }

    private void setDecoderDrmSession(@Nullable DrmSession session) {
    }

    private void setJoiningDeadlineMs() {
    }

    private void setSourceDrmSession(@Nullable DrmSession session) {
    }

    public DecoderReuseEvaluation canReuseDecoder(String decoderName, Format oldFormat, Format newFormat) {
    }

    public abstract Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder(Format format, @Nullable ExoMediaCrypto mediaCrypto) throws DecoderException;

    public void dropOutputBuffer(VideoDecoderOutputBuffer outputBuffer) {
    }

    @CallSuper
    public void flushDecoder() throws ExoPlaybackException {
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

    public boolean maybeDropBuffersToKeyframe(long positionUs) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
    }

    @CallSuper
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
    }

    @CallSuper
    public void onProcessedOutputBuffer(long presentationTimeUs) {
    }

    public void onQueueInputBuffer(VideoDecoderInputBuffer buffer) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) throws ExoPlaybackException {
    }

    @CallSuper
    public void releaseDecoder() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }

    public void renderOutputBuffer(VideoDecoderOutputBuffer outputBuffer, long presentationTimeUs, Format outputFormat) throws DecoderException {
    }

    public abstract void renderOutputBufferToSurface(VideoDecoderOutputBuffer outputBuffer, Surface surface) throws DecoderException;

    public abstract void setDecoderOutputMode(int outputMode);

    public final void setOutput(@Nullable Object output) {
    }

    public boolean shouldDropBuffersToKeyframe(long earlyUs, long elapsedRealtimeUs) {
    }

    public boolean shouldDropOutputBuffer(long earlyUs, long elapsedRealtimeUs) {
    }

    public boolean shouldForceRenderOutputBuffer(long earlyUs, long elapsedSinceLastRenderUs) {
    }

    public void skipOutputBuffer(VideoDecoderOutputBuffer outputBuffer) {
    }

    public void updateDroppedBufferCounters(int droppedBufferCount) {
    }
}
