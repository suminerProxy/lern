package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FragmentedMp4Extractor implements Extractor {
    private static final Format EMSG_FORMAT = null;
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = null;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;
    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    @Nullable
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;
    @Nullable
    private final Track sideloadedTrack;
    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Flags {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MetadataSampleInfo {
        public final long presentationTimeDeltaUs;
        public final int size;

        public MetadataSampleInfo(long presentationTimeDeltaUs, int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        private final ParsableByteArray defaultInitializationVector;
        public DefaultSampleValues defaultSampleValues;
        private final ParsableByteArray encryptionSignalByte;
        public int firstSampleToOutputIndex;
        public final TrackFragment fragment;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        public final ParsableByteArray scratch;

        public TrackBundle(TrackOutput output, TrackSampleTable moovSampleTable, DefaultSampleValues defaultSampleValues) {
        }

        public static /* synthetic */ boolean access$000(TrackBundle trackBundle) {
        }

        public static /* synthetic */ boolean access$002(TrackBundle trackBundle, boolean z) {
        }

        public int getCurrentSampleFlags() {
        }

        public long getCurrentSampleOffset() {
        }

        public long getCurrentSamplePresentationTimeUs() {
        }

        public int getCurrentSampleSize() {
        }

        @Nullable
        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
        }

        public boolean next() {
        }

        public int outputSampleEncryptionData(int sampleSize, int clearHeaderSize) {
        }

        public void reset(TrackSampleTable moovSampleTable, DefaultSampleValues defaultSampleValues) {
        }

        public void resetFragmentInfo() {
        }

        public void seek(long timeUs) {
        }

        public void skipSampleEncryptionData() {
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
        }
    }

    public FragmentedMp4Extractor() {
    }

    public static /* synthetic */ Extractor[] a() {
    }

    private static int checkNonNegative(int value) throws ParserException {
    }

    private void enterReadingAtomHeaderState() {
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> defaultSampleValuesArray, int trackId) {
    }

    @Nullable
    private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> leafChildren) {
    }

    @Nullable
    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> trackBundles) {
    }

    private void initExtraTracks() {
    }

    private void onContainerAtomRead(Atom.ContainerAtom container) throws ParserException {
    }

    private void onEmsgLeafAtomRead(ParsableByteArray atom) {
    }

    private void onLeafAtomRead(Atom.LeafAtom leaf, long inputPosition) throws ParserException {
    }

    private void onMoofContainerAtomRead(Atom.ContainerAtom moof) throws ParserException {
    }

    private void onMoovContainerAtomRead(Atom.ContainerAtom moov) throws ParserException {
    }

    private void outputPendingMetadataSamples(long sampleTimeUs) {
    }

    private static long parseMehd(ParsableByteArray mehd) {
    }

    private static void parseMoof(Atom.ContainerAtom moof, SparseArray<TrackBundle> trackBundles, boolean haveSideloadedTrack, int flags, byte[] extendedTypeScratch) throws ParserException {
    }

    private static void parseSaio(ParsableByteArray saio, TrackFragment out) throws ParserException {
    }

    private static void parseSaiz(TrackEncryptionBox encryptionBox, ParsableByteArray saiz, TrackFragment out) throws ParserException {
    }

    private static void parseSampleGroups(Atom.ContainerAtom traf, @Nullable String schemeType, TrackFragment out) throws ParserException {
    }

    private static void parseSenc(ParsableByteArray senc, TrackFragment out) throws ParserException {
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray atom, long inputPosition) throws ParserException {
    }

    private static long parseTfdt(ParsableByteArray tfdt) {
    }

    @Nullable
    private static TrackBundle parseTfhd(ParsableByteArray tfhd, SparseArray<TrackBundle> trackBundles, boolean haveSideloadedTrack) {
    }

    private static void parseTraf(Atom.ContainerAtom traf, SparseArray<TrackBundle> trackBundles, boolean haveSideloadedTrack, int flags, byte[] extendedTypeScratch) throws ParserException {
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray trex) {
    }

    private static int parseTrun(TrackBundle trackBundle, int index, int flags, ParsableByteArray trun, int trackRunStart) throws ParserException {
    }

    private static void parseTruns(Atom.ContainerAtom traf, TrackBundle trackBundle, int flags) throws ParserException {
    }

    private static void parseUuid(ParsableByteArray uuid, TrackFragment out, byte[] extendedTypeScratch) throws ParserException {
    }

    private void processAtomEnded(long atomEndPosition) throws ParserException {
    }

    private boolean readAtomHeader(ExtractorInput input) throws IOException {
    }

    private void readAtomPayload(ExtractorInput input) throws IOException {
    }

    private void readEncryptionData(ExtractorInput input) throws IOException {
    }

    private boolean readSample(ExtractorInput input) throws IOException {
    }

    private static boolean shouldParseContainerAtom(int atom) {
    }

    private static boolean shouldParseLeafAtom(int atom) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
    }

    @Nullable
    public Track modifyTrack(@Nullable Track track) {
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

    public FragmentedMp4Extractor(int flags) {
    }

    private static void parseSenc(ParsableByteArray senc, int offset, TrackFragment out) throws ParserException {
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster) {
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack) {
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack, List<Format> closedCaptionFormats) {
    }

    public FragmentedMp4Extractor(int flags, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track sideloadedTrack, List<Format> closedCaptionFormats, @Nullable TrackOutput additionalEmsgTrackOutput) {
    }
}
