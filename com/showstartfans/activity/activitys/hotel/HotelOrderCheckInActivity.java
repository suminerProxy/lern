package com.showstartfans.activity.activitys.hotel;

import android.app.Activity;
import android.view.View;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.maintab.HomeCalendarListView;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity;
import h.u.a.g.u1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelOrderCheckInActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderCheckInActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adultNumber", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelOrderCheckInBinding;", "childNumber", "dateVisibility", "", "endTime", "", "hotelBean", "Lcom/showstartfans/activity/model/HotelBean;", "mCheckTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "personVisibility", "startTime", "initData", "", "initListener", "initView", "setContentViewResByViewBind", "Landroid/view/View;", "updatePersonNumber", "updateTime", "brforTime", "afterTime", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelOrderCheckInActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final a f5663l = null;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private static final String f5664m = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5665d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private HotelBean f5666e;

    /* renamed from: f  reason: collision with root package name */
    private int f5667f;

    /* renamed from: g  reason: collision with root package name */
    private int f5668g;

    /* renamed from: h  reason: collision with root package name */
    private long f5669h;

    /* renamed from: i  reason: collision with root package name */
    private long f5670i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private HotelTimeCheckBean f5671j;

    /* renamed from: k  reason: collision with root package name */
    private u1 f5672k;

    /* compiled from: HotelOrderCheckInActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelOrderCheckInActivity$Companion;", "", "()V", "RESULT_KEY", "", "getRESULT_KEY", "()Ljava/lang/String;", "startForResult", "", "activity", "Landroid/app/Activity;", "data", "Lcom/showstartfans/activity/model/HotelBean;", "checkTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }

        public final void b(@NotNull Activity activity, @Nullable HotelBean hotelBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean, int i2) {
        }
    }

    /* compiled from: HotelOrderCheckInActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelOrderCheckInActivity$initListener$7", "Lcom/showstartfans/activity/activitys/maintab/HomeCalendarListView$SimpleDateSelect;", ImageSelectActivity.SELECTED, "", "startDate", "", "endDate", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends HomeCalendarListView.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HotelOrderCheckInActivity f5673a;

        public b(HotelOrderCheckInActivity hotelOrderCheckInActivity) {
        }

        @Override // com.showstartfans.activity.activitys.maintab.HomeCalendarListView.c, com.showstartfans.activity.activitys.maintab.HomeCalendarListView.b
        public void a(@Nullable String str, @Nullable String str2) {
        }
    }

    private static final void A(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private static final void B(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private static final void C(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private static final void D(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private static final void E(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void F(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void G(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void H(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void I(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void J(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void K(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    public static /* synthetic */ void L(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private final void M() {
    }

    private final void N(long j2, long j3) {
    }

    public static final /* synthetic */ String w() {
    }

    public static final /* synthetic */ void x(HotelOrderCheckInActivity hotelOrderCheckInActivity, long j2, long j3) {
    }

    private static final void y(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
    }

    private static final void z(HotelOrderCheckInActivity hotelOrderCheckInActivity, View view) {
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
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
