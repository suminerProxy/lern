package com.showstartfans.activity.activitys.usercenter;

import android.view.KeyEvent;
import android.view.View;
import com.alipay.sdk.widget.j;
import com.showstartfans.activity.model.OrderDetailBean;
import com.showstartfans.activity.view.OrderETicketsTopView;
import com.showstartfans.activity.view.OrderEntityTicketsCenterView;
import com.showstartfans.activity.view.OrderEntityTicketsTopView;
import com.showstartfans.activity.view.textview.CountDownTextView;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.widget.Toolbar;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OrderDetailNewActivity.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\rH\u0002J\u001a\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0014J\b\u0010)\u001a\u00020\u001fH\u0014J\b\u0010*\u001a\u00020\u001fH\u0014J\u0012\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001fH\u0014J\u001a\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001fH\u0014J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u00105\u001a\u00020\u0019H\u0014J\u0010\u00106\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/OrderDetailNewActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "()V", "ETicketsTopFragment", "Lcom/showstartfans/activity/view/OrderETicketsTopView;", "getETicketsTopFragment", "()Lcom/showstartfans/activity/view/OrderETicketsTopView;", "ETicketsTopFragment$delegate", "Lkotlin/Lazy;", "byPayFail", "", "detailBean", "Lcom/showstartfans/activity/model/OrderDetailBean;", "entityTicketsCenterView", "Lcom/showstartfans/activity/view/OrderEntityTicketsCenterView;", "getEntityTicketsCenterView", "()Lcom/showstartfans/activity/view/OrderEntityTicketsCenterView;", "entityTicketsCenterView$delegate", "entityTicketsTopFragment", "Lcom/showstartfans/activity/view/OrderEntityTicketsTopView;", "getEntityTicketsTopFragment", "()Lcom/showstartfans/activity/view/OrderEntityTicketsTopView;", "entityTicketsTopFragment$delegate", "orderBeanType", "", "orderId", "orderListIndex", "payFromToType", "type", "alternateOrder", "", j.f849j, "dataCallBack", "bean", "getOrderDetailData", "isShow", "", "isNotify", "goShowDetail", "initData", "initListener", "initView", "onClick", "view", "Landroid/view/View;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onResume", "orderReceipt", "setContentViewRes", "setPayTimeMin", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class OrderDetailNewActivity extends BaseNoToolBarActivity implements h.y.a.k.j {
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6342d;

    /* renamed from: e  reason: collision with root package name */
    private int f6343e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private OrderDetailBean f6344f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private String f6345g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private String f6346h;

    /* renamed from: i  reason: collision with root package name */
    private int f6347i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f6348j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f6349k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f6350l;

    /* compiled from: OrderDetailNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/OrderETicketsTopView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<OrderETicketsTopView> {
        public final /* synthetic */ OrderDetailNewActivity this$0;

        public a(OrderDetailNewActivity orderDetailNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ OrderETicketsTopView invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final OrderETicketsTopView invoke() {
        }
    }

    /* compiled from: OrderDetailNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/OrderEntityTicketsCenterView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<OrderEntityTicketsCenterView> {
        public final /* synthetic */ OrderDetailNewActivity this$0;

        public b(OrderDetailNewActivity orderDetailNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ OrderEntityTicketsCenterView invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final OrderEntityTicketsCenterView invoke() {
        }
    }

    /* compiled from: OrderDetailNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/OrderEntityTicketsTopView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<OrderEntityTicketsTopView> {
        public final /* synthetic */ OrderDetailNewActivity this$0;

        public c(OrderDetailNewActivity orderDetailNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ OrderEntityTicketsTopView invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final OrderEntityTicketsTopView invoke() {
        }
    }

    /* compiled from: OrderDetailNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ OrderDetailNewActivity this$0;

        public d(OrderDetailNewActivity orderDetailNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: OrderDetailNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/usercenter/OrderDetailNewActivity$setPayTimeMin$1", "Lcom/showstartfans/activity/view/textview/CountDownTextView$OnCountDownFinishListener;", "onCountDownFinish", "", "onUntilFinished", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements CountDownTextView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OrderDetailBean f6351a;
        public final /* synthetic */ OrderDetailNewActivity b;

        public e(OrderDetailBean orderDetailBean, OrderDetailNewActivity orderDetailNewActivity) {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownTextView.b
        public void onCountDownFinish() {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownTextView.b
        public void onUntilFinished(long j2) {
        }
    }

    public static final /* synthetic */ int A(OrderDetailNewActivity orderDetailNewActivity) {
    }

    private final void B(String str) {
    }

    private static final void C(OrderDetailNewActivity orderDetailNewActivity, n nVar) {
    }

    private final void D() {
    }

    private final void E(OrderDetailBean orderDetailBean) {
    }

    private static final void F(OrderDetailNewActivity orderDetailNewActivity) {
    }

    private final OrderETicketsTopView G() {
    }

    private final OrderEntityTicketsCenterView H() {
    }

    private final OrderEntityTicketsTopView I() {
    }

    private final void J(boolean z, boolean z2) {
    }

    public static /* synthetic */ void K(OrderDetailNewActivity orderDetailNewActivity, boolean z, boolean z2, int i2, Object obj) {
    }

    private static final void L(OrderDetailNewActivity orderDetailNewActivity, boolean z, n nVar) {
    }

    private final void M() {
    }

    private static final void N(OrderDetailNewActivity orderDetailNewActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private static final void O(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void P(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void Q(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void R(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void S(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void T(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void U(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void V(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void W(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void X(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void Y(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void Z(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    private static final void a0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void b0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void c0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void d0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void e0(OrderDetailNewActivity orderDetailNewActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void f0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void g0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void h0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void i0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void j0(OrderDetailNewActivity orderDetailNewActivity, n nVar) {
    }

    public static /* synthetic */ void k0(OrderDetailNewActivity orderDetailNewActivity, boolean z, n nVar) {
    }

    public static /* synthetic */ void l0(OrderDetailNewActivity orderDetailNewActivity, n nVar) {
    }

    public static /* synthetic */ void m0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void n0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void o0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void p0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void q0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void r0(OrderDetailNewActivity orderDetailNewActivity, View view) {
    }

    public static /* synthetic */ void s0(OrderDetailNewActivity orderDetailNewActivity) {
    }

    private final void t0(String str) {
    }

    private static final void u0(OrderDetailNewActivity orderDetailNewActivity, n nVar) {
    }

    private final void v0(OrderDetailBean orderDetailBean) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(OrderDetailNewActivity orderDetailNewActivity) {
    }

    public static final /* synthetic */ OrderDetailBean x(OrderDetailNewActivity orderDetailNewActivity) {
    }

    public static final /* synthetic */ int y(OrderDetailNewActivity orderDetailNewActivity) {
    }

    public static final /* synthetic */ String z(OrderDetailNewActivity orderDetailNewActivity) {
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

    @Override // h.y.a.k.j
    public void onClick(@Nullable View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
