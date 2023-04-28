package com.showstartfans.activity.activitys.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Message;
import android.view.View;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.eventmodel.DefaultEvent;
import com.showstartfans.activity.eventmodel.RealNameSuccessEvent;
import com.showstartfans.activity.model.CouponBean;
import com.showstartfans.activity.model.PayBean;
import com.showstartfans.activity.model.PaySupportBean;
import com.showstartfans.activity.model.pay.PayActivityBean;
import com.showstartfans.activity.model.pay.PayTicketResultBean;
import com.showstartfans.activity.model.pay.TicketBean;
import com.showstartfans.activity.view.SelectPaymentView;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.u.a.c.i0.j0;
import h.u.a.c.i0.k0;
import h.u.a.w.d0.r2;
import h.u.a.w.d0.w2;
import h.u.a.w.x;
import h.y.a.k.f;
import h.y.a.m.n;
import h.y.a.n.j1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: PaymentActivity.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002vwB\u0005¢\u0006\u0002\u0010\u0006J\u001a\u00104\u001a\u0002052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0012H\u0002J\b\u00109\u001a\u000205H\u0002J\b\u0010:\u001a\u000205H\u0002J\u0010\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\fH\u0002J\b\u0010=\u001a\u000205H\u0002J\b\u0010>\u001a\u00020\fH\u0002J\b\u0010?\u001a\u000205H\u0002J\n\u0010@\u001a\u0004\u0018\u000107H\u0002J\u0010\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020\u0012H\u0002J\u0010\u0010C\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020/H\u0002J\b\u0010G\u001a\u000205H\u0014J\b\u0010H\u001a\u000205H\u0014J\b\u0010I\u001a\u000205H\u0014J\"\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00192\b\u0010M\u001a\u0004\u0018\u00010NH\u0014J\b\u0010O\u001a\u000205H\u0016J \u0010P\u001a\u0002052\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u0012H\u0016J\b\u0010T\u001a\u000205H\u0014J\u0012\u0010U\u001a\u0002052\b\u0010V\u001a\u0004\u0018\u00010WH\u0007J\u0012\u0010U\u001a\u0002052\b\u0010V\u001a\u0004\u0018\u00010XH\u0007J\u001c\u0010Y\u001a\u0002052\b\u0010Z\u001a\u0004\u0018\u00010[2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\b\u0010^\u001a\u000205H\u0014J$\u0010_\u001a\u0002052\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010\f2\u0006\u0010c\u001a\u00020\u0019H\u0016J\b\u0010d\u001a\u000205H\u0014J\u0010\u0010e\u001a\u0002052\u0006\u0010f\u001a\u00020\u0012H\u0016J\u0010\u0010g\u001a\u0002052\u0006\u0010h\u001a\u00020\u0012H\u0002J\b\u0010i\u001a\u00020\u0019H\u0014J\u001c\u0010j\u001a\u0002052\b\u0010k\u001a\u0004\u0018\u00010\f2\b\u0010l\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010m\u001a\u0002052\u0006\u0010n\u001a\u00020/2\u0006\u0010o\u001a\u00020\u00192\b\u0010p\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010q\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010r\u001a\u00020\u0012H\u0002J\b\u0010s\u001a\u000205H\u0002J\b\u0010t\u001a\u000205H\u0002J\b\u0010u\u001a\u000205H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/showstartfans/activity/activitys/pay/PaymentActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/showstartfans/activity/widget/OnBuyNumChangedListener;", "Lcom/showstartfans/activity/activitys/pay/PaymentTicketTypeFragment$OnTabSelectListener;", "Lcom/taihebase/activity/listener/OnHandlerListener;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "()V", "activityShowBean", "Lcom/showstartfans/activity/model/pay/PayActivityBean;", "adapter", "Lcom/showstartfans/activity/activitys/pay/PaymentOrderManAdapter;", "areaCode", "", "couponBean", "Lcom/showstartfans/activity/model/CouponBean;", "doalog", "Lcom/taihebase/activity/widget/dialog/DefaultDialog;", "havedorder", "", "isAlternate", "isLoadCoupon", "isPolling", "isRequestCoupon", "orderId", "payFromToType", "", "paySupportBean", "Lcom/showstartfans/activity/model/PaySupportBean;", "payTimeDown", "paymentView", "Lcom/showstartfans/activity/view/SelectPaymentView;", "phone", "realNameType", "select", "Lcom/showstartfans/activity/widget/popupwindow/PopAreaCodeSelect;", TabCouponsSelectNewActivity.f6395k, "sessionId", "ticketBean", "Lcom/showstartfans/activity/model/pay/TicketBean;", "ticketRefresh", "ticketResultBean", "Lcom/showstartfans/activity/model/pay/PayTicketResultBean;", "ticketTypeFragment", "Lcom/showstartfans/activity/activitys/pay/PaymentTicketTypeFragment;", "timeCount", "Lcom/showstartfans/activity/activitys/pay/PaymentActivity$TimeCount;", TabCouponsSelectNewActivity.f6394j, "", "userBuyNun", "validateTypeNum", "weakHandler", "Lcom/taihebase/activity/utils/WeakHandler;", "buyByOrder", "", "payBean", "Lcom/showstartfans/activity/model/PayBean;", "checkIfHaveOrderd", "checkTicketOnSaleStatus", "confirmOrder", "dealWithCode", "code", "getData", "getExStr", "getOrderCouponList", "getPayBean", "getTicketList", "needDownTime", "getToken", "getaMoney", "allMoney", "cMoney", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onBuyNumChanged", "paramInt", "id", "bool", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/DefaultEvent;", "Lcom/showstartfans/activity/eventmodel/RealNameSuccessEvent;", "onHandlerMessage", "activity", "Landroid/app/Activity;", "msg", "Landroid/os/Message;", "onPause", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", g.C, "onResume", "onSelectShowPhone", "showPhone", "setButtonPay", "needM", "setContentViewRes", "setPhoneNum", "areaCodeStr", "phoneStr", "setUseCouponMoney", "unitPrice", "buyNum", "couponTxt", "showTencentSP", "isNeedToken", "startCoupnActivity", "startUserOrder", "stopTimeCount", "Companion", "TimeCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PaymentActivity extends BaseNoToolBarActivity implements x, k0.a, f, w2 {
    @NotNull
    public static final a F = null;
    private static final int G = 0;
    private static final int H = 0;
    @NotNull
    private static final String I = null;
    @NotNull
    private static final String J = null;
    @NotNull
    private static final String K = null;
    @NotNull
    private static final String L = null;
    @NotNull
    private static final String M = null;
    @Nullable
    private b A;
    private boolean B;
    @NotNull
    private String C;
    private boolean D;
    private boolean E;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private String f6085d;

    /* renamed from: e  reason: collision with root package name */
    private int f6086e;

    /* renamed from: f  reason: collision with root package name */
    private int f6087f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6088g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6089h;

    /* renamed from: i  reason: collision with root package name */
    private double f6090i;

    /* renamed from: j  reason: collision with root package name */
    private int f6091j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6092k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private TicketBean f6093l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private PayActivityBean f6094m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private CouponBean f6095n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private PayTicketResultBean f6096o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private SelectPaymentView f6097p;
    private int q;
    @Nullable
    private PaySupportBean r;
    @NotNull
    private k0 s;
    @Nullable
    private j0 t;
    private int u;
    @Nullable
    private String v;
    @Nullable
    private h.y.a.p.w.a w;
    @Nullable
    private r2 x;
    private boolean y;
    @Nullable
    private j1 z;

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/activitys/pay/PaymentActivity$Companion;", "", "()V", "ADD_MAN", "", "getADD_MAN", "()I", "COUPON_REQUEST", "getCOUPON_REQUEST", "DATA_SPECIALACTIVITY", "", "getDATA_SPECIALACTIVITY", "()Ljava/lang/String;", "PAY_FROM_TO_TYPE", "getPAY_FROM_TO_TYPE", "PAY_SUPPORT", "getPAY_SUPPORT", "REAL_NAME_TYPE", "getREAL_NAME_TYPE", "SHAPPING_NUM", "getSHAPPING_NUM", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int a() {
        }

        public final int b() {
        }

        @NotNull
        public final String c() {
        }

        @NotNull
        public final String d() {
        }

        @NotNull
        public final String e() {
        }

        @NotNull
        public final String f() {
        }

        @NotNull
        public final String g() {
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/showstartfans/activity/activitys/pay/PaymentActivity$TimeCount;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(JJ)V", "getTick", "", "weakHandler", "Lcom/taihebase/activity/utils/WeakHandler;", "onFinish", "", "onTick", "millisUntilFinished", "setWeakHandler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6098a;
        @Nullable
        private j1 b;

        public b(long j2, long j3) {
        }

        public final void a(@Nullable j1 j1Var) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PaymentActivity this$0;

        public c(PaymentActivity paymentActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: PaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/pay/PaymentActivity$initData$3$1", "Lcom/showstartfans/activity/listener/OnPaymentManSelectCall;", "onPaymentManSelectCall", "", "num", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements h.u.a.l.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PaymentActivity f6099a;
        public final /* synthetic */ int b;

        public d(PaymentActivity paymentActivity, int i2) {
        }

        @Override // h.u.a.l.d
        public void a(int i2) {
        }
    }

    public static final /* synthetic */ String A(PaymentActivity paymentActivity) {
    }

    public static final /* synthetic */ String B() {
    }

    public static final /* synthetic */ String C() {
    }

    public static final /* synthetic */ String D() {
    }

    public static final /* synthetic */ String E() {
    }

    public static final /* synthetic */ boolean F(PaymentActivity paymentActivity) {
    }

    public static final /* synthetic */ void G(PaymentActivity paymentActivity, boolean z) {
    }

    private final void H(CouponBean couponBean, PayBean payBean) {
    }

    private final boolean I() {
    }

    private final void J() {
    }

    private final void K() {
    }

    private final String L(String str) {
    }

    private final void M() {
    }

    private static final void N(PaymentActivity paymentActivity, n nVar) {
    }

    private final String O() {
    }

    private final void P() {
    }

    private static final void Q(PaymentActivity paymentActivity, n nVar) {
    }

    private final PayBean R() {
    }

    private final void S(boolean z) {
    }

    private static final void T(PaymentActivity paymentActivity, boolean z, TicketBean ticketBean, n nVar) {
    }

    private final void U(PayBean payBean) {
    }

    private static final void V(PaymentActivity paymentActivity, PayBean payBean, String str, n nVar) {
    }

    private final double W(double d2, double d3) {
    }

    private static final void X(PaymentActivity paymentActivity, View view) {
    }

    private static final void Y(PaymentActivity paymentActivity, View view) {
    }

    private static final void Z(PaymentActivity paymentActivity, View view) {
    }

    private static final void a0(PaymentActivity paymentActivity, View view) {
    }

    private static final void b0(PaymentActivity paymentActivity, View view) {
    }

    private static final void c0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void d0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void e0(PaymentActivity paymentActivity, n nVar) {
    }

    public static /* synthetic */ void f0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void g0(PayBean payBean, boolean z, PaymentActivity paymentActivity, JSONObject jSONObject) {
    }

    public static /* synthetic */ void h0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void i0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void j0(PaymentActivity paymentActivity, n nVar) {
    }

    public static /* synthetic */ void k0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void l0(PaymentActivity paymentActivity, PayBean payBean, String str, n nVar) {
    }

    public static /* synthetic */ void m0(PaymentActivity paymentActivity, View view) {
    }

    public static /* synthetic */ void n0(PaymentActivity paymentActivity, boolean z, TicketBean ticketBean, n nVar) {
    }

    public static /* synthetic */ void o0(PaymentActivity paymentActivity, View view) {
    }

    private static final void p0(PaymentActivity paymentActivity, View view) {
    }

    private final void q0(boolean z) {
    }

    private final void r0(String str, String str2) {
    }

    private final void s0(double d2, int i2, String str) {
    }

    private final void t0(PayBean payBean, boolean z) {
    }

    private static final void u0(PayBean payBean, boolean z, PaymentActivity paymentActivity, JSONObject jSONObject) {
    }

    private final void v0() {
    }

    public static final /* synthetic */ int w() {
    }

    private final void w0() {
    }

    public static final /* synthetic */ int x() {
    }

    private final void x0() {
    }

    public static final /* synthetic */ String y() {
    }

    public static final /* synthetic */ h.y.a.p.w.a z(PaymentActivity paymentActivity) {
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

    @Override // h.u.a.c.i0.k0.a
    public void j(boolean z) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable DefaultEvent defaultEvent) {
    }

    @Override // h.y.a.k.f
    public void onHandlerMessage(@Nullable Activity activity, @Nullable Message message) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Override // h.u.a.w.x
    public void t(int i2, int i3, boolean z) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RealNameSuccessEvent realNameSuccessEvent) {
    }
}
