package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.EncodeHintType;
import com.sobot.chat.widget.zxing.Writer;
import com.sobot.chat.widget.zxing.WriterException;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    private static final Pattern NUMERIC = null;

    public static int appendPattern(boolean[] zArr, int i2, int[] iArr, boolean z) {
    }

    public static void checkNumeric(String str) {
    }

    private static BitMatrix renderResult(boolean[] zArr, int i2, int i3, int i4) {
    }

    @Override // com.sobot.chat.widget.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
    }

    public Collection<BarcodeFormat> getSupportedWriteFormats() {
    }

    @Override // com.sobot.chat.widget.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) {
    }
}
