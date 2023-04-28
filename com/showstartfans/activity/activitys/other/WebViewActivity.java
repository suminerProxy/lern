package com.showstartfans.activity.activitys.other;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.alibaba.fastjson.JSONObject;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.model.ShareBean;
import com.showstartfans.activity.model.UrlRuleBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.w.c0.m2;
import h.u.a.w.c0.s2;
import h.u.a.w.d0.w2;
import h.y.a.h.h;
import h.y.a.m.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebViewActivity extends BaseNewActivity implements SceneRestorable, w2 {
    private String b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private BridgeWebView f6054d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressBar f6055e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6056f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6057g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6058h;

    /* renamed from: i  reason: collision with root package name */
    private View f6059i;

    /* renamed from: j  reason: collision with root package name */
    private String f6060j;

    /* renamed from: k  reason: collision with root package name */
    private String f6061k;

    /* renamed from: l  reason: collision with root package name */
    private s2 f6062l;

    /* renamed from: m  reason: collision with root package name */
    private ValueCallback<Uri[]> f6063m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f6064a;

        public a(WebViewActivity webViewActivity) {
        }

        private /* synthetic */ void a(String str, UrlRuleBean urlRuleBean) {
        }

        public /* synthetic */ void b(String str, UrlRuleBean urlRuleBean) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f6065a;

        public b(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Function0<Unit> {
        public final /* synthetic */ WebViewActivity b;

        public c(WebViewActivity webViewActivity) {
        }

        public Unit a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements w2 {
        public final /* synthetic */ String b;
        public final /* synthetic */ WebViewActivity c;

        public d(WebViewActivity webViewActivity, String str) {
        }

        @Override // h.u.a.w.d0.w2
        public void onPupMenuViewClick(View view, String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements h.y.a.m.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.l.a.a.e f6066a;
        public final /* synthetic */ WebViewActivity b;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements m2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e f6067a;

            public a(e eVar) {
            }

            @Override // h.u.a.w.c0.m2
            public void a() {
            }

            @Override // h.u.a.w.c0.m2
            public void b() {
            }
        }

        public e(WebViewActivity webViewActivity, h.l.a.a.e eVar) {
        }

        @Override // h.y.a.m.g
        public void a(n nVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f implements h.y.a.m.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.l.a.a.e f6068a;
        public final /* synthetic */ WebViewActivity b;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements m2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f6069a;

            public a(f fVar) {
            }

            @Override // h.u.a.w.c0.m2
            public void a() {
            }

            @Override // h.u.a.w.c0.m2
            public void b() {
            }
        }

        public f(WebViewActivity webViewActivity, h.l.a.a.e eVar) {
        }

        @Override // h.y.a.m.g
        public void a(n nVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6070a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ WebViewActivity c;

        public g(WebViewActivity webViewActivity, boolean z, ImageView imageView) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
        }
    }

    public static /* synthetic */ ProgressBar A(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ void B(WebViewActivity webViewActivity, boolean z) {
    }

    private /* synthetic */ void B0(String str, h.l.a.a.e eVar) {
    }

    public static /* synthetic */ BaseNewFunctionActivity C(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ ValueCallback D(WebViewActivity webViewActivity, ValueCallback valueCallback) {
    }

    private /* synthetic */ boolean D0(View view) {
    }

    public static /* synthetic */ void E(WebViewActivity webViewActivity, String str) {
    }

    public static /* synthetic */ BaseNewFunctionActivity F(WebViewActivity webViewActivity) {
    }

    private /* synthetic */ void F0(String str, h.l.a.a.e eVar) {
    }

    public static /* synthetic */ BaseNewFunctionActivity G(WebViewActivity webViewActivity) {
    }

    private void H() {
    }

    public static /* synthetic */ void H0(String str, h.l.a.a.e eVar) {
    }

    private void I(String str) {
    }

    private /* synthetic */ void I0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void J(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void K0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void L(n nVar) {
    }

    private /* synthetic */ void M0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void N(View view) {
    }

    private /* synthetic */ void O0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void P(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ Unit Q0() {
    }

    private /* synthetic */ void R(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void S0(String str, ShareBean shareBean, View view, String str2, int i2) {
    }

    private /* synthetic */ void T(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void U0(h.y.a.p.v.f fVar, h.l.a.a.e eVar, Boolean bool) throws Exception {
    }

    private /* synthetic */ void V(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void W0(JSONObject jSONObject, View view, String str, int i2) {
    }

    private /* synthetic */ void X(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void Y0(String str, Boolean bool) throws Exception {
    }

    private /* synthetic */ void Z(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void a1(h hVar, ShareBean shareBean, View view, String str, int i2) {
    }

    private /* synthetic */ void b0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void c1(String str, View view, String str2, int i2) {
    }

    private /* synthetic */ void d0(String str, h.l.a.a.e eVar) {
    }

    private void e1() {
    }

    private /* synthetic */ void f0(String str, h.l.a.a.e eVar) {
    }

    private void f1() {
    }

    private void g1() {
    }

    private /* synthetic */ void h0(String str, h.l.a.a.e eVar) {
    }

    private void h1(h hVar, ShareBean shareBean) {
    }

    private void i1(String str) {
    }

    private /* synthetic */ void j0(int i2, View view) {
    }

    private void j1(boolean z) {
    }

    private /* synthetic */ void l0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void n0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void p0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void r0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void t0(String str, h.l.a.a.e eVar) {
    }

    private /* synthetic */ void v0(String str, h.l.a.a.e eVar) {
    }

    public static /* synthetic */ BaseNewFunctionActivity w(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ BridgeWebView x(WebViewActivity webViewActivity) {
    }

    private /* synthetic */ void x0(String str, h.l.a.a.e eVar) {
    }

    public static /* synthetic */ boolean y(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ boolean z(WebViewActivity webViewActivity, boolean z) {
    }

    private /* synthetic */ void z0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void A0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void C0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ boolean E0(View view) {
    }

    public /* synthetic */ void G0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void J0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void K(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void L0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void M(n nVar) {
    }

    public /* synthetic */ void N0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void O(View view) {
    }

    public /* synthetic */ void P0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void Q(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ Unit R0() {
    }

    public /* synthetic */ void S(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void T0(String str, ShareBean shareBean, View view, String str2, int i2) {
    }

    public /* synthetic */ void U(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void V0(h.y.a.p.v.f fVar, h.l.a.a.e eVar, Boolean bool) {
    }

    public /* synthetic */ void W(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void X0(JSONObject jSONObject, View view, String str, int i2) {
    }

    public /* synthetic */ void Y(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void Z0(String str, Boolean bool) {
    }

    public /* synthetic */ void a0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void b1(h hVar, ShareBean shareBean, View view, String str, int i2) {
    }

    public /* synthetic */ void c0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void d1(String str, View view, String str2, int i2) {
    }

    public /* synthetic */ void e0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void g0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void i0(String str, h.l.a.a.e eVar) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @SuppressLint({"CheckResult"})
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    public /* synthetic */ void k0(int i2, View view) {
    }

    public /* synthetic */ void m0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void o0(String str, h.l.a.a.e eVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(View view, String str, int i2) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(Scene scene) {
    }

    public /* synthetic */ void q0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void s0(String str, h.l.a.a.e eVar) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public /* synthetic */ void u0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void w0(String str, h.l.a.a.e eVar) {
    }

    public /* synthetic */ void y0(String str, h.l.a.a.e eVar) {
    }
}
