package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.SonicAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TransformerAudioRenderer extends TransformerBaseRenderer {
    private static final int DEFAULT_ENCODER_BITRATE = 131072;
    private static final float SPEED_UNSET = -1.0f;
    private static final String TAG = "TransformerAudioRenderer";
    private float currentSpeed;
    @Nullable
    private MediaCodecAdapterWrapper decoder;
    private final DecoderInputBuffer decoderInputBuffer;
    private boolean drainingSonicForSpeedChange;
    @Nullable
    private MediaCodecAdapterWrapper encoder;
    @Nullable
    private AudioProcessor.AudioFormat encoderInputAudioFormat;
    private final DecoderInputBuffer encoderInputBuffer;
    private boolean hasEncoderOutputFormat;
    @Nullable
    private Format inputFormat;
    private boolean muxerWrapperTrackEnded;
    private long nextEncoderInputBufferTimeUs;
    private final SonicAudioProcessor sonicAudioProcessor;
    private ByteBuffer sonicOutputBuffer;
    @Nullable
    private SpeedProvider speedProvider;

    public TransformerAudioRenderer(MuxerWrapper muxerWrapper, TransformerMediaClock mediaClock, Transformation transformation) {
    }

    private ExoPlaybackException createRendererException(Throwable cause, int errorCode) {
    }

    private boolean drainDecoderToFeedEncoder() {
    }

    private boolean drainDecoderToFeedSonic() {
    }

    private boolean drainEncoderToFeedMuxer() {
    }

    private boolean drainSonicToFeedEncoder() {
    }

    private boolean ensureDecoderConfigured() throws ExoPlaybackException {
    }

    private boolean ensureEncoderAndAudioProcessingConfigured() throws ExoPlaybackException {
    }

    private boolean feedDecoderInputFromSource() {
    }

    private void feedEncoder(ByteBuffer inputBuffer) {
    }

    private void flushSonicAndSetSpeed(float speed) {
    }

    private static long getBufferDurationUs(long bytesWritten, int bytesPerFrame, int sampleRate) {
    }

    private boolean isSpeedChanging(MediaCodec.BufferInfo bufferInfo) {
    }

    private void queueEndOfStreamToEncoder() {
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
    }
}
