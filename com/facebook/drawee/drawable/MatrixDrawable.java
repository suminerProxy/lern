package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MatrixDrawable extends ForwardingDrawable {
    @Nullable
    private Matrix mDrawMatrix;
    private Matrix mMatrix;
    private int mUnderlyingHeight;
    private int mUnderlyingWidth;

    public MatrixDrawable(Drawable drawable, Matrix matrix) {
    }

    private void configureBounds() {
    }

    private void configureBoundsIfUnderlyingChanged() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public Matrix getMatrix() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix transform) {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public Drawable setCurrent(@Nullable Drawable newDelegate) {
    }

    public void setMatrix(Matrix matrix) {
    }
}
