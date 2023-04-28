package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;
    @Nullable
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;
    @Nullable
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    @Nullable
    private Metadata pendingMetadata;
    private long pendingMetadataTimestampUs;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput output, @Nullable Looper outputLooper) {
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> decodedEntries) {
    }

    private void invokeRenderer(Metadata metadata) {
    }

    private void invokeRendererInternal(Metadata metadata) {
    }

    private boolean outputMetadata(long positionUs) {
    }

    private void readMetadata() {
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
    }

    public MetadataRenderer(MetadataOutput output, @Nullable Looper outputLooper, MetadataDecoderFactory decoderFactory) {
    }
}
