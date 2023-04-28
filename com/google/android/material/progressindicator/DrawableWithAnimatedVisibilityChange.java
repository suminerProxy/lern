package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = null;
    private List<Animatable2Compat.AnimationCallback> animationCallbacks;
    public AnimatorDurationScaleProvider animatorDurationScaleProvider;
    public final BaseProgressIndicatorSpec baseSpec;
    public final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    public final Paint paint;
    private ValueAnimator showAnimator;
    private int totalAlpha;

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

        public AnonymousClass1(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

        public AnonymousClass2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends Property<DrawableWithAnimatedVisibilityChange, Float> {
        public AnonymousClass3(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f2) {
        }
    }

    public DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
    }

    public static /* synthetic */ void access$000(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
    }

    public static /* synthetic */ boolean access$101(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, boolean z, boolean z2) {
    }

    public static /* synthetic */ void access$200(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
    }

    private void dispatchAnimationEnd() {
    }

    private void dispatchAnimationStart() {
    }

    private void endAnimatorWithoutCallbacks(@NonNull ValueAnimator... valueAnimatorArr) {
    }

    private void maybeInitializeAnimators() {
    }

    private void setHideAnimator(@NonNull ValueAnimator valueAnimator) {
    }

    private void setShowAnimator(@NonNull ValueAnimator valueAnimator) {
    }

    public void clearAnimationCallbacks() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public float getGrowFraction() {
    }

    @NonNull
    public ValueAnimator getHideAnimator() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public boolean hideNow() {
    }

    public boolean isHiding() {
    }

    public boolean isRunning() {
    }

    public boolean isShowing() {
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setGrowFraction(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setInternalAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    @VisibleForTesting
    public void setMockHideAnimationRunning(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @VisibleForTesting
    public void setMockShowAnimationRunning(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
    }
}
