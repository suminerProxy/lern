package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    private static final long ANIMATION_DURATION = 300;
    private static final int DEF_STYLE_RES = 0;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private ArrayList<AnimationListener> animationListeners;
    private Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    @NonNull
    public AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    @NonNull
    public TransformationCallback<FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final MaterialShapeDrawable materialShapeDrawable;
    private boolean menuAnimatingWithFabAlignmentMode;
    @Nullable
    private Animator menuAnimator;
    @Nullable
    private Animator modeAnimator;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    @MenuRes
    private int pendingMenuResId;
    private int rightInset;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass1(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements TransformationCallback<FloatingActionButton> {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass2(BottomAppBar bottomAppBar) {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public /* bridge */ /* synthetic */ void onScaleChanged(@NonNull FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public /* bridge */ /* synthetic */ void onTranslationChanged(@NonNull FloatingActionButton floatingActionButton) {
        }

        /* renamed from: onScaleChanged  reason: avoid collision after fix types in other method */
        public void onScaleChanged2(@NonNull FloatingActionButton floatingActionButton) {
        }

        /* renamed from: onTranslationChanged  reason: avoid collision after fix types in other method */
        public void onTranslationChanged2(@NonNull FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements ViewUtils.OnApplyWindowInsetsListener {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass3(BottomAppBar bottomAppBar) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass4(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends FloatingActionButton.OnVisibilityChangedListener {
        public final /* synthetic */ BottomAppBar this$0;
        public final /* synthetic */ int val$targetMode;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onShown(FloatingActionButton floatingActionButton) {
            }
        }

        public AnonymousClass5(BottomAppBar bottomAppBar, int i2) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
        public void onHidden(@NonNull FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass6(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        public boolean cancelled;
        public final /* synthetic */ BottomAppBar this$0;
        public final /* synthetic */ ActionMenuView val$actionMenuView;
        public final /* synthetic */ boolean val$targetAttached;
        public final /* synthetic */ int val$targetMode;

        public AnonymousClass7(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ BottomAppBar this$0;
        public final /* synthetic */ ActionMenuView val$actionMenuView;
        public final /* synthetic */ int val$fabAlignmentMode;
        public final /* synthetic */ boolean val$fabAttached;

        public AnonymousClass8(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        public final /* synthetic */ BottomAppBar this$0;

        public AnonymousClass9(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AnimationListener {
        void onAnimationEnd(BottomAppBar bottomAppBar);

        void onAnimationStart(BottomAppBar bottomAppBar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @NonNull
        private final Rect fabContentRect;
        private final View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private WeakReference<BottomAppBar> viewRef;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements View.OnLayoutChangeListener {
            public final /* synthetic */ Behavior this$0;

            public AnonymousClass1(Behavior behavior) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            }
        }

        public Behavior() {
        }

        public static /* synthetic */ WeakReference access$2400(Behavior behavior) {
        }

        public static /* synthetic */ Rect access$2500(Behavior behavior) {
        }

        public static /* synthetic */ int access$2600(Behavior behavior) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i2, int i3) {
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i2) {
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i2, int i3) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FabAnimationMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int fabAlignmentMode;
        public boolean fabAttached;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public /* bridge */ /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public /* bridge */ /* synthetic */ SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        }
    }

    public BottomAppBar(@NonNull Context context) {
    }

    public static /* synthetic */ boolean access$000(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ boolean access$002(BottomAppBar bottomAppBar, boolean z) {
    }

    public static /* synthetic */ int access$100(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ boolean access$1000(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$1100(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$1102(BottomAppBar bottomAppBar, int i2) {
    }

    public static /* synthetic */ void access$1200(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$1300(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$1400(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$1500(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$1600(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ Animator access$1702(BottomAppBar bottomAppBar, Animator animator) {
    }

    public static /* synthetic */ float access$1800(BottomAppBar bottomAppBar, int i2) {
    }

    public static /* synthetic */ Animator access$1902(BottomAppBar bottomAppBar, Animator animator) {
    }

    public static /* synthetic */ boolean access$200(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$2000(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$2100(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
    }

    public static /* synthetic */ FloatingActionButton access$2200(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ float access$2300(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$2700(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$2800(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$2900(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$300(BottomAppBar bottomAppBar, int i2, boolean z) {
    }

    public static /* synthetic */ int access$3000(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ View access$3100(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ void access$3200(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
    }

    public static /* synthetic */ MaterialShapeDrawable access$400(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ BottomAppBarTopEdgeTreatment access$500(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ boolean access$600(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$702(BottomAppBar bottomAppBar, int i2) {
    }

    public static /* synthetic */ boolean access$800(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$900(BottomAppBar bottomAppBar) {
    }

    public static /* synthetic */ int access$902(BottomAppBar bottomAppBar, int i2) {
    }

    private void addFabAnimationListeners(@NonNull FloatingActionButton floatingActionButton) {
    }

    private void cancelAnimations() {
    }

    private void createFabTranslationXAnimation(int i2, @NonNull List<Animator> list) {
    }

    private void createMenuViewTranslationAnimation(int i2, boolean z, @NonNull List<Animator> list) {
    }

    private void dispatchAnimationEnd() {
    }

    private void dispatchAnimationStart() {
    }

    @Nullable
    private FloatingActionButton findDependentFab() {
    }

    @Nullable
    private View findDependentView() {
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
    }

    private int getBottomInset() {
    }

    private float getFabTranslationX(int i2) {
    }

    private float getFabTranslationY() {
    }

    private int getLeftInset() {
    }

    private int getRightInset() {
    }

    @NonNull
    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
    }

    private boolean isFabVisibleOrWillBeShown() {
    }

    private void maybeAnimateMenuView(int i2, boolean z) {
    }

    private void maybeAnimateModeChange(int i2) {
    }

    private void setActionMenuViewPosition() {
    }

    private void setCutoutState() {
    }

    private void translateActionMenuView(@NonNull ActionMenuView actionMenuView, int i2, boolean z) {
    }

    public void addAnimationListener(@NonNull AnimationListener animationListener) {
    }

    public void createFabDefaultXAnimation(int i2, List<Animator> list) {
    }

    public int getActionMenuViewTranslationX(@NonNull ActionMenuView actionMenuView, int i2, boolean z) {
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public /* bridge */ /* synthetic */ CoordinatorLayout.Behavior getBehavior() {
    }

    @Dimension
    public float getCradleVerticalOffset() {
    }

    public int getFabAlignmentMode() {
    }

    public int getFabAnimationMode() {
    }

    public float getFabCradleMargin() {
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
    }

    public boolean getHideOnScroll() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
    }

    public void performHide() {
    }

    public void performShow() {
    }

    public void removeAnimationListener(@NonNull AnimationListener animationListener) {
    }

    public void replaceMenu(@MenuRes int i2) {
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
    }

    public void setCradleVerticalOffset(@Dimension float f2) {
    }

    @Override // android.view.View
    public void setElevation(float f2) {
    }

    public void setFabAlignmentMode(int i2) {
    }

    public void setFabAlignmentModeAndReplaceMenu(int i2, @MenuRes int i3) {
    }

    public void setFabAnimationMode(int i2) {
    }

    public void setFabCradleMargin(@Dimension float f2) {
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f2) {
    }

    public boolean setFabDiameter(@Px int i2) {
    }

    public void setHideOnScroll(boolean z) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    private void translateActionMenuView(@NonNull ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    private float getFabTranslationX() {
    }
}
