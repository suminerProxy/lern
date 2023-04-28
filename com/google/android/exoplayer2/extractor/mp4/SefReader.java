package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SefReader {
    private static final Splitter ASTERISK_SPLITTER = null;
    private static final Splitter COLON_SPLITTER = null;
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences;
    private int readerState;
    private int tailLength;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int dataType, long startOffset, int size) {
        }
    }

    private void checkForSefData(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    private static int nameToDataType(String name) throws ParserException {
    }

    private void readSdrs(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    private void readSefData(ExtractorInput input, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
    }

    private static SlowMotionData readSlowMotionData(ParsableByteArray data, int dataLength) throws ParserException {
    }

    public int read(ExtractorInput input, PositionHolder seekPosition, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
    }

    public void reset() {
    }
}
