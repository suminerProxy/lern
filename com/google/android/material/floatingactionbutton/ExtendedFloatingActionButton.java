package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    public static final Property<View, Float> HEIGHT = null;
    public static final Property<View, Float> PADDING_END = null;
    public static final Property<View, Float> PADDING_START = null;
    public static final Property<View, Float> WIDTH = null;
    private int animState;
    private boolean animateShowBeforeLayout;
    @NonNull
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    @NonNull
    private final MotionStrategy extendStrategy;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    @NonNull
    public ColorStateList originalTextCsl;
    private final MotionStrategy showStrategy;
    @NonNull
    private final MotionStrategy shrinkStrategy;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Size {
        public final /* synthetic */ ExtendedFloatingActionButton this$0;

        public AnonymousClass1(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Size {
        public final /* synthetic */ ExtendedFloatingActionButton this$0;

        public AnonymousClass2(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        private boolean cancelled;
        public final /* synthetic */ ExtendedFloatingActionButton this$0;
        public final /* synthetic */ OnChangedCallback val$callback;
        public final /* synthetic */ MotionStrategy val$strategy;

        public AnonymousClass3(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, OnChangedCallback onChangedCallback) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 extends Property<View, Float> {
        public AnonymousClass4(Class cls, String str) {
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f2) {
        }

        @NonNull
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f2) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 extends Property<View, Float> {
        public AnonymousClass5(Class cls, String str) {
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f2) {
        }

        @NonNull
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f2) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass6 extends Property<View, Float> {
        public AnonymousClass6(Class cls, String str) {
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f2) {
        }

        @NonNull
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f2) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass7 extends Property<View, Float> {
        public AnonymousClass7(Class cls, String str) {
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f2) {
        }

        @NonNull
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ChangeSizeStrategy extends BaseMotionStrategy {
        private final boolean extending;
        private final Size size;
        public final /* synthetic */ ExtendedFloatingActionButton this$0;

        public ChangeSizeStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker, Size size, boolean z) {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @NonNull
        public AnimatorSet createAnimator() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        @Nullable
        private OnChangedCallback internalAutoHideCallback;
        @Nullable
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
        }

        private static boolean isBottomSheet(@NonNull View view) {
        }

        private boolean shouldUpdateVisibility(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        private boolean updateFabVisibilityForBottomSheet(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
        }

        public boolean isAutoHideEnabled() {
        }

        public boolean isAutoShrinkEnabled() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
        }

        public void setAutoHideEnabled(boolean z) {
        }

        public void setAutoShrinkEnabled(boolean z) {
        }

        @VisibleForTesting
        public void setInternalAutoHideCallback(@Nullable OnChangedCallback onChangedCallback) {
        }

        @VisibleForTesting
        public void setInternalAutoShrinkCallback(@Nullable OnChangedCallback onChangedCallback) {
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class HideStrategy extends BaseMotionStrategy {
        private boolean isCancelled;
        public final /* synthetic */ ExtendedFloatingActionButton this$0;

        public HideStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ShowStrategy extends BaseMotionStrategy {
        public final /* synthetic */ ExtendedFloatingActionButton this$0;

        public ShowStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
    }

    public static /* synthetic */ int access$000(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ int access$100(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ boolean access$1000(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ boolean access$1100(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ MotionStrategy access$200(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ MotionStrategy access$300(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, OnChangedCallback onChangedCallback) {
    }

    public static /* synthetic */ MotionStrategy access$500(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ MotionStrategy access$600(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ boolean access$700(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ boolean access$702(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
    }

    public static /* synthetic */ boolean access$802(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
    }

    public static /* synthetic */ int access$902(ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
    }

    private boolean isOrWillBeHidden() {
    }

    private boolean isOrWillBeShown() {
    }

    private void performMotion(@NonNull MotionStrategy motionStrategy, @Nullable OnChangedCallback onChangedCallback) {
    }

    private void saveOriginalTextCsl() {
    }

    private boolean shouldAnimateVisibilityChange() {
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void extend() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
    }

    public int getCollapsedPadding() {
    }

    @VisibleForTesting
    public int getCollapsedSize() {
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
    }

    public void hide() {
    }

    public final boolean isExtended() {
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i2) {
    }

    public void setExtended(boolean z) {
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i2) {
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
    }

    public void show() {
    }

    public void shrink() {
    }

    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList) {
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
    }
}
