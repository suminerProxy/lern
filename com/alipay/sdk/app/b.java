package com.alipay.sdk.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private Activity f611a;
    private boolean b;
    private Handler c;

    /* renamed from: d  reason: collision with root package name */
    private com.alipay.sdk.widget.a f612d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f613e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f614a;

        public a(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b(Activity activity) {
    }

    public static /* synthetic */ void a(b bVar) {
    }

    private void c() {
    }

    private void d() {
    }

    public boolean b() {
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

    public static /* synthetic */ boolean a(b bVar, boolean z) {
    }

    public void a() {
    }
}
