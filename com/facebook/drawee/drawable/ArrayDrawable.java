package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ArrayDrawable extends Drawable implements Drawable.Callback, TransformCallback, TransformAwareDrawable {
    private final DrawableParent[] mDrawableParents;
    private final DrawableProperties mDrawableProperties;
    private boolean mIsMutated;
    private boolean mIsStateful;
    private boolean mIsStatefulCalculated;
    private final Drawable[] mLayers;
    private final Rect mTmpRect;
    @Nullable
    private TransformCallback mTransformCallback;

    /* renamed from: com.facebook.drawee.drawable.ArrayDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DrawableParent {
        public final /* synthetic */ ArrayDrawable this$0;
        public final /* synthetic */ int val$index;

        public AnonymousClass1(final ArrayDrawable this$0, final int val$index) {
        }

        @Override // com.facebook.drawee.drawable.DrawableParent
        public Drawable getDrawable() {
        }

        @Override // com.facebook.drawee.drawable.DrawableParent
        public Drawable setDrawable(Drawable newDrawable) {
        }
    }

    public ArrayDrawable(Drawable[] layers) {
    }

    private DrawableParent createDrawableParentForIndex(final int index) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Nullable
    public Drawable getDrawable(int index) {
    }

    public DrawableParent getDrawableParentForIndex(int index) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getNumberOfLayers() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF bounds) {
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix transform) {
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
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
    }

    @Nullable
    public Drawable setDrawable(int index, @Nullable Drawable drawable) {
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
