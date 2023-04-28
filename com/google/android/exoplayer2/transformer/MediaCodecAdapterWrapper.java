package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaCodecAdapterWrapper {
    private static final int MEDIA_CODEC_PCM_ENCODING = 2;
    private final MediaCodecAdapter codec;
    private int inputBufferIndex;
    private boolean inputStreamEnded;
    @Nullable
    private ByteBuffer outputBuffer;
    private int outputBufferIndex;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private boolean outputStreamEnded;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Factory extends SynchronousMediaCodecAdapter.Factory {
        private final boolean decoder;

        public Factory(boolean decoder) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.Factory
        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
        }
    }

    private MediaCodecAdapterWrapper(MediaCodecAdapter codec) {
    }

    public static MediaCodecAdapterWrapper createForAudioDecoding(Format format) throws IOException {
    }

    public static MediaCodecAdapterWrapper createForAudioEncoding(Format format) throws IOException {
    }

    private static MediaCodecInfo createPlaceholderMediaCodecInfo() {
    }

    private static Format getFormat(MediaFormat mediaFormat) {
    }

    private boolean maybeDequeueOutputBuffer() {
    }

    @Nullable
    public ByteBuffer getOutputBuffer() {
    }

    @Nullable
    public MediaCodec.BufferInfo getOutputBufferInfo() {
    }

    @Nullable
    public Format getOutputFormat() {
    }

    public boolean isEnded() {
    }

    @EnsuresNonNullIf(expression = {"#1.data"}, result = true)
    public boolean maybeDequeueInputBuffer(DecoderInputBuffer inputBuffer) {
    }

    public void queueInputBuffer(DecoderInputBuffer inputBuffer) {
    }

    public void release() {
    }

    public void releaseOutputBuffer() {
    }
}
