package vi.com.gdi.bgl.android.java;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.SparseArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class EnvDrawText {
    private static final String DEVICE_VIVOX3L = "vivo X3L";
    private static final int FONT_STYLE_BOLD = 1;
    private static final int FONT_STYLE_ITALIC = 2;
    private static final int FONT_STYLE_NORMAL = 0;
    public static int[] buffer;
    private static Bitmap defaultFontBmp;
    public static SparseArray<a> fontCache;

    private static synchronized int[] drawText(String str, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8) {
    }

    private static Bitmap drawTextAlpha(String str, int i2, int i3, int i4) {
    }

    private static synchronized Bitmap drawTextExt(String str, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8) {
    }

    private static Paint.Align getTextAlignedType(int i2) {
    }

    private static Bitmap getTextBitmap() {
    }

    private static short[] getTextSize(String str, int i2, int i3) {
    }

    private static float[] getTextSizeExt(String str, int i2, int i3) {
    }

    private static synchronized boolean isSystemFontChanged() {
    }

    private static native boolean nativeIsBitmapSame(Bitmap bitmap, Bitmap bitmap2);

    public static synchronized void registFontCache(int i2, Typeface typeface) {
    }

    public static synchronized void removeFontCache(int i2) {
    }
}
