package com.sobot.chat.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseActivity;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebViewActivity extends SobotBaseActivity implements View.OnClickListener {
    private static final int REQUEST_CODE_ALBUM = 273;
    private boolean isUrlOrText;
    private ProgressBar mProgressBar;
    private String mUrl;
    private WebView mWebView;
    private Button sobot_btn_reconnect;
    private RelativeLayout sobot_rl_net_error;
    private TextView sobot_textReConnect;
    private TextView sobot_txt_loading;
    private ImageView sobot_webview_copy;
    private ImageView sobot_webview_forward;
    private ImageView sobot_webview_goback;
    private ImageView sobot_webview_reload;
    private LinearLayout sobot_webview_toolsbar;
    private ValueCallback<Uri> uploadMessage;
    private ValueCallback<Uri[]> uploadMessageAboveL;

    /* renamed from: com.sobot.chat.activity.WebViewActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements DownloadListener {
        public final /* synthetic */ WebViewActivity this$0;

        public AnonymousClass1(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.WebViewActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends WebViewClient {
        public final /* synthetic */ WebViewActivity this$0;

        public AnonymousClass2(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* renamed from: com.sobot.chat.activity.WebViewActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends WebChromeClient {
        public final /* synthetic */ WebViewActivity this$0;

        public AnonymousClass3(WebViewActivity webViewActivity) {
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

    public static /* synthetic */ WebView access$000(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ ImageView access$100(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ ImageView access$200(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ boolean access$300(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ String access$400(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ ProgressBar access$500(WebViewActivity webViewActivity) {
    }

    public static /* synthetic */ ValueCallback access$602(WebViewActivity webViewActivity, ValueCallback valueCallback) {
    }

    public static /* synthetic */ void access$700(WebViewActivity webViewActivity) {
    }

    private void chooseAlbumPic() {
    }

    private void copyUrl(String str) {
    }

    @SuppressLint({"NewApi"})
    private void initWebView() {
    }

    private void resetViewDisplay() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    public Context getContext() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initBundleData(Bundle bundle) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void onLeftMenuClick(View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }
}
