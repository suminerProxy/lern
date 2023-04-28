package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    public int activePointerId;
    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    public int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    public float elevation;
    private int expandHalfwayActionId;
    public int expandedOffset;
    private boolean fitToContents;
    public int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public boolean hideable;
    private boolean ignoreEvents;
    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    @Nullable
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    @Nullable
    public WeakReference<View> nestedScrollingChildRef;
    public int parentHeight;
    public int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    public int state;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    @Nullable
    private VelocityTracker velocityTracker;
    @Nullable
    public ViewDragHelper viewDragHelper;
    @Nullable
    public WeakReference<V> viewRef;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ BottomSheetBehavior this$0;
        public final /* synthetic */ View val$child;
        public final /* synthetic */ int val$finalState;

        public AnonymousClass1(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BottomSheetBehavior this$0;

        public AnonymousClass2(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements ViewUtils.OnApplyWindowInsetsListener {
        public final /* synthetic */ BottomSheetBehavior this$0;

        public AnonymousClass3(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends ViewDragHelper.Callback {
        public final /* synthetic */ BottomSheetBehavior this$0;

        public AnonymousClass4(BottomSheetBehavior bottomSheetBehavior) {
        }

        private boolean releasedLow(@NonNull View view) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(@NonNull View view) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i2) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f2, float f3) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i2) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements AccessibilityViewCommand {
        public final /* synthetic */ BottomSheetBehavior this$0;
        public final /* synthetic */ int val$state;

        public AnonymousClass5(BottomSheetBehavior bottomSheetBehavior, int i2) {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f2);

        public abstract void onStateChanged(@NonNull View view, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface SaveFlags {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1  reason: invalid class name */
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

        public SavedState(@NonNull Parcel parcel) {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SettleRunnable implements Runnable {
        private boolean isPosted;
        public int targetState;
        public final /* synthetic */ BottomSheetBehavior this$0;
        private final View view;

        public SettleRunnable(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        }

        public static /* synthetic */ boolean access$300(SettleRunnable settleRunnable) {
        }

        public static /* synthetic */ boolean access$302(SettleRunnable settleRunnable, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    public static /* synthetic */ MaterialShapeDrawable access$000(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ int access$102(BottomSheetBehavior bottomSheetBehavior, int i2) {
    }

    public static /* synthetic */ void access$200(BottomSheetBehavior bottomSheetBehavior, boolean z) {
    }

    public static /* synthetic */ boolean access$400(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ boolean access$500(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ int access$600(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ boolean access$700(BottomSheetBehavior bottomSheetBehavior) {
    }

    private int addAccessibilityActionForState(V v, @StringRes int i2, int i3) {
    }

    private void calculateCollapsedOffset() {
    }

    private void calculateHalfExpandedOffset() {
    }

    private int calculatePeekHeight() {
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(int i2) {
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z) {
    }

    private void createShapeValueAnimator() {
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v) {
    }

    private float getYVelocity() {
    }

    private void replaceAccessibilityActionForState(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i2) {
    }

    private void reset() {
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
    }

    private void setSystemGestureInsets(@NonNull View view) {
    }

    private void settleToStatePendingLayout(int i2) {
    }

    private void updateAccessibilityActions() {
    }

    private void updateDrawableForTargetState(int i2) {
    }

    private void updateImportantForAccessibility(boolean z) {
    }

    private void updatePeekHeight(boolean z) {
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
    }

    public void dispatchOnSlide(int i2) {
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
    }

    public int getExpandedOffset() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getHalfExpandedRatio() {
    }

    public int getPeekHeight() {
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
    }

    public int getSaveFlags() {
    }

    public boolean getSkipCollapsed() {
    }

    public int getState() {
    }

    public boolean isDraggable() {
    }

    public boolean isFitToContents() {
    }

    public boolean isGestureInsetBottomIgnored() {
    }

    public boolean isHideable() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
    }

    public void setDraggable(boolean z) {
    }

    public void setExpandedOffset(int i2) {
    }

    public void setFitToContents(boolean z) {
    }

    public void setGestureInsetBottomIgnored(boolean z) {
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setHideable(boolean z) {
    }

    public void setPeekHeight(int i2) {
    }

    public void setSaveFlags(int i2) {
    }

    public void setSkipCollapsed(boolean z) {
    }

    public void setState(int i2) {
    }

    public void setStateInternal(int i2) {
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
    }

    public void settleToState(@NonNull View view, int i2) {
    }

    public boolean shouldHide(@NonNull View view, float f2) {
    }

    public void startSettlingAnimation(View view, int i2, int i3, boolean z) {
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z, @Nullable ColorStateList colorStateList) {
    }

    public final void setPeekHeight(int i2, boolean z) {
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
