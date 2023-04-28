package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        public /* synthetic */ FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i2, AnonymousClass1 anonymousClass1) {
        }

        private long findNextFrame(ExtractorInput input) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public /* synthetic */ void onSeekFinished() {
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetSampleNumber) throws IOException {
        }

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int frameStartMarker) {
        }
    }

    public FlacBinarySearchSeeker(FlacStreamMetadata flacStreamMetadata, int frameStartMarker, long firstFramePosition, long inputLength) {
    }
}
