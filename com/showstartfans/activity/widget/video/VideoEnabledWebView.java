package com.showstartfans.activity.widget.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import h.u.a.w.e0.e;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoEnabledWebView extends WebView {
    private e b;
    private boolean c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoEnabledWebView f7488a;

        public a(VideoEnabledWebView videoEnabledWebView) {
        }

        private /* synthetic */ void a() {
        }

        public /* synthetic */ void b() {
        }

        @JavascriptInterface
        public void notifyVideoEnd() {
        }
    }

    public VideoEnabledWebView(Context context) {
    }

    public static /* synthetic */ e a(VideoEnabledWebView videoEnabledWebView) {
    }

    private void b() {
    }

    public boolean c() {
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
    }

    @Override // android.webkit.WebView
    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(WebChromeClient webChromeClient) {
    }

    public VideoEnabledWebView(Context context, AttributeSet attributeSet) {
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
    }

    public VideoEnabledWebView(Context context, AttributeSet attributeSet, int i2) {
    }
}
