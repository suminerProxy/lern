package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundedCornersDrawable extends ForwardingDrawable implements Rounded {
    private int mBorderColor;
    private final Path mBorderPath;
    @VisibleForTesting
    public final float[] mBorderRadii;
    private float mBorderWidth;
    private final RectF mBounds;
    @Nullable
    private RectF mInsideBorderBounds;
    @Nullable
    private Matrix mInsideBorderTransform;
    private boolean mIsCircle;
    private int mOverlayColor;
    private float mPadding;
    @VisibleForTesting
    public final Paint mPaint;
    private boolean mPaintFilterBitmap;
    private final Path mPath;
    private final float[] mRadii;
    private boolean mScaleDownInsideBorders;
    private final RectF mTempRectangle;
    @VisibleForTesting
    public Type mType;

    /* renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type CLIPPING = null;
        public static final Type OVERLAY_COLOR = null;

        private Type(String $enum$name, int $enum$ordinal) {
        }

        public static Type valueOf(String name) {
        }

        public static Type[] values() {
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
    }

    private void updatePath() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public int getBorderColor() {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getBorderWidth() {
    }

    public int getOverlayColor() {
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

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setBorder(int color, float width) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setCircle(boolean isCircle) {
    }

    public void setOverlayColor(int overlayColor) {
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

    public void setType(Type type) {
    }
}
