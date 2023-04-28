package com.mobile.auth.gatewayauth.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mobile.auth.gatewayauth.AuthUIConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AuthWebVeiwActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private WebView f4929a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f4930d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f4931e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f4932f;

    /* renamed from: g  reason: collision with root package name */
    private AuthUIConfig f4933g;

    /* renamed from: h  reason: collision with root package name */
    private ImageButton f4934h;

    /* renamed from: com.mobile.auth.gatewayauth.activity.AuthWebVeiwActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthWebVeiwActivity f4935a;

        public AnonymousClass1(AuthWebVeiwActivity authWebVeiwActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.activity.AuthWebVeiwActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthWebVeiwActivity f4936a;

        public AnonymousClass2(AuthWebVeiwActivity authWebVeiwActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.activity.AuthWebVeiwActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthWebVeiwActivity f4937a;

        public AnonymousClass3(AuthWebVeiwActivity authWebVeiwActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    public static /* synthetic */ ProgressBar a(AuthWebVeiwActivity authWebVeiwActivity) {
    }

    public static /* synthetic */ String b(AuthWebVeiwActivity authWebVeiwActivity) {
    }

    public static /* synthetic */ TextView c(AuthWebVeiwActivity authWebVeiwActivity) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }
}
