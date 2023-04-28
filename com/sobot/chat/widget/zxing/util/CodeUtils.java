package com.sobot.chat.widget.zxing.util;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.EncodeHintType;
import com.sobot.chat.widget.zxing.RGBLuminanceSource;
import com.sobot.chat.widget.zxing.Result;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CodeUtils {
    private CodeUtils() {
    }

    private static Bitmap addCode(Bitmap bitmap, String str, int i2, @ColorInt int i3, int i4) {
    }

    private static Bitmap addLogo(Bitmap bitmap, Bitmap bitmap2) {
    }

    private static Bitmap compressBitmap(String str) {
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i2, int i3) {
    }

    public static Bitmap createQRCode(String str, int i2) {
    }

    private static RGBLuminanceSource getRGBLuminanceSource(@NonNull Bitmap bitmap) {
    }

    public static String parseCode(String str) {
    }

    public static Result[] parseMultiQRCode(String str) {
    }

    public static String parseQRCode(String str) {
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) {
    }

    public static Bitmap createQRCode(String str, int i2, Bitmap bitmap) {
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map, boolean z) {
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map, boolean z, int i4, @ColorInt int i5) {
    }

    public static Result[] parseMultiQRCode(String str, Map<DecodeHintType, ?> map) {
    }

    public static String parseQRCode(String str, Map<DecodeHintType, ?> map) {
    }

    public static Bitmap createQRCode(String str, int i2, Bitmap bitmap, Map<EncodeHintType, ?> map) {
    }

    public static String parseCode(String str, Map<DecodeHintType, Object> map) {
    }
}
