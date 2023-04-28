package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Animator implements Cloneable {
    public ArrayList<AnimatorListener> mListeners;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AnimatorListener {
        void onAnimationCancel(Animator animator);

        void onAnimationEnd(Animator animator);

        void onAnimationRepeat(Animator animator);

        void onAnimationStart(Animator animator);
    }

    public void addListener(AnimatorListener animatorListener) {
    }

    public void cancel() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo11clone() throws CloneNotSupportedException {
    }

    public void end() {
    }

    public abstract long getDuration();

    public ArrayList<AnimatorListener> getListeners() {
    }

    public abstract long getStartDelay();

    public abstract boolean isRunning();

    public boolean isStarted() {
    }

    public void removeAllListeners() {
    }

    public void removeListener(AnimatorListener animatorListener) {
    }

    public abstract Animator setDuration(long j2);

    public abstract void setInterpolator(Interpolator interpolator);

    public abstract void setStartDelay(long j2);

    public void setTarget(Object obj) {
    }

    public void setupEndValues() {
    }

    public void setupStartValues() {
    }

    public void start() {
    }

    public Animator clone() {
    }
}
