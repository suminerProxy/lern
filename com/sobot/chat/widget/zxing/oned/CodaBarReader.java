package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class CodaBarReader extends OneDReader {
    public static final char[] ALPHABET = null;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    public static final int[] CHARACTER_ENCODINGS = null;
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final char[] STARTEND_ENCODING = null;
    private int counterLength;
    private int[] counters;
    private final StringBuilder decodeRowResult;

    public static boolean arrayContains(char[] cArr, char c) {
    }

    private void counterAppend(int i2) {
    }

    private int findStartPattern() throws NotFoundException {
    }

    private void setCounters(BitArray bitArray) throws NotFoundException {
    }

    private int toNarrowWidePattern(int i2) {
    }

    private void validatePattern(int i2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
