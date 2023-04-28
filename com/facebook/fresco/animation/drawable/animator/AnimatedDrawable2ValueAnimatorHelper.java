package com.facebook.fresco.animation.drawable.animator;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@TargetApi(11)
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawable2ValueAnimatorHelper {

    /* renamed from: com.facebook.fresco.animation.drawable.animator.AnimatedDrawable2ValueAnimatorHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ AnimatedDrawable2 val$drawable;

        public AnonymousClass1(final AnimatedDrawable2 val$drawable) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        @TargetApi(11)
        public void onAnimationUpdate(ValueAnimator animation) {
        }
    }

    private AnimatedDrawable2ValueAnimatorHelper() {
    }

    public static ValueAnimator.AnimatorUpdateListener createAnimatorUpdateListener(final AnimatedDrawable2 drawable) {
    }

    @Nullable
    public static ValueAnimator createValueAnimator(AnimatedDrawable2 animatedDrawable, int maxDurationMs) {
    }

    public static ValueAnimator createValueAnimator(AnimatedDrawable2 animatedDrawable) {
    }
}
