package com.sobot.chat.widget.zxing;

import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException;

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException;
}
