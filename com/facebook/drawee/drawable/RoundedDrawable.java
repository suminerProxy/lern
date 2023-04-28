package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class RoundedDrawable extends Drawable implements Rounded, TransformAwareDrawable {
    @VisibleForTesting
    public final RectF mBitmapBounds;
    public int mBorderColor;
    public final Path mBorderPath;
    @VisibleForTesting
    public final float[] mBorderRadii;
    public float mBorderWidth;
    @VisibleForTesting
    public final Matrix mBoundsTransform;
    private final float[] mCornerRadii;
    private final Drawable mDelegate;
    @VisibleForTesting
    public final RectF mDrawableBounds;
    @Nullable
    @VisibleForTesting
    public RectF mInsideBorderBounds;
    @Nullable
    @VisibleForTesting
    public float[] mInsideBorderRadii;
    @Nullable
    @VisibleForTesting
    public Matrix mInsideBorderTransform;
    @VisibleForTesting
    public final Matrix mInverseParentTransform;
    public boolean mIsCircle;
    private boolean mIsPathDirty;
    public boolean mIsShaderTransformDirty;
    private float mPadding;
    private boolean mPaintFilterBitmap;
    @VisibleForTesting
    public final Matrix mParentTransform;
    public final Path mPath;
    @VisibleForTesting
    public final Matrix mPrevBoundsTransform;
    @Nullable
    @VisibleForTesting
    public Matrix mPrevInsideBorderTransform;
    @VisibleForTesting
    public final Matrix mPrevParentTransform;
    @VisibleForTesting
    public final RectF mPrevRootBounds;
    public boolean mRadiiNonZero;
    @VisibleForTesting
    public final RectF mRootBounds;
    private boolean mScaleDownInsideBorders;
    @VisibleForTesting
    public final Matrix mTransform;
    @Nullable
    private TransformCallback mTransformCallback;

    public RoundedDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public int getBorderColor() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getBorderWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
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

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int color, @NonNull PorterDuff.Mode mode) {
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

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public void setTransformCallback(@Nullable TransformCallback transformCallback) {
    }

    @VisibleForTesting
    public boolean shouldRound() {
    }

    public void updatePath() {
    }

    public void updateTransform() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
