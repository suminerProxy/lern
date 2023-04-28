package h.u.a.c.f0.v9;

import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.showstartfans.activity.model.PostArticleData;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.view.AutoScrollRecyclerView;
import h.u.a.c.f0.l9;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleListTabFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0014J\b\u0010%\u001a\u00020\u001eH\u0014J\u0006\u0010&\u001a\u00020\u001eJ\b\u0010'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u0006\u0010,\u001a\u00020\u001eJ\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\tH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "fragments", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleGridFragment;", "Lkotlin/collections/ArrayList;", "isDownScroll", "", "isLoadFirstDataed", "iv_publish", "Landroid/widget/ImageView;", "layout_abl", "Lcom/google/android/material/appbar/AppBarLayout;", "layout_coord", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "layout_pull", "Lcom/soli/pullupdownrefresh/PullRefreshLayout;", "layout_top_topic", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "rv_top_list", "Lcom/taihebase/activity/view/AutoScrollRecyclerView;", "tab_Top", "Lcom/flyco/tablayout/SlidingTabLayout;", "topicAdapter", "Lcom/showstartfans/activity/activitys/maintab/TopicAdapter;", "vp_viewpager", "Landroidx/viewpager/widget/ViewPager;", "OnRefresh", "", "getContentView", "", "getPopUps", "getTopicData", "initData", "initListener", "initView", "loadFirstData", "onDestroy", "onDoubleClickHappen", "onInvisible", "onResume", "onVisible", "sctollToTop", "setTopicShow", "show", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v3 extends h.y.a.f.o.f implements h.u.a.l.b {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final a f18792p = null;
    @NotNull
    public Map<Integer, View> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<t3> f18793d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f18794e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private SlidingTabLayout f18795f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private AutoScrollRecyclerView f18796g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private l9 f18797h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private CollapsingToolbarLayout f18798i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18799j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private AppBarLayout f18800k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private ImageView f18801l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private CoordinatorLayout f18802m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private PullRefreshLayout f18803n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18804o;

    /* compiled from: ArticleListTabFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final v3 a() {
        }
    }

    /* compiled from: ArticleListTabFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment$initListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ v3 b;

        public b(v3 v3Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: ArticleListTabFragment.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002M\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ#\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment$initListener$2", "Lkotlin/Function3;", "Lcom/showstartfans/activity/model/PostArticleData;", "Lkotlin/ParameterName;", "name", "data", "", "pageIndex", "", "canSendPost", "", "Lcom/showstartfans/activity/activitys/maintab/newmain/OnGetFirstData;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements Function3<PostArticleData, Integer, Boolean, Unit> {
        public final /* synthetic */ v3 b;

        public c(v3 v3Var) {
        }

        public void a(@Nullable PostArticleData postArticleData, int i2, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData, Integer num, Boolean bool) {
        }
    }

    /* compiled from: ArticleListTabFragment.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment$initListener$3", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/ParameterName;", "name", "recyclerView", "", "dx", "dy", "", "Lcom/showstartfans/activity/activitys/maintab/newmain/OnScrolledCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements Function3<RecyclerView, Integer, Integer, Unit> {
        public final /* synthetic */ v3 b;
        public final /* synthetic */ t3 c;

        public d(v3 v3Var, t3 t3Var) {
        }

        public void a(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView, Integer num, Integer num2) {
        }
    }

    /* compiled from: ArticleListTabFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/ArticleListTabFragment$initListener$5", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v3 f18805a;

        public e(v3 v3Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    private static final void B(v3 v3Var) {
    }

    private final void D(boolean z) {
    }

    private final void i() {
    }

    public static final /* synthetic */ void j(v3 v3Var) {
    }

    public static final /* synthetic */ ImageView k(v3 v3Var) {
    }

    public static final /* synthetic */ AppBarLayout l(v3 v3Var) {
    }

    public static final /* synthetic */ boolean m(v3 v3Var) {
    }

    public static final /* synthetic */ void n(v3 v3Var, boolean z) {
    }

    private final void q() {
    }

    private static final void r(v3 v3Var, h.y.a.m.n nVar) {
    }

    private final void s() {
    }

    private static final void u(v3 v3Var, h.y.a.m.n nVar) {
    }

    private static final void v(v3 v3Var, View view) {
    }

    public static /* synthetic */ void w(v3 v3Var, View view) {
    }

    public static /* synthetic */ void x(v3 v3Var) {
    }

    public static /* synthetic */ void y(v3 v3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void z(v3 v3Var, h.y.a.m.n nVar) {
    }

    public final void A() {
    }

    public final void C() {
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // h.y.a.f.o.f, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // h.u.a.l.b
    public void p() {
    }
}
