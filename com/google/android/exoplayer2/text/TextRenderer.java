package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 0;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    @Nullable
    private SubtitleDecoder decoder;
    private final SubtitleDecoderFactory decoderFactory;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    @Nullable
    private SubtitleInputBuffer nextInputBuffer;
    @Nullable
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private final TextOutput output;
    @Nullable
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    @Nullable
    private Format streamFormat;
    @Nullable
    private SubtitleOutputBuffer subtitle;
    private boolean waitingForKeyFrame;

    public TextRenderer(TextOutput output, @Nullable Looper outputLooper) {
    }

    private void clearOutput() {
    }

    private long getNextEventTime() {
    }

    private void handleDecoderError(SubtitleDecoderException e2) {
    }

    private void initDecoder() {
    }

    private void invokeUpdateOutputInternal(List<Cue> cues) {
    }

    private void releaseBuffers() {
    }

    private void releaseDecoder() {
    }

    private void replaceDecoder() {
    }

    private void updateOutput(List<Cue> cues) {
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

    public void setFinalStreamEndPositionUs(long streamEndPositionUs) {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
    }

    public TextRenderer(TextOutput output, @Nullable Looper outputLooper, SubtitleDecoderFactory decoderFactory) {
    }
}
