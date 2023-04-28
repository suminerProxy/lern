package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import h.f.a.a.d;
import h.f.a.a.f;
import h.f.a.a.j;
import h.f.a.a.k;
import h.f.a.a.m;
import h.f.a.a.p;
import h.f.a.a.s.n;
import h.f.a.a.t.e0.i;
import h.f.a.a.t.g;
import h.f.a.a.t.h;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChipsLayoutManager extends RecyclerView.LayoutManager implements f, k, m.a {
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 4;
    public static final int G = 5;
    public static final int H = 6;
    private static final String I = "ChipsLayoutManager";
    private static final int J = 10;
    private static final int K = 5;
    private static final float L = 2.0f;
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private g f2945a;
    private h.f.a.a.g b;
    private h.f.a.a.b c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<View> f2946d;

    /* renamed from: e  reason: collision with root package name */
    private n f2947e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2948f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f2949g;

    /* renamed from: h  reason: collision with root package name */
    private i f2950h;
    @Orientation

    /* renamed from: i  reason: collision with root package name */
    private int f2951i;

    /* renamed from: j  reason: collision with root package name */
    private int f2952j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2953k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2954l;

    /* renamed from: m  reason: collision with root package name */
    private h.f.a.a.r.a f2955m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private Integer f2956n;

    /* renamed from: o  reason: collision with root package name */
    private SparseArray<View> f2957o;

    /* renamed from: p  reason: collision with root package name */
    private ParcelableContainer f2958p;
    private h.f.a.a.u.d.c q;
    private boolean r;
    private int s;
    private AnchorViewState t;
    private h.f.a.a.t.m u;
    private h.f.a.a.t.k v;
    private h.f.a.a.q.c w;
    private j x;
    private h.f.a.a.t.g0.g y;
    private h.f.a.a.u.e.b z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f2959a;
        public final /* synthetic */ ChipsLayoutManager b;

        public /* synthetic */ b(ChipsLayoutManager chipsLayoutManager, a aVar) {
        }

        public ChipsLayoutManager a() {
        }

        public b b(int i2) {
        }

        public b c(@NonNull n nVar) {
        }

        public b d(@IntRange(from = 1) int i2) {
        }

        public b e(@Orientation int i2) {
        }

        public b f(@NonNull i iVar) {
        }

        public c g(int i2) {
        }

        public b h(boolean z) {
        }

        private b(ChipsLayoutManager chipsLayoutManager) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c extends b {
        public final /* synthetic */ ChipsLayoutManager c;

        public c(ChipsLayoutManager chipsLayoutManager) {
        }

        public b i(boolean z) {
        }
    }

    @VisibleForTesting
    public ChipsLayoutManager(Context context) {
    }

    private void A() {
    }

    private void B(RecyclerView.Recycler recycler) {
    }

    private void C(RecyclerView.Recycler recycler, h hVar, h hVar2) {
    }

    private void D() {
    }

    private void E(RecyclerView.Recycler recycler, h hVar, int i2) {
    }

    private void N(RecyclerView.Recycler recycler, @NonNull h hVar, h hVar2) {
    }

    public static b O(Context context) {
    }

    private void P(int i2) {
    }

    private void Q() {
    }

    private void R() {
    }

    private void S() {
    }

    public static /* synthetic */ j i(ChipsLayoutManager chipsLayoutManager, j jVar) {
    }

    public static /* synthetic */ boolean j(ChipsLayoutManager chipsLayoutManager, boolean z) {
    }

    public static /* synthetic */ AnchorViewState k(ChipsLayoutManager chipsLayoutManager, AnchorViewState anchorViewState) {
    }

    public static /* synthetic */ h.f.a.a.g l(ChipsLayoutManager chipsLayoutManager, h.f.a.a.g gVar) {
    }

    public static /* synthetic */ h.f.a.a.b m(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ n n(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ n o(ChipsLayoutManager chipsLayoutManager, n nVar) {
    }

    public static /* synthetic */ int p(ChipsLayoutManager chipsLayoutManager, int i2) {
    }

    public static /* synthetic */ Integer q(ChipsLayoutManager chipsLayoutManager, Integer num) {
    }

    public static /* synthetic */ i r(ChipsLayoutManager chipsLayoutManager, i iVar) {
    }

    public static /* synthetic */ int s(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ int t(ChipsLayoutManager chipsLayoutManager, int i2) {
    }

    public static /* synthetic */ h.f.a.a.t.m u(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ h.f.a.a.t.m v(ChipsLayoutManager chipsLayoutManager, h.f.a.a.t.m mVar) {
    }

    public static /* synthetic */ g w(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ g x(ChipsLayoutManager chipsLayoutManager, g gVar) {
    }

    public static /* synthetic */ h.f.a.a.q.c y(ChipsLayoutManager chipsLayoutManager) {
    }

    public static /* synthetic */ h.f.a.a.q.c z(ChipsLayoutManager chipsLayoutManager, h.f.a.a.q.c cVar) {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public AnchorViewState F() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g G() {
    }

    public n H() {
    }

    @Nullable
    public View I(int i2) {
    }

    public int J() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public h.f.a.a.r.a K() {
    }

    public d L() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean M() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void T(h.f.a.a.u.e.b bVar) {
    }

    public p U() {
    }

    @Override // h.f.a.a.f, h.f.a.a.i
    public boolean a() {
    }

    @Override // h.f.a.a.f, h.f.a.a.i
    public void b(boolean z) {
    }

    @Override // h.f.a.a.f, h.f.a.a.k
    @Orientation
    public int c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollRange(RecyclerView.State state) {
    }

    @Override // h.f.a.a.m.a
    public void d(j jVar, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
    }

    @Override // h.f.a.a.f
    public void e(@IntRange(from = 1) Integer num) {
    }

    @Override // h.f.a.a.f
    public Integer f() {
    }

    @Override // h.f.a.a.h
    public int findFirstCompletelyVisibleItemPosition() {
    }

    @Override // h.f.a.a.h
    public int findFirstVisibleItemPosition() {
    }

    @Override // h.f.a.a.h
    public int findLastCompletelyVisibleItemPosition() {
    }

    @Override // h.f.a.a.h
    public int findLastVisibleItemPosition() {
    }

    @Override // h.f.a.a.f
    public int g() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getItemCount() {
    }

    @Override // h.f.a.a.f
    public i h() {
    }

    @Override // h.f.a.a.k
    public boolean isLayoutRTL() {
    }

    @Override // h.f.a.a.i
    public boolean isSmoothScrollbarEnabled() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(int i2, int i3) {
    }

    @Override // h.f.a.a.i
    public void setSmoothScrollbarEnabled(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
    }
}
