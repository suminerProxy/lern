package com.sobot.chat.widget.zxing.common;

import com.sobot.chat.widget.zxing.Binarizer;
import com.sobot.chat.widget.zxing.LuminanceSource;
import com.sobot.chat.widget.zxing.NotFoundException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
    }

    private static int[][] calculateBlackPoints(byte[] bArr, int i2, int i3, int i4, int i5) {
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr, BitMatrix bitMatrix) {
    }

    private static int cap(int i2, int i3) {
    }

    private static void thresholdBlock(byte[] bArr, int i2, int i3, int i4, int i5, BitMatrix bitMatrix) {
    }

    @Override // com.sobot.chat.widget.zxing.common.GlobalHistogramBinarizer, com.sobot.chat.widget.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
    }

    @Override // com.sobot.chat.widget.zxing.common.GlobalHistogramBinarizer, com.sobot.chat.widget.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
    }
}
