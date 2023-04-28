package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Function;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray stsc, ParsableByteArray chunkOffsets, boolean chunkOffsetsAreLongs) throws ParserException {
        }

        public boolean moveNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int numberOfEntries) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom stszAtom, Format trackFormat) {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom stz2Atom) {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int id, long duration, int rotationDegrees) {
        }

        public static /* synthetic */ long access$000(TkhdData tkhdData) {
        }

        public static /* synthetic */ int access$100(TkhdData tkhdData) {
        }

        public static /* synthetic */ int access$200(TkhdData tkhdData) {
        }
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] timestamps, long duration, long editStartTime, long editEndTime) {
    }

    private static int findEsdsPosition(ParsableByteArray parent, int position, int size) throws ParserException {
    }

    private static int getTrackTypeForHdlr(int hdlr) {
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray meta) {
    }

    private static void parseAudioSampleEntry(ParsableByteArray parent, int atomType, int position, int size, int trackId, String language, boolean isQuickTime, @Nullable DrmInitData drmInitData, StsdData out, int entryIndex) throws ParserException {
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parent, int position, int size) throws ParserException {
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom edtsAtom) {
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parent, int position) {
    }

    private static int parseExpandableClassSize(ParsableByteArray data) {
    }

    private static int parseHdlr(ParsableByteArray hdlr) {
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray ilst, int limit) {
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray mdhd) {
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom meta) {
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parent, int atomType, int position, int trackId, StsdData out) {
    }

    private static long parseMvhd(ParsableByteArray mvhd) {
    }

    private static float parsePaspFromParent(ParsableByteArray parent, int position) {
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parent, int position, int size) {
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parent, int position, int size) throws ParserException {
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parent, int position, int size, String schemeType) {
    }

    @Nullable
    private static Metadata parseSmta(ParsableByteArray smta, int limit) {
    }

    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom stblAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
    }

    private static StsdData parseStsd(ParsableByteArray stsd, int trackId, int rotationDegrees, String language, @Nullable DrmInitData drmInitData, boolean isQuickTime) throws ParserException {
    }

    private static void parseTextSampleEntry(ParsableByteArray parent, int atomType, int position, int atomSize, int trackId, String language, StsdData out) {
    }

    private static TkhdData parseTkhd(ParsableByteArray tkhd) {
    }

    @Nullable
    private static Track parseTrak(Atom.ContainerAtom trak, Atom.LeafAtom mvhd, long duration, @Nullable DrmInitData drmInitData, boolean ignoreEditLists, boolean isQuickTime) throws ParserException {
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom moov, GaplessInfoHolder gaplessInfoHolder, long duration, @Nullable DrmInitData drmInitData, boolean ignoreEditLists, boolean isQuickTime, Function<Track, Track> modifyTrackFunction) throws ParserException {
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom udtaAtom) {
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray meta, int limit) {
    }

    private static void parseVideoSampleEntry(ParsableByteArray parent, int atomType, int position, int size, int trackId, int rotationDegrees, @Nullable DrmInitData drmInitData, StsdData out, int entryIndex) throws ParserException {
    }
}
