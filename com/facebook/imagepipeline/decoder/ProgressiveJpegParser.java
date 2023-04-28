package com.facebook.imagepipeline.decoder;

import com.facebook.common.memory.ByteArrayPool;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ProgressiveJpegParser {
    private static final int BUFFER_SIZE = 16384;
    private static final int NOT_A_JPEG = 6;
    private static final int READ_FIRST_JPEG_BYTE = 0;
    private static final int READ_MARKER_FIRST_BYTE_OR_ENTROPY_DATA = 2;
    private static final int READ_MARKER_SECOND_BYTE = 3;
    private static final int READ_SECOND_JPEG_BYTE = 1;
    private static final int READ_SIZE_FIRST_BYTE = 4;
    private static final int READ_SIZE_SECOND_BYTE = 5;
    private int mBestScanEndOffset;
    private int mBestScanNumber;
    private final ByteArrayPool mByteArrayPool;
    private int mBytesParsed;
    private boolean mEndMarkerRead;
    private int mLastByteRead;
    private int mNextFullScanNumber;
    private int mParserState;

    public ProgressiveJpegParser(ByteArrayPool byteArrayPool) {
    }

    private boolean doParseMoreData(final InputStream inputStream) {
    }

    private static boolean doesMarkerStartSegment(int markerSecondByte) {
    }

    private void newScanOrImageEndFound(int offset) {
    }

    public int getBestScanEndOffset() {
    }

    public int getBestScanNumber() {
    }

    public boolean isEndMarkerRead() {
    }

    public boolean isJpeg() {
    }

    public boolean parseMoreData(final EncodedImage encodedImage) {
    }
}
