package com.sobot.chat.widget.zxing.qrcode.encoder;

import com.sobot.chat.widget.zxing.WriterException;
import com.sobot.chat.widget.zxing.common.BitArray;
import com.sobot.chat.widget.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sobot.chat.widget.zxing.qrcode.decoder.Version;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MatrixUtil {
    private static final int[][] POSITION_ADJUSTMENT_PATTERN = null;
    private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = null;
    private static final int[][] POSITION_DETECTION_PATTERN = null;
    private static final int[][] TYPE_INFO_COORDINATES = null;
    private static final int TYPE_INFO_MASK_PATTERN = 21522;
    private static final int TYPE_INFO_POLY = 1335;
    private static final int VERSION_INFO_POLY = 7973;

    private MatrixUtil() {
    }

    public static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i2, ByteMatrix byteMatrix) throws WriterException {
    }

    public static int calculateBCHCode(int i2, int i3) {
    }

    public static void clearMatrix(ByteMatrix byteMatrix) {
    }

    public static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix byteMatrix) throws WriterException {
    }

    public static void embedDataBits(BitArray bitArray, int i2, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedHorizontalSeparationPattern(int i2, int i3, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedPositionAdjustmentPattern(int i2, int i3, ByteMatrix byteMatrix) {
    }

    private static void embedPositionDetectionPattern(int i2, int i3, ByteMatrix byteMatrix) {
    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedTimingPatterns(ByteMatrix byteMatrix) {
    }

    public static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int i2, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedVerticalSeparationPattern(int i2, int i3, ByteMatrix byteMatrix) throws WriterException {
    }

    public static int findMSBSet(int i2) {
    }

    private static boolean isEmpty(int i2) {
    }

    public static void makeTypeInfoBits(ErrorCorrectionLevel errorCorrectionLevel, int i2, BitArray bitArray) throws WriterException {
    }

    public static void makeVersionInfoBits(Version version, BitArray bitArray) throws WriterException {
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version version, ByteMatrix byteMatrix) {
    }

    public static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) throws WriterException {
    }
}
