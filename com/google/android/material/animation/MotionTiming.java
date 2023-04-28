package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MotionTiming {
    private long delay;
    private long duration;
    @Nullable
    private TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long j2, long j3) {
    }

    @NonNull
    public static MotionTiming createFromAnimator(@NonNull ValueAnimator valueAnimator) {
    }

    private static TimeInterpolator getInterpolatorCompat(@NonNull ValueAnimator valueAnimator) {
    }

    public void apply(@NonNull Animator animator) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public long getDelay() {
    }

    public long getDuration() {
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
    }

    public int getRepeatCount() {
    }

    public int getRepeatMode() {
    }

    public int hashCode() {
    }

    @NonNull
    public String toString() {
    }

    public MotionTiming(long j2, long j3, @NonNull TimeInterpolator timeInterpolator) {
    }
}
