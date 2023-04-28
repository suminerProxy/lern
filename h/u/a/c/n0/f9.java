package h.u.a.c.n0;

import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.eventmodel.RefreshPeriheralOrderListEvent;
import com.showstartfans.activity.eventmodel.RefreshPeripheralOrderEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PeripheralOrderListFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\u0006\u0010\u001c\u001a\u00020\u0017J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\"H\u0007J\u0006\u0010#\u001a\u00020\u0017J\b\u0010$\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/PeripheralOrderListFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/goods/PeripheralOrderAdapter;", "emp", "Landroid/view/View;", "emp_head_p", "emptyMore", "emptyText", "Landroid/widget/TextView;", "footerMore", "history", "", "isFirstRequest", "", "pageNo", "refreshRunnable", "Ljava/lang/Runnable;", "seeGoodsEmp", "createFooter", "getContentView", "getData", "", "isShowProgress", "initData", "initListener", "initView", "loadFirst", "loadMore", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshPeriheralOrderListEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshPeripheralOrderEvent;", com.alipay.sdk.widget.j.f844e, "onRestart", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class f9 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public static final a f19631n = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private TextView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View f19632d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View f19633e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private h.u.a.c.b0.g4 f19634f;

    /* renamed from: g  reason: collision with root package name */
    private int f19635g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private View f19636h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private View f19637i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f19638j;

    /* renamed from: k  reason: collision with root package name */
    private int f19639k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f19640l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19641m;

    /* compiled from: PeripheralOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/PeripheralOrderListFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/usercenter/PeripheralOrderListFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final f9 a() {
        }
    }

    /* compiled from: PeripheralOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ f9 this$0;

        public b(f9 f9Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: PeripheralOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/PeripheralOrderListFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f9 f19642a;

        public c(f9 f9Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    private final void A() {
    }

    private static final void B(f9 f9Var) {
    }

    public static final /* synthetic */ void g(f9 f9Var, boolean z) {
    }

    public static final /* synthetic */ int h(f9 f9Var) {
    }

    public static final /* synthetic */ void i(f9 f9Var, int i2) {
    }

    public static final /* synthetic */ void j(f9 f9Var, int i2) {
    }

    private final View k() {
    }

    private static final void l(f9 f9Var, View view) {
    }

    private final void m(boolean z) {
    }

    private static final void n(f9 f9Var, h.y.a.m.n nVar) {
    }

    /* renamed from: onEvent$lambda-10  reason: not valid java name */
    private static final void m42onEvent$lambda10(f9 f9Var) {
    }

    private static final void q(f9 f9Var, View view) {
    }

    private static final void r(f9 f9Var, View view) {
    }

    public static /* synthetic */ void s(f9 f9Var) {
    }

    public static /* synthetic */ void u(f9 f9Var, View view) {
    }

    public static /* synthetic */ void v(f9 f9Var, View view) {
    }

    public static /* synthetic */ void w(f9 f9Var) {
    }

    public static /* synthetic */ void x(f9 f9Var, View view) {
    }

    public static /* synthetic */ void y(f9 f9Var, h.y.a.m.n nVar) {
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
    public final void onEvent(@Nullable RefreshPeriheralOrderListEvent refreshPeriheralOrderListEvent) {
    }

    public final void onRefresh() {
    }

    @Override // h.y.a.f.o.e
    public void onRestart() {
    }

    public final void z() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshPeripheralOrderEvent refreshPeripheralOrderEvent) {
    }
}
