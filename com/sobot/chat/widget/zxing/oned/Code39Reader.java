package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Code39Reader extends OneDReader {
    public static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    public static final int ASTERISK_ENCODING = 148;
    public static final int[] CHARACTER_ENCODINGS = null;
    private final int[] counters;
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
    }

    private static String decodeExtended(CharSequence charSequence) throws FormatException {
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] iArr) throws NotFoundException {
    }

    private static char patternToChar(int i2) throws NotFoundException {
    }

    private static int toNarrowWidePattern(int[] iArr) {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }

    public Code39Reader(boolean z) {
    }

    public Code39Reader(boolean z, boolean z2) {
    }
}
