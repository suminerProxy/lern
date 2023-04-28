package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FlacStreamMetadataHolder {
        @Nullable
        public FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(@Nullable FlacStreamMetadata flacStreamMetadata) {
        }
    }

    private FlacMetadataReader() {
    }

    public static boolean checkAndPeekStreamMarker(ExtractorInput input) throws IOException {
    }

    public static int getFrameStartMarker(ExtractorInput input) throws IOException {
    }

    @Nullable
    public static Metadata peekId3Metadata(ExtractorInput input, boolean parseData) throws IOException {
    }

    @Nullable
    public static Metadata readId3Metadata(ExtractorInput input, boolean parseData) throws IOException {
    }

    public static boolean readMetadataBlock(ExtractorInput input, FlacStreamMetadataHolder metadataHolder) throws IOException {
    }

    private static PictureFrame readPictureMetadataBlock(ExtractorInput input, int length) throws IOException {
    }

    public static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ParsableByteArray data) {
    }

    private static FlacStreamMetadata readStreamInfoBlock(ExtractorInput input) throws IOException {
    }

    public static void readStreamMarker(ExtractorInput input) throws IOException {
    }

    private static List<String> readVorbisCommentMetadataBlock(ExtractorInput input, int length) throws IOException {
    }

    private static FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(ExtractorInput input, int length) throws IOException {
    }
}
