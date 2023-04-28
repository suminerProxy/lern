package com.facebook.imagepipeline.filter;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class IterativeBoxBlurFilter {
    private static final String TAG = "IterativeBoxBlurFilter";

    private static int bound(int x, int l2, int h2) {
    }

    public static void boxBlurBitmapInPlace(final Bitmap bitmap, final int iterations, final int radius) {
    }

    private static void fastBoxBlur(final Bitmap bitmap, final int iterations, final int radius) {
    }

    private static void internalHorizontalBlur(int[] pixels, int[] outRow, int w, int row, int diameter, int[] div) {
    }

    private static void internalVerticalBlur(int[] pixels, int[] outCol, int w, int h2, int col, int diameter, int[] div) {
    }
}
