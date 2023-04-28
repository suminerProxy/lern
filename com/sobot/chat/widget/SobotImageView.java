package com.sobot.chat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotImageView extends ImageView {
    private int mBorderColor;
    private Paint mBorderPaint;
    private int mBorderWidth;
    private int mCornerRadius;
    private int mDefaultImageId;
    private boolean mIsCircle;
    private boolean mIsSquare;
    private OnDrawableChangedCallback mOnDrawableChangedCallback;
    private RectF mRect;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnDrawableChangedCallback {
        void onDrawableChanged(Drawable drawable);
    }

    public SobotImageView(Context context) {
    }

    private int dip2px(float f2) {
    }

    public static RoundedBitmapDrawable getCircleDrawable(Context context, Bitmap bitmap) {
    }

    public static RoundedBitmapDrawable getRoundedDrawable(Context context, Bitmap bitmap, float f2) {
    }

    private void initBorderPaint() {
    }

    private void initCustomAttr(int i2, TypedArray typedArray) {
    }

    private void initCustomAttrs(Context context, AttributeSet attributeSet) {
    }

    private void notifyDrawableChanged(Drawable drawable) {
    }

    private void setDefaultImage() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setCornerRadius(int i2) {
    }

    public void setDrawableChangedCallback(OnDrawableChangedCallback onDrawableChangedCallback) {
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i2) {
    }

    public void setIsCircle(boolean z) {
    }

    public SobotImageView(Context context, AttributeSet attributeSet) {
    }

    public SobotImageView(Context context, AttributeSet attributeSet, int i2) {
    }

    public static RoundedBitmapDrawable getRoundedDrawable(Context context, @DrawableRes int i2, float f2) {
    }

    public static RoundedBitmapDrawable getCircleDrawable(Context context, @DrawableRes int i2) {
    }
}
