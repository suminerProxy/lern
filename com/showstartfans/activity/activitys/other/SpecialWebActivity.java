package com.showstartfans.activity.activitys.other;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.fastjson.JSONObject;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.model.ShareBean;
import com.showstartfans.activity.model.UrlRuleBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.l.a.a.e;
import h.u.a.w.c0.s2;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpecialWebActivity.kt */
@Deprecated(message = "我也不知道为啥有2个一样的WebViewActivity，建议以后都统一到 WebViewActivity 里面")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J$\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u0019H\u0016J\u0012\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u0019H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SpecialWebActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/mob/moblink/SceneRestorable;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "()V", "currentShareId", "", "isLoadFinsh", "", "shareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareVideoDialog;", "shareImg", "titleStr", "url", "getVideoSharePic", "", "id", "initData", "initListener", "initView", "loadUrl", "onBackPressed", "onDestroy", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", g.C, "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "resetWeb", "setContentViewRes", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SpecialWebActivity extends BaseNoToolBarActivity implements SceneRestorable, w2 {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f6041i = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f6042d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f6043e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f6044f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6045g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private s2 f6046h;

    /* compiled from: SpecialWebActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SpecialWebActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "url", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @NotNull String str) {
        }
    }

    /* compiled from: SpecialWebActivity.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"com/showstartfans/activity/activitys/other/SpecialWebActivity$initListener$3", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SpecialWebActivity f6047a;

        public b(SpecialWebActivity specialWebActivity) {
        }

        public static /* synthetic */ void a(SpecialWebActivity specialWebActivity, String str, UrlRuleBean urlRuleBean) {
        }

        public static /* synthetic */ void b(SpecialWebActivity specialWebActivity) {
        }

        private static final void c(SpecialWebActivity specialWebActivity) {
        }

        private static final void d(SpecialWebActivity specialWebActivity, String str, UrlRuleBean urlRuleBean) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        }
    }

    /* compiled from: SpecialWebActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/other/SpecialWebActivity$initView$2", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "onReceivedTitle", "title", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SpecialWebActivity f6048a;

        public c(SpecialWebActivity specialWebActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@Nullable WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
        }
    }

    /* compiled from: SpecialWebActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SpecialWebActivity this$0;

        public d(SpecialWebActivity specialWebActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ void A(SpecialWebActivity specialWebActivity, String str) {
    }

    private final void B(String str) {
    }

    private static final void C(SpecialWebActivity specialWebActivity, n nVar) {
    }

    private static final void D(SpecialWebActivity specialWebActivity, View view) {
    }

    private static final void E(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void F(String str, e eVar) {
    }

    private static final void G(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void H(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, View view, String str, int i2) {
    }

    private static final void I(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void J(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void K(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void L(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void M(SpecialWebActivity specialWebActivity, View view) {
    }

    private static final void N(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, View view, String str, int i2) {
    }

    private static final void O(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private static final void P(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    private static final void Q(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    private static final void R(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    private static final void S(JSONObject jSONObject, SpecialWebActivity specialWebActivity, View view, String str, int i2) {
    }

    private static final void T(String str, e eVar) {
    }

    public static /* synthetic */ void U(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void V(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void W(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    public static /* synthetic */ void X(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void Y(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, View view, String str, int i2) {
    }

    public static /* synthetic */ void Z(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    public static /* synthetic */ void a0(String str, e eVar) {
    }

    public static /* synthetic */ void b0(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, View view, String str, int i2) {
    }

    public static /* synthetic */ void c0(SpecialWebActivity specialWebActivity, Ref.ObjectRef objectRef, ShareBean shareBean, View view, String str, int i2) {
    }

    public static /* synthetic */ void d0(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void e0(SpecialWebActivity specialWebActivity, View view) {
    }

    public static /* synthetic */ void f0(JSONObject jSONObject, SpecialWebActivity specialWebActivity, View view, String str, int i2) {
    }

    public static /* synthetic */ void g0(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void h0(SpecialWebActivity specialWebActivity, View view) {
    }

    public static /* synthetic */ void i0(String str, e eVar) {
    }

    public static /* synthetic */ void j0(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    public static /* synthetic */ void k0(SpecialWebActivity specialWebActivity, n nVar) {
    }

    public static /* synthetic */ void l0(SpecialWebActivity specialWebActivity, String str, e eVar) {
    }

    private final void m0() {
    }

    private final void n0() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(SpecialWebActivity specialWebActivity) {
    }

    public static final /* synthetic */ boolean x(SpecialWebActivity specialWebActivity) {
    }

    public static final /* synthetic */ void y(SpecialWebActivity specialWebActivity) {
    }

    public static final /* synthetic */ void z(SpecialWebActivity specialWebActivity, boolean z) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
