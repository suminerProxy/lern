package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.EncodeHintType;
import com.sobot.chat.widget.zxing.Writer;
import com.sobot.chat.widget.zxing.WriterException;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UPCAWriter implements Writer {
    private final EAN13Writer subWriter;

    @Override // com.sobot.chat.widget.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
    }

    @Override // com.sobot.chat.widget.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
    }
}
