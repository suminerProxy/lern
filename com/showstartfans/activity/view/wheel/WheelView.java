package com.showstartfans.activity.view.wheel;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import h.u.a.u.h4.c;
import h.u.a.u.h4.d;
import h.u.a.u.h4.f;
import h.u.a.u.h4.g;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WheelView extends View {
    private static final int[] u = null;
    private static final int v = 10;
    private static final int w = 10;
    private static final int x = 5;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7343d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f7344e;

    /* renamed from: f  reason: collision with root package name */
    private GradientDrawable f7345f;

    /* renamed from: g  reason: collision with root package name */
    private GradientDrawable f7346g;

    /* renamed from: h  reason: collision with root package name */
    private g f7347h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7348i;

    /* renamed from: j  reason: collision with root package name */
    private int f7349j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7350k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f7351l;

    /* renamed from: m  reason: collision with root package name */
    private int f7352m;

    /* renamed from: n  reason: collision with root package name */
    private h.u.a.u.h4.h.g f7353n;

    /* renamed from: o  reason: collision with root package name */
    private f f7354o;

    /* renamed from: p  reason: collision with root package name */
    private List<h.u.a.u.h4.b> f7355p;
    private List<d> q;
    private List<c> r;
    public g.c s;
    private DataSetObserver t;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WheelView f7356a;

        public a(WheelView wheelView) {
        }

        @Override // h.u.a.u.h4.g.c
        public void a() {
        }

        @Override // h.u.a.u.h4.g.c
        public void b() {
        }

        @Override // h.u.a.u.h4.g.c
        public void c(int i2) {
        }

        @Override // h.u.a.u.h4.g.c
        public void onFinished() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WheelView f7357a;

        public b(WheelView wheelView) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public WheelView(Context context, AttributeSet attributeSet, int i2) {
    }

    private boolean A() {
    }

    private void E() {
    }

    public static /* synthetic */ boolean a(WheelView wheelView) {
    }

    public static /* synthetic */ boolean b(WheelView wheelView, boolean z) {
    }

    public static /* synthetic */ void c(WheelView wheelView, int i2) {
    }

    public static /* synthetic */ int d(WheelView wheelView) {
    }

    public static /* synthetic */ int e(WheelView wheelView, int i2) {
    }

    public static /* synthetic */ g f(WheelView wheelView) {
    }

    private boolean g(int i2, boolean z) {
    }

    private int getItemHeight() {
    }

    private h.u.a.u.h4.a getItemsRange() {
    }

    private void h() {
    }

    private int i(int i2, int i3) {
    }

    private void j() {
    }

    private void k(int i2) {
    }

    private void l(Canvas canvas) {
    }

    private void m(Canvas canvas) {
    }

    private void n(Canvas canvas) {
    }

    private int o(LinearLayout linearLayout) {
    }

    private View p(int i2) {
    }

    private void q(Context context) {
    }

    private void r() {
    }

    private boolean u(int i2) {
    }

    private void v(int i2, int i3) {
    }

    public void B(int i2, int i3) {
    }

    public void C(int i2, boolean z) {
    }

    public void D() {
    }

    public void addChangingListener(h.u.a.u.h4.b bVar) {
    }

    public void addClickingListener(c cVar) {
    }

    public void addScrollingListener(d dVar) {
    }

    public int getCurrentItem() {
    }

    public h.u.a.u.h4.h.g getViewAdapter() {
    }

    public int getVisibleItems() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void removeChangingListener(h.u.a.u.h4.b bVar) {
    }

    public void removeClickingListener(c cVar) {
    }

    public void removeScrollingListener(d dVar) {
    }

    public void s(boolean z) {
    }

    public void setCurrentItem(int i2) {
    }

    public void setCyclic(boolean z) {
    }

    public void setInterpolator(Interpolator interpolator) {
    }

    public void setViewAdapter(h.u.a.u.h4.h.g gVar) {
    }

    public void setVisibleItems(int i2) {
    }

    public boolean t() {
    }

    public void w(int i2, int i3) {
    }

    public void x(int i2) {
    }

    public void y() {
    }

    public void z() {
    }

    public WheelView(Context context, AttributeSet attributeSet) {
    }

    public WheelView(Context context) {
    }
}
