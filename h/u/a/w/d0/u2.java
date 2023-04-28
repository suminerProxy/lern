package h.u.a.w.d0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.model.TicketSessionBean;
import com.showstartfans.activity.model.TicketSessionMsgBean;
import com.showstartfans.activity.model.pay.PayActivityBean;
import com.showstartfans.activity.model.pay.TicketBean;
import com.showstartfans.activity.widget.GoodsCounter;
import com.umeng.analytics.pro.am;
import h.u.a.c.i0.l0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectTicketDialog.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J0\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\nH\u0014J \u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0002J7\u0010:\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u0001042#\u0010<\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020.\u0018\u00010=H\u0002J\u0012\u0010A\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u000104H\u0002J\b\u0010B\u001a\u00020.H\u0014J\b\u0010C\u001a\u00020.H\u0014J\u001a\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J \u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u0012H\u0016J\u0012\u0010M\u001a\u00020.2\b\u0010N\u001a\u0004\u0018\u00010FH\u0016J\u0010\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020QH\u0016J$\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u0001042\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0012\u0010T\u001a\u00020.2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J0\u0010W\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010;\u001a\u000204H\u0002J0\u0010X\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00142\u0006\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010;\u001a\u000204H\u0002J\u001a\u0010Y\u001a\u00020.2\u0006\u0010S\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u000104H\u0003J\u0012\u0010Z\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u000104H\u0002J\u001e\u0010[\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010;\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\nJ\u0010\u0010\\\u001a\u00020.2\u0006\u0010]\u001a\u00020\nH\u0002J\u0010\u0010^\u001a\u00020.2\u0006\u0010_\u001a\u00020\nH\u0002J\u0010\u0010`\u001a\u00020.2\u0006\u0010a\u001a\u00020\u0012H\u0002J\u0010\u0010b\u001a\u00020.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/SelectTicketDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "Lcom/showstartfans/activity/activitys/pay/SelectTicketPopAdapter$OnItemClickTicket;", "Landroid/view/View$OnClickListener;", "Lcom/showstartfans/activity/widget/OnBuyNumChangedListener;", "Lcom/showstartfans/activity/listener/OnSessionShowCall;", "()V", "actDesBean", "Lcom/showstartfans/activity/model/pay/PayActivityBean;", "activityId", "", "adapter", "Lcom/showstartfans/activity/activitys/pay/SelectTicketPopAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/pay/SelectTicketPopAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "canSelectNum", "", "checkSessionId", "", "goButton", "Landroid/widget/TextView;", "goodsCounter", "Lcom/showstartfans/activity/widget/GoodsCounter;", "numParent", "Landroid/widget/RelativeLayout;", "parentP", "payFromToType", "selectNumP", "selectTickDes", "sessionAdapter", "Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter;", "getSessionAdapter", "()Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter;", "sessionAdapter$delegate", "sessionList", "Landroidx/recyclerview/widget/RecyclerView;", "tempIndex", "tickList", "ticketResultBean", "Lcom/showstartfans/activity/model/TicketSessionBean;", "topView", "Landroid/widget/LinearLayout;", "xggz", "OpenAudience", "", TabCouponsSelectNewActivity.f6399o, "openType", "bodyType", "listPosition", "ticketBean", "Lcom/showstartfans/activity/model/pay/TicketBean;", "getContentView", "getMaxShoppingNum", "reservationNum", "storeNum", "xNum", "getTicketList", "bean", "callBac", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "goPay", "initData", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBuyNumChanged", "paramInt", "id", "bool", "onClick", am.aE, "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onItemClickTicket", h.a.a.a.a.i.g.C, "onSelectSession", "sessionBean", "Lcom/showstartfans/activity/model/TicketSessionMsgBean;", "openTicketPush", "openTips", "setButtonStatus", "setCurrentView", "setData", "setMaxCanBuyNum", "canBuyNum", "setMaxDes", "canNum", "setOtherViewVis", "show", "setUIData", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class u2 extends h.y.a.o.y.b implements l0.a, View.OnClickListener, h.u.a.w.x, h.u.a.l.e {
    @NotNull
    public Map<Integer, View> b;
    private GoodsCounter c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f25271d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f25272e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f25273f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f25274g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f25275h;

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f25276i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f25277j;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f25278k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f25279l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private String f25280m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private TicketSessionBean f25281n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private PayActivityBean f25282o;

    /* renamed from: p  reason: collision with root package name */
    private int f25283p;
    private int q;
    private int r;
    private boolean s;
    @NotNull
    private final Lazy t;
    @NotNull
    private final Lazy u;

    /* compiled from: SelectTicketDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/pay/SelectTicketPopAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<h.u.a.c.i0.l0> {
        public final /* synthetic */ u2 this$0;

        public a(u2 u2Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.i0.l0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.i0.l0 invoke() {
        }
    }

    /* compiled from: SelectTicketDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/widget/popupwindow/SelectTicketDialog$initListener$1$1$1", "Lcom/showstartfans/activity/listener/OnNumKeyBoardCall;", "onNumKeyCall", "", "num", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements h.u.a.l.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u2 f25284a;

        public b(u2 u2Var) {
        }

        @Override // h.u.a.l.c
        public void a(int i2) {
        }
    }

    /* compiled from: SelectTicketDialog.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/widget/popupwindow/SelectTicketDialog$initListener$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ u2 b;

        public c(u2 u2Var) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* compiled from: SelectTicketDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/pay/ActivityShowSessionAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<h.u.a.c.i0.g0> {
        public final /* synthetic */ u2 this$0;

        public d(u2 u2Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.i0.g0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.i0.g0 invoke() {
        }
    }

    /* compiled from: SelectTicketDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ TicketBean $bean;
        public final /* synthetic */ u2 this$0;

        public e(TicketBean ticketBean, u2 u2Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        public final void invoke(int i2) {
        }
    }

    public static /* synthetic */ void A(View view, u2 u2Var) {
    }

    public static /* synthetic */ void B(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    public static /* synthetic */ void C(u2 u2Var, TicketBean ticketBean, int i2, View view) {
    }

    public static /* synthetic */ void D(u2 u2Var, View view) {
    }

    public static /* synthetic */ void E(u2 u2Var, int i2, TicketBean ticketBean, int i3, int i4, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void F(u2 u2Var, View view) {
    }

    public static /* synthetic */ void G(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    public static /* synthetic */ void H(u2 u2Var, View view) {
    }

    public static /* synthetic */ void I(u2 u2Var, TicketBean ticketBean, int i2, View view) {
    }

    public static /* synthetic */ void J(u2 u2Var, View view) {
    }

    public static /* synthetic */ void K(TicketBean ticketBean, u2 u2Var, int i2, View view) {
    }

    public static /* synthetic */ void L(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    public static /* synthetic */ void M(u2 u2Var, Function1 function1, TicketBean ticketBean, h.y.a.m.n nVar) {
    }

    private static final void N(View view, u2 u2Var) {
    }

    private final void O(String str, int i2, int i3, int i4, TicketBean ticketBean) {
    }

    private static final void P(u2 u2Var, int i2, TicketBean ticketBean, int i3, int i4, h.y.a.m.n nVar) {
    }

    private final void Q(String str, int i2, int i3, int i4, TicketBean ticketBean) {
    }

    private static final void R(u2 u2Var, View view) {
    }

    @SuppressLint({"CheckResult"})
    private final void S(int i2, TicketBean ticketBean) {
    }

    private static final void T(TicketBean ticketBean, u2 u2Var, int i2, View view) {
    }

    private static final void U(TicketBean ticketBean, u2 u2Var, int i2, boolean z) {
    }

    private static final void V(u2 u2Var, View view) {
    }

    private static final void W(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    private static final void X(u2 u2Var, TicketBean ticketBean, int i2, View view) {
    }

    private static final void Y(u2 u2Var, TicketBean ticketBean, int i2, View view) {
    }

    private static final void Z(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    private static final void a0(TicketBean ticketBean, int i2, u2 u2Var, View view) {
    }

    private final void b0(TicketBean ticketBean) {
    }

    private final void d0(int i2) {
    }

    private final void e(String str, int i2, int i3, int i4, TicketBean ticketBean) {
    }

    private final void e0(int i2) {
    }

    public static final /* synthetic */ Context f(u2 u2Var) {
    }

    private final void f0(boolean z) {
    }

    public static final /* synthetic */ GoodsCounter g(u2 u2Var) {
    }

    public static final /* synthetic */ h.u.a.c.i0.g0 h(u2 u2Var) {
    }

    public static final /* synthetic */ int i(u2 u2Var) {
    }

    public static final /* synthetic */ TicketSessionBean j(u2 u2Var) {
    }

    public static final /* synthetic */ void k(u2 u2Var, TicketBean ticketBean) {
    }

    public static final /* synthetic */ void l(u2 u2Var, int i2) {
    }

    private final h.u.a.c.i0.l0 m() {
    }

    private final int n(int i2, int i3, int i4) {
    }

    private final h.u.a.c.i0.g0 q() {
    }

    private final void r(TicketBean ticketBean, Function1<? super Integer, Unit> function1) {
    }

    private static final void s(u2 u2Var, Function1 function1, TicketBean ticketBean, h.y.a.m.n nVar) {
    }

    private final void u(TicketBean ticketBean) {
    }

    private static final void v(u2 u2Var, View view) {
    }

    private static final void w(u2 u2Var, View view) {
    }

    private static final void x(u2 u2Var, View view) {
    }

    public static /* synthetic */ void y(TicketBean ticketBean, u2 u2Var, int i2, boolean z) {
    }

    public static /* synthetic */ void z(u2 u2Var, View view) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.u.a.l.e
    public void a(@Nullable TicketSessionMsgBean ticketSessionMsgBean) {
    }

    @Override // h.u.a.c.i0.l0.a
    public void c(int i2, @Nullable TicketBean ticketBean, @Nullable View view) {
    }

    public final void c0(@NotNull PayActivityBean payActivityBean, @NotNull TicketSessionBean ticketSessionBean, int i2) {
    }

    public final void g0(@Nullable String str) {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    @Override // h.y.a.o.y.b
    public void initData() {
    }

    @Override // h.y.a.o.y.b
    public void initListener() {
    }

    @Override // h.y.a.o.y.b
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
    }

    @Override // h.u.a.w.x
    public void t(int i2, int i3, boolean z) {
    }
}
