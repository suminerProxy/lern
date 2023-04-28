package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final int[] COLORS = null;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final Interpolator LINEAR_INTERPOLATOR = null;
    private static final Interpolator MATERIAL_INTERPOLATOR = null;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    public boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    public float mRotationCount;

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ CircularProgressDrawable this$0;
        public final /* synthetic */ Ring val$ring;

        public AnonymousClass1(CircularProgressDrawable circularProgressDrawable, Ring ring) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Animator.AnimatorListener {
        public final /* synthetic */ CircularProgressDrawable this$0;
        public final /* synthetic */ Ring val$ring;

        public AnonymousClass2(CircularProgressDrawable circularProgressDrawable, Ring ring) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface ProgressDrawableSize {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Ring {
        public int mAlpha;
        public Path mArrow;
        public int mArrowHeight;
        public final Paint mArrowPaint;
        public float mArrowScale;
        public int mArrowWidth;
        public final Paint mCirclePaint;
        public int mColorIndex;
        public int[] mColors;
        public int mCurrentColor;
        public float mEndTrim;
        public final Paint mPaint;
        public float mRingCenterRadius;
        public float mRotation;
        public boolean mShowArrow;
        public float mStartTrim;
        public float mStartingEndTrim;
        public float mStartingRotation;
        public float mStartingStartTrim;
        public float mStrokeWidth;
        public final RectF mTempBounds;

        public void draw(Canvas canvas, Rect rect) {
        }

        public void drawTriangle(Canvas canvas, float f2, float f3, RectF rectF) {
        }

        public int getAlpha() {
        }

        public float getArrowHeight() {
        }

        public float getArrowScale() {
        }

        public float getArrowWidth() {
        }

        public int getBackgroundColor() {
        }

        public float getCenterRadius() {
        }

        public int[] getColors() {
        }

        public float getEndTrim() {
        }

        public int getNextColor() {
        }

        public int getNextColorIndex() {
        }

        public float getRotation() {
        }

        public boolean getShowArrow() {
        }

        public float getStartTrim() {
        }

        public int getStartingColor() {
        }

        public float getStartingEndTrim() {
        }

        public float getStartingRotation() {
        }

        public float getStartingStartTrim() {
        }

        public Paint.Cap getStrokeCap() {
        }

        public float getStrokeWidth() {
        }

        public void goToNextColor() {
        }

        public void resetOriginals() {
        }

        public void setAlpha(int i2) {
        }

        public void setArrowDimensions(float f2, float f3) {
        }

        public void setArrowScale(float f2) {
        }

        public void setBackgroundColor(int i2) {
        }

        public void setCenterRadius(float f2) {
        }

        public void setColor(int i2) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }

        public void setColorIndex(int i2) {
        }

        public void setColors(@NonNull int[] iArr) {
        }

        public void setEndTrim(float f2) {
        }

        public void setRotation(float f2) {
        }

        public void setShowArrow(boolean z) {
        }

        public void setStartTrim(float f2) {
        }

        public void setStrokeCap(Paint.Cap cap) {
        }

        public void setStrokeWidth(float f2) {
        }

        public void storeOriginals() {
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
    }

    private void applyFinishTranslation(float f2, Ring ring) {
    }

    private int evaluateColorChange(float f2, int i2, int i3) {
    }

    private float getRotation() {
    }

    private void setRotation(float f2) {
    }

    private void setSizeParameters(float f2, float f3, float f4, float f5) {
    }

    private void setupAnimators() {
    }

    public void applyTransformation(float f2, Ring ring, boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public boolean getArrowEnabled() {
    }

    public float getArrowHeight() {
    }

    public float getArrowScale() {
    }

    public float getArrowWidth() {
    }

    public int getBackgroundColor() {
    }

    public float getCenterRadius() {
    }

    @NonNull
    public int[] getColorSchemeColors() {
    }

    public float getEndTrim() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public float getProgressRotation() {
    }

    public float getStartTrim() {
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
    }

    public float getStrokeWidth() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setArrowDimensions(float f2, float f3) {
    }

    public void setArrowEnabled(boolean z) {
    }

    public void setArrowScale(float f2) {
    }

    public void setBackgroundColor(int i2) {
    }

    public void setCenterRadius(float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
    }

    public void setProgressRotation(float f2) {
    }

    public void setStartEndTrim(float f2, float f3) {
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
    }

    public void setStrokeWidth(float f2) {
    }

    public void setStyle(int i2) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    public void updateRingColor(float f2, Ring ring) {
    }
}
