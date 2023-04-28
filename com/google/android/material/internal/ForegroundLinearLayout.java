package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {
    @Nullable
    private Drawable foreground;
    public boolean foregroundBoundsChanged;
    private int foregroundGravity;
    public boolean mForegroundInPadding;
    private final Rect overlayBounds;
    private final Rect selfBounds;

    public ForegroundLinearLayout(@NonNull Context context) {
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
    }

    @Override // android.view.View
    public int getForegroundGravity() {
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
