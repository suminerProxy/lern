package com.showstartfans.activity.activitys.fansspace;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapController;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.AppBarLayout;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.eventmodel.RefreshUserInfoEvent;
import com.showstartfans.activity.model.FansHomePagerInfoBean;
import com.showstartfans.activity.model.PrivateSettingBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import h.a.a.a.a.i.g;
import h.y.a.h.i;
import h.y.a.k.j;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FansHomeOldActivity.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002XYB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020\u001eH\u0002J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001eH\u0014J\b\u0010+\u001a\u00020\u001eH\u0014J\b\u0010,\u001a\u00020\u001eH\u0014J\"\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020\u001eH\u0016J\u0012\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0012\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010;H\u0007J\u0012\u0010<\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u000101H\u0014J\u001a\u0010>\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u000bH\u0016J\u0010\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010E\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010F\u001a\u00020\u001e2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020\u001eH\u0014J\u0010\u0010J\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u000bH\u0002J\u000e\u0010K\u001a\u00020\u001e2\u0006\u0010L\u001a\u00020\rJ\b\u0010M\u001a\u00020\u000bH\u0014J\b\u0010N\u001a\u00020\u001eH\u0002J\b\u0010O\u001a\u00020\u001eH\u0002J\b\u0010P\u001a\u00020\u001eH\u0002J\u0006\u0010Q\u001a\u00020\u001eJ\b\u0010R\u001a\u00020\u001eH\u0002J\b\u0010S\u001a\u00020\u001eH\u0002J\u0010\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u0007H\u0002J\u0018\u0010V\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0015j\b\u0012\u0004\u0012\u00020\u0019`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/showstartfans/activity/activitys/fansspace/FansHomeOldActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "fansId", "", "homePagerInfoBean", "Lcom/showstartfans/activity/model/FansHomePagerInfoBean;", "initDisplayPos", "", "isBlack", "", "isCustomService", "isMyself", "picPathsb", "Ljava/lang/StringBuffer;", "privateBean", "Lcom/showstartfans/activity/model/PrivateSettingBean;", "tabClass", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/fansspace/FansHomeOldActivity$TabItems;", "Lkotlin/collections/ArrayList;", "tabFragment", "Landroidx/fragment/app/Fragment;", "tabTitle", "uploadedPath", "", "addBlack", "", "bindUserInfoData", "concernOrcancelNew", "type", "deleteBlack", "deleteUserImage", "imageId", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "getOpenData", "getUserHomePagerInfo", "loadingType", "Lcom/taihebase/activity/enummodel/LoadingType;", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshUserInfoEvent;", "onNewIntent", "intent", "onOffsetChanged", TtmlNode.TAG_LAYOUT, "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onOptionsItemSelected", MapController.ITEM_LAYER_TAG, "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "onStop", "report", "setBlack", WbCloudFaceContant.BLACK, "setContentViewRes", "setFollowView", "setIdentityInfo", "showReportPop", "startActivityChat", "startAttention", "startFans", "upImagePath", "picturePath", "upMorePic", g.C, "Companion", "TabItems", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FansHomeOldActivity extends BaseNoToolBarActivity implements AppBarLayout.OnOffsetChangedListener, j, SceneRestorable {
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final a f5466o = null;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private static final String f5467p = null;
    @NotNull
    private static final String q = null;
    @NotNull
    private static final String r = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f5468d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5469e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5470f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5471g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private PrivateSettingBean f5472h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private FansHomePagerInfoBean f5473i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<Fragment> f5474j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private StringBuffer f5475k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private List<String> f5476l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<String> f5477m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<b> f5478n;

    /* compiled from: FansHomeOldActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/activitys/fansspace/FansHomeOldActivity$Companion;", "", "()V", "CUSTOM_SERVICE", "", "getCUSTOM_SERVICE", "()Ljava/lang/String;", "FANS_ID_KEY", "getFANS_ID_KEY", "UMENG_FROM_ID", "getUMENG_FROM_ID", "start", "", "ctx", "Landroid/content/Context;", "fansId", "customService", "", "from", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final String c() {
        }

        @JvmStatic
        public final void d(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        }

        @JvmStatic
        public final void e(@Nullable Context context, @NotNull String str, boolean z, @NotNull String str2) {
        }
    }

    /* compiled from: FansHomeOldActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/fansspace/FansHomeOldActivity$TabItems;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Fragment f5479a;

        public b(@NotNull Fragment fragment) {
        }

        public static /* synthetic */ b c(b bVar, Fragment fragment, int i2, Object obj) {
        }

        @NotNull
        public final Fragment a() {
        }

        @NotNull
        public final b b(@NotNull Fragment fragment) {
        }

        @NotNull
        public final Fragment d() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @NotNull
        public String toString() {
        }
    }

    /* compiled from: FansHomeOldActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $type;
        public final /* synthetic */ FansHomeOldActivity this$0;

        public c(int i2, FansHomeOldActivity fansHomeOldActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: FansHomeOldActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FansHomeOldActivity this$0;

        public d(FansHomeOldActivity fansHomeOldActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: FansHomeOldActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/fansspace/FansHomeOldActivity$initListener$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ FansHomeOldActivity b;

        public e(FansHomeOldActivity fansHomeOldActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    public static final /* synthetic */ ArrayList A(FansHomeOldActivity fansHomeOldActivity) {
    }

    public static final /* synthetic */ String B() {
    }

    private final void B0() {
    }

    public static final /* synthetic */ void C(FansHomeOldActivity fansHomeOldActivity, i iVar) {
    }

    private final void C0() {
    }

    public static final /* synthetic */ boolean D(FansHomeOldActivity fansHomeOldActivity) {
    }

    private final void D0(String str) {
    }

    public static final /* synthetic */ void E(FansHomeOldActivity fansHomeOldActivity) {
    }

    private static final void E0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static final /* synthetic */ void F(FansHomeOldActivity fansHomeOldActivity, int i2) {
    }

    private final void F0(String str, int i2) {
    }

    private final void G() {
    }

    private static final void G0(int i2, FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private static final void H(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private final void I() {
    }

    private static final void L(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private static final void N(FansHomeOldActivity fansHomeOldActivity, int i2, n nVar) {
    }

    private final void O() {
    }

    private static final void P(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private final void Q(i iVar) {
    }

    private static final void R(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private static final void S(FansHomeOldActivity fansHomeOldActivity, AppBarLayout appBarLayout, int i2) {
    }

    private static final void T(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void U(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void V(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void W(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void X(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void Y(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    private static final void Z(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void a0(int i2, FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static /* synthetic */ void b0(FansHomeOldActivity fansHomeOldActivity, View view, String str, int i2) {
    }

    public static /* synthetic */ void c0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void d0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static /* synthetic */ void e0(FansHomeOldActivity fansHomeOldActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void f0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void g0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void h0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void i0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static /* synthetic */ void j0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static /* synthetic */ void k0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void l0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    public static /* synthetic */ void m0(FansHomeOldActivity fansHomeOldActivity, int i2, n nVar) {
    }

    public static /* synthetic */ void n0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void o0(FansHomeOldActivity fansHomeOldActivity, View view, String str, int i2) {
    }

    public static /* synthetic */ void p0(FansHomeOldActivity fansHomeOldActivity, View view) {
    }

    public static /* synthetic */ void q0(FansHomeOldActivity fansHomeOldActivity, n nVar) {
    }

    private static final void r0(FansHomeOldActivity fansHomeOldActivity, View view, String str, int i2) {
    }

    private final void s0(int i2) {
    }

    private final void u0() {
    }

    private final void v0() {
    }

    public static final /* synthetic */ String w() {
    }

    private final void w0() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(FansHomeOldActivity fansHomeOldActivity) {
    }

    private static final void x0(FansHomeOldActivity fansHomeOldActivity, View view, String str, int i2) {
    }

    public static final /* synthetic */ String y() {
    }

    @JvmStatic
    public static final void y0(@Nullable Context context, @NotNull String str, @NotNull String str2) {
    }

    public static final /* synthetic */ FansHomePagerInfoBean z(FansHomeOldActivity fansHomeOldActivity) {
    }

    @JvmStatic
    public static final void z0(@Nullable Context context, @NotNull String str, boolean z, @NotNull String str2) {
    }

    public final void A0() {
    }

    public final void J(int i2) {
    }

    public final void K() {
    }

    public final void M(@NotNull String str, int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // h.y.a.k.j
    public void onClick(@Nullable View view) {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserInfoEvent refreshUserInfoEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public final void t0(boolean z) {
    }
}
