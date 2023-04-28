package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int inputSampleRateHz, int channelCount, float speed, float pitch, int outputSampleRateHz) {
    }

    private void adjustRate(float rate, int originalOutputFrameCount) {
    }

    private void changeSpeed(float speed) {
    }

    private int copyInputToOutput(int positionFrames) {
    }

    private void copyToOutput(short[] samples, int positionFrames, int frameCount) {
    }

    private void downSampleInput(short[] samples, int position, int skip) {
    }

    private short[] ensureSpaceForAdditionalFrames(short[] buffer, int frameCount, int additionalFrameCount) {
    }

    private int findPitchPeriod(short[] samples, int position) {
    }

    private int findPitchPeriodInRange(short[] samples, int position, int minPeriod, int maxPeriod) {
    }

    private int insertPitchPeriod(short[] samples, int position, float speed, int period) {
    }

    private short interpolate(short[] in, int inPos, int oldSampleRate, int newSampleRate) {
    }

    private void moveNewSamplesToPitchBuffer(int originalOutputFrameCount) {
    }

    private static void overlapAdd(int frameCount, int channelCount, short[] out, int outPosition, short[] rampDown, int rampDownPosition, short[] rampUp, int rampUpPosition) {
    }

    private boolean previousPeriodBetter(int minDiff, int maxDiff) {
    }

    private void processStreamInput() {
    }

    private void removePitchFrames(int frameCount) {
    }

    private void removeProcessedInputFrames(int positionFrames) {
    }

    private int skipPitchPeriod(short[] samples, int position, float speed, int period) {
    }

    public void flush() {
    }

    public void getOutput(ShortBuffer buffer) {
    }

    public int getOutputSize() {
    }

    public int getPendingInputBytes() {
    }

    public void queueEndOfStream() {
    }

    public void queueInput(ShortBuffer buffer) {
    }
}
