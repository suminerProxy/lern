package h.u.a.t;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.view.SelectPaymentView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlaceOrderPayTool.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002JP\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002JP\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002JP\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J}\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\f0&JP\u0010*\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002Ju\u0010+\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010,\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142#\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0002J\u0016\u0010-\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0014J\u0010\u0010/\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u000e\u00100\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u00101\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/showstartfans/activity/utils/PlaceOrderPayTool;", "", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "orderDialog", "Lcom/showstartfans/activity/widget/dialog/OrderInDialog;", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "totalGetPayPar", "", "dismissProgress", "", "getPayParamsTips", "ctx", "Landroid/content/Context;", TabCouponsSelectNewActivity.f6395k, "price", "", "buyCar", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "payFromToType", "paymentView", "Lcom/showstartfans/activity/view/SelectPaymentView;", "placeOrderType", "Lcom/taihebase/activity/enummodel/EPlaceOrderType;", "isAlternate", "payByOrderId", "context", "payPar", "placeOrder", "apiParams", "Lcom/taihebase/activity/network/ApiParams;", "sessionId", "", "callBac", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isPolling", "placeOrderSuccess", "pollingCall", "orderJobKey", "showOrderInDialog", "realShow", "showProgress", "showQuitDialog", "stopTimer", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v2 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final v2 f24588a = null;
    private static int b;
    @Nullable
    private static i.a.u0.c c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static h.y.a.p.w.i f24589d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private static h.u.a.w.c0.n2 f24590e;

    /* compiled from: PlaceOrderPayTool.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24591a = null;
    }

    private v2() {
    }

    private static final void A(h.y.a.p.w.a aVar, Context context, View view) {
    }

    private final void a() {
    }

    private final void b(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2) {
    }

    private static final void c(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, View view) {
    }

    public static /* synthetic */ void d(double d2, Context context, int i2, String str, boolean z, h.y.a.h.g gVar, SelectPaymentView selectPaymentView, int i3, boolean z2, JSONObject jSONObject, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void e(Function1 function1, String str, Context context, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, Long l2) {
    }

    public static /* synthetic */ void f(Context context, Function1 function1, Long l2, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void g(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, View view) {
    }

    public static /* synthetic */ void h(Function1 function1, Throwable th) {
    }

    public static /* synthetic */ void i(Context context, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, Function1 function1, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void j(Context context) {
    }

    public static /* synthetic */ void k(h.y.a.p.w.a aVar, Context context, View view) {
    }

    private final void l(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2) {
    }

    private static final void m(double d2, Context context, int i2, String str, boolean z, h.y.a.h.g gVar, SelectPaymentView selectPaymentView, int i3, boolean z2, JSONObject jSONObject, h.y.a.m.n nVar) {
    }

    private final void n(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2) {
    }

    public static /* synthetic */ void p(v2 v2Var, Context context, int i2, double d2, boolean z, int i3, h.y.a.m.i iVar, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, String str, Function1 function1, int i4, Object obj) {
    }

    private static final void q(Context context, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, Function1 function1, h.y.a.m.n nVar) {
    }

    private final void r(Context context, int i2, double d2, boolean z, JSONObject jSONObject, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2) {
    }

    private final void s(Context context, int i2, double d2, boolean z, String str, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, Function1<? super Boolean, Unit> function1) {
    }

    private static final void t(Function1 function1, String str, Context context, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, Long l2) {
    }

    private static final void u(Context context, Function1 function1, Long l2, int i2, double d2, boolean z, int i3, SelectPaymentView selectPaymentView, h.y.a.h.g gVar, boolean z2, h.y.a.m.n nVar) {
    }

    private static final void v(Function1 function1, Throwable th) {
    }

    private static final void x(Context context) {
    }

    private final void y(Context context) {
    }

    public final void B() {
    }

    public final void o(@NotNull Context context, int i2, double d2, boolean z, int i3, @Nullable h.y.a.m.i iVar, @NotNull SelectPaymentView selectPaymentView, @NotNull h.y.a.h.g gVar, boolean z2, @NotNull String str, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    public final void w(@NotNull Context context, boolean z) {
    }

    public final void z(@NotNull Context context) {
    }
}
