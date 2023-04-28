package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobDrawerLayout extends ViewGroup {
    private static final int SNAP_VELOCITY = 500;
    private static final int TOUCH_STATE_REST = 0;
    private static final int TOUCH_STATE_SCROLLING = 1;
    private FrameLayout bodyContainer;
    private FrameLayout drawerContainer;
    private double drawerWidth;
    private float lastMotionX;
    private float lastMotionY;
    private OnDrawerStateChangeListener listener;
    private boolean lockScroll;
    private int maximumVelocity;
    private boolean opened;
    private Paint paint;
    private Scroller scroller;
    private int touchSlop;
    private int touchState;
    private DrawerType type;
    private VelocityTracker velocityTracker;

    /* renamed from: com.mob.tools.gui.MobDrawerLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ MobDrawerLayout this$0;

        public AnonymousClass1(MobDrawerLayout mobDrawerLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mob.tools.gui.MobDrawerLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DrawerType {
        private static final /* synthetic */ DrawerType[] $VALUES = null;
        public static final DrawerType LEFT_BOTTOM = null;
        public static final DrawerType LEFT_COVER = null;
        public static final DrawerType LEFT_PUSH = null;
        public static final DrawerType RIGHT_BOTTOM = null;
        public static final DrawerType RIGHT_COVER = null;
        public static final DrawerType RIGHT_PUSH = null;

        private DrawerType(String str, int i2) {
        }

        public static DrawerType valueOf(String str) {
        }

        public static DrawerType[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnDrawerStateChangeListener {
        void onClosing(MobDrawerLayout mobDrawerLayout, int i2);

        void onOpening(MobDrawerLayout mobDrawerLayout, int i2);
    }

    public MobDrawerLayout(Context context) {
    }

    private void computeDrag(int i2) {
    }

    private void dragToLeft(int i2) {
    }

    private void dragToRight(int i2) {
    }

    private void drawShadow(Canvas canvas) {
    }

    private void init(Context context) {
    }

    private boolean isClose() {
    }

    private void switchDrawer(boolean z, boolean z2) {
    }

    public void close(boolean z) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public boolean isOpened() {
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

    public void open(boolean z) {
    }

    public void setBody(View view) {
    }

    public void setDrawer(View view) {
    }

    public void setDrawerType(DrawerType drawerType) {
    }

    public void setDrawerWidth(double d2) {
    }

    public void setLockScroll(boolean z) {
    }

    public void setOnDrawerStateChangeListener(OnDrawerStateChangeListener onDrawerStateChangeListener) {
    }

    public void close() {
    }

    public void open() {
    }

    public MobDrawerLayout(Context context, AttributeSet attributeSet) {
    }

    public MobDrawerLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
