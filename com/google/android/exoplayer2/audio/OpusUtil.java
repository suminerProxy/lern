package com.google.android.exoplayer2.audio;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
    }

    public static List<byte[]> buildInitializationData(byte[] header) {
    }

    private static byte[] buildNativeOrderByteArray(long value) {
    }

    public static int getChannelCount(byte[] header) {
    }

    public static int getPreSkipSamples(List<byte[]> initializationData) {
    }

    public static int getSeekPreRollSamples(List<byte[]> initializationData) {
    }

    private static long nanosecondsToSampleCount(long nanoseconds) {
    }

    private static long sampleCountToNanoseconds(long sampleCount) {
    }

    private static int getPreSkipSamples(byte[] header) {
    }
}
