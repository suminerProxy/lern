package com.baidu.mapapi.map;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private int f1803a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private long f1804d;

    /* renamed from: e  reason: collision with root package name */
    private View f1805e;

    /* renamed from: f  reason: collision with root package name */
    private DismissCallbacks f1806f;

    /* renamed from: g  reason: collision with root package name */
    private int f1807g;

    /* renamed from: h  reason: collision with root package name */
    private float f1808h;

    /* renamed from: i  reason: collision with root package name */
    private float f1809i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1810j;

    /* renamed from: k  reason: collision with root package name */
    private int f1811k;

    /* renamed from: l  reason: collision with root package name */
    private Object f1812l;

    /* renamed from: m  reason: collision with root package name */
    private VelocityTracker f1813m;

    /* renamed from: n  reason: collision with root package name */
    private float f1814n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1815o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1816p;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);

        void onNotify();
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
    }

    public static /* synthetic */ void a(SwipeDismissTouchListener swipeDismissTouchListener) {
    }

    public static /* synthetic */ View b(SwipeDismissTouchListener swipeDismissTouchListener) {
    }

    public static /* synthetic */ Object c(SwipeDismissTouchListener swipeDismissTouchListener) {
    }

    public static /* synthetic */ DismissCallbacks d(SwipeDismissTouchListener swipeDismissTouchListener) {
    }

    @Override // android.view.View.OnTouchListener
    @TargetApi(12)
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @TargetApi(11)
    private void a() {
    }
}
