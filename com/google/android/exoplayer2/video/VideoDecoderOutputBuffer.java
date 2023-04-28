package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class VideoDecoderOutputBuffer extends OutputBuffer {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    @Nullable
    public ByteBuffer data;
    public int decoderPrivate;
    @Nullable
    public Format format;
    public int height;
    public int mode;
    private final OutputBuffer.Owner<VideoDecoderOutputBuffer> owner;
    @Nullable
    public ByteBuffer supplementalData;
    public int width;
    @Nullable
    public ByteBuffer[] yuvPlanes;
    @Nullable
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(OutputBuffer.Owner<VideoDecoderOutputBuffer> owner) {
    }

    private static boolean isSafeToMultiply(int a2, int b) {
    }

    public void init(long timeUs, int mode, @Nullable ByteBuffer supplementalData) {
    }

    public void initForPrivateFrame(int width, int height) {
    }

    public boolean initForYuvFrame(int width, int height, int yStride, int uvStride, int colorspace) {
    }

    @Override // com.google.android.exoplayer2.decoder.OutputBuffer
    public void release() {
    }
}
