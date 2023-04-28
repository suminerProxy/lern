package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {
    public static final double COS_45 = 0.0d;
    public static final float SHADOW_BOTTOM_SCALE = 1.0f;
    public static final float SHADOW_HORIZ_SCALE = 0.5f;
    public static final float SHADOW_MULTIPLIER = 1.5f;
    public static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    @NonNull
    public final RectF contentBounds;
    public float cornerRadius;
    @NonNull
    public final Paint cornerShadowPaint;
    public Path cornerShadowPath;
    private boolean dirty;
    @NonNull
    public final Paint edgeShadowPaint;
    public float maxShadowSize;
    private boolean printedShadowClipWarning;
    public float rawMaxShadowSize;
    public float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    public float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f2, float f3, float f4) {
    }

    private void buildComponents(@NonNull Rect rect) {
    }

    private void buildShadowCorners() {
    }

    public static float calculateHorizontalPadding(float f2, float f3, boolean z) {
    }

    public static float calculateVerticalPadding(float f2, float f3, boolean z) {
    }

    private void drawShadow(@NonNull Canvas canvas) {
    }

    private static int toEven(float f2) {
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    public float getCornerRadius() {
    }

    public float getMaxShadowSize() {
    }

    public float getMinHeight() {
    }

    public float getMinWidth() {
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
    }

    public float getShadowSize() {
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    public void setAddPaddingForCorners(boolean z) {
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setCornerRadius(float f2) {
    }

    public void setMaxShadowSize(float f2) {
    }

    public final void setRotation(float f2) {
    }

    public void setShadowSize(float f2, float f3) {
    }

    public void setShadowSize(float f2) {
    }
}
