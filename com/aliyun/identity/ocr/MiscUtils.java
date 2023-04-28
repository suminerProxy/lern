package com.aliyun.identity.ocr;

import android.graphics.Bitmap;
import com.aliyun.identity.ocr.model.AlgorithmOcrResult;
import com.aliyun.identity.platform.api.IdentityOcrInfo;
import java.util.Date;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MiscUtils {
    public static final int IDCARD_OCR_ITEM_ADDRESS = 4;
    public static final int IDCARD_OCR_ITEM_AUTHORITY = 0;
    public static final int IDCARD_OCR_ITEM_BIRTHDATE = 3;
    public static final int IDCARD_OCR_ITEM_IDCARD_DATE = 1;
    public static final int IDCARD_OCR_ITEM_NAME_INDEX = 0;
    public static final int IDCARD_OCR_ITEM_NATIONALITY = 2;
    public static final int IDCARD_OCR_ITEM_NO_INDEX = 5;
    public static final int IDCARD_OCR_ITEM_SEX_INDEX = 1;

    public static IdentityOcrInfo copyOcrInfo(AlgorithmOcrResult algorithmOcrResult, boolean z) {
    }

    public static Bitmap createRoundBitmap(Bitmap bitmap, int i2, int i3, int i4) {
    }

    public static Bitmap createTextMarkBitmap(String str, int i2, int i3, int i4, int i5, int i6) {
    }

    public static boolean isBankCardNoValid(String str) {
    }

    public static boolean isIdCardNameValid(String str) {
    }

    public static boolean isIdCardNoValid(String str) {
    }

    public static boolean isIdcardOutDate(String str, IdentityOcrInfo identityOcrInfo) {
    }

    public static boolean isOcrBackResValid(AlgorithmOcrResult algorithmOcrResult) {
    }

    public static boolean isOcrBankResValid(AlgorithmOcrResult algorithmOcrResult) {
    }

    public static boolean isOcrFrontResValid(AlgorithmOcrResult algorithmOcrResult) {
    }

    public static <T> T json2Object(String str, Class<T> cls) {
    }

    public static Bitmap mergeBitmap(Bitmap bitmap, Bitmap bitmap2) {
    }

    public static Date parseDate(String str) {
    }

    private static boolean validateCheckNumber(String str) {
    }
}
