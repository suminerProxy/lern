package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    /* renamed from: com.google.android.material.transition.platform.ScaleProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ float val$originalScaleX;
        public final /* synthetic */ float val$originalScaleY;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(View view, float f2, float f3) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ScaleProvider() {
    }

    private static Animator createScaleAnimator(View view, float f2, float f3) {
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
    }

    public float getIncomingEndScale() {
    }

    public float getIncomingStartScale() {
    }

    public float getOutgoingEndScale() {
    }

    public float getOutgoingStartScale() {
    }

    public boolean isGrowing() {
    }

    public boolean isScaleOnDisappear() {
    }

    public void setGrowing(boolean z) {
    }

    public void setIncomingEndScale(float f2) {
    }

    public void setIncomingStartScale(float f2) {
    }

    public void setOutgoingEndScale(float f2) {
    }

    public void setOutgoingStartScale(float f2) {
    }

    public void setScaleOnDisappear(boolean z) {
    }

    public ScaleProvider(boolean z) {
    }
}
