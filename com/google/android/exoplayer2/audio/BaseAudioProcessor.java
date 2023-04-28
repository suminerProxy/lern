package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {
    private ByteBuffer buffer;
    public AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    public AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
    }

    public final boolean hasPendingOutput() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
    }

    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
    }

    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
    }

    public final ByteBuffer replaceOutputBuffer(int count) {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
    }
}
