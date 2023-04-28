package com.sobot.chat.widget.zxing.qrcode.detector;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.ResultPointCallback;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.DetectorResult;
import com.sobot.chat.widget.zxing.common.PerspectiveTransform;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f2) throws NotFoundException {
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i2) {
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i2) throws NotFoundException {
    }

    private float sizeOfBlackWhiteBlackRun(int i2, int i3, int i4, int i5) {
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i2, int i3, int i4, int i5) {
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
    }

    public final AlignmentPattern findAlignmentInRegion(float f2, int i2, int i3, float f3) throws NotFoundException {
    }

    public final BitMatrix getImage() {
    }

    public final ResultPointCallback getResultPointCallback() {
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
    }
}
