package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AmrExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int MAX_FRAME_SIZE_BYTES = 0;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final byte[] amrSignatureNb = null;
    private static final byte[] amrSignatureWb = null;
    private static final int[] frameSizeBytesByTypeNb = null;
    private static final int[] frameSizeBytesByTypeWb = null;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean hasOutputSeekMap;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private final byte[] scratch;
    private SeekMap seekMap;
    private long timeOffsetUs;
    private TrackOutput trackOutput;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Flags {
    }

    public AmrExtractor() {
    }

    public static /* synthetic */ Extractor[] a() {
    }

    public static byte[] amrSignatureNb() {
    }

    public static byte[] amrSignatureWb() {
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
    }

    public static int frameSizeBytesByTypeNb(int frameType) {
    }

    public static int frameSizeBytesByTypeWb(int frameType) {
    }

    private static int getBitrateFromFrameSize(int frameSize, long durationUsPerFrame) {
    }

    private SeekMap getConstantBitrateSeekMap(long inputLength) {
    }

    private int getFrameSizeInBytes(int frameType) throws ParserException {
    }

    private boolean isNarrowBandValidFrameType(int frameType) {
    }

    private boolean isValidFrameType(int frameType) {
    }

    private boolean isWideBandValidFrameType(int frameType) {
    }

    @RequiresNonNull({"trackOutput"})
    private void maybeOutputFormat() {
    }

    @RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long inputLength, int sampleReadResult) {
    }

    private static boolean peekAmrSignature(ExtractorInput input, byte[] amrSignature) throws IOException {
    }

    private int peekNextSampleSize(ExtractorInput extractorInput) throws IOException {
    }

    private boolean readAmrHeader(ExtractorInput input) throws IOException {
    }

    @RequiresNonNull({"trackOutput"})
    private int readSample(ExtractorInput extractorInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
    }

    public AmrExtractor(int flags) {
    }
}
