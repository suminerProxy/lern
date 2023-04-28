package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseLottieAnimator extends ValueAnimator {
    private final Set<Animator.AnimatorListener> listeners;
    private final Set<ValueAnimator.AnimatorUpdateListener> updateListeners;

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
    }

    public void notifyCancel() {
    }

    public void notifyEnd(boolean z) {
    }

    public void notifyRepeat() {
    }

    public void notifyStart(boolean z) {
    }

    public void notifyUpdate() {
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long j2) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j2) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j2) {
    }
}
