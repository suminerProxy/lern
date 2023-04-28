package com.showstartfans.activity.activitys.goods;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.ShoppingChangeEvent;
import com.showstartfans.activity.model.CouponBean;
import com.showstartfans.activity.model.GoodPoster;
import com.showstartfans.activity.model.GoodsDetailBean;
import com.showstartfans.activity.model.ShowCouponLabel;
import com.showstartfans.activity.view.VideoFullView;
import com.showstartfans.activity.view.textview.CountDownNewView;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.w.c0.p2;
import h.u.a.w.c0.r2;
import h.u.a.w.d0.w2;
import h.u.a.w.d0.x2;
import h.y.a.f.m;
import h.y.a.m.n;
import h.y.a.m.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowGoodsDetailActivity.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001UB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\u001e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0(H\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000fH\u0002J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u000fJ\b\u0010.\u001a\u00020\u001eH\u0014J\b\u0010/\u001a\u00020\u001eH\u0014J\b\u00100\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001eH\u0014J\b\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u001aH\u0017J\b\u00105\u001a\u00020\u001eH\u0014J\u0012\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u000108H\u0007J\u0012\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u000109H\u0007J\u001a\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?H\u0014J \u0010@\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0011H\u0016J\b\u0010C\u001a\u00020\u001eH\u0014J\b\u0010D\u001a\u00020\u001eH\u0014J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020\u001eH\u0014J\b\u0010I\u001a\u00020\u001eH\u0014J\b\u0010J\u001a\u00020\u001eH\u0002J\b\u0010K\u001a\u00020\u0011H\u0014J\b\u0010L\u001a\u00020\u001eH\u0002J\u0018\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020\u001eH\u0002J\u0010\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020\u0011H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Landroid/view/View$OnClickListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "bean", "Lcom/showstartfans/activity/model/GoodsDetailBean;", "couponPop", "Lcom/showstartfans/activity/widget/popupwindow/ShowDetailCouponPop;", "fullView", "Lcom/showstartfans/activity/view/VideoFullView;", "goodsId", "", "isTouch", "", "mScrollY", "", "pushUserId", "shareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "skuDialog", "Lcom/showstartfans/activity/widget/dialog/SKUDialog;", "tabs", "", "Landroid/util/Pair;", "Landroid/view/View;", "widthPixels", "checkPermission", "clickBuyBtn", "", "createKnowView", "text", "createLabelText", "labelCoupon", "Lcom/showstartfans/activity/model/ShowCouponLabel;", "getCoupon", "couponBean", "Lcom/showstartfans/activity/model/CouponBean;", "callBack", "Lkotlin/Function0;", "getCouponsAndReceive", "getGoodsDetailData", "isShow", "getShoppingNum", "isNeedAni", "initData", "initListener", "initSKUDialog", "initView", "onBackPressed", "onClick", "view", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/ShoppingChangeEvent;", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPupMenuViewClick", "content", h.a.a.a.a.i.g.C, "onRestart", "onResume", "onReturnSceneData", InnerShareParams.SCENCE, "Lcom/mob/moblink/Scene;", "onStart", "onStop", "saveCalendar", "setContentViewRes", "setCountDown", "setTime", "djTime", "Lcom/showstartfans/activity/view/textview/CountDownNewView;", "djTimeP", "Landroid/widget/LinearLayout;", "setViewData", "showSkuDialog", "type", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShowGoodsDetailActivity extends BaseNewActivity implements w2, View.OnClickListener, SceneRestorable {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public static final a f5562n = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private VideoFullView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private String f5563d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f5564e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private GoodsDetailBean f5565f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private p2 f5566g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private r2 f5567h;

    /* renamed from: i  reason: collision with root package name */
    private int f5568i;

    /* renamed from: j  reason: collision with root package name */
    private int f5569j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5570k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final List<Pair<String, View>> f5571l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private x2 f5572m;

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "id", "", "payFromToType", "", "pushUserId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@NotNull Context context, @Nullable String str) {
        }

        @JvmStatic
        public final void b(@NotNull Context context, @Nullable String str, int i2, @Nullable String str2) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CouponBean $couponBean;
        public final /* synthetic */ ShowGoodsDetailActivity this$0;

        public b(CouponBean couponBean, ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "goodsDetailBean", "Lcom/showstartfans/activity/model/GoodsDetailBean;", "resultCode", "Lcom/taihebase/activity/network/ResultCode;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function2<GoodsDetailBean, o, Unit> {
        public final /* synthetic */ ShowGoodsDetailActivity this$0;

        /* compiled from: ShowGoodsDetailActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ ShowGoodsDetailActivity this$0;

            public a(ShowGoodsDetailActivity showGoodsDetailActivity) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public c(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(GoodsDetailBean goodsDetailBean, o oVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable GoodsDetailBean goodsDetailBean, @Nullable o oVar) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "aFlag", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ShowGoodsDetailActivity this$0;

        public d(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "statusFlag", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ShowGoodsDetailActivity this$0;

        public e(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity$setTime$1", "Lcom/showstartfans/activity/view/textview/CountDownNewView$OnCountDownNewFinishListener;", "onCountDownFinish", "", "onUntilFinished", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements CountDownNewView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShowGoodsDetailActivity f5573a;

        public f(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownNewView.b
        public void onCountDownFinish() {
        }

        @Override // com.showstartfans.activity.view.textview.CountDownNewView.b
        public void onUntilFinished(long j2) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity$setViewData$11", "Landroid/webkit/WebChromeClient;", "onHideCustomView", "", "onShowCustomView", "view", "Landroid/view/View;", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShowGoodsDetailActivity f5574a;

        public g(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        public static /* synthetic */ void a(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        private static final void b(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ ShowGoodsDetailActivity this$0;

        public h(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        public final void invoke(int i2) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity$setViewData$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShowGoodsDetailActivity f5575a;
        public final /* synthetic */ k b;

        public i(ShowGoodsDetailActivity showGoodsDetailActivity, k kVar) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function1<String, CharSequence> {
        public static final j INSTANCE = null;

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        }
    }

    /* compiled from: ShowGoodsDetailActivity.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0014¨\u0006\u0010"}, d2 = {"com/showstartfans/activity/activitys/goods/ShowGoodsDetailActivity$setViewData$adapter$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/GoodPoster;", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", h.a.a.a.a.i.g.C, "onCreateViewHolder_impl", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends m<GoodPoster> {

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ ShowGoodsDetailActivity f5576n;

        public k(ShowGoodsDetailActivity showGoodsDetailActivity) {
        }

        public static /* synthetic */ void Q(GoodPoster goodPoster, k kVar, int i2, View view) {
        }

        public static /* synthetic */ void R(GoodPoster goodPoster, ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
        }

        private static final void S(GoodPoster goodPoster, k kVar, int i2, View view) {
        }

        private static final void T(GoodPoster goodPoster, ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
        }

        @Override // h.y.a.f.m
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder C(ViewGroup viewGroup, int i2) {
        }

        @NotNull
        public m.c U(@Nullable ViewGroup viewGroup, int i2) {
        }

        @Override // h.y.a.f.m
        public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
        }
    }

    public static final /* synthetic */ void A(ShowGoodsDetailActivity showGoodsDetailActivity, boolean z) {
    }

    public static /* synthetic */ void A0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static final /* synthetic */ int B(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    public static /* synthetic */ boolean B0(ShowGoodsDetailActivity showGoodsDetailActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ List C(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    public static /* synthetic */ void C0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static final /* synthetic */ void D(ShowGoodsDetailActivity showGoodsDetailActivity, GoodsDetailBean goodsDetailBean) {
    }

    @JvmStatic
    public static final void D0(@NotNull Context context, @Nullable String str) {
    }

    public static final /* synthetic */ void E(ShowGoodsDetailActivity showGoodsDetailActivity, int i2) {
    }

    @JvmStatic
    public static final void E0(@NotNull Context context, @Nullable String str, int i2, @Nullable String str2) {
    }

    public static final /* synthetic */ void F(ShowGoodsDetailActivity showGoodsDetailActivity, boolean z) {
    }

    private final void F0() {
    }

    public static final /* synthetic */ void G(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    private final void G0() {
    }

    private final boolean H() {
    }

    private final void H0(CountDownNewView countDownNewView, LinearLayout linearLayout) {
    }

    private final void I() {
    }

    private final void I0() {
    }

    private final View J(String str) {
    }

    private static final boolean J0(ShowGoodsDetailActivity showGoodsDetailActivity, View view, MotionEvent motionEvent) {
    }

    private static final void K(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void K0(ShowGoodsDetailActivity showGoodsDetailActivity, View view, int i2, int i3, int i4, int i5) {
    }

    private final View L(ShowCouponLabel showCouponLabel) {
    }

    private static final void L0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private final void M(CouponBean couponBean, Function0<Unit> function0) {
    }

    private final void M0(int i2) {
    }

    private static final void N(ShowGoodsDetailActivity showGoodsDetailActivity, Function0 function0, n nVar) {
    }

    private final void O() {
    }

    private static final void P(ShowGoodsDetailActivity showGoodsDetailActivity, n nVar) {
    }

    private static final void Q(ShowGoodsDetailActivity showGoodsDetailActivity, CouponBean couponBean) {
    }

    private final void R(boolean z) {
    }

    private static final void T(ShowGoodsDetailActivity showGoodsDetailActivity, n nVar) {
    }

    private static final void U(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void V(ShowGoodsDetailActivity showGoodsDetailActivity, int i2, View view) {
    }

    private static final void W(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void X(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void Y(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void Z(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void a0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void b0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void c0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void d0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void e0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private static final void f0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    private final void g0() {
    }

    private static final void h0(ShowGoodsDetailActivity showGoodsDetailActivity, String str) {
    }

    public static /* synthetic */ void i0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void j0(ShowGoodsDetailActivity showGoodsDetailActivity, Function0 function0, n nVar) {
    }

    public static /* synthetic */ void k0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void l0(ShowGoodsDetailActivity showGoodsDetailActivity, int i2, View view) {
    }

    public static /* synthetic */ void m0(ShowGoodsDetailActivity showGoodsDetailActivity, CouponBean couponBean) {
    }

    public static /* synthetic */ void n0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void o0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void p0(ShowGoodsDetailActivity showGoodsDetailActivity, n nVar) {
    }

    public static /* synthetic */ void q0(ShowGoodsDetailActivity showGoodsDetailActivity, View view, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void r0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void s0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void t0(ShowGoodsDetailActivity showGoodsDetailActivity, n nVar) {
    }

    public static /* synthetic */ void u0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static /* synthetic */ void v0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static final /* synthetic */ void w(ShowGoodsDetailActivity showGoodsDetailActivity, o oVar, Function0 function0) {
    }

    public static /* synthetic */ void w0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static final /* synthetic */ GoodsDetailBean x(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    public static /* synthetic */ void x0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public static final /* synthetic */ x2 y(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    public static /* synthetic */ void y0(ShowGoodsDetailActivity showGoodsDetailActivity, String str) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(ShowGoodsDetailActivity showGoodsDetailActivity) {
    }

    public static /* synthetic */ void z0(ShowGoodsDetailActivity showGoodsDetailActivity, View view) {
    }

    public final void S(boolean z) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"CheckResult"})
    public void onClick(@NotNull View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ShoppingChangeEvent shoppingChangeEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@NotNull View view, @NotNull String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@NotNull Scene scene) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }
}
