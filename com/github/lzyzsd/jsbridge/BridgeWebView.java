package com.github.lzyzsd.jsbridge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import h.l.a.a.d;
import h.l.a.a.e;
import h.l.a.a.g;
import h.l.a.a.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BridgeWebView extends WebView implements h {

    /* renamed from: j  reason: collision with root package name */
    public static final String f3343j = "WebViewJavascriptBridge.js";
    public Map<String, e> b;
    public Map<String, h.l.a.a.b> c;

    /* renamed from: d  reason: collision with root package name */
    public h.l.a.a.b f3344d;

    /* renamed from: e  reason: collision with root package name */
    private long f3345e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f3346f;

    /* renamed from: g  reason: collision with root package name */
    private c f3347g;

    /* renamed from: h  reason: collision with root package name */
    private WebViewClient f3348h;

    /* renamed from: i  reason: collision with root package name */
    private List<g> f3349i;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeWebView f3350a;

        /* renamed from: com.github.lzyzsd.jsbridge.BridgeWebView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C0059a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3351a;
            public final /* synthetic */ a b;

            public C0059a(a aVar, String str) {
            }

            @Override // h.l.a.a.e
            public void a(String str) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class b implements e {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f3352a;

            public b(a aVar) {
            }

            @Override // h.l.a.a.e
            public void a(String str) {
            }
        }

        public a(BridgeWebView bridgeWebView) {
        }

        @Override // h.l.a.a.e
        public void a(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeWebView f3353a;

        private b(BridgeWebView bridgeWebView) {
        }

        @JavascriptInterface
        public void openImage(String str) {
        }

        public /* synthetic */ b(BridgeWebView bridgeWebView, a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface c {
        void a(int i2, ArrayList<String> arrayList);

        void onUrlClick(String str);
    }

    public BridgeWebView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void b(BridgeWebView bridgeWebView, g gVar) {
    }

    public static /* synthetic */ c c(BridgeWebView bridgeWebView) {
    }

    public static /* synthetic */ int d(BridgeWebView bridgeWebView, String str) {
    }

    public static /* synthetic */ ArrayList e(BridgeWebView bridgeWebView) {
    }

    private String g(String str) {
    }

    private int getScreentWidth() {
    }

    public static int h(float f2, Context context) {
    }

    private void j(String str, String str2, e eVar) {
    }

    private int k(String str) {
    }

    private void p() {
    }

    private void r(g gVar) {
    }

    @Override // h.l.a.a.h
    public void a(String str, e eVar) {
    }

    public void f(String str, String str2, e eVar) {
    }

    public List<g> getStartupMessage() {
    }

    public void i(g gVar) {
    }

    public void l() {
    }

    public d m() {
    }

    public String n(String str, int i2, int i3) {
    }

    public void o(String str) {
    }

    public void q(String str, e eVar) {
    }

    public void s(String str, h.l.a.a.b bVar) {
    }

    @Override // h.l.a.a.h
    public void send(String str) {
    }

    public void setDefaultHandler(h.l.a.a.b bVar) {
    }

    public void setHtmlData(String str) {
    }

    public void setOnImageOpenListener(c cVar) {
    }

    public void setStartupMessage(List<g> list) {
    }

    public void setWebViewClientFromSide(WebViewClient webViewClient) {
    }

    public void t(String str, String str2) {
    }

    public BridgeWebView(Context context, AttributeSet attributeSet, int i2) {
    }

    public BridgeWebView(Context context) {
    }
}
