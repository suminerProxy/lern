package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_DURATION = 250;
    public static final int ANIMATION_FADE_DURATION = 180;
    private static final int ANIMATION_FADE_IN_DURATION = 150;
    private static final int ANIMATION_FADE_OUT_DURATION = 75;
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    public static final int MSG_DISMISS = 1;
    public static final int MSG_SHOW = 0;
    private static final int[] SNACKBAR_STYLE_ATTR = null;
    private static final String TAG = null;
    private static final boolean USE_OFFSET_API = false;
    @NonNull
    public static final Handler handler = null;
    @Nullable
    private final AccessibilityManager accessibilityManager;
    @Nullable
    private View anchorView;
    private final ViewTreeObserver.OnGlobalLayoutListener anchorViewLayoutListener;
    private boolean anchorViewLayoutListenerEnabled;
    private Behavior behavior;
    @RequiresApi(29)
    private final Runnable bottomMarginGestureInsetRunnable;
    private List<BaseCallback<B>> callbacks;
    @NonNull
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    @NonNull
    public SnackbarManager.Callback managerCallback;
    @Nullable
    private Rect originalMargins;
    @NonNull
    private final ViewGroup targetParent;
    @NonNull
    public final SnackbarBaseLayout view;

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass10(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass11 extends AnimatorListenerAdapter {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass11(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass12 extends AnimatorListenerAdapter {
        public final /* synthetic */ BaseTransientBottomBar this$0;
        public final /* synthetic */ int val$event;

        public AnonymousClass12(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass13 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass13(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass14(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass15 extends AnimatorListenerAdapter {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass15(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass16 implements ValueAnimator.AnimatorUpdateListener {
        private int previousAnimatedIntValue;
        public final /* synthetic */ BaseTransientBottomBar this$0;
        public final /* synthetic */ int val$translationYBottom;

        public AnonymousClass16(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass17 extends AnimatorListenerAdapter {
        public final /* synthetic */ BaseTransientBottomBar this$0;
        public final /* synthetic */ int val$event;

        public AnonymousClass17(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass18 implements ValueAnimator.AnimatorUpdateListener {
        private int previousAnimatedIntValue;
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass18(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass2(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass3(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements OnApplyWindowInsetsListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass4(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends AccessibilityDelegateCompat {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass5(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 implements SnackbarManager.Callback {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass6(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void dismiss(int i2) {
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void show() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements OnAttachStateChangeListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$7$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass7 this$1;

            public AnonymousClass1(AnonymousClass7 anonymousClass7) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass7(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 implements OnLayoutChangeListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass8(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 implements SwipeDismissBehavior.OnDismissListener {
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public AnonymousClass9(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDismiss(@NonNull View view) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDragStateChanged(int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface AnimationMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i2) {
        }

        public void onShown(B b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        @NonNull
        private final BehaviorDelegate delegate;

        public static /* synthetic */ void access$1300(Behavior behavior, BaseTransientBottomBar baseTransientBottomBar) {
        }

        private void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BehaviorDelegate {
        private SnackbarManager.Callback managerCallback;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
        }

        public boolean canSwipeDismissView(View view) {
        }

        public void onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
        }
    }

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Duration {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnLayoutChangeListener {
        void onLayoutChange(View view, int i2, int i3, int i4, int i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SnackbarBaseLayout extends FrameLayout {
        private static final View.OnTouchListener consumeAllTouchListener = null;
        private final float actionTextColorAlpha;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private ColorStateList backgroundTint;
        private PorterDuff.Mode backgroundTintMode;
        private OnAttachStateChangeListener onAttachStateChangeListener;
        private OnLayoutChangeListener onLayoutChangeListener;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
            }
        }

        public SnackbarBaseLayout(@NonNull Context context) {
        }

        @NonNull
        private Drawable createThemedBackground() {
        }

        public float getActionTextColorAlpha() {
        }

        public int getAnimationMode() {
        }

        public float getBackgroundOverlayColorAlpha() {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        public void setAnimationMode(int i2) {
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        }

        public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        }

        public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
        }
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
    }

    public static /* synthetic */ boolean access$000(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ int access$1002(BaseTransientBottomBar baseTransientBottomBar, int i2) {
    }

    public static /* synthetic */ int access$102(BaseTransientBottomBar baseTransientBottomBar, int i2) {
    }

    public static /* synthetic */ int access$1102(BaseTransientBottomBar baseTransientBottomBar, int i2) {
    }

    public static /* synthetic */ void access$1200(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ void access$1400(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ void access$1500(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ com.google.android.material.snackbar.ContentViewCallback access$1600(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ boolean access$1700() {
    }

    public static /* synthetic */ int access$200(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ void access$300(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ Context access$400(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ int access$500(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ int access$600(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ int access$700(BaseTransientBottomBar baseTransientBottomBar) {
    }

    public static /* synthetic */ int access$702(BaseTransientBottomBar baseTransientBottomBar, int i2) {
    }

    public static /* synthetic */ String access$800() {
    }

    public static /* synthetic */ int access$902(BaseTransientBottomBar baseTransientBottomBar, int i2) {
    }

    private void animateViewOut(int i2) {
    }

    private int calculateBottomMarginForAnchorView() {
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
    }

    private ValueAnimator getScaleAnimator(float... fArr) {
    }

    @RequiresApi(17)
    private int getScreenHeight() {
    }

    private int getTranslationYBottom() {
    }

    private int getViewAbsoluteBottom() {
    }

    private boolean isSwipeDismissable() {
    }

    private void setUpBehavior(CoordinatorLayout.LayoutParams layoutParams) {
    }

    private boolean shouldUpdateGestureInset() {
    }

    private void showViewImpl() {
    }

    private void startFadeInAnimation() {
    }

    private void startFadeOutAnimation(int i2) {
    }

    private void startSlideInAnimation() {
    }

    private void startSlideOutAnimation(int i2) {
    }

    private void updateMargins() {
    }

    @NonNull
    public B addCallback(@Nullable BaseCallback<B> baseCallback) {
    }

    public void animateViewIn() {
    }

    public void dismiss() {
    }

    public void dispatchDismiss(int i2) {
    }

    @Nullable
    public View getAnchorView() {
    }

    public int getAnimationMode() {
    }

    public Behavior getBehavior() {
    }

    @NonNull
    public Context getContext() {
    }

    public int getDuration() {
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> getNewBehavior() {
    }

    @LayoutRes
    public int getSnackbarBaseLayoutResId() {
    }

    @NonNull
    public View getView() {
    }

    public boolean hasSnackbarStyleAttr() {
    }

    public final void hideView(int i2) {
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
    }

    public boolean isGestureInsetBottomIgnored() {
    }

    public boolean isShown() {
    }

    public boolean isShownOrQueued() {
    }

    public void onViewHidden(int i2) {
    }

    public void onViewShown() {
    }

    @NonNull
    public B removeCallback(@Nullable BaseCallback<B> baseCallback) {
    }

    @NonNull
    public B setAnchorView(@Nullable View view) {
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z) {
    }

    @NonNull
    public B setAnimationMode(int i2) {
    }

    @NonNull
    public B setBehavior(Behavior behavior) {
    }

    @NonNull
    public B setDuration(int i2) {
    }

    @NonNull
    public B setGestureInsetBottomIgnored(boolean z) {
    }

    public boolean shouldAnimate() {
    }

    public void show() {
    }

    public final void showView() {
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
    }

    @NonNull
    public B setAnchorView(@IdRes int i2) {
    }
}
