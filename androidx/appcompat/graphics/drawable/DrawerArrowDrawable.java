package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = 0.0f;
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
    }

    private static float lerp(float f2, float f3, float f4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public float getArrowHeadLength() {
    }

    public float getArrowShaftLength() {
    }

    public float getBarLength() {
    }

    public float getBarThickness() {
    }

    @ColorInt
    public int getColor() {
    }

    public int getDirection() {
    }

    public float getGapSize() {
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

    public final Paint getPaint() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getProgress() {
    }

    public boolean isSpinEnabled() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setArrowHeadLength(float f2) {
    }

    public void setArrowShaftLength(float f2) {
    }

    public void setBarLength(float f2) {
    }

    public void setBarThickness(float f2) {
    }

    public void setColor(@ColorInt int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDirection(int i2) {
    }

    public void setGapSize(float f2) {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setSpinEnabled(boolean z) {
    }

    public void setVerticalMirror(boolean z) {
    }
}
