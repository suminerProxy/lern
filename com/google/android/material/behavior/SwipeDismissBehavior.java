package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    public float alphaEndSwipeDistance;
    public float alphaStartSwipeDistance;
    private final ViewDragHelper.Callback dragCallback;
    public float dragDismissThreshold;
    private boolean interceptingEvents;
    public OnDismissListener listener;
    private float sensitivity;
    private boolean sensitivitySet;
    public int swipeDirection;
    public ViewDragHelper viewDragHelper;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ViewDragHelper.Callback {
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId;
        private int originalCapturedViewLeft;
        public final /* synthetic */ SwipeDismissBehavior this$0;

        public AnonymousClass1(SwipeDismissBehavior swipeDismissBehavior) {
        }

        private boolean shouldDismiss(@NonNull View view, float f2) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i2) {
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
        public boolean tryCaptureView(View view, int i2) {
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements AccessibilityViewCommand {
        public final /* synthetic */ SwipeDismissBehavior this$0;

        public AnonymousClass2(SwipeDismissBehavior swipeDismissBehavior) {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        public final /* synthetic */ SwipeDismissBehavior this$0;
        private final View view;

        public SettleRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static float clamp(float f2, float f3, float f4) {
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
    }

    public static float fraction(float f2, float f3, float f4) {
    }

    private void updateAccessibilityActions(View view) {
    }

    public boolean canSwipeDismissView(@NonNull View view) {
    }

    public int getDragState() {
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public void setDragDismissDistance(float f2) {
    }

    public void setEndAlphaSwipeDistance(float f2) {
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
    }

    public void setSensitivity(float f2) {
    }

    public void setStartAlphaSwipeDistance(float f2) {
    }

    public void setSwipeDirection(int i2) {
    }

    public static int clamp(int i2, int i3, int i4) {
    }
}
