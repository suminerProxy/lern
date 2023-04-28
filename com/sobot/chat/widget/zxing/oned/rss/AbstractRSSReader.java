package com.sobot.chat.widget.zxing.oned.rss;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.oned.OneDReader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.2f;
    private static final float MAX_FINDER_PATTERN_RATIO = 0.89285713f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.45f;
    private static final float MIN_FINDER_PATTERN_RATIO = 0.7916667f;
    private final int[] dataCharacterCounters;
    private final int[] decodeFinderCounters;
    private final int[] evenCounts;
    private final float[] evenRoundingErrors;
    private final int[] oddCounts;
    private final float[] oddRoundingErrors;

    @Deprecated
    public static int count(int[] iArr) {
    }

    public static void decrement(int[] iArr, float[] fArr) {
    }

    public static void increment(int[] iArr, float[] fArr) {
    }

    public static boolean isFinderPattern(int[] iArr) {
    }

    public static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
    }

    public final int[] getDataCharacterCounters() {
    }

    public final int[] getDecodeFinderCounters() {
    }

    public final int[] getEvenCounts() {
    }

    public final float[] getEvenRoundingErrors() {
    }

    public final int[] getOddCounts() {
    }

    public final float[] getOddRoundingErrors() {
    }
}
