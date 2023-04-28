package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import java.util.WeakHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ViewPropertyAnimator {
    private static final WeakHashMap<View, ViewPropertyAnimator> ANIMATORS = null;

    public static ViewPropertyAnimator animate(View view) {
    }

    public abstract ViewPropertyAnimator alpha(float f2);

    public abstract ViewPropertyAnimator alphaBy(float f2);

    public abstract void cancel();

    public abstract long getDuration();

    public abstract long getStartDelay();

    public abstract ViewPropertyAnimator rotation(float f2);

    public abstract ViewPropertyAnimator rotationBy(float f2);

    public abstract ViewPropertyAnimator rotationX(float f2);

    public abstract ViewPropertyAnimator rotationXBy(float f2);

    public abstract ViewPropertyAnimator rotationY(float f2);

    public abstract ViewPropertyAnimator rotationYBy(float f2);

    public abstract ViewPropertyAnimator scaleX(float f2);

    public abstract ViewPropertyAnimator scaleXBy(float f2);

    public abstract ViewPropertyAnimator scaleY(float f2);

    public abstract ViewPropertyAnimator scaleYBy(float f2);

    public abstract ViewPropertyAnimator setDuration(long j2);

    public abstract ViewPropertyAnimator setInterpolator(Interpolator interpolator);

    public abstract ViewPropertyAnimator setListener(Animator.AnimatorListener animatorListener);

    public abstract ViewPropertyAnimator setStartDelay(long j2);

    public abstract void start();

    public abstract ViewPropertyAnimator translationX(float f2);

    public abstract ViewPropertyAnimator translationXBy(float f2);

    public abstract ViewPropertyAnimator translationY(float f2);

    public abstract ViewPropertyAnimator translationYBy(float f2);

    public abstract ViewPropertyAnimator x(float f2);

    public abstract ViewPropertyAnimator xBy(float f2);

    public abstract ViewPropertyAnimator y(float f2);

    public abstract ViewPropertyAnimator yBy(float f2);
}
