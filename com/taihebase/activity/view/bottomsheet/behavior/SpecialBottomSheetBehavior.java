package com.taihebase.activity.view.bottomsheet.behavior;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.ViewDragHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SpecialBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    public static final int G = 5;
    public static final int H = 6;
    public static final int I = -1;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 4;
    public static final int M = 8;
    public static final int N = -1;
    public static final int O = 0;
    private static final float P = 0.4f;
    private static final float Q = 0.1f;
    private View A;
    private final ViewDragHelper.Callback B;

    /* renamed from: a  reason: collision with root package name */
    private int f8092a;
    private boolean b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private int f8093d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8094e;

    /* renamed from: f  reason: collision with root package name */
    private int f8095f;

    /* renamed from: g  reason: collision with root package name */
    public int f8096g;

    /* renamed from: h  reason: collision with root package name */
    public int f8097h;

    /* renamed from: i  reason: collision with root package name */
    public int f8098i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8099j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8100k;

    /* renamed from: l  reason: collision with root package name */
    public int f8101l;

    /* renamed from: m  reason: collision with root package name */
    public ViewDragHelper f8102m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8103n;

    /* renamed from: o  reason: collision with root package name */
    private int f8104o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8105p;
    public int q;
    public int r;
    public WeakReference<V> s;
    public WeakReference<View> t;
    private c u;
    private VelocityTracker v;
    public int w;
    private int x;
    public boolean y;
    private Map<View, Integer> z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public SavedState a(Parcel parcel) {
            }

            public SavedState b(Parcel parcel, ClassLoader classLoader) {
            }

            public SavedState[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public SavedState(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable, SpecialBottomSheetBehavior specialBottomSheetBehavior) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SpecialBottomSheetBehavior f8106d;

        public a(SpecialBottomSheetBehavior specialBottomSheetBehavior, View view, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends ViewDragHelper.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SpecialBottomSheetBehavior f8107a;

        public b(SpecialBottomSheetBehavior specialBottomSheetBehavior) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class c {
        public abstract void a(@NonNull View view, float f2);

        public abstract void b(@NonNull View view, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements Runnable {
        private final View b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SpecialBottomSheetBehavior f8108d;

        public d(SpecialBottomSheetBehavior specialBottomSheetBehavior, View view, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public @interface e {
    }

    public SpecialBottomSheetBehavior() {
    }

    public static /* synthetic */ boolean a(SpecialBottomSheetBehavior specialBottomSheetBehavior) {
    }

    public static /* synthetic */ int b(SpecialBottomSheetBehavior specialBottomSheetBehavior) {
    }

    public static /* synthetic */ int c(SpecialBottomSheetBehavior specialBottomSheetBehavior) {
    }

    private void calculateCollapsedOffset() {
    }

    public static /* synthetic */ boolean d(SpecialBottomSheetBehavior specialBottomSheetBehavior) {
    }

    public static <V extends View> SpecialBottomSheetBehavior<V> e(V v) {
    }

    private void f(SavedState savedState) {
    }

    private int getExpandedOffset() {
    }

    private float getYVelocity() {
    }

    private void i(int i2) {
    }

    private void reset() {
    }

    private void updateImportantForAccessibility(boolean z) {
    }

    public void dispatchOnSlide(int i2) {
    }

    @VisibleForTesting
    public View findScrollingChild(View view) {
    }

    public void g(c cVar) {
    }

    public final int getPeekHeight() {
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
    }

    public int getSaveFlags() {
    }

    public boolean getSkipCollapsed() {
    }

    public final int getState() {
    }

    public void h(View view, int i2) {
    }

    public boolean isFitToContents() {
    }

    public boolean isHideable() {
    }

    public void j(View view) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public void setFitToContents(boolean z) {
    }

    public void setHideable(boolean z) {
    }

    public final void setPeekHeight(int i2) {
    }

    public void setSaveFlags(int i2) {
    }

    public void setSkipCollapsed(boolean z) {
    }

    public final void setState(int i2) {
    }

    public void setStateInternal(int i2) {
    }

    public boolean shouldHide(View view, float f2) {
    }

    public final void setPeekHeight(int i2, boolean z) {
    }

    public SpecialBottomSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
