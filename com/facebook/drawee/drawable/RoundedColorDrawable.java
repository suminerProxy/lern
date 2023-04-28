package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundedColorDrawable extends Drawable implements Rounded {
    private int mAlpha;
    private int mBorderColor;
    @VisibleForTesting
    public final Path mBorderPath;
    @VisibleForTesting
    public final float[] mBorderRadii;
    private float mBorderWidth;
    private int mColor;
    @Nullable
    @VisibleForTesting
    public float[] mInsideBorderRadii;
    private boolean mIsCircle;
    private float mPadding;
    @VisibleForTesting
    public final Paint mPaint;
    private boolean mPaintFilterBitmap;
    @VisibleForTesting
    public final Path mPath;
    private final float[] mRadii;
    private boolean mScaleDownInsideBorders;
    private final RectF mTempRect;

    public RoundedColorDrawable(int color) {
    }

    @TargetApi(11)
    public static RoundedColorDrawable fromColorDrawable(ColorDrawable colorDrawable) {
    }

    private void updatePath() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public int getBorderColor() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getBorderWidth() {
    }

    public int getColor() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getPadding() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public boolean getPaintFilterBitmap() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float[] getRadii() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public boolean getScaleDownInsideBorders() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public boolean isCircle() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setBorder(int color, float width) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setCircle(boolean isCircle) {
    }

    public void setColor(int color) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setPadding(float padding) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setPaintFilterBitmap(boolean paintFilterBitmap) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setRadii(float[] radii) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setRadius(float radius) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setScaleDownInsideBorders(boolean scaleDownInsideBorders) {
    }

    public RoundedColorDrawable(float[] radii, int color) {
    }

    public RoundedColorDrawable(float radius, int color) {
    }
}
