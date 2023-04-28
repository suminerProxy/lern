package com.google.android.material.elevation;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
    }

    private boolean isThemeSurfaceColor(@ColorInt int i2) {
    }

    public int calculateOverlayAlpha(float f2) {
    }

    public float calculateOverlayAlphaFraction(float f2) {
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i2, float f2, @NonNull View view) {
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i2, float f2, @NonNull View view) {
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f2, @NonNull View view) {
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
    }

    @ColorInt
    public int getThemeSurfaceColor() {
    }

    public boolean isThemeElevationOverlayEnabled() {
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i2, float f2) {
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i2, float f2) {
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f2) {
    }
}
