package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.LottieComposition;
import com.google.android.material.shadow.ShadowDrawableWrapper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    @Nullable
    private LottieComposition composition;
    private float frame;
    private long lastFrameTimeNs;
    private float maxFrame;
    private float minFrame;
    private int repeatCount;
    @VisibleForTesting
    public boolean running;
    private float speed;
    private boolean speedReversedForRepeatMode;

    private float getFrameDurationNs() {
    }

    private boolean isReversed() {
    }

    private void verifyFrame() {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
    }

    public void clearComposition() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
    }

    @MainThread
    public void endAnimation() {
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getAnimatedFraction() {
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getAnimatedValueAbsolute() {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
    }

    public float getFrame() {
    }

    public float getMaxFrame() {
    }

    public float getMinFrame() {
    }

    public float getSpeed() {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
    }

    @MainThread
    public void pauseAnimation() {
    }

    @MainThread
    public void playAnimation() {
    }

    public void postFrameCallback() {
    }

    @MainThread
    public void removeFrameCallback() {
    }

    @MainThread
    public void resumeAnimation() {
    }

    public void reverseAnimationSpeed() {
    }

    public void setComposition(LottieComposition lottieComposition) {
    }

    public void setFrame(float f2) {
    }

    public void setMaxFrame(float f2) {
    }

    public void setMinAndMaxFrames(float f2, float f3) {
    }

    public void setMinFrame(int i2) {
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
    }

    public void setSpeed(float f2) {
    }

    @MainThread
    public void removeFrameCallback(boolean z) {
    }
}
