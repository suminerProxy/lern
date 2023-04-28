package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NativeRoundingFilter {
    public static void addRoundedCorners(Bitmap bitmap, int radiusTopLeft, int radiusTopRight, int radiusBottomRight, int radiusBottomLeft) {
    }

    @DoNotStrip
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int radiusTopLeft, int radiusTopRight, int radiusBottomRight, int radiusBottomLeft);

    @DoNotStrip
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean antiAliased);

    @DoNotStrip
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean antiAliased);

    @DoNotStrip
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int colorARGB, int borderWidthPx, boolean antiAliased);

    public static void toCircle(Bitmap bitmap) {
    }

    public static void toCircleFast(Bitmap bitmap) {
    }

    public static void toCircleWithBorder(Bitmap bitmap, int colorARGB, int borderWidthPx, boolean antiAliased) {
    }

    @DoNotStrip
    public static void toCircle(Bitmap bitmap, boolean antiAliased) {
    }

    @DoNotStrip
    public static void toCircleFast(Bitmap bitmap, boolean antiAliased) {
    }
}
