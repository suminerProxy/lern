package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final ExtractorsFactory FACTORY = null;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final TsDurationReader durationReader;
    private boolean hasOutputSeekMap;
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private TsBinarySearchSeeker tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Mode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch;
        public final /* synthetic */ TsExtractor this$0;

        public PatReader(final TsExtractor this$0) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray sectionData) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch;
        public final /* synthetic */ TsExtractor this$0;
        private final SparseIntArray trackIdToPidScratch;
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch;

        public PmtReader(final TsExtractor this$0, int pid) {
        }

        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray data, int length) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray sectionData) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        }
    }

    public TsExtractor() {
    }

    public static /* synthetic */ Extractor[] a() {
    }

    public static /* synthetic */ SparseArray access$000(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ int access$100(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ boolean access$1000(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ boolean access$1002(TsExtractor tsExtractor, boolean z) {
    }

    public static /* synthetic */ int access$102(TsExtractor tsExtractor, int i2) {
    }

    public static /* synthetic */ int access$108(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ int access$200(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ List access$300(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ int access$402(TsExtractor tsExtractor, int i2) {
    }

    public static /* synthetic */ TsPayloadReader access$500(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ TsPayloadReader access$502(TsExtractor tsExtractor, TsPayloadReader tsPayloadReader) {
    }

    public static /* synthetic */ TsPayloadReader.Factory access$600(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ ExtractorOutput access$700(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ SparseBooleanArray access$800(TsExtractor tsExtractor) {
    }

    public static /* synthetic */ SparseBooleanArray access$900(TsExtractor tsExtractor) {
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput input) throws IOException {
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
    }

    private void maybeOutputSeekMap(long inputLength) {
    }

    private void resetPayloadReaders() {
    }

    private boolean shouldConsumePacketPayload(int packetPid) {
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

    public TsExtractor(int defaultTsPayloadReaderFlags) {
    }

    public TsExtractor(int mode, int defaultTsPayloadReaderFlags, int timestampSearchBytes) {
    }

    public TsExtractor(int mode, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory payloadReaderFactory) {
    }

    public TsExtractor(int mode, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory payloadReaderFactory, int timestampSearchBytes) {
    }
}
