package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Property;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseMotionStrategy implements MotionStrategy {
    private final Context context;
    @Nullable
    private MotionSpec defaultMotionSpec;
    @NonNull
    private final ExtendedFloatingActionButton fab;
    private final ArrayList<Animator.AnimatorListener> listeners;
    @Nullable
    private MotionSpec motionSpec;
    private final AnimatorTracker tracker;

    /* renamed from: com.google.android.material.floatingactionbutton.BaseMotionStrategy$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Property<ExtendedFloatingActionButton, Float> {
        public final /* synthetic */ BaseMotionStrategy this$0;

        public AnonymousClass1(BaseMotionStrategy baseMotionStrategy, Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(ExtendedFloatingActionButton extendedFloatingActionButton, Float f2) {
        }
    }

    public BaseMotionStrategy(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
    }

    public static /* synthetic */ ExtendedFloatingActionButton access$000(BaseMotionStrategy baseMotionStrategy) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @NonNull
    public final List<Animator.AnimatorListener> getListeners() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @Nullable
    public MotionSpec getMotionSpec() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationCancel() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationEnd() {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    @NonNull
    public AnimatorSet createAnimator(@NonNull MotionSpec motionSpec) {
    }
}
