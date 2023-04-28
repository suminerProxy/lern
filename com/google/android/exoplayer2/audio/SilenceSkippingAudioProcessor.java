package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 150000;
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int STATE_MAYBE_SILENT = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SILENT = 2;
    private int bytesPerFrame;
    private boolean enabled;
    private boolean hasOutputNoise;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferSize;
    private final long minimumSilenceDurationUs;
    private byte[] paddingBuffer;
    private final long paddingSilenceUs;
    private int paddingSize;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
    }

    private int durationUsToFrames(long durationUs) {
    }

    private int findNoiseLimit(ByteBuffer buffer) {
    }

    private int findNoisePosition(ByteBuffer buffer) {
    }

    private void output(byte[] data, int length) {
    }

    private void processMaybeSilence(ByteBuffer inputBuffer) {
    }

    private void processNoisy(ByteBuffer inputBuffer) {
    }

    private void processSilence(ByteBuffer inputBuffer) {
    }

    private void updatePaddingBuffer(ByteBuffer input, byte[] buffer, int size) {
    }

    public long getSkippedFrames() {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onFlush() {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onReset() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
    }

    public void setEnabled(boolean enabled) {
    }

    public SilenceSkippingAudioProcessor(long minimumSilenceDurationUs, long paddingSilenceUs, short silenceThresholdLevel) {
    }

    private void output(ByteBuffer data) {
    }
}
