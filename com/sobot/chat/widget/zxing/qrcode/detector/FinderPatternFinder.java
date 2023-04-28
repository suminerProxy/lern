package com.sobot.chat.widget.zxing.qrcode.detector;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPointCallback;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    public static final int MAX_MODULES = 97;
    public static final int MIN_SKIP = 3;
    private static final EstimatedModuleComparator moduleComparator = null;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class EstimatedModuleComparator implements Comparator<FinderPattern>, Serializable {
        private EstimatedModuleComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }

        public /* synthetic */ EstimatedModuleComparator(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
    }

    private static float centerFromEnd(int[] iArr, int i2) {
    }

    private boolean crossCheckDiagonal(int i2, int i3) {
    }

    private float crossCheckHorizontal(int i2, int i3, int i4, int i5) {
    }

    private float crossCheckVertical(int i2, int i3, int i4, int i5) {
    }

    private int findRowSkip() {
    }

    public static boolean foundPatternCross(int[] iArr) {
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
    }

    private int[] getCrossCheckStateCount() {
    }

    private boolean haveMultiplyConfirmedCenters() {
    }

    private FinderPattern[] selectBestPatterns() throws NotFoundException {
    }

    private static double squaredDistance(FinderPattern finderPattern, FinderPattern finderPattern2) {
    }

    public final void clearCounts(int[] iArr) {
    }

    public final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    public final BitMatrix getImage() {
    }

    public final List<FinderPattern> getPossibleCenters() {
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i2, int i3, boolean z) {
    }

    public final void shiftCounts2(int[] iArr) {
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
    }

    public final boolean handlePossibleCenter(int[] iArr, int i2, int i3) {
    }
}
