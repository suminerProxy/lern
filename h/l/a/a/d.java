package h.l.a.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.lzyzsd.jsbridge.BridgeWebView;

/* compiled from: BridgeWebViewClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private String f17375a;
    private BridgeWebView b;
    private WebViewClient c;

    /* renamed from: d  reason: collision with root package name */
    private BridgeWebView.c f17376d;

    public d(BridgeWebView bridgeWebView, WebViewClient webViewClient, BridgeWebView.c cVar) {
    }

    private boolean a(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
    }
}
