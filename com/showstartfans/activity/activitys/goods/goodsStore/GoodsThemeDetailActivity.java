package com.showstartfans.activity.activitys.goods.goodsStore;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.AppBarLayout;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.view.TopShopNumView;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.u.a.w.c0.r2;
import h.u.a.w.d0.w2;
import h.v.a.e.e;
import h.y.a.k.j;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GoodsThemeDetailActivity.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00018B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0014J\b\u0010%\u001a\u00020\u001eH\u0016J\u0012\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u001a\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u0013H\u0016J$\u00100\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010\n2\u0006\u00102\u001a\u00020\u0013H\u0016J\b\u00103\u001a\u00020\u001eH\u0014J\u0012\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\u0013H\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/goodsStore/GoodsThemeDetailActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "goodsAdapter", "Lcom/showstartfans/activity/activitys/goods/goodsStore/GoodsAdapter;", "id", "", "livePushId", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "mAdapter", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "mShareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "pageNo", "", "shareParams", "", "shoppingView", "Lcom/showstartfans/activity/view/TopShopNumView;", "getShoppingView", "()Lcom/showstartfans/activity/view/TopShopNumView;", "shoppingView$delegate", "Lkotlin/Lazy;", "type", "addStatusBarHeights", "", "getGoodsThemeDetailData", "isShowProgress", "getGoodsThemeDetailList", "initData", "initListener", "initView", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onNewIntent", "intent", "Landroid/content/Intent;", "onOffsetChanged", TtmlNode.TAG_LAYOUT, "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onPupMenuViewClick", "content", g.C, "onResume", "onReturnSceneData", InnerShareParams.SCENCE, "Lcom/mob/moblink/Scene;", "setContentViewRes", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GoodsThemeDetailActivity extends BaseNoToolBarActivity implements AppBarLayout.OnOffsetChangedListener, w2, j, SceneRestorable {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f5578m = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private String f5579d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5580e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f5581f;

    /* renamed from: g  reason: collision with root package name */
    private int f5582g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private h.v.a.d f5583h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private h.u.a.c.b0.l4.j f5584i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private e f5585j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private r2 f5586k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f5587l;

    /* compiled from: GoodsThemeDetailActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/goods/goodsStore/GoodsThemeDetailActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "themeId", "", "themeType", "shareParams", "", "pushUserId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        }

        public final void b(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z) {
        }

        public final void c(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        }
    }

    /* compiled from: GoodsThemeDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/goods/goodsStore/GoodsThemeDetailActivity$getGoodsThemeDetailData$1$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GoodsThemeDetailActivity f5588a;

        public b(GoodsThemeDetailActivity goodsThemeDetailActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) {
        }
    }

    /* compiled from: GoodsThemeDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ GoodsThemeDetailActivity this$0;

        public c(GoodsThemeDetailActivity goodsThemeDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: GoodsThemeDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/TopShopNumView;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<TopShopNumView> {
        public final /* synthetic */ GoodsThemeDetailActivity this$0;

        public d(GoodsThemeDetailActivity goodsThemeDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ TopShopNumView invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TopShopNumView invoke() {
        }
    }

    private static final void A(GoodsThemeDetailActivity goodsThemeDetailActivity, n nVar) {
    }

    private final void B() {
    }

    private static final void C(GoodsThemeDetailActivity goodsThemeDetailActivity, n nVar) {
    }

    private final TopShopNumView D() {
    }

    private static final void E(GoodsThemeDetailActivity goodsThemeDetailActivity, int i2, View view) {
    }

    private static final void F(GoodsThemeDetailActivity goodsThemeDetailActivity, View view) {
    }

    private static final void G(GoodsThemeDetailActivity goodsThemeDetailActivity, boolean z) {
    }

    public static /* synthetic */ void H(GoodsThemeDetailActivity goodsThemeDetailActivity, int i2, View view) {
    }

    public static /* synthetic */ void I(GoodsThemeDetailActivity goodsThemeDetailActivity, View view) {
    }

    public static /* synthetic */ void J(GoodsThemeDetailActivity goodsThemeDetailActivity, n nVar) {
    }

    public static /* synthetic */ void K(GoodsThemeDetailActivity goodsThemeDetailActivity, n nVar) {
    }

    public static /* synthetic */ void L(GoodsThemeDetailActivity goodsThemeDetailActivity, boolean z) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(GoodsThemeDetailActivity goodsThemeDetailActivity) {
    }

    public static final /* synthetic */ void x(GoodsThemeDetailActivity goodsThemeDetailActivity, boolean z) {
    }

    private final void y() {
    }

    private final void z(boolean z) {
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

    @Override // h.y.a.k.j
    public void onClick(@Nullable View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
