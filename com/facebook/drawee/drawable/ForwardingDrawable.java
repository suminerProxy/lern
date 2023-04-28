package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingDrawable extends Drawable implements Drawable.Callback, TransformCallback, TransformAwareDrawable, DrawableParent {
    private static final Matrix sTempTransform = null;
    @Nullable
    private Drawable mCurrentDelegate;
    private final DrawableProperties mDrawableProperties;
    @Nullable
    public TransformCallback mTransformCallback;

    public ForwardingDrawable(@Nullable Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable getCurrent() {
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    @Nullable
    public Drawable getDrawable() {
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

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
    }

    public void getParentTransform(Matrix transform) {
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF bounds) {
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix transform) {
    }

    public void getTransformedBounds(RectF outBounds) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    @Nullable
    public Drawable setCurrent(@Nullable Drawable newDelegate) {
    }

    @Nullable
    public Drawable setCurrentWithoutInvalidate(@Nullable Drawable newDelegate) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    @Nullable
    public Drawable setDrawable(@Nullable Drawable newDrawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filterBitmap) {
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float x, float y) {
    }

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public void setTransformCallback(TransformCallback transformCallback) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
    }
}
