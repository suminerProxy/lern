package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class StateListAnimator {
    private final Animator.AnimatorListener animationListener;
    @Nullable
    private Tuple lastMatch;
    @Nullable
    public ValueAnimator runningAnimator;
    private final ArrayList<Tuple> tuples;

    /* renamed from: com.google.android.material.internal.StateListAnimator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ StateListAnimator this$0;

        public AnonymousClass1(StateListAnimator stateListAnimator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Tuple {
        public final ValueAnimator animator;
        public final int[] specs;

        public Tuple(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    private void cancel() {
    }

    private void start(@NonNull Tuple tuple) {
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
    }

    public void jumpToCurrentState() {
    }

    public void setState(int[] iArr) {
    }
}
