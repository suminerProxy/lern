package h.u.a.c.f0.v9;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.eventmodel.BaiduLocationEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.MainActivityHideBgEvent;
import com.showstartfans.activity.model.QuickCheckBean;
import com.showstartfans.activity.model.home.HomeHeadClassificationBean;
import com.showstartfans.activity.model.home.NewYearHomeHeaderBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabHomeShowFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\nH\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0014J\b\u0010#\u001a\u00020\u001fH\u0014J\b\u0010$\u001a\u00020\u001fH\u0014JF\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0005J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0005J\b\u0010/\u001a\u00020\u001fH\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u000103H\u0007J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u000104H\u0007J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u000105H\u0007J\b\u00106\u001a\u00020\u001fH\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\b\u00108\u001a\u00020\u001fH\u0002J\u0018\u00109\u001a\u00020\u001f2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010;H\u0002J\u0012\u0010<\u001a\u00020\u001f2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\b\u0010?\u001a\u00020\u001fH\u0002J\u0006\u0010@\u001a\u00020\u001fJ\u000e\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006D"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "cityCode", "", "classPagerList", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/home/HomeHeadClassificationBean;", "initDisplayPos", "", "isShowCityChange", "", "mQuickCheck", "Landroid/widget/ImageView;", "pop", "Lcom/showstartfans/activity/widget/QuickTickPop;", "quickCheckType", "spUtil", "Lcom/taihebase/activity/utils/SPUtileBiz;", "kotlin.jvm.PlatformType", "getSpUtil", "()Lcom/taihebase/activity/utils/SPUtileBiz;", "spUtil$delegate", "Lkotlin/Lazy;", "tabFragment", "Landroidx/fragment/app/Fragment;", "getTabFragment", "()Ljava/util/ArrayList;", "getContentView", "getHeadData", "", "show", "getQuickCheck", "initData", "initListener", "initView", TUIConstants.TUIChat.NOTICE, "searchStyleKey", "searchTypeClassKey", "activityScaleKey", "moreSaleKey", "morePriceKey", "startTime", "endTime", "onActivityResult", "cityCodeStr", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/BaiduLocationEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/MainActivityHideBgEvent;", "onInvisible", "onVisible", "scrollTop", "setHomeChannel", "classList", "", "setViewData", "bean", "Lcom/showstartfans/activity/model/home/NewYearHomeHeaderBean;", "showCityDifDialog", "smoothScroollTop", "visibleChange", MapBundleKey.MapObjKey.OBJ_SL_VISI, "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class f4 extends h.y.a.f.o.f implements h.u.a.l.b {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f18673m = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18674d;

    /* renamed from: e  reason: collision with root package name */
    private int f18675e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18676f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f18677g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private h.u.a.w.y f18678h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private ImageView f18679i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<HomeHeadClassificationBean> f18680j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<Fragment> f18681k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f18682l;

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ f4 b(a aVar, int i2, int i3, Object obj) {
        }

        @NotNull
        public final f4 a(int i2) {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/home/NewYearHomeHeaderBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<NewYearHomeHeaderBean, Unit> {
        public final /* synthetic */ f4 this$0;

        public b(f4 f4Var) {
        }

        public static /* synthetic */ void a(f4 f4Var) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m37invoke$lambda0(f4 f4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NewYearHomeHeaderBean newYearHomeHeaderBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable NewYearHomeHeaderBean newYearHomeHeaderBean) {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/QuickCheckBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<List<? extends QuickCheckBean>, Unit> {
        public final /* synthetic */ f4 this$0;

        public c(f4 f4Var) {
        }

        public static /* synthetic */ void a(f4 f4Var, View view) {
        }

        public static /* synthetic */ void b(f4 f4Var) {
        }

        /* renamed from: invoke$lambda-2$lambda-1  reason: not valid java name */
        private static final void m38invoke$lambda2$lambda1(f4 f4Var, View view) {
        }

        /* renamed from: invoke$lambda-2$lambda-1$lambda-0  reason: not valid java name */
        private static final void m39invoke$lambda2$lambda1$lambda0(f4 f4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends QuickCheckBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends QuickCheckBean> list) {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment$initListener$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4 f18683a;

        public d(f4 f4Var) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment$initListener$2", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4 f18684a;

        public e(f4 f4Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment$setHomeChannel$1$2", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "createFragment", "Landroidx/fragment/app/Fragment;", h.a.a.a.a.i.g.C, "", "getItemCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends FragmentStateAdapter {
        public final /* synthetic */ f4 b;

        public f(f4 f4Var) {
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }
    }

    /* compiled from: TabHomeShowFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/taihebase/activity/utils/SPUtileBiz;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<h.y.a.n.u0> {
        public static final g INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.y.a.n.u0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final h.y.a.n.u0 invoke() {
        }
    }

    private static final void A(f4 f4Var, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void B(f4 f4Var, String str, View view) {
    }

    public static /* synthetic */ void C(f4 f4Var, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void D(f4 f4Var) {
    }

    private final void G() {
    }

    private final void H(List<? extends HomeHeadClassificationBean> list) {
    }

    private final void I(NewYearHomeHeaderBean newYearHomeHeaderBean) {
    }

    private final void J() {
    }

    private static final void K(f4 f4Var, String str, View view) {
    }

    private static final void M(f4 f4Var) {
    }

    public static final /* synthetic */ String i(f4 f4Var) {
    }

    public static final /* synthetic */ FragmentActivity j(f4 f4Var) {
    }

    public static final /* synthetic */ void k(f4 f4Var, boolean z) {
    }

    public static final /* synthetic */ ImageView l(f4 f4Var) {
    }

    public static final /* synthetic */ h.u.a.w.y m(f4 f4Var) {
    }

    public static final /* synthetic */ h.y.a.n.u0 n(f4 f4Var) {
    }

    public static final /* synthetic */ void q(f4 f4Var, int i2) {
    }

    public static final /* synthetic */ void r(f4 f4Var, ImageView imageView) {
    }

    public static final /* synthetic */ void s(f4 f4Var, h.u.a.w.y yVar) {
    }

    public static final /* synthetic */ void u(f4 f4Var, NewYearHomeHeaderBean newYearHomeHeaderBean) {
    }

    public static final /* synthetic */ void v(f4 f4Var) {
    }

    private final void w(boolean z) {
    }

    private final void x() {
    }

    private final h.y.a.n.u0 y() {
    }

    public final void E(@NotNull String str, @NotNull String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
    }

    public final void F(@NotNull String str) {
    }

    public final void L() {
    }

    public final void N(boolean z) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable BaiduLocationEvent baiduLocationEvent) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    @NotNull
    public final ArrayList<Fragment> z() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable MainActivityHideBgEvent mainActivityHideBgEvent) {
    }
}
