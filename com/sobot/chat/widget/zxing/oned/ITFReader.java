package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ITFReader extends OneDReader {
    private static final int[] DEFAULT_ALLOWED_LENGTHS = null;
    private static final int[][] END_PATTERN_REVERSED = null;
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.5f;
    private static final int N = 1;
    private static final int[][] PATTERNS = null;
    private static final int[] START_PATTERN = null;
    private static final int W = 3;
    private static final int w = 2;
    private int narrowLineWidth;

    private static int decodeDigit(int[] iArr) throws NotFoundException {
    }

    private int[] decodeEnd(BitArray bitArray) throws NotFoundException {
    }

    private static void decodeMiddle(BitArray bitArray, int i2, int i3, StringBuilder sb) throws NotFoundException {
    }

    private int[] decodeStart(BitArray bitArray) throws NotFoundException {
    }

    private static int[] findGuardPattern(BitArray bitArray, int i2, int[] iArr) throws NotFoundException {
    }

    private static int skipWhiteSpace(BitArray bitArray) throws NotFoundException {
    }

    private void validateQuietZone(BitArray bitArray, int i2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
    }
}
