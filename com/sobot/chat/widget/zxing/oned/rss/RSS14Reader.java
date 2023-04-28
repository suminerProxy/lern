package com.sobot.chat.widget.zxing.oned.rss;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private static final int[][] FINDER_PATTERNS = null;
    private static final int[] INSIDE_GSUM = null;
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = null;
    private static final int[] INSIDE_ODD_WIDEST = null;
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = null;
    private static final int[] OUTSIDE_GSUM = null;
    private static final int[] OUTSIDE_ODD_WIDEST = null;
    private final List<Pair> possibleLeftPairs;
    private final List<Pair> possibleRightPairs;

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
    }

    private void adjustOddEvenCounts(boolean z, int i2) throws NotFoundException {
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
    }

    private static Result constructResult(Pair pair, Pair pair2) {
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z) throws NotFoundException {
    }

    private Pair decodePair(BitArray bitArray, boolean z, int i2, Map<DecodeHintType, ?> map) {
    }

    private int[] findFinderPattern(BitArray bitArray, boolean z) throws NotFoundException {
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i2, boolean z, int[] iArr) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader, com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }
}
