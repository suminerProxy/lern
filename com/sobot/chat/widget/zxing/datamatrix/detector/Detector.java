package com.sobot.chat.widget.zxing.datamatrix.detector;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.DetectorResult;
import com.sobot.chat.widget.zxing.common.detector.WhiteRectangleDetector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
    }

    private ResultPoint correctTopRight(ResultPoint[] resultPointArr) {
    }

    private ResultPoint[] detectSolid1(ResultPoint[] resultPointArr) {
    }

    private ResultPoint[] detectSolid2(ResultPoint[] resultPointArr) {
    }

    private boolean isValid(ResultPoint resultPoint) {
    }

    private static ResultPoint moveAway(ResultPoint resultPoint, float f2, float f3) {
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i2, int i3) throws NotFoundException {
    }

    private static ResultPoint shiftPoint(ResultPoint resultPoint, ResultPoint resultPoint2, int i2) {
    }

    private ResultPoint[] shiftToModuleCenter(ResultPoint[] resultPointArr) {
    }

    private int transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    public DetectorResult detect() throws NotFoundException {
    }
}
