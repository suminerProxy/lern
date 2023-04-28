package com.aliyun.identity.face.ui;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerWebView extends WebView {
    private Handler mHandler;
    private ProgressBar mProgressBar;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ToygerWebChromeClient extends WebChromeClient {
        public final /* synthetic */ ToygerWebView this$0;

        public ToygerWebChromeClient(ToygerWebView toygerWebView) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
        }
    }

    public ToygerWebView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ ProgressBar access$000(ToygerWebView toygerWebView) {
    }

    public static /* synthetic */ Handler access$100(ToygerWebView toygerWebView) {
    }

    private static Context getFixedContext(Context context) {
    }

    public void init() {
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    public void setHandler(Handler handler) {
    }
}
