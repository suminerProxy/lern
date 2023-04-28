package com.showstartfans.activity.widget.citylist;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PinnedSectionListView extends ListView {
    private final Rect b;
    private final PointF c;

    /* renamed from: d  reason: collision with root package name */
    private int f7460d;

    /* renamed from: e  reason: collision with root package name */
    private View f7461e;

    /* renamed from: f  reason: collision with root package name */
    private MotionEvent f7462f;

    /* renamed from: g  reason: collision with root package name */
    private GradientDrawable f7463g;

    /* renamed from: h  reason: collision with root package name */
    private int f7464h;

    /* renamed from: i  reason: collision with root package name */
    private int f7465i;

    /* renamed from: j  reason: collision with root package name */
    public AbsListView.OnScrollListener f7466j;

    /* renamed from: k  reason: collision with root package name */
    public d f7467k;

    /* renamed from: l  reason: collision with root package name */
    public d f7468l;

    /* renamed from: m  reason: collision with root package name */
    public int f7469m;

    /* renamed from: n  reason: collision with root package name */
    private final AbsListView.OnScrollListener f7470n;

    /* renamed from: o  reason: collision with root package name */
    private final DataSetObserver f7471o;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements AbsListView.OnScrollListener {
        public final /* synthetic */ PinnedSectionListView b;

        public a(PinnedSectionListView pinnedSectionListView) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PinnedSectionListView f7472a;

        public b(PinnedSectionListView pinnedSectionListView) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Runnable {
        public final /* synthetic */ PinnedSectionListView b;

        public c(PinnedSectionListView pinnedSectionListView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f7473a;
        public int b;
        public long c;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface e extends ListAdapter {
        boolean b(int i2);
    }

    public PinnedSectionListView(Context context, AttributeSet attributeSet) {
    }

    private void a() {
    }

    private void h() {
    }

    public static boolean i(ListAdapter listAdapter, int i2) {
    }

    private boolean j(View view, float f2, float f3) {
    }

    private boolean k() {
    }

    public void b(int i2) {
    }

    public void c() {
    }

    public void d(int i2, int i3, int i4) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public int e(int i2) {
    }

    public int f(int i2, int i3) {
    }

    public void g(boolean z) {
    }

    public void l() {
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
    }

    public void setShadowVisible(boolean z) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
    }

    public PinnedSectionListView(Context context, AttributeSet attributeSet, int i2) {
    }
}
