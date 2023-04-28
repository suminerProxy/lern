package com.taihebase.activity.view.recycleview.spannedgridlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SpannedGridLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private c f8109a;
    private int b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private int f8110d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f8111e;

    /* renamed from: f  reason: collision with root package name */
    private int f8112f;

    /* renamed from: g  reason: collision with root package name */
    private int f8113g;

    /* renamed from: h  reason: collision with root package name */
    private int f8114h;

    /* renamed from: i  reason: collision with root package name */
    private int f8115i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8116j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray<b> f8117k;

    /* renamed from: l  reason: collision with root package name */
    private List<Integer> f8118l;

    /* renamed from: m  reason: collision with root package name */
    private int f8119m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f8120n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SpannedGridLayoutManager f8121a;

        public a(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8122a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8123d;

        public b(int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        e a(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d extends RecyclerView.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f8124a;
        public int b;

        public d(Context context, AttributeSet attributeSet) {
        }

        public d(int i2, int i3) {
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public d(ViewGroup.LayoutParams layoutParams) {
        }

        public d(RecyclerView.LayoutParams layoutParams) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class e {
        public static final e c = null;

        /* renamed from: a  reason: collision with root package name */
        public int f8125a;
        public int b;

        public e(int i2, int i3) {
        }
    }

    public SpannedGridLayoutManager(c cVar, int i2, float f2) {
    }

    private void A(int i2, int i3) {
    }

    private void B(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    private void C() {
    }

    private void D() {
    }

    public static /* synthetic */ int i(SpannedGridLayoutManager spannedGridLayoutManager, int i2) {
    }

    public static /* synthetic */ int j(SpannedGridLayoutManager spannedGridLayoutManager) {
    }

    public static /* synthetic */ int k(SpannedGridLayoutManager spannedGridLayoutManager) {
    }

    private void l() {
    }

    private void m(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    private void n() {
    }

    private int o(int i2) {
    }

    private int q(int i2, RecyclerView.State state) {
    }

    private int r() {
    }

    private int s(int i2) {
    }

    private int t(int i2) {
    }

    private e u(int i2) {
    }

    private int updateSpecWithExtra(int i2, int i3, int i4) {
    }

    private int v() {
    }

    private void w(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
    }

    private int x(int i2, int i3, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    private void y(View view, int i2, int i3) {
    }

    private void z(String str) {
    }

    public void E(@NonNull c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
    }

    public int findLastVisibleItemPosition() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    public int p() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Keep
    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
