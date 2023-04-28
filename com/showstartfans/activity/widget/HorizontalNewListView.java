package com.showstartfans.activity.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.core.widget.EdgeEffectCompat;
import java.util.List;
import java.util.Queue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HorizontalNewListView extends AdapterView<ListAdapter> {
    private static final int J = -1;
    private static final int K = 0;
    private static final float L = 30.0f;
    private static final float M = 0.009f;
    private static final String N = "BUNDLE_ID_CURRENT_X";
    private static final String O = "BUNDLE_ID_PARENT_STATE";
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    private int A;
    private boolean B;
    private boolean C;
    private View.OnClickListener D;
    private DataSetObserver E;
    private Runnable F;
    private ViewGroup G;
    private float H;
    private float I;
    public Scroller b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private GestureDetector f7410d;

    /* renamed from: e  reason: collision with root package name */
    private int f7411e;

    /* renamed from: f  reason: collision with root package name */
    public ListAdapter f7412f;

    /* renamed from: g  reason: collision with root package name */
    private List<Queue<View>> f7413g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7414h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f7415i;

    /* renamed from: j  reason: collision with root package name */
    private View f7416j;

    /* renamed from: k  reason: collision with root package name */
    private int f7417k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f7418l;

    /* renamed from: m  reason: collision with root package name */
    public int f7419m;

    /* renamed from: n  reason: collision with root package name */
    public int f7420n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f7421o;

    /* renamed from: p  reason: collision with root package name */
    private int f7422p;
    private int q;
    private int r;
    private int s;
    private h t;
    private int u;
    private boolean v;
    private g w;
    private g.a x;
    private EdgeEffectCompat y;
    private EdgeEffectCompat z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnTouchListener {
        public final /* synthetic */ HorizontalNewListView b;

        public a(HorizontalNewListView horizontalNewListView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HorizontalNewListView f7423a;

        public b(HorizontalNewListView horizontalNewListView) {
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
        public final /* synthetic */ HorizontalNewListView b;

        public c(HorizontalNewListView horizontalNewListView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ HorizontalNewListView b;

        private d(HorizontalNewListView horizontalNewListView) {
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

        public /* synthetic */ d(HorizontalNewListView horizontalNewListView, a aVar) {
        }
    }

    @TargetApi(11)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e {
        private e() {
        }

        public static void a(Scroller scroller, float f2) {
        }
    }

    @TargetApi(14)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f {
        private f() {
        }

        public static float a(Scroller scroller) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface g {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES = null;
            public static final a SCROLL_STATE_FLING = null;
            public static final a SCROLL_STATE_IDLE = null;
            public static final a SCROLL_STATE_TOUCH_SCROLL = null;

            private a(String str, int i2) {
            }

            public static a valueOf(String str) {
            }

            public static a[] values() {
            }
        }

        void a(a aVar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface h {
        void a();
    }

    public HorizontalNewListView(Context context, AttributeSet attributeSet) {
    }

    private View A(int i2) {
    }

    private void B() {
    }

    private void C(int i2) {
    }

    private boolean D() {
    }

    private boolean E(int i2) {
    }

    private boolean F(int i2) {
    }

    private void G(View view) {
    }

    private int H(float f2, float f3) {
    }

    private void K(int i2) {
    }

    private void L(int i2, View view) {
    }

    private void M() {
    }

    private void N(int i2) {
    }

    private void O(Boolean bool) {
    }

    private void P() {
    }

    private void Q(Context context, AttributeSet attributeSet) {
    }

    private void T() {
    }

    private void U(int i2) {
    }

    public static /* synthetic */ GestureDetector a(HorizontalNewListView horizontalNewListView) {
    }

    public static /* synthetic */ boolean b(HorizontalNewListView horizontalNewListView) {
    }

    public static /* synthetic */ int c(HorizontalNewListView horizontalNewListView) {
    }

    public static /* synthetic */ View.OnClickListener d(HorizontalNewListView horizontalNewListView) {
    }

    public static /* synthetic */ boolean e(HorizontalNewListView horizontalNewListView, boolean z) {
    }

    public static /* synthetic */ boolean f(HorizontalNewListView horizontalNewListView, boolean z) {
    }

    public static /* synthetic */ void g(HorizontalNewListView horizontalNewListView) {
    }

    private View getLeftmostChild() {
    }

    private int getRenderHeight() {
    }

    private int getRenderWidth() {
    }

    private View getRightmostChild() {
    }

    public static /* synthetic */ void h(HorizontalNewListView horizontalNewListView) {
    }

    public static /* synthetic */ void i(HorizontalNewListView horizontalNewListView, Boolean bool) {
    }

    public static /* synthetic */ void j(HorizontalNewListView horizontalNewListView, g.a aVar) {
    }

    public static /* synthetic */ void k(HorizontalNewListView horizontalNewListView, int i2) {
    }

    public static /* synthetic */ int l(HorizontalNewListView horizontalNewListView, int i2, int i3) {
    }

    private void m(View view, int i2) {
    }

    private void n() {
    }

    private float o() {
    }

    private void p() {
    }

    private boolean q() {
    }

    private void r(Canvas canvas, Rect rect) {
    }

    private void s(Canvas canvas) {
    }

    private void setCurrentScrollState(g.a aVar) {
    }

    private void t(Canvas canvas) {
    }

    private void u(int i2) {
    }

    private void v(int i2, int i3) {
    }

    private void w(int i2, int i3) {
    }

    private View x(int i2) {
    }

    private int y(int i2, int i3) {
    }

    private ViewGroup.LayoutParams z(View view) {
    }

    public boolean I(MotionEvent motionEvent) {
    }

    public boolean J(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
    }

    public void R(int i2) {
    }

    public void S(h hVar, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    public void setDivider(Drawable drawable) {
    }

    public void setDividerWidth(int i2) {
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnScrollStateChangedListener(g gVar) {
    }

    public void setParentScroller(ViewGroup viewGroup) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i2) {
    }

    @Override // android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public ListAdapter getAdapter2() {
    }

    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
    }
}
