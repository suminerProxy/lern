package com.nineoldandroids.animation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimeAnimator extends ValueAnimator {
    private TimeListener mListener;
    private long mPreviousTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TimeListener {
        void onTimeUpdate(TimeAnimator timeAnimator, long j2, long j3);
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void animateValue(float f2) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public boolean animationFrame(long j2) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void initAnimation() {
    }

    public void setTimeListener(TimeListener timeListener) {
    }
}
