package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.transformer.Muxer;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FrameworkMuxer implements Muxer {
    private final MediaCodec.BufferInfo bufferInfo;
    private boolean isStarted;
    private final MediaMuxer mediaMuxer;
    private final String outputMimeType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements Muxer.Factory {
        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        @RequiresApi(26)
        public /* bridge */ /* synthetic */ Muxer create(ParcelFileDescriptor parcelFileDescriptor, String outputMimeType) throws IOException {
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        public boolean supportsOutputMimeType(String mimeType) {
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        public /* bridge */ /* synthetic */ Muxer create(String path, String outputMimeType) throws IOException {
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        public FrameworkMuxer create(String path, String outputMimeType) throws IOException {
        }

        @Override // com.google.android.exoplayer2.transformer.Muxer.Factory
        @RequiresApi(26)
        public FrameworkMuxer create(ParcelFileDescriptor parcelFileDescriptor, String outputMimeType) throws IOException {
        }
    }

    public /* synthetic */ FrameworkMuxer(MediaMuxer mediaMuxer, String str, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ int access$000(String str) {
    }

    private static int mimeTypeToMuxerOutputFormat(String mimeType) {
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public int addTrack(Format format) {
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public void release(boolean forCancellation) {
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public boolean supportsSampleMimeType(@Nullable String mimeType) {
    }

    @Override // com.google.android.exoplayer2.transformer.Muxer
    public void writeSampleData(int trackIndex, ByteBuffer data, boolean isKeyFrame, long presentationTimeUs) {
    }

    private FrameworkMuxer(MediaMuxer mediaMuxer, String outputMimeType) {
    }
}
