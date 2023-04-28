package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Scroller;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ScrollerListView extends LoadListView implements AbsListView.OnScrollListener {
    private static final float t = 1.8f;
    private static final int u = 0;
    private static final int v = 400;

    /* renamed from: i  reason: collision with root package name */
    private Scroller f6924i;

    /* renamed from: j  reason: collision with root package name */
    private View f6925j;

    /* renamed from: k  reason: collision with root package name */
    private float f6926k;

    /* renamed from: l  reason: collision with root package name */
    private int f6927l;

    /* renamed from: m  reason: collision with root package name */
    private int f6928m;

    /* renamed from: n  reason: collision with root package name */
    private AbsListView.OnScrollListener f6929n;

    /* renamed from: o  reason: collision with root package name */
    private int f6930o;

    /* renamed from: p  reason: collision with root package name */
    private int f6931p;
    private final int q;
    private c r;
    private b s;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ScrollerListView b;

        public a(ScrollerListView scrollerListView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(View view, int i2);
    }

    public ScrollerListView(Context context) {
    }

    public static /* synthetic */ int m(ScrollerListView scrollerListView) {
    }

    public static /* synthetic */ int n(ScrollerListView scrollerListView, int i2) {
    }

    public static /* synthetic */ View o(ScrollerListView scrollerListView) {
    }

    public static /* synthetic */ void p(ScrollerListView scrollerListView, int i2) {
    }

    private void q(Context context) {
    }

    private boolean r(ListView listView) {
    }

    private void s() {
    }

    private void setHeaderHeight(int i2) {
    }

    private void t(float f2) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public int getHeaderHeight() {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setOnPullDownListener(b bVar) {
    }

    public void setOnScrollListener_ScrollerListView(AbsListView.OnScrollListener onScrollListener) {
    }

    public void setOnScrollerListener(c cVar) {
    }

    public void setTopScrollView(View view) {
    }

    public ScrollerListView(Context context, AttributeSet attributeSet) {
    }

    public ScrollerListView(Context context, AttributeSet attributeSet, int i2) {
    }
}
