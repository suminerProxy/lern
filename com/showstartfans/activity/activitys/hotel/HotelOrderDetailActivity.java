package com.showstartfans.activity.activitys.hotel;

import android.content.Context;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.eventmodel.RefreshPayHotelStatusEvent;
import com.showstartfans.activity.model.HotelOrderDetailBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.g.w1;
import h.y.a.h.f;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelOrderDetailActivity.kt */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\rH\u0014J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\rH\u0014J\b\u0010\u001f\u001a\u00020\u0010H\u0014J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006$"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelOrderDetailBinding;", "leftTime", "", "payType", "Lcom/taihebase/activity/enummodel/EPayPlatform;", "runLeftTime", "com/showstartfans/activity/activitys/hotel/HotelOrderDetailActivity$runLeftTime$1", "Lcom/showstartfans/activity/activitys/hotel/HotelOrderDetailActivity$runLeftTime$1;", "callService", "", "cancelOrder", "createPersonView", "Landroid/view/View;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "name", "", "getData", "showProgress", "", "initData", "initListener", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshPayHotelStatusEvent;", "onRestart", "setContentViewResByViewBind", "updateData", "data", "Lcom/showstartfans/activity/model/HotelOrderDetailBean;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelOrderDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5686g = null;
    @NotNull
    public Map<Integer, View> b;
    private w1 c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private f f5687d;

    /* renamed from: e  reason: collision with root package name */
    private int f5688e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final b f5689f;

    /* compiled from: HotelOrderDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderDetailActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "orderId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, int i2) {
        }
    }

    /* compiled from: HotelOrderDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelOrderDetailActivity$runLeftTime$1", "Ljava/lang/Runnable;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ HotelOrderDetailActivity b;

        public b(HotelOrderDetailActivity hotelOrderDetailActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private final void A() {
    }

    private final void B() {
    }

    private static final void C(HotelOrderDetailActivity hotelOrderDetailActivity, n nVar) {
    }

    private final View D(int i2, String str) {
    }

    private final void E(boolean z) {
    }

    private static final void F(HotelOrderDetailActivity hotelOrderDetailActivity, n nVar) {
    }

    private static final void G(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void H(HotelOrderDetailActivity hotelOrderDetailActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private static final void I(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void J(View view) {
    }

    private static final void K(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void L(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void M(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void N(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private static final void O(HotelOrderDetailActivity hotelOrderDetailActivity) {
    }

    public static /* synthetic */ void P(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    public static /* synthetic */ void Q(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    public static /* synthetic */ void R(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    public static /* synthetic */ void S(HotelOrderDetailActivity hotelOrderDetailActivity, Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void T(HotelOrderDetailActivity hotelOrderDetailActivity, n nVar) {
    }

    public static /* synthetic */ void U(HotelOrderDetailActivity hotelOrderDetailActivity, n nVar) {
    }

    public static /* synthetic */ void V(HotelOrderDetailActivity hotelOrderDetailActivity) {
    }

    public static /* synthetic */ void W(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    public static /* synthetic */ void X(View view) {
    }

    public static /* synthetic */ void Y(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    public static /* synthetic */ void Z(HotelOrderDetailBean hotelOrderDetailBean, View view) {
    }

    public static /* synthetic */ void a0(HotelOrderDetailActivity hotelOrderDetailActivity, View view) {
    }

    private final void b0(HotelOrderDetailBean hotelOrderDetailBean) {
    }

    private static final void c0(HotelOrderDetailBean hotelOrderDetailBean, View view) {
    }

    public static final /* synthetic */ w1 w(HotelOrderDetailActivity hotelOrderDetailActivity) {
    }

    public static final /* synthetic */ void x(HotelOrderDetailActivity hotelOrderDetailActivity, boolean z) {
    }

    public static final /* synthetic */ int y(HotelOrderDetailActivity hotelOrderDetailActivity) {
    }

    public static final /* synthetic */ void z(HotelOrderDetailActivity hotelOrderDetailActivity, int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
