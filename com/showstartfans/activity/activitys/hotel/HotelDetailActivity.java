package com.showstartfans.activity.activitys.hotel;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.AppBarLayout;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelRoomBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.c.d0.f1;
import h.u.a.d.p0;
import h.u.a.d.v0;
import h.u.a.d.z0;
import h.u.a.g.s1;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelDetailActivity.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u0004H\u0002J\b\u0010.\u001a\u00020*H\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0014J\u0012\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020*H\u0014J\b\u00104\u001a\u00020*H\u0014J\"\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020\u0004H\u0002J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020!H\u0002J\u0010\u0010=\u001a\u00020*2\u0006\u0010<\u001a\u00020!H\u0002J\b\u0010>\u001a\u00020?H\u0014J\b\u0010@\u001a\u00020!H\u0014J\u0012\u0010A\u001a\u00020*2\b\u0010B\u001a\u0004\u0018\u00010$H\u0002J\b\u0010C\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "HotelOrderCheckRequestCode", "", "adapter", "Lcom/showstartfans/activity/adapter/HotelRoomAdapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/HotelRoomAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "adapterStrategy", "Lcom/showstartfans/activity/adapter/HotelStrategyAdapter;", "getAdapterStrategy", "()Lcom/showstartfans/activity/adapter/HotelStrategyAdapter;", "adapterStrategy$delegate", "adapterTag", "Lcom/showstartfans/activity/activitys/hotel/HotelTagAdapter;", "getAdapterTag", "()Lcom/showstartfans/activity/activitys/hotel/HotelTagAdapter;", "adapterTag$delegate", "adapterVpPhoto", "Lcom/showstartfans/activity/adapter/HotelDetailAdapter;", "getAdapterVpPhoto", "()Lcom/showstartfans/activity/adapter/HotelDetailAdapter;", "adapterVpPhoto$delegate", "binding", "Lcom/showstartfans/activity/databinding/ActivityHotelDetailsBinding;", "fromActDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "fromHotelBean", "Lcom/showstartfans/activity/model/HotelBean;", "isCheckCenterReserve", "", "isCheckCenterSure", "mCheckTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "mData", "mRoomDatas", "", "Lcom/showstartfans/activity/model/HotelRoomBean;", "OnScroolChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "getData", "getRoomData", "initData", "data", "initFirstData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onVpTopPhotoPageSelected", h.a.a.a.a.i.g.C, "setCheckCenterReserve", "check", "setCheckCenterSure", "setContentViewResByViewBind", "Landroid/view/View;", "setStatusBarTextWhite", "updateCheckInfo", "checkTimeCheckBean", "updateRoomList", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final a f5650p = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private HotelBean f5651d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ActDesBean f5652e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private HotelTimeCheckBean f5653f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private List<HotelRoomBean> f5654g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5655h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5656i;

    /* renamed from: j  reason: collision with root package name */
    private s1 f5657j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f5658k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f5659l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f5660m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f5661n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private HotelBean f5662o;

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/hotel/HotelDetailActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "actDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "hotelBean", "Lcom/showstartfans/activity/model/HotelBean;", "checkTimeCheckBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context, @Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelRoomAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<v0> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public b(HotelDetailActivity hotelDetailActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final v0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ v0 invoke() {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelStrategyAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<z0> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public c(HotelDetailActivity hotelDetailActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final z0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ z0 invoke() {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/hotel/HotelTagAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<f1> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public d(HotelDetailActivity hotelDetailActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final f1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ f1 invoke() {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelDetailAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<p0> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public e(HotelDetailActivity hotelDetailActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final p0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ p0 invoke() {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelDetailActivity$initListener$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ HotelDetailActivity b;

        public f(HotelDetailActivity hotelDetailActivity) {
        }

        public static /* synthetic */ void a(HotelDetailActivity hotelDetailActivity) {
        }

        public static /* synthetic */ void b(HotelDetailActivity hotelDetailActivity) {
        }

        private static final void c(HotelDetailActivity hotelDetailActivity) {
        }

        private static final void d(HotelDetailActivity hotelDetailActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/hotel/HotelDetailActivity$initListener$3", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g implements AppBarLayout.OnOffsetChangedListener {
        public final /* synthetic */ HotelDetailActivity b;

        public g(HotelDetailActivity hotelDetailActivity) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public h(HotelDetailActivity hotelDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: HotelDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/taihebase/activity/widget/Toolbar;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function1<Toolbar, Unit> {
        public final /* synthetic */ HotelDetailActivity this$0;

        public i(HotelDetailActivity hotelDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Toolbar toolbar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Toolbar toolbar) {
        }
    }

    public static final /* synthetic */ BaseNewFunctionActivity A(HotelDetailActivity hotelDetailActivity) {
    }

    public static final /* synthetic */ HotelBean B(HotelDetailActivity hotelDetailActivity) {
    }

    public static final /* synthetic */ void C(HotelDetailActivity hotelDetailActivity, int i2) {
    }

    private final v0 D() {
    }

    private final z0 E() {
    }

    private final f1 F() {
    }

    private final p0 G() {
    }

    private final void H() {
    }

    private static final void I(HotelDetailActivity hotelDetailActivity, n nVar) {
    }

    private final void J() {
    }

    private static final void K(HotelDetailActivity hotelDetailActivity, n nVar) {
    }

    private final void L(HotelBean hotelBean) {
    }

    private final void M() {
    }

    private static final void N(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void O(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void P(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void Q(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void R(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void S(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private static final void T(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void U(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void V(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void W(HotelDetailActivity hotelDetailActivity, n nVar) {
    }

    public static /* synthetic */ void X(HotelDetailActivity hotelDetailActivity, n nVar) {
    }

    public static /* synthetic */ void Y(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void Z(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void a0(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void b0(HotelDetailActivity hotelDetailActivity, View view) {
    }

    public static /* synthetic */ void c0(HotelDetailActivity hotelDetailActivity, View view) {
    }

    private final void d0(int i2) {
    }

    @JvmStatic
    public static final void e0(@NotNull Context context, @Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
    }

    private final void f0(boolean z) {
    }

    private final void g0(boolean z) {
    }

    private final void h0(HotelTimeCheckBean hotelTimeCheckBean) {
    }

    private final void i0() {
    }

    private final void w(AppBarLayout appBarLayout, int i2) {
    }

    public static final /* synthetic */ void x(HotelDetailActivity hotelDetailActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static final /* synthetic */ p0 y(HotelDetailActivity hotelDetailActivity) {
    }

    public static final /* synthetic */ s1 z(HotelDetailActivity hotelDetailActivity) {
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

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
