package com.showstartfans.activity.activitys.products;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.AddressBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.a.a.a.a.i.g;
import h.u.a.c.i0.m0;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReservationActivity.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\"\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J0\u0010\"\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/activitys/products/ReservationActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Landroid/widget/AdapterView$OnItemClickListener;", "()V", "activityBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "getActivityBean", "()Lcom/showstartfans/activity/model/actdes/ActDesBean;", "activityBean$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/showstartfans/activity/activitys/pay/TicketManAdapter;", "canReNum", "", "requestForSelectAddress", "selectAddress", "Lcom/showstartfans/activity/model/AddressBean;", "actionReservation", "", "checkIfInputOkay", "", "getData", "getDefaultAddressInfo", "initAddressData", "temp", "initData", "initListener", "initView", "needTopToolbar", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onItemClick", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", g.C, "id", "", "selectTicketUser", "setContentViewRes", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ReservationActivity extends BaseNewActivity implements AdapterView.OnItemClickListener {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f6176h = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private AddressBean f6177d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private m0 f6178e;

    /* renamed from: f  reason: collision with root package name */
    private int f6179f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f6180g;

    /* compiled from: ReservationActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/products/ReservationActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "bean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull ActDesBean actDesBean) {
        }
    }

    /* compiled from: ReservationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<ActDesBean> {
        public final /* synthetic */ ReservationActivity this$0;

        public b(ReservationActivity reservationActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ActDesBean invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ ActDesBean invoke() {
        }
    }

    private final void A() {
    }

    private static final void B(ReservationActivity reservationActivity, n nVar) {
    }

    private final void C() {
    }

    private static final void D(ReservationActivity reservationActivity, n nVar) {
    }

    private final void E(AddressBean addressBean) {
    }

    private static final void F(ReservationActivity reservationActivity, View view) {
    }

    private static final void G(ReservationActivity reservationActivity, View view) {
    }

    private static final void H(ReservationActivity reservationActivity, View view) {
    }

    public static /* synthetic */ void I(ReservationActivity reservationActivity, n nVar) {
    }

    public static /* synthetic */ void J(ReservationActivity reservationActivity, View view) {
    }

    public static /* synthetic */ void K(ReservationActivity reservationActivity, n nVar) {
    }

    public static /* synthetic */ void L(ReservationActivity reservationActivity, View view) {
    }

    public static /* synthetic */ void M(ReservationActivity reservationActivity, n nVar) {
    }

    public static /* synthetic */ void N(ReservationActivity reservationActivity, View view) {
    }

    private final void O() {
    }

    private final void w() {
    }

    private static final void x(ReservationActivity reservationActivity, n nVar) {
    }

    private final boolean y() {
    }

    private final ActDesBean z() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(@Nullable AdapterView<?> adapterView, @Nullable View view, int i2, long j2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
