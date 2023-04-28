package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    @Nullable
    private RendererConfiguration configuration;
    private final FormatHolder formatHolder;
    private int index;
    private long lastResetPositionUs;
    private long readingPositionUs;
    private int state;
    @Nullable
    private SampleStream stream;
    @Nullable
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;

    public BaseRenderer(int trackType) {
    }

    public final ExoPlaybackException createRendererException(Throwable cause, @Nullable Format format, int errorCode) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration configuration, Format[] formats, SampleStream stream, long positionUs, boolean joining, boolean mayRenderStartOfStream, long startPositionUs, long offsetUs) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
    }

    public final RendererConfiguration getConfiguration() {
    }

    public final FormatHolder getFormatHolder() {
    }

    public final int getIndex() {
    }

    public final long getLastResetPositionUs() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream getStream() {
    }

    public final Format[] getStreamFormats() {
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
    }

    public final boolean isSourceReady() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
    }

    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) throws ExoPlaybackException {
    }

    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formats, SampleStream stream, long startPositionUs, long offsetUs) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long positionUs) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setIndex(int index) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f2, float f3) {
    }

    public int skipSource(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
    }

    public final ExoPlaybackException createRendererException(Throwable cause, @Nullable Format format, boolean isRecoverable, int errorCode) {
    }
}
