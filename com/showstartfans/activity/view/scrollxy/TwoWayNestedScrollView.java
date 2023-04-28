package com.showstartfans.activity.view.scrollxy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TwoWayNestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {
    public static final int H = 250;
    public static final float I = 0.5f;
    private static final String J = "TwoWayNestedScrollView";
    private static final int K = 250;
    private static final int L = -1;
    private static final a M = null;
    private static final int[] N = null;
    private int A;
    private SavedState B;
    private final NestedScrollingParentHelper C;
    private final NestedScrollingChildHelper D;
    private float E;
    private float F;
    private b G;
    private long b;
    private final Rect c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f7233d;

    /* renamed from: e  reason: collision with root package name */
    private EdgeEffect f7234e;

    /* renamed from: f  reason: collision with root package name */
    private EdgeEffect f7235f;

    /* renamed from: g  reason: collision with root package name */
    private EdgeEffect f7236g;

    /* renamed from: h  reason: collision with root package name */
    private EdgeEffect f7237h;

    /* renamed from: i  reason: collision with root package name */
    private int f7238i;

    /* renamed from: j  reason: collision with root package name */
    private int f7239j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7240k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7241l;

    /* renamed from: m  reason: collision with root package name */
    private View f7242m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7243n;

    /* renamed from: o  reason: collision with root package name */
    private VelocityTracker f7244o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7245p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] v;
    private final int[] w;
    private int x;
    private int y;
    private int z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int scrollPositionX;
        public int scrollPositionY;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public SavedState a(Parcel parcel) {
            }

            public SavedState[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        @NonNull
        public String toString() {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(TwoWayNestedScrollView twoWayNestedScrollView, int i2, int i3, int i4, int i5);
    }

    public TwoWayNestedScrollView(@NonNull Context context) {
    }

    private void B() {
    }

    private void C(boolean z) {
    }

    private boolean D(int i2, int i3, int i4) {
    }

    private void E(View view) {
    }

    private boolean F(Rect rect, boolean z) {
    }

    private void I(int i2, int i3, int i4, boolean z) {
    }

    private void a() {
    }

    private boolean c() {
    }

    private boolean d() {
    }

    private static int e(int i2, int i3, int i4) {
    }

    private float getHorizontalScrollFactorCompat() {
    }

    private float getVerticalScrollFactorCompat() {
    }

    private void h(int i2, int i3) {
    }

    private void i() {
    }

    private void j() {
    }

    private View l(boolean z, int i2, int i3) {
    }

    private boolean o(int i2, int i3) {
    }

    private void p() {
    }

    private void q() {
    }

    private void r() {
    }

    private boolean t(View view) {
    }

    private static boolean v(View view, View view2) {
    }

    private boolean w(View view, int i2, int i3, int i4, int i5) {
    }

    private void x(int i2, int i3, int i4, @Nullable int[] iArr) {
    }

    private void y(MotionEvent motionEvent) {
    }

    public boolean A(int i2) {
    }

    public final void G(int i2, int i3) {
    }

    public final void H(int i2, int i3, int i4) {
    }

    public final void J(int i2, int i3) {
    }

    public final void K(int i2, int i3, int i4) {
    }

    public void L(int i2, int i3, int i4, boolean z) {
    }

    public void M(int i2, int i3, boolean z) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
    }

    public boolean b(int i2) {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f2, float f3) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @NonNull int[] iArr2) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int f(Rect rect) {
    }

    public int g(Rect rect) {
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
    }

    public int getMaxScrollAmountX() {
    }

    public int getMaxScrollAmountY() {
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
    }

    public int getScrollRangeX() {
    }

    public int getScrollRangeY() {
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i2) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
    }

    public boolean k(@NonNull KeyEvent keyEvent) {
    }

    public void m(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
    }

    public boolean n(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2, int i3) {
    }

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public boolean s() {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void setFillViewport(boolean z) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnScrollChangeListener(@Nullable b bVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i2, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i2) {
    }

    public boolean u() {
    }

    public boolean z(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
    }

    public TwoWayNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i2) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
    }

    public TwoWayNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }
}
