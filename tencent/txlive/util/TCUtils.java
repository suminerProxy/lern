package tencent.txlive.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCUtils {
    public static final int FILTERTYPE_NONE = 0;
    public static final int FILTERTYPE_bailan = 5;
    public static final int FILTERTYPE_biaozhun = 1;
    public static final int FILTERTYPE_chaotuo = 7;
    public static final int FILTERTYPE_chunzhen = 4;
    public static final int FILTERTYPE_fennen = 12;
    public static final int FILTERTYPE_huaijiu = 13;
    public static final int FILTERTYPE_landiao = 14;
    public static final int FILTERTYPE_langman = 9;
    public static final int FILTERTYPE_qingliang = 15;
    public static final int FILTERTYPE_qingxin = 10;
    public static final int FILTERTYPE_rixi = 16;
    public static final int FILTERTYPE_weimei = 11;
    public static final int FILTERTYPE_xiangfen = 8;
    public static final int FILTERTYPE_yinghong = 2;
    public static final int FILTERTYPE_yuanqi = 6;
    public static final int FILTERTYPE_yunshang = 3;

    public static String EnumGenderToString(int i2) {
    }

    public static String asTwoDigit(long j2) {
    }

    private static Bitmap blurBitmap(Bitmap bitmap, Context context) {
    }

    public static boolean checkFloatPermission(Context context, int i2) {
    }

    @TargetApi(19)
    public static void checkFloatWindowPermission(Context context) throws IOException {
    }

    @TargetApi(19)
    public static boolean checkPermission(@NonNull Context context, String str) {
    }

    public static boolean checkRecordPermission(Activity activity) {
    }

    public static Bitmap createCircleImage(Bitmap bitmap, int i2) {
    }

    private static Bitmap decodeResource(Resources resources, int i2) {
    }

    public static int dp2pxConvertInt(Context context, float f2) {
    }

    public static String duration(long j2) {
    }

    public static int filtNumber(int i2, int i3, int i4) {
    }

    public static String formattedTime(long j2) {
    }

    public static int getCharacterNum(String str) {
    }

    public static int getChineseNum(String str) {
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
    }

    public static Bitmap getFilterBitmap(Resources resources, int i2) {
    }

    public static String getGreenFileName(int i2) {
    }

    public static String getLimitString(String str, int i2) {
    }

    public static String getLimitStringWithoutNode(String str, int i2) {
    }

    @TargetApi(19)
    public static String getPath(Context context, Uri uri) {
    }

    public static boolean isDownloadsDocument(Uri uri) {
    }

    public static boolean isExternalStorageDocument(Uri uri) {
    }

    public static boolean isGooglePhotosUri(Uri uri) {
    }

    public static boolean isMediaDocument(Uri uri) {
    }

    public static boolean isNetworkAvailable(Context context) {
    }

    public static boolean isPasswordValid(String str) {
    }

    public static boolean isUsernameVaild(String str) {
    }

    public static String md5(String str) {
    }

    public static void showKickOut(Context context) {
    }

    public static float sp2px(Context context, float f2) {
    }
}
