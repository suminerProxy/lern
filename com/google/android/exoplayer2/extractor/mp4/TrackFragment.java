package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackFragment {
    public long atomPosition;
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public boolean nextFragmentDecodeTimeIncludesMoov;
    public int[] sampleCompositionTimeOffsetUsTable;
    public int sampleCount;
    public long[] sampleDecodingTimeUsTable;
    public final ParsableByteArray sampleEncryptionData;
    public boolean sampleEncryptionDataNeedsFill;
    public boolean[] sampleHasSubsampleEncryptionTable;
    public boolean[] sampleIsSyncFrameTable;
    public int[] sampleSizeTable;
    @Nullable
    public TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition;
    public int[] trunLength;

    public void fillEncryptionData(ExtractorInput input) throws IOException {
    }

    public long getSamplePresentationTimeUs(int index) {
    }

    public void initEncryptionData(int length) {
    }

    public void initTables(int trunCount, int sampleCount) {
    }

    public void reset() {
    }

    public boolean sampleHasSubsampleEncryptionTable(int index) {
    }

    public void fillEncryptionData(ParsableByteArray source) {
    }
}
