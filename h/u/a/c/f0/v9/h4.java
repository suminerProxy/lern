package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import cn.sharesdk.framework.InnerShareParams;
import com.showstartfans.activity.eventmodel.ClearUnredMsgEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.PushEvent;
import com.showstartfans.activity.model.MessageUnreadBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import h.u.a.n.b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabMessageNewFragment.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\fH\u0014J\b\u0010\u001a\u001a\u00020\fH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\"H\u0007J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0005H\u0016J \u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00152\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010(J\u0018\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0015H\u0002J\u0006\u0010-\u001a\u00020\fJ\u0012\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageNewFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "isLogin", "", "()Z", "isLogin$delegate", "Lkotlin/Lazy;", "mUnreadBean", "Lcom/showstartfans/activity/model/MessageUnreadBean;", "OnRefresh", "", "checkIM", "clearCommMsgNum", "doApi", "clearJoinGroupMsgNum", "clearOfficalMsgNum", "clearOrderMsgNum", "clearShowMsgNum", "getContentView", "", "getMessagePoint", "initConversationLayout", "initData", "initListener", "initView", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ClearUnredMsgEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/PushEvent;", "Lcom/showstartfans/activity/model/LoginImEvent;", "onHiddenChanged", InnerShareParams.HIDDEN, "readSystemAll", "type", "onSuccess", "Lkotlin/Function0;", "setViewWidth", "view", "Landroid/view/View;", AnimatedPasterJsonConfig.CONFIG_WIDTH, "smoothScroollTop", "startChatActivity", "conversationInfo", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class h4 extends h.y.a.f.o.e implements h.u.a.l.b {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private MessageUnreadBean c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f18703d;

    /* compiled from: TabMessageNewFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMessageNewFragment$initListener$1", "Lcom/tencent/qcloud/tuikit/tuiconversation/ui/interfaces/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "viewType", "", "messageInfo", "Lcom/tencent/qcloud/tuikit/tuiconversation/bean/ConversationInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h4 f18704a;

        public a(h4 h4Var) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener
        public void onItemClick(@Nullable View view, int i2, @Nullable ConversationInfo conversationInfo) {
        }
    }

    /* compiled from: TabMessageNewFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMessageNewFragment$initListener$2", "Lcom/showstartfans/activity/manager/MessageNumMagener$OnListener;", "OnReadMsg", "", "type", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements b.InterfaceC0361b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h4 f18705a;

        public b(h4 h4Var) {
        }

        @Override // h.u.a.n.b.InterfaceC0361b
        public void a(int i2) {
        }
    }

    /* compiled from: TabMessageNewFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ h4 this$0;

        public c(h4 h4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabMessageNewFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMessageNewFragment$initListener$9", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h4 f18706a;

        public d(h4 h4Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: TabMessageNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Boolean> {
        public static final e INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
        }
    }

    private static final void A(h4 h4Var, View view) {
    }

    private static final void B(h4 h4Var, View view) {
    }

    private static final void C(h4 h4Var, View view) {
    }

    private static final void D(h4 h4Var, View view) {
    }

    private static final void E(h4 h4Var, View view) {
    }

    private final boolean F() {
    }

    public static /* synthetic */ void G(h4 h4Var, View view) {
    }

    public static /* synthetic */ void H(h4 h4Var, View view) {
    }

    public static /* synthetic */ void I(h4 h4Var) {
    }

    public static /* synthetic */ void J(h4 h4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void K() {
    }

    public static /* synthetic */ void L(h4 h4Var, View view) {
    }

    public static /* synthetic */ void M(h4 h4Var, View view) {
    }

    public static /* synthetic */ void N(h4 h4Var, View view) {
    }

    public static /* synthetic */ void O(Function0 function0, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void P(h4 h4Var, View view) {
    }

    public static /* synthetic */ void Q(h4 h4Var) {
    }

    public static /* synthetic */ void S(h4 h4Var, int i2, Function0 function0, int i3, Object obj) {
    }

    private static final void T(Function0 function0, h.y.a.m.n nVar) {
    }

    private final void U(View view, int i2) {
    }

    private static final void W(h4 h4Var) {
    }

    private final void X(ConversationInfo conversationInfo) {
    }

    private final void g() {
    }

    public static final /* synthetic */ void h(h4 h4Var) {
    }

    public static final /* synthetic */ FragmentActivity i(h4 h4Var) {
    }

    public static final /* synthetic */ void j(h4 h4Var, ConversationInfo conversationInfo) {
    }

    private final void k() {
    }

    public static /* synthetic */ void m(h4 h4Var, boolean z, int i2, Object obj) {
    }

    /* renamed from: onEvent$lambda-15$lambda-14  reason: not valid java name */
    private static final void m40onEvent$lambda15$lambda14(h4 h4Var) {
    }

    public static /* synthetic */ void q(h4 h4Var, boolean z, int i2, Object obj) {
    }

    private final void v() {
    }

    private static final void w(h4 h4Var, h.y.a.m.n nVar) {
    }

    private final void x() {
    }

    private static final void y(h4 h4Var, View view) {
    }

    private static final void z() {
    }

    public final void R(int i2, @Nullable Function0<Unit> function0) {
    }

    public final void V() {
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

    public final void l(boolean z) {
    }

    public final void n(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void r() {
    }

    public final void s() {
    }

    public final void u() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.n nVar) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ClearUnredMsgEvent clearUnredMsgEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable PushEvent pushEvent) {
    }
}
