package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = 0;
    @Nullable
    private Integer navigationIconTint;

    public MaterialToolbar(@NonNull Context context) {
    }

    private void initBackground(Context context) {
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f2) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
    }

    public void setNavigationIconTint(@ColorInt int i2) {
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
