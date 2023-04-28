package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FlacFrameReader {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SampleNumberHolder {
        public long sampleNumber;
    }

    private FlacFrameReader() {
    }

    private static boolean checkAndReadBlockSizeSamples(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int blockSizeKey) {
    }

    private static boolean checkAndReadCrc(ParsableByteArray data, int frameStartPosition) {
    }

    private static boolean checkAndReadFirstSampleNumber(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, boolean isBlockSizeVariable, SampleNumberHolder sampleNumberHolder) {
    }

    public static boolean checkAndReadFrameHeader(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int frameStartMarker, SampleNumberHolder sampleNumberHolder) {
    }

    private static boolean checkAndReadSampleRate(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int sampleRateKey) {
    }

    private static boolean checkBitsPerSample(int bitsPerSampleKey, FlacStreamMetadata flacStreamMetadata) {
    }

    private static boolean checkChannelAssignment(int channelAssignmentKey, FlacStreamMetadata flacStreamMetadata) {
    }

    public static boolean checkFrameHeaderFromPeek(ExtractorInput input, FlacStreamMetadata flacStreamMetadata, int frameStartMarker, SampleNumberHolder sampleNumberHolder) throws IOException {
    }

    public static long getFirstSampleNumber(ExtractorInput input, FlacStreamMetadata flacStreamMetadata) throws IOException {
    }

    public static int readFrameBlockSizeSamplesFromKey(ParsableByteArray data, int blockSizeKey) {
    }
}
