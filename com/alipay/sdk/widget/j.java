package com.alipay.sdk.widget;

import android.app.Activity;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import com.alipay.sdk.widget.WebViewWindow;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j extends g implements WebViewWindow.a, WebViewWindow.b, WebViewWindow.c {
    public static final String b = "alipayjsbridge://";
    public static final String c = "onBack";

    /* renamed from: d  reason: collision with root package name */
    public static final String f843d = "setTitle";

    /* renamed from: e  reason: collision with root package name */
    public static final String f844e = "onRefresh";

    /* renamed from: f  reason: collision with root package name */
    public static final String f845f = "showBackButton";

    /* renamed from: g  reason: collision with root package name */
    public static final String f846g = "onExit";

    /* renamed from: h  reason: collision with root package name */
    public static final String f847h = "onLoadJs";

    /* renamed from: i  reason: collision with root package name */
    public static final String f848i = "callNativeFunc";

    /* renamed from: j  reason: collision with root package name */
    public static final String f849j = "back";

    /* renamed from: k  reason: collision with root package name */
    public static final String f850k = "title";

    /* renamed from: l  reason: collision with root package name */
    public static final String f851l = "refresh";

    /* renamed from: m  reason: collision with root package name */
    public static final String f852m = "backButton";

    /* renamed from: n  reason: collision with root package name */
    public static final String f853n = "refreshButton";

    /* renamed from: o  reason: collision with root package name */
    public static final String f854o = "exit";

    /* renamed from: p  reason: collision with root package name */
    public static final String f855p = "action";
    public static final String q = "pushWindow";
    public static final String r = "h5JsFuncCallback";
    private static final String s = "sdk_result_code:";
    private boolean t;
    private String u;
    private boolean v;
    private boolean w;
    private WebViewWindow x;
    private u y;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public abstract class a implements Animation.AnimationListener {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f856d;

        private a(j jVar) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ a(j jVar, k kVar) {
        }
    }

    public j(Activity activity) {
    }

    public static /* synthetic */ WebViewWindow a(j jVar) {
    }

    public static /* synthetic */ boolean b(j jVar, boolean z) {
    }

    private boolean c() {
    }

    private void d() {
    }

    private void e() {
    }

    private boolean f() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
    }

    @Override // com.alipay.sdk.widget.g
    public boolean b() {
    }

    public void a(String str, String str2, boolean z) {
    }

    private boolean b(String str, String str2) {
    }

    private void a(boolean z) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.b
    public boolean c(WebViewWindow webViewWindow, String str) {
    }

    @Override // com.alipay.sdk.widget.g
    public void a(String str) {
    }

    @Override // com.alipay.sdk.widget.g
    public void a() {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.a
    public boolean a(WebViewWindow webViewWindow, String str, String str2, String str3, JsPromptResult jsPromptResult) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.a
    public void a(WebViewWindow webViewWindow, String str) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.b
    public boolean b(WebViewWindow webViewWindow, String str) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.b
    public boolean a(WebViewWindow webViewWindow, int i2, String str, String str2) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.b
    public boolean a(WebViewWindow webViewWindow, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    private void a(String str, String str2, String str3) {
    }

    private void b(String str) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.c
    public void a(WebViewWindow webViewWindow) {
    }

    @Override // com.alipay.sdk.widget.WebViewWindow.c
    public void b(WebViewWindow webViewWindow) {
    }
}
