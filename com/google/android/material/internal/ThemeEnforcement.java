package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ThemeEnforcement {
    private static final int[] APPCOMPAT_CHECK_ATTRS = null;
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final int[] MATERIAL_CHECK_ATTRS = null;
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(@NonNull Context context) {
    }

    private static void checkCompatibleTheme(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    public static void checkMaterialTheme(@NonNull Context context) {
    }

    private static void checkTextAppearance(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @Nullable @StyleableRes int... iArr2) {
    }

    private static void checkTheme(@NonNull Context context, @NonNull int[] iArr, String str) {
    }

    public static boolean isAppCompatTheme(@NonNull Context context) {
    }

    private static boolean isCustomTextAppearanceValid(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @NonNull @StyleableRes int... iArr2) {
    }

    public static boolean isMaterialTheme(@NonNull Context context) {
    }

    private static boolean isTheme(@NonNull Context context, @NonNull int[] iArr) {
    }

    @NonNull
    public static TypedArray obtainStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @StyleableRes int... iArr2) {
    }

    public static TintTypedArray obtainTintedStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @StyleableRes int... iArr2) {
    }
}
