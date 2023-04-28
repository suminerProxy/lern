package com.sobot.chat.widget.zxing.util;

import android.content.Intent;
import android.net.Uri;
import com.sobot.chat.widget.zxing.BarcodeFormat;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DecodeFormatManager {
    public static final Set<BarcodeFormat> AZTEC_FORMATS = null;
    private static final Pattern COMMA_PATTERN = null;
    public static final Set<BarcodeFormat> DATA_MATRIX_FORMATS = null;
    private static final Map<String, Set<BarcodeFormat>> FORMATS_FOR_MODE = null;
    public static final Set<BarcodeFormat> INDUSTRIAL_FORMATS = null;
    public static final Set<BarcodeFormat> ONE_D_FORMATS = null;
    public static final Set<BarcodeFormat> PDF417_FORMATS = null;
    public static final Set<BarcodeFormat> PRODUCT_FORMATS = null;
    public static final Set<BarcodeFormat> QR_CODE_FORMATS = null;

    private DecodeFormatManager() {
    }

    public static Set<BarcodeFormat> parseDecodeFormats(Intent intent) {
    }

    public static Set<BarcodeFormat> parseDecodeFormats(Uri uri) {
    }

    private static Set<BarcodeFormat> parseDecodeFormats(Iterable<String> iterable, String str) {
    }
}
