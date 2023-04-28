package com.mob.tools.gui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PullToRequestView extends RelativeLayout {
    private static final int FAULT_TOLERANCE_RANGE = 10;
    private static final long MIN_REF_TIME = 1000;
    private PullToRequestAdatper adapter;
    private View bodyView;
    private float downY;
    private int footerHeight;
    private View footerView;
    private int headerHeight;
    private View headerView;
    private long pullTime;
    private boolean pullingDownLock;
    private boolean pullingUpLock;
    private int state;
    private Runnable stopAct;

    /* renamed from: top  reason: collision with root package name */
    private int f4423top;

    /* renamed from: com.mob.tools.gui.PullToRequestView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ PullToRequestView this$0;

        public AnonymousClass1(PullToRequestView pullToRequestView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public PullToRequestView(Context context) {
    }

    public static /* synthetic */ void access$000(PullToRequestView pullToRequestView) {
    }

    private boolean canPullDown() {
    }

    private boolean canPullUp() {
    }

    private MotionEvent getCancelEvent(MotionEvent motionEvent) {
    }

    private void init() {
    }

    private void performRequestNext() {
    }

    private void reversePulling() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public void lockPullingDown() {
    }

    public void lockPullingUp() {
    }

    public void performFresh() {
    }

    public void performPullingDown(boolean z) {
    }

    public void performPullingUp(boolean z) {
    }

    public void releasePullingDownLock() {
    }

    public void releasePullingUpLock() {
    }

    public void setAdapter(PullToRequestAdatper pullToRequestAdatper) {
    }

    public void stopPulling() {
    }

    public PullToRequestView(Context context, AttributeSet attributeSet) {
    }

    public PullToRequestView(Context context, AttributeSet attributeSet, int i2) {
    }
}
