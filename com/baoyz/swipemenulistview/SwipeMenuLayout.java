package com.baoyz.swipemenulistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.widget.ScrollerCompat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SwipeMenuLayout extends FrameLayout {
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 0;
    private static final int t = 1;
    private View b;
    private SwipeMenuView c;

    /* renamed from: d  reason: collision with root package name */
    private int f2915d;

    /* renamed from: e  reason: collision with root package name */
    private int f2916e;

    /* renamed from: f  reason: collision with root package name */
    private GestureDetectorCompat f2917f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector.OnGestureListener f2918g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2919h;

    /* renamed from: i  reason: collision with root package name */
    private int f2920i;

    /* renamed from: j  reason: collision with root package name */
    private int f2921j;

    /* renamed from: k  reason: collision with root package name */
    private ScrollerCompat f2922k;

    /* renamed from: l  reason: collision with root package name */
    private ScrollerCompat f2923l;

    /* renamed from: m  reason: collision with root package name */
    private int f2924m;

    /* renamed from: n  reason: collision with root package name */
    private int f2925n;

    /* renamed from: o  reason: collision with root package name */
    private Interpolator f2926o;

    /* renamed from: p  reason: collision with root package name */
    private Interpolator f2927p;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ SwipeMenuLayout b;

        public a(SwipeMenuLayout swipeMenuLayout) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }
    }

    public SwipeMenuLayout(View view, SwipeMenuView swipeMenuView) {
    }

    public static /* synthetic */ boolean a(SwipeMenuLayout swipeMenuLayout, boolean z) {
    }

    public static /* synthetic */ int b(SwipeMenuLayout swipeMenuLayout) {
    }

    public static /* synthetic */ int c(SwipeMenuLayout swipeMenuLayout) {
    }

    private int e(int i2) {
    }

    private void f() {
    }

    private void l(int i2) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public void d() {
    }

    public boolean g() {
    }

    public View getContentView() {
    }

    public SwipeMenuView getMenuView() {
    }

    public int getPosition() {
    }

    public boolean h(MotionEvent motionEvent) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setMenuHeight(int i2) {
    }

    public void setPosition(int i2) {
    }

    public SwipeMenuLayout(View view, SwipeMenuView swipeMenuView, Interpolator interpolator, Interpolator interpolator2) {
    }

    private SwipeMenuLayout(Context context, AttributeSet attributeSet) {
    }

    private SwipeMenuLayout(Context context) {
    }
}
