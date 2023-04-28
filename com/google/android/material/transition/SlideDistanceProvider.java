package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    @Px
    private int slideDistance;
    private int slideEdge;

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ float val$originalTranslation;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(View view, float f2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ float val$originalTranslation;
        public final /* synthetic */ View val$view;

        public AnonymousClass2(View view, float f2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i2) {
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i2, @Px int i3) {
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i2, @Px int i3) {
    }

    private static Animator createTranslationXAnimator(View view, float f2, float f3, float f4) {
    }

    private static Animator createTranslationYAnimator(View view, float f2, float f3, float f4) {
    }

    private int getSlideDistanceOrDefault(Context context) {
    }

    private static boolean isRtl(View view) {
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
    }

    @Px
    public int getSlideDistance() {
    }

    public int getSlideEdge() {
    }

    public void setSlideDistance(@Px int i2) {
    }

    public void setSlideEdge(int i2) {
    }
}
