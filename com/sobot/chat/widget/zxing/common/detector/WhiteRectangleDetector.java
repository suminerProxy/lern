package com.sobot.chat.widget.zxing.common.detector;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
    }

    private boolean containsBlackPoint(int i2, int i3, int i4, boolean z) {
    }

    private ResultPoint getBlackPointOnSegment(float f2, float f3, float f4, float f5) {
    }

    public ResultPoint[] detect() throws NotFoundException {
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i2, int i3, int i4) throws NotFoundException {
    }
}
