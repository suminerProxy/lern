package com.sobot.chat.widget.zxing;

import com.sobot.chat.widget.zxing.common.BitArray;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class Binarizer {
    private final LuminanceSource source;

    public Binarizer(LuminanceSource luminanceSource) {
    }

    public abstract Binarizer createBinarizer(LuminanceSource luminanceSource);

    public abstract BitMatrix getBlackMatrix() throws NotFoundException;

    public abstract BitArray getBlackRow(int i2, BitArray bitArray) throws NotFoundException;

    public final int getHeight() {
    }

    public final LuminanceSource getLuminanceSource() {
    }

    public final int getWidth() {
    }
}
