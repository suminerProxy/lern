package com.google.android.exoplayer2.transformer;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TransformerVideoRenderer extends TransformerBaseRenderer {
    private static final String TAG = "TransformerVideoRenderer";
    private final DecoderInputBuffer buffer;
    private boolean formatRead;
    private boolean isBufferPending;
    private boolean isInputStreamEnded;
    @Nullable
    private SampleTransformer sampleTransformer;

    public TransformerVideoRenderer(MuxerWrapper muxerWrapper, TransformerMediaClock mediaClock, Transformation transformation) {
    }

    private boolean readAndTransformBuffer() {
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) {
    }
}
