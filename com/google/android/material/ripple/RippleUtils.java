package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET = null;
    private static final int[] FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] HOVERED_STATE_SET = null;
    @VisibleForTesting
    public static final String LOG_TAG = null;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int[] SELECTED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = null;
    private static final int[] SELECTED_HOVERED_STATE_SET = null;
    private static final int[] SELECTED_PRESSED_STATE_SET = null;
    private static final int[] SELECTED_STATE_SET = null;
    @VisibleForTesting
    public static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    public static final boolean USE_FRAMEWORK_RIPPLE = false;

    private RippleUtils() {
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
    }

    @ColorInt
    @TargetApi(21)
    private static int doubleAlpha(@ColorInt int i2) {
    }

    @ColorInt
    private static int getColorForState(@Nullable ColorStateList colorStateList, int[] iArr) {
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
    }
}
