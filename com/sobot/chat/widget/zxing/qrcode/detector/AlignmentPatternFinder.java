package com.sobot.chat.widget.zxing.qrcode.detector;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPointCallback;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class AlignmentPatternFinder {
    private final int[] crossCheckStateCount;
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final List<AlignmentPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;

    public AlignmentPatternFinder(BitMatrix bitMatrix, int i2, int i3, int i4, int i5, float f2, ResultPointCallback resultPointCallback) {
    }

    private static float centerFromEnd(int[] iArr, int i2) {
    }

    private float crossCheckVertical(int i2, int i3, int i4, int i5) {
    }

    private boolean foundPatternCross(int[] iArr) {
    }

    private AlignmentPattern handlePossibleCenter(int[] iArr, int i2, int i3) {
    }

    public AlignmentPattern find() throws NotFoundException {
    }
}
