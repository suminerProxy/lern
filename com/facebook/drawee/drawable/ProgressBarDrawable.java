package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ProgressBarDrawable extends Drawable implements CloneableDrawable {
    private int mBackgroundColor;
    private int mBarWidth;
    private int mColor;
    private boolean mHideWhenZero;
    private boolean mIsVertical;
    private int mLevel;
    private int mPadding;
    private final Paint mPaint;
    private final Path mPath;
    private int mRadius;
    private final RectF mRect;

    private void drawBar(Canvas canvas, int color) {
    }

    private void drawHorizontalBar(Canvas canvas, int level, int color) {
    }

    private void drawVerticalBar(Canvas canvas, int level, int color) {
    }

    @Override // com.facebook.drawee.drawable.CloneableDrawable
    public Drawable cloneDrawable() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public int getBackgroundColor() {
    }

    public int getBarWidth() {
    }

    public int getColor() {
    }

    public boolean getHideWhenZero() {
    }

    public boolean getIsVertical() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
    }

    public int getRadius() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    public void setBackgroundColor(int backgroundColor) {
    }

    public void setBarWidth(int barWidth) {
    }

    public void setColor(int color) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
    }

    public void setHideWhenZero(boolean hideWhenZero) {
    }

    public void setIsVertical(boolean isVertical) {
    }

    public void setPadding(int padding) {
    }

    public void setRadius(int radius) {
    }
}
