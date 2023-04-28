package com.google.android.exoplayer2.transformer;

import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MediaClock;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TransformerBaseRenderer extends BaseRenderer {
    public boolean isRendererStarted;
    public final TransformerMediaClock mediaClock;
    public final MuxerWrapper muxerWrapper;
    public final Transformation transformation;

    public TransformerBaseRenderer(int trackType, MuxerWrapper muxerWrapper, TransformerMediaClock mediaClock, Transformation transformation) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final MediaClock getMediaClock() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean joining, boolean mayRenderStartOfStream) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
    }
}
