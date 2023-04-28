package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MediaCodecAdapter {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Configuration {
        public final MediaCodecInfo codecInfo;
        @Nullable
        public final MediaCrypto crypto;
        public final int flags;
        public final Format format;
        public final MediaFormat mediaFormat;
        @Nullable
        public final Surface surface;

        public Configuration(MediaCodecInfo codecInfo, MediaFormat mediaFormat, Format format, @Nullable Surface surface, @Nullable MediaCrypto crypto, int flags) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Factory {
        public static final Factory DEFAULT = null;

        MediaCodecAdapter createAdapter(Configuration configuration) throws IOException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnFrameRenderedListener {
        void onFrameRendered(MediaCodecAdapter codec, long presentationTimeUs, long nanoTime);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    @Nullable
    ByteBuffer getInputBuffer(int index);

    @Nullable
    ByteBuffer getOutputBuffer(int index);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags);

    void queueSecureInputBuffer(int index, int offset, CryptoInfo info, long presentationTimeUs, int flags);

    void release();

    @RequiresApi(21)
    void releaseOutputBuffer(int index, long renderTimeStampNs);

    void releaseOutputBuffer(int index, boolean render);

    @RequiresApi(23)
    void setOnFrameRenderedListener(OnFrameRenderedListener listener, Handler handler);

    @RequiresApi(23)
    void setOutputSurface(Surface surface);

    @RequiresApi(19)
    void setParameters(Bundle params);

    void setVideoScalingMode(int scalingMode);
}
