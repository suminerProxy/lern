package com.showstartfans.activity.activitys.community;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.eventmodel.ArticlePublishEvent;
import com.showstartfans.activity.model.MapShowCountryData;
import com.showstartfans.activity.model.MapShowSiteData;
import com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.y.b0;
import h.u.a.g.a0;
import h.u.a.w.d0.u1;
import h.y.a.m.n;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k.b.v0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommunityMapActivity.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0014J\b\u0010.\u001a\u00020+H\u0014J\b\u0010/\u001a\u00020+H\u0014J\u0018\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0018H\u0014J\u001c\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\u0018H\u0002J\u0016\u00107\u001a\u00020+2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d09H\u0002J\b\u0010:\u001a\u00020\u0018H\u0016J\"\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0012\u0010@\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020+H\u0014J\u0012\u0010D\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010FH\u0007J\u0012\u0010G\u001a\u00020+2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010J\u001a\u00020+2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010K\u001a\u00020+2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u001a\u0010K\u001a\u00020+2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010L\u001a\u00020\u0012H\u0016J\b\u0010M\u001a\u00020+H\u0014J\b\u0010N\u001a\u00020+H\u0014J\u0010\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020BH\u0014J\u0010\u0010Q\u001a\u00020+2\u0006\u0010R\u001a\u00020\u0018H\u0014J\u0012\u0010S\u001a\u00020+2\b\b\u0002\u0010T\u001a\u00020\u0018H\u0002J\b\u0010U\u001a\u00020\u000eH\u0014J\u001c\u0010V\u001a\u00020+2\b\b\u0002\u0010W\u001a\u00020\u00182\b\b\u0002\u0010X\u001a\u00020#H\u0002J\u001e\u0010Y\u001a\u00020+2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u0010Z\u001a\u00020\u0018H\u0002J\u0012\u0010[\u001a\u00020+2\b\b\u0002\u0010T\u001a\u00020\u0018H\u0002J\b\u0010\\\u001a\u00020+H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b'\u0010(¨\u0006]"}, d2 = {"Lcom/showstartfans/activity/activitys/community/CommunityMapActivity;", "Lcom/showstartfans/activity/threepartysupport/baidumap/BaiduLocationActivity;", "Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/community/CommunityMapAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/community/CommunityMapAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "baiduMap", "Lcom/baidu/mapapi/map/BaiduMap;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "binding", "Lcom/showstartfans/activity/databinding/ActivityCommunityMapBinding;", "bottomHeight", "", "getBottomHeight", "()I", "bottomHeight$delegate", "helpIndex", "isLocationSuccess", "", "isShowHelpOnTouch", "isShowLocationOnce", "mClusterManager", "Lcom/showstartfans/activity/activitys/community/clusterutil/clustering/ClusterManager;", "Lcom/showstartfans/activity/activitys/community/clusterutil/clustering/ClusterItem;", "mLocation", "Lcom/baidu/location/BDLocation;", "mapIsInited", "mapRecordShow", "", "", "Lcom/showstartfans/activity/model/MapShowCountryData;", "recordPopup", "Lcom/showstartfans/activity/activitys/community/CommunityRecordPopup;", "getRecordPopup", "()Lcom/showstartfans/activity/activitys/community/CommunityRecordPopup;", "recordPopup$delegate", "finish", "", "initCluster", "initData", "initListener", "initView", "locationReceive", "location", "isSuccess", "mapScale", "latLng", "Lcom/baidu/mapapi/model/LatLng;", "isReset", "mapScaleItems", "items", "", "needTopToolbar", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ArticlePublishEvent;", "onMapStatusChange", "mapStatus", "Lcom/baidu/mapapi/map/MapStatus;", "onMapStatusChangeFinish", "onMapStatusChangeStart", "reason", "onPause", "onResume", "onSaveInstanceState", "outState", "permissionWhether", "isPermission", "requestAllExpMapData", "resetMap", "setContentViewResByViewBind", "showHelp", "isForce", "text", "showNowLocation", "isScale", "updateMapData", "updateMapView", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CommunityMapActivity extends BaiduLocationActivity implements BaiduMap.OnMapStatusChangeListener {
    @NotNull
    public Map<Integer, View> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private Map<String, MapShowCountryData> f5371d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f5372e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private BottomSheetBehavior<View> f5373f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f5374g;

    /* renamed from: h  reason: collision with root package name */
    private BaiduMap f5375h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5376i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5377j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private h.u.a.c.y.e0.b.c<h.u.a.c.y.e0.b.b> f5378k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5379l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private BDLocation f5380m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5381n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f5382o;

    /* renamed from: p  reason: collision with root package name */
    private int f5383p;
    @NotNull
    private final Lazy q;

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/community/CommunityMapAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends Lambda implements Function0<h.u.a.c.y.a0> {
        public final /* synthetic */ CommunityMapActivity this$0;

        public a(CommunityMapActivity communityMapActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.y.a0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.y.a0 invoke() {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ CommunityMapActivity this$0;

        public b(CommunityMapActivity communityMapActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/model/MapShowSiteData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.community.CommunityMapActivity$initListener$4$site$1", f = "CommunityMapActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends SuspendLambda implements Function2<v0, Continuation<? super MapShowSiteData>, Object> {
        public final /* synthetic */ List<MapShowSiteData> $sites;
        public int label;
        public final /* synthetic */ CommunityMapActivity this$0;

        public c(CommunityMapActivity communityMapActivity, List<MapShowSiteData> list, Continuation<? super c> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super MapShowSiteData> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super MapShowSiteData> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/community/CommunityMapActivity$initView$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommunityMapActivity f5384a;

        public d(CommunityMapActivity communityMapActivity) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View view, int i2) {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/community/CommunityRecordPopup;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function0<b0> {
        public static final e INSTANCE = null;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final b0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ b0 invoke() {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CommunityMapActivity this$0;

        public f(CommunityMapActivity communityMapActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: CommunityMapActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/community/CommunityMapActivity$showHelp$2$1", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchScalePop$AnimListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g extends u1.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommunityMapActivity f5385a;

        public g(CommunityMapActivity communityMapActivity) {
        }

        @Override // h.u.a.w.d0.u1.b, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@Nullable Animation animation) {
        }
    }

    public static final /* synthetic */ a0 E(CommunityMapActivity communityMapActivity) {
    }

    public static final /* synthetic */ int F(CommunityMapActivity communityMapActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity G(CommunityMapActivity communityMapActivity) {
    }

    public static final /* synthetic */ void H(CommunityMapActivity communityMapActivity, int i2) {
    }

    private final h.u.a.c.y.a0 I() {
    }

    private final int J() {
    }

    private final b0 K() {
    }

    private final void L() {
    }

    private static final void M(CommunityMapActivity communityMapActivity, MotionEvent motionEvent) {
    }

    private static final boolean N(CommunityMapActivity communityMapActivity, h.u.a.c.y.e0.b.a aVar) {
    }

    private static final boolean O(CommunityMapActivity communityMapActivity, h.u.a.c.y.e0.b.b bVar) {
    }

    private static final void P(CommunityMapActivity communityMapActivity, View view) {
    }

    private static final void Q(CommunityMapActivity communityMapActivity) {
    }

    private static final void R(CommunityMapActivity communityMapActivity) {
    }

    private static final void S(CommunityMapActivity communityMapActivity, View view) {
    }

    private static final void T(CommunityMapActivity communityMapActivity, View view) {
    }

    private static final void U(CommunityMapActivity communityMapActivity, View view) {
    }

    private static final void V(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ void W(CommunityMapActivity communityMapActivity, View view) {
    }

    public static /* synthetic */ void X(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ void Y(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ void Z(CommunityMapActivity communityMapActivity, boolean z, n nVar) {
    }

    public static /* synthetic */ void a0(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ void b0(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ void c0(CommunityMapActivity communityMapActivity, View view) {
    }

    public static /* synthetic */ void d0(CommunityMapActivity communityMapActivity, View view) {
    }

    public static /* synthetic */ void e0(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ boolean f0(CommunityMapActivity communityMapActivity, h.u.a.c.y.e0.b.a aVar) {
    }

    public static /* synthetic */ void g0(CommunityMapActivity communityMapActivity, View view) {
    }

    public static /* synthetic */ void h0(CommunityMapActivity communityMapActivity) {
    }

    public static /* synthetic */ boolean i0(CommunityMapActivity communityMapActivity, h.u.a.c.y.e0.b.b bVar) {
    }

    public static /* synthetic */ void j0(CommunityMapActivity communityMapActivity, MotionEvent motionEvent) {
    }

    private final void k0(LatLng latLng, boolean z) {
    }

    public static /* synthetic */ void l0(CommunityMapActivity communityMapActivity, LatLng latLng, boolean z, int i2, Object obj) {
    }

    private final void m0(Collection<? extends h.u.a.c.y.e0.b.b> collection) {
    }

    private final void n0(boolean z) {
    }

    public static /* synthetic */ void o0(CommunityMapActivity communityMapActivity, boolean z, int i2, Object obj) {
    }

    /* renamed from: onEvent$lambda-15  reason: not valid java name */
    private static final void m16onEvent$lambda15(CommunityMapActivity communityMapActivity) {
    }

    private static final void p0(CommunityMapActivity communityMapActivity, boolean z, n nVar) {
    }

    private final void q0(boolean z, String str) {
    }

    public static /* synthetic */ void r0(CommunityMapActivity communityMapActivity, boolean z, String str, int i2, Object obj) {
    }

    private static final void s0(CommunityMapActivity communityMapActivity) {
    }

    private static final void t0(CommunityMapActivity communityMapActivity) {
    }

    private final void u0(LatLng latLng, boolean z) {
    }

    public static /* synthetic */ void v0(CommunityMapActivity communityMapActivity, LatLng latLng, boolean z, int i2, Object obj) {
    }

    private final void w0(boolean z) {
    }

    public static /* synthetic */ void x0(CommunityMapActivity communityMapActivity, boolean z, int i2, Object obj) {
    }

    private final void y0() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity
    public void C(@NotNull BDLocation bDLocation, boolean z) {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity
    public void D(boolean z) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // android.app.Activity
    public void finish() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ArticlePublishEvent articlePublishEvent) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChange(@Nullable MapStatus mapStatus) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeFinish(@Nullable MapStatus mapStatus) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeStart(@Nullable MapStatus mapStatus) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeStart(@Nullable MapStatus mapStatus, int i2) {
    }
}
