package com.taihebase.activity.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.Queue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HorizontalListView extends AdapterView<ListAdapter> {
    public static final int A = 5;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public boolean b;
    public ListAdapter c;

    /* renamed from: d  reason: collision with root package name */
    private int f8192d;

    /* renamed from: e  reason: collision with root package name */
    private int f8193e;

    /* renamed from: f  reason: collision with root package name */
    public int f8194f;

    /* renamed from: g  reason: collision with root package name */
    public int f8195g;

    /* renamed from: h  reason: collision with root package name */
    private int f8196h;

    /* renamed from: i  reason: collision with root package name */
    private int f8197i;

    /* renamed from: j  reason: collision with root package name */
    public Scroller f8198j;

    /* renamed from: k  reason: collision with root package name */
    private GestureDetector f8199k;

    /* renamed from: l  reason: collision with root package name */
    private Queue<View> f8200l;

    /* renamed from: m  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f8201m;

    /* renamed from: n  reason: collision with root package name */
    private AdapterView.OnItemClickListener f8202n;

    /* renamed from: o  reason: collision with root package name */
    private AdapterView.OnItemLongClickListener f8203o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8204p;
    private ViewGroup q;
    private c r;
    private DataSetObserver s;
    private float t;
    private float u;
    private GestureDetector.OnGestureListener v;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HorizontalListView f8205a;

        public a(HorizontalListView horizontalListView) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ HorizontalListView b;

        public b(HorizontalListView horizontalListView) {
        }

        private boolean a(MotionEvent motionEvent, View view) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(int i2);
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ boolean a(HorizontalListView horizontalListView, boolean z2) {
    }

    public static /* synthetic */ void b(HorizontalListView horizontalListView) {
    }

    public static /* synthetic */ AdapterView.OnItemClickListener c(HorizontalListView horizontalListView) {
    }

    public static /* synthetic */ int d(HorizontalListView horizontalListView) {
    }

    public static /* synthetic */ AdapterView.OnItemSelectedListener e(HorizontalListView horizontalListView) {
    }

    public static /* synthetic */ AdapterView.OnItemLongClickListener f(HorizontalListView horizontalListView) {
    }

    private void g(View view, int i2) {
    }

    private void h(int i2) {
    }

    private void i(int i2, int i3) {
    }

    private void j(int i2, int i3) {
    }

    private synchronized void k() {
    }

    private /* synthetic */ void l() {
    }

    private int n(float f2, float f3) {
    }

    private void q(int i2) {
    }

    private void r(int i2) {
    }

    private synchronized void s() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
    }

    public /* synthetic */ void m() {
    }

    public boolean o(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public synchronized void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public boolean p(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    public void setMeasureChild(c cVar) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    public void setParentScroller(ViewGroup viewGroup) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i2) {
    }

    public synchronized void t(int i2) {
    }

    @Override // android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public ListAdapter getAdapter2() {
    }

    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
    }
}
