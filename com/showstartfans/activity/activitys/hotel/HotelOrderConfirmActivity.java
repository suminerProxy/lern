package com.showstartfans.activity.activitys.hotel;

import android.content.Context;
import android.view.View;
import com.showstartfans.activity.eventmodel.RefreshPayHotelStatusEvent;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelRoomBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.g.v1;
import h.u.a.w.c0.m2;
import h.y.a.h.f;
import h.y.a.m.i;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelOrderConfirmActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderConfirmActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelOrderConfirmBinding;", "checkTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "hotelBean", "Lcom/showstartfans/activity/model/HotelBean;", "payType", "Lcom/taihebase/activity/enummodel/EPayPlatform;", "room", "Lcom/showstartfans/activity/model/HotelRoomBean;", "calculatePrice", "", "checkAndGetParams", "Lcom/taihebase/activity/network/ApiParams;", "createOrderAndPay", "params", "initData", "initListener", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshPayHotelStatusEvent;", "pay", "orderId", "", "requestRealName", "setContentViewResByViewBind", "Landroid/view/View;", "updatePersonNumber", "updateRoom", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelOrderConfirmActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5674h = null;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private static final String f5675i = null;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private static final String f5676j = null;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private static final String f5677k = null;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private static final String f5678l = null;
    @NotNull
    public Map<Integer, View> b;
    private v1 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private HotelBean f5679d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private HotelRoomBean f5680e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private HotelTimeCheckBean f5681f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private f f5682g;

    /* compiled from: HotelOrderConfirmActivity.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J8\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderConfirmActivity$Companion;", "", "()V", "ACTDES_BEAN", "", "HOTEL_BEAN", "HOTEL_TIME_CHECK_BEAN", "ROOM_BEAN", "realStart", "", "context", "Landroid/content/Context;", "actDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "HotelBean", "Lcom/showstartfans/activity/model/HotelBean;", "room", "Lcom/showstartfans/activity/model/HotelRoomBean;", "checkTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "start", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {

        /* compiled from: HotelOrderConfirmActivity.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelOrderConfirmActivity$Companion$start$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.activitys.hotel.HotelOrderConfirmActivity$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0132a implements m2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f5683a;
            public final /* synthetic */ ActDesBean b;
            public final /* synthetic */ HotelBean c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ HotelRoomBean f5684d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ HotelTimeCheckBean f5685e;

            public C0132a(Context context, ActDesBean actDesBean, HotelBean hotelBean, HotelRoomBean hotelRoomBean, HotelTimeCheckBean hotelTimeCheckBean) {
            }

            @Override // h.u.a.w.c0.m2
            public void a() {
            }

            @Override // h.u.a.w.c0.m2
            public void b() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final /* synthetic */ void a(a aVar, Context context, ActDesBean actDesBean, HotelBean hotelBean, HotelRoomBean hotelRoomBean, HotelTimeCheckBean hotelTimeCheckBean) {
        }

        private final void b(Context context, ActDesBean actDesBean, HotelBean hotelBean, HotelRoomBean hotelRoomBean, HotelTimeCheckBean hotelTimeCheckBean) {
        }

        @JvmStatic
        public final void c(@NotNull Context context, @Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelRoomBean hotelRoomBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
        }
    }

    private final void A() {
    }

    private final i B() {
    }

    private final void C(i iVar) {
    }

    private static final void D(HotelOrderConfirmActivity hotelOrderConfirmActivity, n nVar) {
    }

    private static final void E(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void F(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void G(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void H(HotelOrderConfirmActivity hotelOrderConfirmActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private static final void I(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void J(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void K(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void L(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void M(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void N(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private static final void O(HotelOrderConfirmActivity hotelOrderConfirmActivity) {
    }

    public static /* synthetic */ void P(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void Q(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void R(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void S(HotelOrderConfirmActivity hotelOrderConfirmActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void T(HotelOrderConfirmActivity hotelOrderConfirmActivity) {
    }

    public static /* synthetic */ void U(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void V(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void W(HotelOrderConfirmActivity hotelOrderConfirmActivity, i iVar, n nVar) {
    }

    public static /* synthetic */ void X(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void Y(HotelOrderConfirmActivity hotelOrderConfirmActivity, n nVar) {
    }

    public static /* synthetic */ void Z(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void a0(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    public static /* synthetic */ void b0(HotelOrderConfirmActivity hotelOrderConfirmActivity, View view) {
    }

    private final void c0(int i2) {
    }

    private final void d0(i iVar) {
    }

    private static final void e0(HotelOrderConfirmActivity hotelOrderConfirmActivity, i iVar, n nVar) {
    }

    @JvmStatic
    public static final void f0(@NotNull Context context, @Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelRoomBean hotelRoomBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
    }

    private final void g0() {
    }

    private final void h0() {
    }

    public static final /* synthetic */ String w() {
    }

    public static final /* synthetic */ String x() {
    }

    public static final /* synthetic */ String y() {
    }

    public static final /* synthetic */ String z() {
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
    public final void onEvent(@NotNull RefreshPayHotelStatusEvent refreshPayHotelStatusEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
