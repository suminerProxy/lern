package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.d.q0;
import h.u.a.g.t1;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelListActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/HotelListActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "HotelOrderCheckRequestCode", "", "actDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "adapter", "Lcom/showstartfans/activity/adapter/HotelListAdapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/HotelListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelListBinding;", "checkInDateTime", "", "checkOutDateTime", "checkTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "mPage", "getData", "", "page", "initData", "initFirstData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "setContentViewResByViewBind", "Landroid/view/View;", "updateCheckTime", "startTime", "enTime", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelListActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f5800k = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ActDesBean f5801d;

    /* renamed from: e  reason: collision with root package name */
    private int f5802e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f5803f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private HotelTimeCheckBean f5804g;

    /* renamed from: h  reason: collision with root package name */
    private t1 f5805h;

    /* renamed from: i  reason: collision with root package name */
    private long f5806i;

    /* renamed from: j  reason: collision with root package name */
    private long f5807j;

    /* compiled from: HotelListActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/HotelListActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "actDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @Nullable ActDesBean actDesBean) {
        }
    }

    /* compiled from: HotelListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelListAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<q0> {
        public final /* synthetic */ HotelListActivity this$0;

        public b(HotelListActivity hotelListActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final q0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ q0 invoke() {
        }
    }

    /* compiled from: HotelListActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/HotelListActivity$initListener$3", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HotelListActivity f5808a;

        public c(HotelListActivity hotelListActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    private final void A(int i2) {
    }

    private static final void B(HotelListActivity hotelListActivity, int i2, n nVar) {
    }

    private static final void C(HotelListActivity hotelListActivity) {
    }

    private final void D() {
    }

    private static final void E(HotelListActivity hotelListActivity, View view) {
    }

    private static final void F(HotelListActivity hotelListActivity, View view) {
    }

    private static final void G(HotelListActivity hotelListActivity, View view) {
    }

    public static /* synthetic */ void H(HotelListActivity hotelListActivity, View view) {
    }

    public static /* synthetic */ void I(HotelListActivity hotelListActivity, View view) {
    }

    public static /* synthetic */ void J(HotelListActivity hotelListActivity, View view) {
    }

    public static /* synthetic */ void K(HotelListActivity hotelListActivity, int i2, n nVar) {
    }

    public static /* synthetic */ void L(HotelListActivity hotelListActivity) {
    }

    private final void M(long j2, long j3) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(HotelListActivity hotelListActivity) {
    }

    public static final /* synthetic */ void x(HotelListActivity hotelListActivity, int i2) {
    }

    public static final /* synthetic */ int y(HotelListActivity hotelListActivity) {
    }

    private final q0 z() {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
