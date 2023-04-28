package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.common.BitArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class EAN13Reader extends UPCEANReader {
    public static final int[] FIRST_DIGIT_ENCODINGS = null;
    private final int[] decodeMiddleCounters;

    private static void determineFirstDigit(StringBuilder sb, int i2) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public BarcodeFormat getBarcodeFormat() {
    }
}
