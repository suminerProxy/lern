package com.baoyz.swipemenulistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SwipeMenuListView extends ListView {

    /* renamed from: n  reason: collision with root package name */
    private static final int f2928n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f2929o = 1;

    /* renamed from: p  reason: collision with root package name */
    private static final int f2930p = 2;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private float f2931d;

    /* renamed from: e  reason: collision with root package name */
    private float f2932e;

    /* renamed from: f  reason: collision with root package name */
    private int f2933f;

    /* renamed from: g  reason: collision with root package name */
    private int f2934g;

    /* renamed from: h  reason: collision with root package name */
    private SwipeMenuLayout f2935h;

    /* renamed from: i  reason: collision with root package name */
    private c f2936i;

    /* renamed from: j  reason: collision with root package name */
    private h.e.a.c f2937j;

    /* renamed from: k  reason: collision with root package name */
    private b f2938k;

    /* renamed from: l  reason: collision with root package name */
    private Interpolator f2939l;

    /* renamed from: m  reason: collision with root package name */
    private Interpolator f2940m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends h.e.a.b {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ SwipeMenuListView f2941e;

        public a(SwipeMenuListView swipeMenuListView, Context context, ListAdapter listAdapter) {
        }

        @Override // h.e.a.b, com.baoyz.swipemenulistview.SwipeMenuView.a
        public void a(SwipeMenuView swipeMenuView, h.e.a.a aVar, int i2) {
        }

        @Override // h.e.a.b
        public void c(h.e.a.a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        boolean a(int i2, h.e.a.a aVar, int i3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a(int i2);

        void b(int i2);
    }

    public SwipeMenuListView(Context context) {
    }

    public static /* synthetic */ h.e.a.c a(SwipeMenuListView swipeMenuListView) {
    }

    public static /* synthetic */ b b(SwipeMenuListView swipeMenuListView) {
    }

    public static /* synthetic */ SwipeMenuLayout c(SwipeMenuListView swipeMenuListView) {
    }

    private int d(int i2) {
    }

    private void e() {
    }

    public void f(int i2) {
    }

    public Interpolator getCloseInterpolator() {
    }

    public Interpolator getOpenInterpolator() {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    public void setCloseInterpolator(Interpolator interpolator) {
    }

    public void setMenuCreator(h.e.a.c cVar) {
    }

    public void setOnMenuItemClickListener(b bVar) {
    }

    public void setOnSwipeListener(c cVar) {
    }

    public void setOpenInterpolator(Interpolator interpolator) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
    }

    public SwipeMenuListView(Context context, AttributeSet attributeSet, int i2) {
    }

    public SwipeMenuListView(Context context, AttributeSet attributeSet) {
    }
}
