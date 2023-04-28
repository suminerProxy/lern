package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> ANIMATION_FRACTION = null;
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> COMPLETE_END_FRACTION = null;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = null;
    private static final int[] DELAY_TO_EXPAND_IN_MS = null;
    private static final int[] DELAY_TO_FADE_IN_MS = null;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    public Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final FastOutSlowInInterpolator interpolator;

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ CircularIndeterminateAnimatorDelegate this$0;

        public AnonymousClass1(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ CircularIndeterminateAnimatorDelegate this$0;

        public AnonymousClass2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        public AnonymousClass3(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        public AnonymousClass4(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
        }
    }

    public CircularIndeterminateAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
    }

    public static /* synthetic */ int access$000(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    public static /* synthetic */ int access$002(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, int i2) {
    }

    public static /* synthetic */ BaseProgressIndicatorSpec access$100(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    public static /* synthetic */ float access$200(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    public static /* synthetic */ float access$300(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
    }

    public static /* synthetic */ void access$400(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, float f2) {
    }

    private float getAnimationFraction() {
    }

    private float getCompleteEndFraction() {
    }

    private void maybeInitializeAnimators() {
    }

    private void maybeUpdateSegmentColors(int i2) {
    }

    private void setCompleteEndFraction(float f2) {
    }

    private void updateSegmentPositions(int i2) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @VisibleForTesting
    public void resetPropertiesForNewStart() {
    }

    @VisibleForTesting
    public void setAnimationFraction(float f2) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }
}
