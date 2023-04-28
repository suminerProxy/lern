package h.u.a.c.n0;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.showstartfans.activity.eventmodel.RefreshPeripheralOrderEvent;
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

/* compiled from: PhotoOrderListFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0014J\u0006\u0010\u001d\u001a\u00020\u0018J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0006\u0010#\u001a\u00020\u0018J\b\u0010$\u001a\u00020\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/PhotoOrderListFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/goods/PhotoOrderAdapter;", "emp", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getEmp", "()Landroid/view/View;", "emp$delegate", "Lkotlin/Lazy;", "emptyMore", "emptyText", "Landroid/widget/TextView;", "footerMore", "history", "", "isFirstRequest", "", "pageNo", "createFooter", "getContentView", "getData", "", "isShowProgress", "initData", "initListener", "initView", "loadFirst", "loadMore", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshPeripheralOrderEvent;", com.alipay.sdk.widget.j.f844e, "onRestart", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class g9 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f19645k = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private h.u.a.c.b0.h4 c;

    /* renamed from: d  reason: collision with root package name */
    private int f19646d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View f19647e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private View f19648f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TextView f19649g;

    /* renamed from: h  reason: collision with root package name */
    private int f19650h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f19651i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19652j;

    /* compiled from: PhotoOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/PhotoOrderListFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/usercenter/PhotoOrderListFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final g9 a() {
        }
    }

    /* compiled from: PhotoOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<View> {
        public final /* synthetic */ g9 this$0;

        public b(g9 g9Var) {
        }

        public static /* synthetic */ void a(g9 g9Var, View view) {
        }

        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        private static final void m43invoke$lambda1$lambda0(g9 g9Var, View view) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ View invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
        }
    }

    /* compiled from: PhotoOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ g9 this$0;

        public c(g9 g9Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: PhotoOrderListFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/PhotoOrderListFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g9 f19653a;

        public d(g9 g9Var) {
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

    public static final /* synthetic */ FragmentActivity g(g9 g9Var) {
    }

    public static final /* synthetic */ void h(g9 g9Var, boolean z) {
    }

    public static final /* synthetic */ View i(g9 g9Var) {
    }

    public static final /* synthetic */ int j(g9 g9Var) {
    }

    public static final /* synthetic */ void k(g9 g9Var) {
    }

    public static final /* synthetic */ void l(g9 g9Var, View view) {
    }

    public static final /* synthetic */ void m(g9 g9Var, TextView textView) {
    }

    public static final /* synthetic */ void n(g9 g9Var, int i2) {
    }

    public static final /* synthetic */ void q(g9 g9Var, int i2) {
    }

    private final View r() {
    }

    private static final void s(g9 g9Var, View view) {
    }

    private final void u(boolean z) {
    }

    private static final void v(g9 g9Var, h.y.a.m.n nVar) {
    }

    private final View w() {
    }

    public static /* synthetic */ void x(g9 g9Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(g9 g9Var, View view) {
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
    public final void onEvent(@Nullable RefreshPeripheralOrderEvent refreshPeripheralOrderEvent) {
    }

    public final void onRefresh() {
    }

    @Override // h.y.a.f.o.e
    public void onRestart() {
    }

    public final void z() {
    }
}
