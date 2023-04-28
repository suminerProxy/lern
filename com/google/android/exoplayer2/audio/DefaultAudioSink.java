package com.google.android.exoplayer2.audio;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioTrackPositionTracker;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    private static final long MAX_BUFFER_DURATION_US = 750000;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final long MIN_BUFFER_DURATION_US = 250000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    private static final long OFFLOAD_BUFFER_DURATION_US = 50000000;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    private static final int OUTPUT_MODE_OFFLOAD = 1;
    private static final int OUTPUT_MODE_PASSTHROUGH = 2;
    private static final int OUTPUT_MODE_PCM = 0;
    private static final long PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;
    private AudioProcessor[] activeAudioProcessors;
    @Nullable
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    @Nullable
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    @Nullable
    private AudioTrack audioTrack;
    private PlaybackParameters audioTrackPlaybackParameters;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;
    @Nullable
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    @Nullable
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;
    @Nullable
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;
    @Nullable
    private Configuration pendingConfiguration;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ DefaultAudioSink this$0;
        public final /* synthetic */ AudioTrack val$toRelease;

        public AnonymousClass1(final DefaultAudioSink this$0, String name, final AudioTrack val$toRelease) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        boolean applySkipSilenceEnabled(boolean skipSilenceEnabled);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long playoutDuration);

        long getSkippedOutputFrameCount();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Configuration {
        public final AudioProcessor[] availableAudioProcessors;
        public final int bufferSize;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;

        public Configuration(Format inputFormat, int inputPcmFrameSize, int outputMode, int outputPcmFrameSize, int outputSampleRate, int outputChannelConfig, int outputEncoding, int specifiedBufferSize, boolean enableAudioTrackPlaybackParams, AudioProcessor[] availableAudioProcessors) {
        }

        private int computeBufferSize(int specifiedBufferSize, boolean enableAudioTrackPlaybackParameters) {
        }

        private AudioTrack createAudioTrack(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
        }

        @RequiresApi(21)
        private AudioTrack createAudioTrackV21(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
        }

        @RequiresApi(29)
        private AudioTrack createAudioTrackV29(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
        }

        private AudioTrack createAudioTrackV9(AudioAttributes audioAttributes, int audioSessionId) {
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean tunneling) {
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
        }

        private int getEncodedDefaultBufferSize(long bufferDurationUs) {
        }

        private int getPcmDefaultBufferSize(float maxAudioTrackPlaybackSpeed) {
        }

        public AudioTrack buildAudioTrack(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) throws AudioSink.InitializationException {
        }

        public boolean canReuseAudioTrack(Configuration audioTrackConfiguration) {
        }

        public long durationUsToFrames(long durationUs) {
        }

        public long framesToDurationUs(long frameCount) {
        }

        public long inputFramesToDurationUs(long frameCount) {
        }

        public boolean outputModeIsOffload() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessors) {
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long playoutDuration) {
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessors, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, AnonymousClass1 anonymousClass1) {
        }

        private InvalidAudioTrackTimestampException(String message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;
        public final boolean skipSilence;

        public /* synthetic */ MediaPositionParameters(PlaybackParameters playbackParameters, boolean z, long j2, long j3, AnonymousClass1 anonymousClass1) {
        }

        private MediaPositionParameters(PlaybackParameters playbackParameters, boolean skipSilence, long mediaTimeUs, long audioTrackPositionUs) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface OffloadMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PendingExceptionHolder<T extends Exception> {
        @Nullable
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long throwDelayMs) {
        }

        public void clear() {
        }

        public void throwExceptionIfDeadlineIsReached(T exception) throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        public final /* synthetic */ DefaultAudioSink this$0;

        private PositionTrackerListener(final DefaultAudioSink this$0) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long latencyUs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long playoutStartSystemTimeMs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int bufferSize, long bufferSizeMs) {
        }

        public /* synthetic */ PositionTrackerListener(DefaultAudioSink defaultAudioSink, AnonymousClass1 anonymousClass1) {
        }
    }

    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class StreamEventCallbackV29 {
        private final AudioTrack.StreamEventCallback callback;
        private final Handler handler;
        public final /* synthetic */ DefaultAudioSink this$0;

        /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AudioTrack.StreamEventCallback {
            public final /* synthetic */ StreamEventCallbackV29 this$1;
            public final /* synthetic */ DefaultAudioSink val$this$0;

            public AnonymousClass1(final StreamEventCallbackV29 this$1, final DefaultAudioSink val$this$0) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack track, int size) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(@NonNull AudioTrack track) {
            }
        }

        public StreamEventCallbackV29(final DefaultAudioSink this$0) {
        }

        public void register(AudioTrack audioTrack) {
        }

        public void unregister(AudioTrack audioTrack) {
        }
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessors) {
    }

    public static /* synthetic */ AudioFormat access$1000(int i2, int i3, int i4) {
    }

    public static /* synthetic */ int access$1100(int i2) {
    }

    public static /* synthetic */ ConditionVariable access$200(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ AudioTrack access$300(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ AudioSink.Listener access$400(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ boolean access$500(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ long access$600(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ long access$700(DefaultAudioSink defaultAudioSink) {
    }

    public static /* synthetic */ long access$900(DefaultAudioSink defaultAudioSink) {
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long presentationTimeUs) {
    }

    private long applyMediaPositionParameters(long positionUs) {
    }

    private long applySkipping(long positionUs) {
    }

    private AudioTrack buildAudioTrack() throws AudioSink.InitializationException {
    }

    private boolean drainToEndOfStream() throws AudioSink.WriteException {
    }

    private void flushAudioProcessors() {
    }

    @RequiresApi(21)
    private static AudioFormat getAudioFormat(int sampleRate, int channelConfig, int encoding) {
    }

    private PlaybackParameters getAudioProcessorPlaybackParameters() {
    }

    private static int getChannelConfigForPassthrough(int channelCount) {
    }

    @Nullable
    private static Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, @Nullable AudioCapabilities audioCapabilities) {
    }

    private static int getFramesPerEncodedSample(int encoding, ByteBuffer buffer) {
    }

    @RequiresApi(29)
    private static int getMaxSupportedChannelCountForPassthroughV29(int encoding, int sampleRate) {
    }

    private static int getMaximumEncodedRateBytesPerSecond(int encoding) {
    }

    private MediaPositionParameters getMediaPositionParameters() {
    }

    private long getSubmittedFrames() {
    }

    private long getWrittenFrames() {
    }

    private void initializeAudioTrack() throws AudioSink.InitializationException {
    }

    private static boolean isAudioTrackDeadObject(int status) {
    }

    private boolean isAudioTrackInitialized() {
    }

    private static boolean isOffloadedGaplessPlaybackSupported() {
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
    }

    private static boolean isPassthroughPlaybackSupported(Format format, @Nullable AudioCapabilities audioCapabilities) {
    }

    private void maybeDisableOffload() {
    }

    private void playPendingData() {
    }

    private void processBuffers(long avSyncPresentationTimeUs) throws AudioSink.WriteException {
    }

    @RequiresApi(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
    }

    private void resetSinkStateForFlush() {
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(PlaybackParameters playbackParameters, boolean skipSilence) {
    }

    @RequiresApi(23)
    private void setAudioTrackPlaybackParametersV23(PlaybackParameters audioTrackPlaybackParameters) {
    }

    private void setVolumeInternal() {
    }

    @RequiresApi(21)
    private static void setVolumeInternalV21(AudioTrack audioTrack, float volume) {
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float volume) {
    }

    private void setupAudioProcessors() {
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
    }

    private boolean shouldUseFloatOutput(int pcmEncoding) {
    }

    private boolean useOffloadedPlayback(Format format, AudioAttributes audioAttributes) {
    }

    private void writeBuffer(ByteBuffer buffer, long avSyncPresentationTimeUs) throws AudioSink.WriteException {
    }

    @RequiresApi(21)
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer buffer, int size) {
    }

    @RequiresApi(21)
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer buffer, int size, long presentationTimeUs) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format inputFormat, int specifiedBufferSize, @Nullable int[] outputChannels) throws AudioSink.ConfigurationException {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean sourceEnded) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer buffer, long presentationTimeUs, int encodedAccessUnitCount) throws AudioSink.InitializationException, AudioSink.WriteException {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int audioSessionId) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean skipSilenceEnabled) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float volume) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessors, boolean enableFloatOutput) {
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean enableFloatOutput, boolean enableAudioTrackPlaybackParams, int offloadMode) {
    }
}
