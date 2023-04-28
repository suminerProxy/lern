package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ScaleTypeDrawable extends ForwardingDrawable {
    @Nullable
    @VisibleForTesting
    public Matrix mDrawMatrix;
    @Nullable
    @VisibleForTesting
    public PointF mFocusPoint;
    @VisibleForTesting
    public ScalingUtils.ScaleType mScaleType;
    @Nullable
    @VisibleForTesting
    public Object mScaleTypeState;
    private Matrix mTempMatrix;
    @VisibleForTesting
    public int mUnderlyingHeight;
    @VisibleForTesting
    public int mUnderlyingWidth;

    public ScaleTypeDrawable(@Nullable Drawable drawable, ScalingUtils.ScaleType scaleType) {
    }

    private void configureBoundsIfUnderlyingChanged() {
    }

    @VisibleForTesting
    public void configureBounds() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Nullable
    public PointF getFocusPoint() {
    }

    public ScalingUtils.ScaleType getScaleType() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix transform) {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    @Nullable
    public Drawable setCurrent(@Nullable Drawable newDelegate) {
    }

    public void setFocusPoint(@Nullable PointF focusPoint) {
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
    }

    public ScaleTypeDrawable(@Nullable Drawable drawable, ScalingUtils.ScaleType scaleType, @Nullable PointF focusPoint) {
    }
}
