package com.sobot.chat.widget.zxing.multi.qrcode.detector;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPointCallback;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.qrcode.detector.FinderPattern;
import com.sobot.chat.widget.zxing.qrcode.detector.FinderPatternFinder;
import com.sobot.chat.widget.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final FinderPattern[][] EMPTY_FP_2D_ARRAY = null;
    private static final FinderPattern[] EMPTY_FP_ARRAY = null;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = null;
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ModuleSizeComparator implements Comparator<FinderPattern>, Serializable {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }

        public /* synthetic */ ModuleSizeComparator(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
    }

    private FinderPattern[][] selectMultipleBestPatterns() throws NotFoundException {
    }

    public FinderPatternInfo[] findMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
