package h.u.a.c.f0.v9;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabFindAttentionFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020\u0015H\u0016J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0016J\u0006\u0010&\u001a\u00020\u0015R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindAttentionFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "isLoadFirstDataed", "", "layout_UnLogin", "Landroid/widget/LinearLayout;", "list", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", com.alipay.sdk.widget.j.f851l, "Lcom/soli/pullupdownrefresh/PullRefreshLayout;", "tvLogin", "Landroid/widget/TextView;", "clearTabFoundUnReadNum", "", "getContentView", "", "getData", "articleMinId", "", "initData", "initListener", "initView", "loadFirstData", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "onInvisible", com.alipay.sdk.widget.j.f844e, "onVisible", "sctollToTop", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class y3 extends h.y.a.f.o.f implements h.u.a.l.b {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f18811j = null;
    @NotNull
    public Map<Integer, View> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f18812d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private LoadMoreRecyclerView f18813e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private PullRefreshLayout f18814f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f18815g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TextView f18816h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18817i;

    /* compiled from: TabFindAttentionFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindAttentionFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindAttentionFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final y3 a() {
        }
    }

    /* compiled from: TabFindAttentionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.l0.t3> {
        public final /* synthetic */ y3 this$0;

        public b(y3 y3Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.l0.t3 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.l0.t3 invoke() {
        }
    }

    /* compiled from: TabFindAttentionFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindAttentionFragment$initListener$2", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y3 f18818a;

        public c(y3 y3Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ h.u.a.c.l0.t3 i(y3 y3Var) {
    }

    public static final /* synthetic */ void j(y3 y3Var, String str) {
    }

    public static final /* synthetic */ void k(y3 y3Var) {
    }

    private final void l() {
    }

    private final h.u.a.c.l0.t3 m() {
    }

    private final void n(String str) {
    }

    private final void onRefresh() {
    }

    private static final void q(y3 y3Var, String str, h.y.a.m.n nVar) {
    }

    private static final void r(y3 y3Var, View view) {
    }

    public static /* synthetic */ void s(y3 y3Var, String str, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void u(y3 y3Var) {
    }

    public static /* synthetic */ void v(y3 y3Var, View view) {
    }

    private static final void x(y3 y3Var) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void w() {
    }

    public final void y() {
    }
}
