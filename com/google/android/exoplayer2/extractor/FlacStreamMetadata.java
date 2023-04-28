package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String SEPARATOR = "=";
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    @Nullable
    private final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    @Nullable
    public final SeekTable seekTable;
    public final long totalSamples;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] pointSampleNumbers, long[] pointOffsets) {
        }
    }

    public FlacStreamMetadata(byte[] data, int offset) {
    }

    @Nullable
    private static Metadata buildMetadata(List<String> vorbisComments, List<PictureFrame> pictureFrames) {
    }

    private static int getBitsPerSampleLookupKey(int bitsPerSample) {
    }

    private static int getSampleRateLookupKey(int sampleRate) {
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> pictureFrames) {
    }

    public FlacStreamMetadata copyWithSeekTable(@Nullable SeekTable seekTable) {
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> vorbisComments) {
    }

    public long getApproxBytesPerFrame() {
    }

    public int getDecodedBitrate() {
    }

    public long getDurationUs() {
    }

    public Format getFormat(byte[] streamMarkerAndInfoBlock, @Nullable Metadata id3Metadata) {
    }

    public int getMaxDecodedFrameSize() {
    }

    @Nullable
    public Metadata getMetadataCopyWithAppendedEntriesFrom(@Nullable Metadata other) {
    }

    public long getSampleNumber(long timeUs) {
    }

    public FlacStreamMetadata(int minBlockSizeSamples, int maxBlockSizeSamples, int minFrameSize, int maxFrameSize, int sampleRate, int channels, int bitsPerSample, long totalSamples, ArrayList<String> vorbisComments, ArrayList<PictureFrame> pictureFrames) {
    }

    private FlacStreamMetadata(int minBlockSizeSamples, int maxBlockSizeSamples, int minFrameSize, int maxFrameSize, int sampleRate, int channels, int bitsPerSample, long totalSamples, @Nullable SeekTable seekTable, @Nullable Metadata metadata) {
    }
}
