package com.sobot.chat.widget.zxing.aztec.encoder;

import com.sobot.chat.widget.zxing.common.BitArray;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.reedsolomon.GenericGF;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = null;

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i2, int i3) {
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i2, int i3) {
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i2, BitArray bitArray) {
    }

    public static AztecCode encode(byte[] bArr) {
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i2, int i3) {
    }

    public static BitArray generateModeMessage(boolean z, int i2, int i3) {
    }

    private static GenericGF getGF(int i2) {
    }

    public static BitArray stuffBits(BitArray bitArray, int i2) {
    }

    private static int totalBitsInLayer(int i2, boolean z) {
    }

    public static AztecCode encode(byte[] bArr, int i2, int i3) {
    }
}
