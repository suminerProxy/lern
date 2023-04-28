package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ClockHandView extends View {
    private static final int ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    @Px
    private final int selectorStrokeWidth;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ClockHandView this$0;

        public AnonymousClass1(ClockHandView clockHandView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ ClockHandView this$0;

        public AnonymousClass2(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f2, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f2, boolean z);
    }

    public ClockHandView(Context context) {
    }

    public static /* synthetic */ void access$000(ClockHandView clockHandView, float f2, boolean z) {
    }

    private void drawSelector(Canvas canvas) {
    }

    private int getDegreesFromXY(float f2, float f3) {
    }

    private Pair<Float, Float> getValuesForAnimation(float f2) {
    }

    private boolean handleTouchInput(float f2, float f3, boolean z, boolean z2, boolean z3) {
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, to = 360.0d) float f2, boolean z) {
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
    }

    public RectF getCurrentSelectorBox() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 360.0d)
    public float getHandRotation() {
    }

    public int getSelectorRadius() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setAnimateOnTouchUp(boolean z) {
    }

    public void setCircleRadius(@Dimension int i2) {
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f2) {
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f2, boolean z) {
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
