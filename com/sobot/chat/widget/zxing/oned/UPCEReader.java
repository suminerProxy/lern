package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UPCEReader extends UPCEANReader {
    private static final int[] MIDDLE_END_PATTERN = null;
    public static final int[][] NUMSYS_AND_CHECK_DIGIT_PATTERNS = null;
    private final int[] decodeMiddleCounters;

    public static String convertUPCEtoUPCA(String str) {
    }

    private static void determineNumSysAndCheckDigit(StringBuilder sb, int i2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public boolean checkChecksum(String str) throws FormatException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public int[] decodeEnd(BitArray bitArray, int i2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public BarcodeFormat getBarcodeFormat() {
    }
}
