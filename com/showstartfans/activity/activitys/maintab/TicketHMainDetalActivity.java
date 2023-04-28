package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.eventmodel.RefreshTicketListEvent;
import com.showstartfans.activity.eventmodel.TicketSuccessEvent;
import com.showstartfans.activity.model.ShareMouldBean;
import com.showstartfans.activity.model.WalletBean;
import com.showstartfans.activity.model.actdes.SiteBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.RatioLayout;
import h.u.a.w.d0.p2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TicketHMainDetalActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\b\u0010\u001b\u001a\u00020\u000eH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0014J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010!H\u0007J\b\u0010\"\u001a\u00020\u000eH\u0014J\b\u0010#\u001a\u00020\u000eH\u0014J\b\u0010$\u001a\u00020%H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/TicketHMainDetalActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "ID", "", "inviationData", "Lcom/showstartfans/activity/model/ShareMouldBean;", "layout_Invitation", "Lcom/taihebase/activity/view/RatioLayout;", "mBean", "Lcom/showstartfans/activity/model/WalletBean;", "tv_show_invation", "Landroid/widget/TextView;", "OnNoNetWork", "", "OnRefresh", "progress", "", "checkCenterView", "getData", "getInvitationData", "goToMap", "siteBean", "Lcom/showstartfans/activity/model/actdes/SiteBean;", "initData", "bean", "initListener", "initView", "needBindUI", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshTicketListEvent;", "Lcom/showstartfans/activity/eventmodel/TicketSuccessEvent;", "onPause", "onResume", "setContentViewRes", "", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class TicketHMainDetalActivity extends BaseNoToolBarActivity {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5875h = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private WalletBean f5876d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ShareMouldBean f5877e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private RatioLayout f5878f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TextView f5879g;

    /* compiled from: TicketHMainDetalActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/TicketHMainDetalActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "id", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context, @Nullable String str) {
        }
    }

    /* compiled from: TicketHMainDetalActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TicketHMainDetalActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ TicketHMainDetalActivity this$0;

        public c(TicketHMainDetalActivity ticketHMainDetalActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TicketHMainDetalActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/TicketHMainDetalActivity$initListener$2", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TicketHMainDetalActivity f5880a;

        public d(TicketHMainDetalActivity ticketHMainDetalActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: TicketHMainDetalActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/TicketHMainDetalActivity$initListener$3$dialog$1", "Lcom/showstartfans/activity/widget/popupwindow/OnTicketHolderSelect;", "onSelfSuccess", "", "onTicketHolderSelect", "meJoin", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements p2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TicketHMainDetalActivity f5881a;

        public e(TicketHMainDetalActivity ticketHMainDetalActivity) {
        }

        @Override // h.u.a.w.d0.p2
        public void a() {
        }

        @Override // h.u.a.w.d0.p2
        public void b(boolean z) {
        }
    }

    private final void A() {
    }

    private final void B() {
    }

    private static final void C(TicketHMainDetalActivity ticketHMainDetalActivity, n nVar) {
    }

    private final void D() {
    }

    private static final void E(TicketHMainDetalActivity ticketHMainDetalActivity, n nVar) {
    }

    private final void F(SiteBean siteBean) {
    }

    private final void G(WalletBean walletBean) {
    }

    private static final void H(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void I(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void J(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void K(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void L(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void M(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void N(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private static final void O(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void P(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void Q(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void R(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void S(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void T(TicketHMainDetalActivity ticketHMainDetalActivity, n nVar) {
    }

    public static /* synthetic */ void U(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void V(TicketHMainDetalActivity ticketHMainDetalActivity, n nVar) {
    }

    public static /* synthetic */ void W(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void X(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    public static /* synthetic */ void Y(TicketHMainDetalActivity ticketHMainDetalActivity, View view) {
    }

    private final void Z() {
    }

    @JvmStatic
    public static final void a0(@NotNull Context context, @Nullable String str) {
    }

    private final void w() {
    }

    private final void x(boolean z) {
    }

    public static final /* synthetic */ void y(TicketHMainDetalActivity ticketHMainDetalActivity, boolean z) {
    }

    public static final /* synthetic */ void z(TicketHMainDetalActivity ticketHMainDetalActivity) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshTicketListEvent refreshTicketListEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable TicketSuccessEvent ticketSuccessEvent) {
    }
}
