package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
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

/* compiled from: TabMessageTabFollowFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\b\u0010\n\u001a\u00020\u0010H\u0014J\u0006\u0010\f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0006\u0010!\u001a\u00020\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabFollowFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/message/AdapterFollowMessageNew;", "getAdapter", "()Lcom/showstartfans/activity/activitys/message/AdapterFollowMessageNew;", "adapter$delegate", "Lkotlin/Lazy;", "initView", "", "loadFirst", "pageNo", "", "dataInit", "", com.alipay.sdk.util.l.c, "Lcom/taihebase/activity/network/Result;", "eventUpdate", TUIConstants.TUILive.USER_ID, "", "relationship", "getContentView", "getFollowMessage", "show", "initData", "initListener", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "smoothScroollTop", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class j4 extends h.y.a.f.o.e implements h.u.a.l.b {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f18716g = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f18717d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18718e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f18719f;

    /* compiled from: TabMessageTabFollowFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabFollowFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabFollowFragment;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final j4 a() {
        }
    }

    /* compiled from: TabMessageTabFollowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/message/AdapterFollowMessageNew;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.g0.l1> {
        public final /* synthetic */ j4 this$0;

        public b(j4 j4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.g0.l1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.g0.l1 invoke() {
        }
    }

    /* compiled from: TabMessageTabFollowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ j4 this$0;

        public c(j4 j4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabMessageTabFollowFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMessageTabFollowFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j4 f18720a;

        public d(j4 j4Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ FragmentActivity g(j4 j4Var) {
    }

    public static final /* synthetic */ void h(j4 j4Var, boolean z) {
    }

    public static final /* synthetic */ int i(j4 j4Var) {
    }

    public static final /* synthetic */ void j(j4 j4Var, int i2) {
    }

    private final void k(h.y.a.m.n nVar) {
    }

    private final void l(String str, int i2) {
    }

    private final h.u.a.c.g0.l1 m() {
    }

    private final void n(boolean z) {
    }

    private static final void q(j4 j4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void r(j4 j4Var) {
    }

    public static /* synthetic */ void s(j4 j4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void u(j4 j4Var) {
    }

    private static final void w(j4 j4Var) {
    }

    private static final void y(j4 j4Var) {
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
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void v() {
    }

    public final void x() {
    }
}
