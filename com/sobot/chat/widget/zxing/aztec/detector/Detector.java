package com.sobot.chat.widget.zxing.aztec.detector;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.aztec.AztecDetectorResult;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = null;
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Point {
        private final int x;
        private final int y;

        public Point(int i2, int i3) {
        }

        public int getX() {
        }

        public int getY() {
        }

        public ResultPoint toResultPoint() {
        }

        public String toString() {
        }
    }

    public Detector(BitMatrix bitMatrix) {
    }

    private static float distance(Point point, Point point2) {
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArr, int i2, int i3) {
    }

    private void extractParameters(ResultPoint[] resultPointArr) throws NotFoundException {
    }

    private ResultPoint[] getBullsEyeCorners(Point point) throws NotFoundException {
    }

    private int getColor(Point point, Point point2) {
    }

    private static int getCorrectedParameterData(long j2, boolean z) throws NotFoundException {
    }

    private int getDimension() {
    }

    private Point getFirstDifferent(Point point, boolean z, int i2, int i3) {
    }

    private Point getMatrixCenter() {
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArr) {
    }

    private static int getRotation(int[] iArr, int i2) throws NotFoundException {
    }

    private boolean isValid(int i2, int i3) {
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int i2) {
    }

    public AztecDetectorResult detect() throws NotFoundException {
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    private boolean isValid(ResultPoint resultPoint) {
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
    }
}
