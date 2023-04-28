package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int dimensions, int entries, long[] lengthMap, int lookupType, boolean isOrdered) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String vendor, String[] comments, int length) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean blockFlag, int windowType, int transformType, int mapping) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int version, int channels, int sampleRate, int bitrateMaximum, int bitrateNominal, int bitrateMinimum, int blockSize0, int blockSize1, boolean framingFlag, byte[] data) {
        }
    }

    private VorbisUtil() {
    }

    public static int iLog(int x) {
    }

    private static long mapType1QuantValues(long entries, long dimension) {
    }

    private static CodeBook readBook(VorbisBitArray bitArray) throws ParserException {
    }

    private static void readFloors(VorbisBitArray bitArray) throws ParserException {
    }

    private static void readMappings(int channels, VorbisBitArray bitArray) throws ParserException {
    }

    private static Mode[] readModes(VorbisBitArray bitArray) {
    }

    private static void readResidues(VorbisBitArray bitArray) throws ParserException {
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray headerData) throws ParserException {
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray headerData) throws ParserException {
    }

    public static Mode[] readVorbisModes(ParsableByteArray headerData, int channels) throws ParserException {
    }

    public static boolean verifyVorbisHeaderCapturePattern(int headerType, ParsableByteArray header, boolean quiet) throws ParserException {
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray headerData, boolean hasMetadataHeader, boolean hasFramingBit) throws ParserException {
    }
}
