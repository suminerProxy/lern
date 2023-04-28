package com.sobot.chat.widget.zxing.common;

import com.sobot.chat.widget.zxing.Binarizer;
import com.sobot.chat.widget.zxing.LuminanceSource;
import com.sobot.chat.widget.zxing.NotFoundException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    private static final byte[] EMPTY = null;
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
    }

    private static int estimateBlackPoint(int[] iArr) throws NotFoundException {
    }

    private void initArrays(int i2) {
    }

    @Override // com.sobot.chat.widget.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
    }

    @Override // com.sobot.chat.widget.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.Binarizer
    public BitArray getBlackRow(int i2, BitArray bitArray) throws NotFoundException {
    }
}
