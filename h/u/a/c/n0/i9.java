package h.u.a.c.n0;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.showstartfans.activity.eventmodel.RefreshReceiverOrderListEvent;
import com.showstartfans.activity.eventmodel.RefreshUserOrderListEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowOrderListFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\u0006\u0010!\u001a\u00020\u0019J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010'H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/ShowOrderListFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/usercenter/adapter/OrderListAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/usercenter/adapter/OrderListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "emp", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getEmp", "()Landroid/view/View;", "emp$delegate", "emptyMore", "emptyText", "Landroid/widget/TextView;", "footerMore", "history", "", "isFirstRequest", "", "pageIndex", com.alipay.sdk.widget.j.f849j, "", "createFooter", "getContentView", "getMyOrder", "isShow", "initData", "initListener", "initView", "loadFirst", "loadMore", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshReceiverOrderListEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserOrderListEvent;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class i9 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f19670k = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View f19671d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View f19672e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TextView f19673f;

    /* renamed from: g  reason: collision with root package name */
    private int f19674g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f19675h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f19676i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19677j;

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/ShowOrderListFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/usercenter/ShowOrderListFragment;", "from", "", "payFromToType", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ i9 b(a aVar, String str, int i2, int i3, Object obj) {
        }

        @NotNull
        public final i9 a(@NotNull String str, int i2) {
        }
    }

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/usercenter/adapter/OrderListAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.n0.o9.a0> {
        public final /* synthetic */ i9 this$0;

        public b(i9 i9Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.n0.o9.a0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.n0.o9.a0 invoke() {
        }
    }

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<View> {
        public final /* synthetic */ i9 this$0;

        public c(i9 i9Var) {
        }

        public static /* synthetic */ void a(i9 i9Var, View view) {
        }

        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        private static final void m44invoke$lambda1$lambda0(i9 i9Var, View view) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ View invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
        }
    }

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ i9 this$0;

        public d(i9 i9Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/ShowOrderListFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i9 f19678a;

        public e(i9 i9Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: ShowOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ i9 $this_run;

        public f(i9 i9Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static /* synthetic */ void A(i9 i9Var, h.y.a.m.n nVar) {
    }

    private final void C() {
    }

    public static final /* synthetic */ FragmentActivity g(i9 i9Var) {
    }

    public static final /* synthetic */ View h(i9 i9Var) {
    }

    public static final /* synthetic */ void i(i9 i9Var, boolean z) {
    }

    public static final /* synthetic */ int j(i9 i9Var) {
    }

    public static final /* synthetic */ void k(i9 i9Var) {
    }

    public static final /* synthetic */ void l(i9 i9Var, View view) {
    }

    public static final /* synthetic */ void m(i9 i9Var, TextView textView) {
    }

    public static final /* synthetic */ void n(i9 i9Var, int i2) {
    }

    public static final /* synthetic */ void q(i9 i9Var, int i2) {
    }

    private final void r() {
    }

    private final View s() {
    }

    private static final void u(i9 i9Var, View view) {
    }

    private final h.u.a.c.n0.o9.a0 v() {
    }

    private final View w() {
    }

    private final void x(boolean z) {
    }

    private static final void y(i9 i9Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void z(i9 i9Var, View view) {
    }

    public final void B() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
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

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserOrderListEvent refreshUserOrderListEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshReceiverOrderListEvent refreshReceiverOrderListEvent) {
    }
}
