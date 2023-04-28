package com.alipay.sdk.widget;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WebViewWindow extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    private static Handler f817f;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f818a;
    private TextView b;
    private ImageView c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f819d;

    /* renamed from: e  reason: collision with root package name */
    private WebView f820e;

    /* renamed from: g  reason: collision with root package name */
    private a f821g;

    /* renamed from: h  reason: collision with root package name */
    private b f822h;

    /* renamed from: i  reason: collision with root package name */
    private c f823i;

    /* renamed from: j  reason: collision with root package name */
    private View.OnClickListener f824j;

    /* renamed from: k  reason: collision with root package name */
    private final float f825k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void a(WebViewWindow webViewWindow, String str);

        boolean a(WebViewWindow webViewWindow, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        boolean a(WebViewWindow webViewWindow, int i2, String str, String str2);

        boolean a(WebViewWindow webViewWindow, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean b(WebViewWindow webViewWindow, String str);

        boolean c(WebViewWindow webViewWindow, String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a(WebViewWindow webViewWindow);

        void b(WebViewWindow webViewWindow);
    }

    public WebViewWindow(Context context) {
    }

    public static /* synthetic */ c a(WebViewWindow webViewWindow) {
    }

    public static /* synthetic */ Handler b() {
    }

    public static /* synthetic */ ImageView c(WebViewWindow webViewWindow) {
    }

    public static /* synthetic */ ProgressBar d(WebViewWindow webViewWindow) {
    }

    public static /* synthetic */ a e(WebViewWindow webViewWindow) {
    }

    public static /* synthetic */ b f(WebViewWindow webViewWindow) {
    }

    public ImageView getBackButton() {
    }

    public ProgressBar getProgressbar() {
    }

    public ImageView getRefreshButton() {
    }

    public TextView getTitle() {
    }

    public String getUrl() {
    }

    public WebView getWebView() {
    }

    public void setChromeProxy(a aVar) {
    }

    public void setWebClientProxy(b bVar) {
    }

    public void setWebEventProxy(c cVar) {
    }

    public WebViewWindow(Context context, AttributeSet attributeSet) {
    }

    private void a(Context context) {
    }

    public static /* synthetic */ ImageView b(WebViewWindow webViewWindow) {
    }

    private void c(Context context) {
    }

    private void b(Context context) {
    }

    public void a(WebView webView, Context context) {
    }

    public void a(String str) {
    }

    public void a(String str, byte[] bArr) {
    }

    public void a() {
    }

    private int a(int i2) {
    }
}
