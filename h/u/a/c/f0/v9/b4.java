package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.material.appbar.AppBarLayout;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabFindVideoFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020\u000bH\u0014J\u0006\u0010$\u001a\u00020\u000bJ\u0006\u0010%\u001a\u00020\u000bJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020'H\u0014J\b\u0010+\u001a\u00020'H\u0014J\b\u0010\u0010\u001a\u00020'H\u0014J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\b\u0010.\u001a\u00020'H\u0016J\u000e\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "beautyAdapter", "Lcom/showstartfans/activity/activitys/products/MarvellousAdapter;", "getBeautyAdapter", "()Lcom/showstartfans/activity/activitys/products/MarvellousAdapter;", "beautyAdapter$delegate", "Lkotlin/Lazy;", "initDisplayPos", "", "getInitDisplayPos", "()I", "setInitDisplayPos", "(I)V", "initView", "", "manager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "manager$delegate", "snapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "specialAdapter", "Lcom/showstartfans/activity/activitys/products/SpecialAdapter;", "getSpecialAdapter", "()Lcom/showstartfans/activity/activitys/products/SpecialAdapter;", "specialAdapter$delegate", "tabFragment", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "getTabFragment", "()Ljava/util/ArrayList;", "getContentView", "getCurrentParentSelect", "getCurrentSelect", "getVideoPage", "", "showDialog", "showPro", "initData", "initListener", "onDoubleClickHappen", "onInvisible", "onVisible", "onVisibleStatus", MapBundleKey.MapObjKey.OBJ_SL_VISI, "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class b4 extends h.y.a.f.o.f implements h.u.a.l.b {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f18636k = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18637d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18638e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private PagerSnapHelper f18639f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f18640g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f18641h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f18642i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<Fragment> f18643j;

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final b4 a() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/MarvellousAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.k0.d2> {
        public final /* synthetic */ b4 this$0;

        public b(b4 b4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.k0.d2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.k0.d2 invoke() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment$getVideoPage$1$1$2", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "createFragment", "Landroidx/fragment/app/Fragment;", h.a.a.a.a.i.g.C, "", "getItemCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends FragmentStateAdapter {
        public final /* synthetic */ b4 b;

        public c(b4 b4Var) {
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ b4 this$0;

        public d(b4 b4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b4 f18644a;

        public e(b4 b4Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment$initListener$2", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b4 f18645a;

        public f(b4 b4Var) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindVideoFragment$initListener$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "currentPage", "", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        private int f18646a;
        public final /* synthetic */ b4 b;

        public g(b4 b4Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function0<LinearLayoutManager> {
        public final /* synthetic */ b4 this$0;

        public h(b4 b4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ LinearLayoutManager invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LinearLayoutManager invoke() {
        }
    }

    /* compiled from: TabFindVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/SpecialAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function0<h.u.a.c.k0.m2> {
        public final /* synthetic */ b4 this$0;

        public i(b4 b4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.k0.m2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.k0.m2 invoke() {
        }
    }

    private static final void A(b4 b4Var, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void B(b4 b4Var, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void C(b4 b4Var) {
    }

    public static /* synthetic */ void D(b4 b4Var) {
    }

    public static /* synthetic */ void E(b4 b4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void F(b4 b4Var) {
    }

    private static final void G(b4 b4Var) {
    }

    private static final void I(b4 b4Var) {
    }

    public static final /* synthetic */ h.u.a.c.k0.d2 i(b4 b4Var) {
    }

    public static final /* synthetic */ FragmentActivity j(b4 b4Var) {
    }

    public static final /* synthetic */ LinearLayoutManager k(b4 b4Var) {
    }

    public static final /* synthetic */ PagerSnapHelper l(b4 b4Var) {
    }

    public static final /* synthetic */ void m(b4 b4Var, boolean z, boolean z2) {
    }

    private final h.u.a.c.k0.d2 n() {
    }

    private final LinearLayoutManager u() {
    }

    private final h.u.a.c.k0.m2 v() {
    }

    private final void x(boolean z, boolean z2) {
    }

    private static final void y(b4 b4Var, h.y.a.m.n nVar) {
    }

    private static final void z(b4 b4Var) {
    }

    public final void H(boolean z) {
    }

    public final void J(int i2) {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.o.f
    public void g() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    @Override // h.y.a.f.o.f
    public void h() {
    }

    @Override // h.y.a.f.o.e
    public void initData() {
    }

    @Override // h.y.a.f.o.e
    public void initListener() {
    }

    @Override // h.y.a.f.o.e
    public void initView() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final int q() {
    }

    public final int r() {
    }

    public final int s() {
    }

    @NotNull
    public final ArrayList<Fragment> w() {
    }
}
