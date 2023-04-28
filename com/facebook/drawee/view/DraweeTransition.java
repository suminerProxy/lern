package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@TargetApi(19)
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DraweeTransition extends Transition {
    private static final String PROPNAME_BOUNDS = "draweeTransition:bounds";
    @Nullable
    private final PointF mFromFocusPoint;
    private final ScalingUtils.ScaleType mFromScale;
    @Nullable
    private final PointF mToFocusPoint;
    private final ScalingUtils.ScaleType mToScale;

    /* renamed from: com.facebook.drawee.view.DraweeTransition$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ DraweeTransition this$0;
        public final /* synthetic */ ScalingUtils.InterpolatingScaleType val$scaleType;

        public AnonymousClass1(final DraweeTransition this$0, final ScalingUtils.InterpolatingScaleType val$scaleType) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
        }
    }

    /* renamed from: com.facebook.drawee.view.DraweeTransition$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ DraweeTransition this$0;
        public final /* synthetic */ GenericDraweeView val$draweeView;

        public AnonymousClass2(final DraweeTransition this$0, final GenericDraweeView val$draweeView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }
    }

    public DraweeTransition(ScalingUtils.ScaleType fromScale, ScalingUtils.ScaleType toScale, @Nullable PointF fromFocusPoint, @Nullable PointF toFocusPoint) {
    }

    public static /* synthetic */ ScalingUtils.ScaleType access$000(DraweeTransition draweeTransition) {
    }

    public static /* synthetic */ PointF access$100(DraweeTransition draweeTransition) {
    }

    private void captureValues(TransitionValues transitionValues) {
    }

    public static TransitionSet createTransitionSet(ScalingUtils.ScaleType fromScale, ScalingUtils.ScaleType toScale) {
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
    }

    public static TransitionSet createTransitionSet(ScalingUtils.ScaleType fromScale, ScalingUtils.ScaleType toScale, @Nullable PointF fromFocusPoint, @Nullable PointF toFocusPoint) {
    }

    public DraweeTransition(ScalingUtils.ScaleType fromScale, ScalingUtils.ScaleType toScale) {
    }
}
