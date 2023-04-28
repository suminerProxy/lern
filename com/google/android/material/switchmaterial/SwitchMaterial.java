package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.elevation.ElevationOverlayProvider;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] ENABLED_CHECKED_STATES = null;
    @NonNull
    private final ElevationOverlayProvider elevationOverlayProvider;
    @Nullable
    private ColorStateList materialThemeColorsThumbTintList;
    @Nullable
    private ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    public SwitchMaterial(@NonNull Context context) {
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
    }

    public boolean isUseMaterialThemeColors() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    public void setUseMaterialThemeColors(boolean z) {
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
