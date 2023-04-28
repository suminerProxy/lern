package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    @Nullable
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    public OverScroller scroller;
    private int touchSlop;
    @Nullable
    private VelocityTracker velocityTracker;

    /* JADX WARN: Field signature parse error: layout
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class FlingRunnable implements Runnable {
        private final View layout;
        private final CoordinatorLayout parent;
        public final /* synthetic */ HeaderBehavior this$0;

        public FlingRunnable(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, V v) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public HeaderBehavior() {
    }

    private void ensureVelocityTracker() {
    }

    public boolean canDragView(V v) {
    }

    public final boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v, int i2, int i3, float f2) {
    }

    public int getMaxDragOffset(@NonNull V v) {
    }

    public int getScrollRangeForDragFling(@NonNull V v) {
    }

    public int getTopBottomOffsetForScrollingSibling() {
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i2) {
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
    }
}
