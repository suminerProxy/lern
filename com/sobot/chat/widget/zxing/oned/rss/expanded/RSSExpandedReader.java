package com.sobot.chat.widget.zxing.oned.rss.expanded;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import com.sobot.chat.widget.zxing.oned.rss.AbstractRSSReader;
import com.sobot.chat.widget.zxing.oned.rss.DataCharacter;
import com.sobot.chat.widget.zxing.oned.rss.FinderPattern;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int[] EVEN_TOTAL_SUBSET = null;
    private static final int[][] FINDER_PATTERNS = null;
    private static final int[][] FINDER_PATTERN_SEQUENCES = null;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int[] GSUM = null;
    private static final int MAX_PAIRS = 11;
    private static final int[] SYMBOL_WIDEST = null;
    private static final int[][] WEIGHTS = null;
    private final List<ExpandedPair> pairs;
    private final List<ExpandedRow> rows;
    private final int[] startEnd;
    private boolean startFromEven;

    private void adjustOddEvenCounts(int i2) throws NotFoundException {
    }

    private boolean checkChecksum() {
    }

    private List<ExpandedPair> checkRows(boolean z) {
    }

    public static Result constructResult(List<ExpandedPair> list) throws NotFoundException, FormatException {
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i2) throws NotFoundException {
    }

    private static int getNextSecondBar(BitArray bitArray, int i2) {
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z, boolean z2) {
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i2, boolean z) {
    }

    private static void removePartialRows(Collection<ExpandedPair> collection, Collection<ExpandedRow> collection2) {
    }

    private static void reverseCounters(int[] iArr) {
    }

    private void storeRow(int i2, boolean z) {
    }

    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
    }

    public List<ExpandedPair> decodeRow2pairs(int i2, BitArray bitArray) throws NotFoundException {
    }

    public List<ExpandedRow> getRows() {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader, com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }

    public ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i2) throws NotFoundException {
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i2) throws NotFoundException {
    }
}
