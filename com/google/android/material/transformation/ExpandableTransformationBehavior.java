package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @Nullable
    private AnimatorSet currentAnimation;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ ExpandableTransformationBehavior this$0;

        public AnonymousClass1(ExpandableTransformationBehavior expandableTransformationBehavior) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public static /* synthetic */ AnimatorSet access$002(ExpandableTransformationBehavior expandableTransformationBehavior, AnimatorSet animatorSet) {
    }

    @NonNull
    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2) {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}
