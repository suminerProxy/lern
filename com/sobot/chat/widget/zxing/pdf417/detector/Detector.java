package com.sobot.chat.widget.zxing.pdf417.detector;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final int[] INDEXES_START_PATTERN = null;
    private static final int[] INDEXES_STOP_PATTERN = null;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] START_PATTERN = null;
    private static final int[] STOP_PATTERN = null;

    private Detector() {
    }

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i2, int i3, int i4, boolean z, int[] iArr, int[] iArr2) {
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i2, int i3) {
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2, float f2) {
    }

    private static List<ResultPoint[]> detect(boolean z, BitMatrix bitMatrix) {
    }
}
