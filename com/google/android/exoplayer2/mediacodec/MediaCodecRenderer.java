package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = null;
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    public static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;
    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    @Nullable
    private C2Mp3TimestampTracker c2Mp3TimestampTracker;
    @Nullable
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    @Nullable
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    @Nullable
    private MediaCodecInfo codecInfo;
    @Nullable
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    @Nullable
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed;
    private final ArrayList<Long> decodeOnlyPresentationTimestamps;
    public DecoderCounters decoderCounters;
    private boolean enableAsynchronousBufferQueueing;
    private final boolean enableDecoderFallback;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;
    private boolean forceAsyncQueueingSynchronizationWorkaround;
    private final TimedValueQueue<Format> formatQueue;
    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private final MediaCodecSelector mediaCodecSelector;
    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private final DecoderInputBuffer noDataBuffer;
    @Nullable
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    @Nullable
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private long outputStreamStartPositionUs;
    private boolean pendingOutputEndOfStream;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamStartPositionsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    @Nullable
    private ExoPlaybackException pendingPlaybackException;
    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    @Nullable
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    public MediaCodecRenderer(int trackType, MediaCodecAdapter.Factory codecAdapterFactory, MediaCodecSelector mediaCodecSelector, boolean enableDecoderFallback, float assumedMinimumCodecOperatingRate) {
    }

    private void bypassRead() throws ExoPlaybackException {
    }

    private boolean bypassRender(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }

    private int codecAdaptationWorkaroundMode(String name) {
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String name, Format format) {
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String codecName) {
    }

    private static boolean codecNeedsEosFlushWorkaround(String name) {
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String name) {
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo codecInfo) {
    }

    private static boolean codecNeedsFlushWorkaround(String name) {
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String name, Format format) {
    }

    private static boolean codecNeedsSosFlushWorkaround(String name) {
    }

    private void disableBypass() {
    }

    private boolean drainAndFlushCodec() {
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
    }

    @TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
    }

    private boolean drainOutputBuffer(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo codecInfo, Format newFormat, @Nullable DrmSession oldSession, @Nullable DrmSession newSession) throws ExoPlaybackException {
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
    }

    private void flushCodec() {
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean mediaCryptoRequiresSecureDecoder) throws MediaCodecUtil.DecoderQueryException {
    }

    @Nullable
    private FrameworkMediaCrypto getFrameworkMediaCrypto(DrmSession drmSession) throws ExoPlaybackException {
    }

    private boolean hasOutputBuffer() {
    }

    private void initBypass(Format format) {
    }

    private void initCodec(MediaCodecInfo codecInfo, MediaCrypto crypto) throws Exception {
    }

    private boolean isDecodeOnlyBuffer(long presentationTimeUs) {
    }

    private static boolean isMediaCodecException(IllegalStateException error) {
    }

    @RequiresApi(21)
    private static boolean isMediaCodecExceptionV21(IllegalStateException error) {
    }

    @RequiresApi(21)
    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException error) {
    }

    private void maybeInitCodecWithFallback(MediaCrypto crypto, boolean mediaCryptoRequiresSecureDecoder) throws DecoderInitializationException {
    }

    private boolean maybeRequiresSecureDecoder(FrameworkMediaCrypto sessionMediaCrypto, Format format) {
    }

    @TargetApi(23)
    private void processEndOfStream() throws ExoPlaybackException {
    }

    private void processOutputMediaFormatChanged() {
    }

    private boolean readSourceOmittingSampleData(int readFlags) throws ExoPlaybackException {
    }

    private void reinitializeCodec() throws ExoPlaybackException {
    }

    private void resetInputBuffer() {
    }

    private void resetOutputBuffer() {
    }

    private void setCodecDrmSession(@Nullable DrmSession session) {
    }

    private void setSourceDrmSession(@Nullable DrmSession session) {
    }

    private boolean shouldContinueRendering(long renderStartTimeMs) {
    }

    public static boolean supportsFormatDrm(Format format) {
    }

    @RequiresApi(23)
    private void updateDrmSessionV23() throws ExoPlaybackException {
    }

    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo codecInfo, Format oldFormat, Format newFormat) {
    }

    public MediaCodecDecoderException createDecoderException(Throwable cause, @Nullable MediaCodecInfo codecInfo) {
    }

    public void experimentalSetAsynchronousBufferQueueingEnabled(boolean enabled) {
    }

    public void experimentalSetForceAsyncQueueingSynchronizationWorkaround(boolean enabled) {
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean enabled) {
    }

    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
    }

    public boolean flushOrReleaseCodec() {
    }

    @Nullable
    public final MediaCodecAdapter getCodec() {
    }

    @Nullable
    public final MediaCodecInfo getCodecInfo() {
    }

    public boolean getCodecNeedsEosPropagation() {
    }

    public float getCodecOperatingRate() {
    }

    public float getCodecOperatingRateV23(float targetPlaybackSpeed, Format format, Format[] streamFormats) {
    }

    @Nullable
    public final MediaFormat getCodecOutputMediaFormat() {
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean requiresSecureDecoder) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo codecInfo, Format format, @Nullable MediaCrypto crypto, float codecOperatingRate);

    public final long getOutputStreamOffsetUs() {
    }

    public float getPlaybackSpeed() {
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer buffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
    }

    public final void maybeInitCodecOrBypass() throws ExoPlaybackException {
    }

    public void onCodecError(Exception codecError) {
    }

    public void onCodecInitialized(String name, long initializedTimestampMs, long initializationDurationMs) {
    }

    public void onCodecReleased(String name) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
    }

    @Nullable
    @CallSuper
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
    }

    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
    }

    @CallSuper
    public void onProcessedOutputBuffer(long presentationTimeUs) {
    }

    public void onProcessedStreamChange() {
    }

    public void onQueueInputBuffer(DecoderInputBuffer buffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
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

    public abstract boolean processOutputBuffer(long positionUs, long elapsedRealtimeUs, @Nullable MediaCodecAdapter codec, @Nullable ByteBuffer buffer, int bufferIndex, int bufferFlags, int sampleCount, long bufferPresentationTimeUs, boolean isDecodeOnlyBuffer, boolean isLastBuffer, Format format) throws ExoPlaybackException;

    public void releaseCodec() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    @CallSuper
    public void resetCodecStateForFlush() {
    }

    @CallSuper
    public void resetCodecStateForRelease() {
    }

    public final void setPendingOutputEndOfStream() {
    }

    public final void setPendingPlaybackException(ExoPlaybackException exception) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float currentPlaybackSpeed, float targetPlaybackSpeed) throws ExoPlaybackException {
    }

    public void setRenderTimeLimitMs(long renderTimeLimitMs) {
    }

    public boolean shouldInitCodec(MediaCodecInfo codecInfo) {
    }

    public boolean shouldUseBypass(Format format) {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
    }

    public final boolean updateCodecOperatingRate() throws ExoPlaybackException {
    }

    public final void updateOutputFormatForTime(long presentationTimeUs) throws ExoPlaybackException {
    }

    private boolean updateCodecOperatingRate(Format format) throws ExoPlaybackException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        @Nullable
        public final MediaCodecInfo codecInfo;
        @Nullable
        public final String diagnosticInfo;
        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable cause, boolean secureDecoderRequired, int errorCode) {
        }

        public static /* synthetic */ DecoderInitializationException access$000(DecoderInitializationException decoderInitializationException, DecoderInitializationException decoderInitializationException2) {
        }

        private static String buildCustomDiagnosticInfo(int errorCode) {
        }

        @CheckResult
        private DecoderInitializationException copyWithFallbackException(DecoderInitializationException fallbackException) {
        }

        @Nullable
        @RequiresApi(21)
        private static String getDiagnosticInfoV21(@Nullable Throwable cause) {
        }

        public DecoderInitializationException(Format format, @Nullable Throwable cause, boolean secureDecoderRequired, MediaCodecInfo mediaCodecInfo) {
        }

        private DecoderInitializationException(String message, @Nullable Throwable cause, String mimeType, boolean secureDecoderRequired, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String diagnosticInfo, @Nullable DecoderInitializationException fallbackDecoderInitializationException) {
        }
    }
}
