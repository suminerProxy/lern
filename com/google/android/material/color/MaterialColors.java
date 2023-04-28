package com.google.android.material.color;

import android.content.Context;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i2, @IntRange(from = 0, to = 255) int i3) {
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i2) {
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i2, @AttrRes int i3) {
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i2, String str) {
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i2, @AttrRes int i3, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i2, @ColorInt int i3) {
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i2, @ColorInt int i3) {
    }

    @ColorInt
    public static int layer(@ColorInt int i2, @ColorInt int i3, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @ColorInt
    public static int layer(@ColorInt int i2, @ColorInt int i3) {
    }
}
