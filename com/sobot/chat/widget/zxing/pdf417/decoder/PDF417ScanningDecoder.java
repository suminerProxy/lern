package com.sobot.chat.widget.zxing.pdf417.decoder;

import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.DecoderResult;
import com.sobot.chat.widget.zxing.pdf417.decoder.ec.ErrorCorrection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = null;

    private PDF417ScanningDecoder() {
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) throws NotFoundException {
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeValueArr) throws NotFoundException {
    }

    private static int adjustCodewordStartColumn(BitMatrix bitMatrix, int i2, int i3, boolean z, int i4, int i5) {
    }

    private static boolean checkCodewordSkew(int i2, int i3, int i4) {
    }

    private static int correctErrors(int[] iArr, int[] iArr2, int i2) throws ChecksumException {
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResult) {
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) throws FormatException, ChecksumException, NotFoundException {
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int i2, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i2, int i3) throws NotFoundException, FormatException, ChecksumException {
    }

    private static DecoderResult decodeCodewords(int[] iArr, int i2, int[] iArr2) throws FormatException, ChecksumException {
    }

    private static Codeword detectCodeword(BitMatrix bitMatrix, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
    }

    private static int[] getBitCountForCodeword(int i2) {
    }

    private static int getCodewordBucketNumber(int i2) {
    }

    private static int getMax(int[] iArr) {
    }

    private static int[] getModuleBitCount(BitMatrix bitMatrix, int i2, int i3, boolean z, int i4, int i5) {
    }

    private static int getNumberOfECCodeWords(int i2) {
    }

    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean z, int i2, int i3) {
    }

    private static int getStartColumn(DetectionResult detectionResult, int i2, int i3, boolean z) {
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int i2) {
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) throws NotFoundException {
    }

    public static String toString(BarcodeValue[][] barcodeValueArr) {
    }

    private static void verifyCodewordCount(int[] iArr, int i2) throws FormatException {
    }

    private static int getCodewordBucketNumber(int[] iArr) {
    }
}
