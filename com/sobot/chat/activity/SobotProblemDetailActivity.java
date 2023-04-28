package com.sobot.chat.activity;

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
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseHelpCenterActivity;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.StDocModel;
import com.sobot.chat.api.model.StHelpDocModel;
import com.sobot.network.http.callback.StringResultCallBack;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotProblemDetailActivity extends SobotBaseHelpCenterActivity implements View.OnClickListener {
    public static final String DEFAULT_STYLE = "<style>*,body,html,div,p,img{border:0;margin:0;padding:0;} </style>";
    public static final String EXTRA_KEY_DOC = "extra_key_doc";
    private static final int REQUEST_CODE_ALBUM = 273;
    private View mBottomBtn;
    private StDocModel mDoc;
    private TextView mProblemTitle;
    private WebView mWebView;
    private TextView tvOnlineService;
    private TextView tv_sobot_layout_online_service;
    private TextView tv_sobot_layout_online_tel;
    private ValueCallback<Uri> uploadMessage;
    private ValueCallback<Uri[]> uploadMessageAboveL;

    /* renamed from: com.sobot.chat.activity.SobotProblemDetailActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<StHelpDocModel> {
        public final /* synthetic */ SobotProblemDetailActivity this$0;

        public AnonymousClass1(SobotProblemDetailActivity sobotProblemDetailActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(StHelpDocModel stHelpDocModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(StHelpDocModel stHelpDocModel) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotProblemDetailActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements DownloadListener {
        public final /* synthetic */ SobotProblemDetailActivity this$0;

        public AnonymousClass2(SobotProblemDetailActivity sobotProblemDetailActivity) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotProblemDetailActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends WebViewClient {
        public final /* synthetic */ SobotProblemDetailActivity this$0;

        public AnonymousClass3(SobotProblemDetailActivity sobotProblemDetailActivity) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotProblemDetailActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends WebChromeClient {
        public final /* synthetic */ SobotProblemDetailActivity this$0;

        public AnonymousClass4(SobotProblemDetailActivity sobotProblemDetailActivity) {
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

    public static /* synthetic */ TextView access$000(SobotProblemDetailActivity sobotProblemDetailActivity) {
    }

    public static /* synthetic */ WebView access$100(SobotProblemDetailActivity sobotProblemDetailActivity) {
    }

    public static /* synthetic */ void access$200(SobotProblemDetailActivity sobotProblemDetailActivity) {
    }

    public static /* synthetic */ ValueCallback access$302(SobotProblemDetailActivity sobotProblemDetailActivity, ValueCallback valueCallback) {
    }

    public static /* synthetic */ void access$400(SobotProblemDetailActivity sobotProblemDetailActivity) {
    }

    private void chooseAlbumPic() {
    }

    private void imgReset() {
    }

    private void initWebView() {
    }

    public static Intent newIntent(Context context, Information information, StDocModel stDocModel) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseHelpCenterActivity, com.sobot.chat.activity.base.SobotBaseActivity
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
