package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobViewPager extends ViewGroup {
    private static final int DECELERATION = 10;
    private static final int SNAP_VELOCITY = 500;
    private static final int TOUCH_STATE_REST = 0;
    private static final int TOUCH_STATE_SCROLLING = 1;
    private ViewPagerAdapter adapter;
    private View currentPage;
    private int currentScreen;
    private int flingVelocity;
    private float lastMotionX;
    private float lastMotionY;
    private int maximumVelocity;
    private View nextPage;
    private int pageWidth;
    private View previousPage;
    private int screenCount;
    private Scroller scroller;
    private boolean skipScreen;
    private int touchSlop;
    private int touchState;
    private VelocityTracker velocityTracker;

    /* renamed from: com.mob.tools.gui.MobViewPager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Interpolator {
        public final /* synthetic */ MobViewPager this$0;

        public AnonymousClass1(MobViewPager mobViewPager) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }
    }

    /* renamed from: com.mob.tools.gui.MobViewPager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ MobViewPager this$0;
        public final /* synthetic */ boolean val$immediate;
        public final /* synthetic */ int val$whichScreen;

        public AnonymousClass2(MobViewPager mobViewPager, int i2, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public MobViewPager(Context context) {
    }

    public static /* synthetic */ void access$000(MobViewPager mobViewPager, int i2, boolean z) {
    }

    private void adjustScroller() {
    }

    private void handleInterceptMove(MotionEvent motionEvent) {
    }

    private void handleScrollMove(MotionEvent motionEvent) {
    }

    private void init(Context context) {
    }

    private void onScreenChange(int i2) {
    }

    private void scrollToScreenOnUIThread(int i2, boolean z) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i2) {
    }

    public int getCurrentScreen() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void scrollLeft(boolean z) {
    }

    public void scrollRight(boolean z) {
    }

    public void scrollToScreen(int i2, boolean z) {
    }

    public void setAdapter(ViewPagerAdapter viewPagerAdapter) {
    }

    public MobViewPager(Context context, AttributeSet attributeSet) {
    }

    @Deprecated
    public void scrollToScreen(int i2, boolean z, boolean z2) {
    }

    public MobViewPager(Context context, AttributeSet attributeSet, int i2) {
    }
}
