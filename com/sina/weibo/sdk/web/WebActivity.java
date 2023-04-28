package com.sina.weibo.sdk.web;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sina.weibo.sdk.web.b.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebActivity extends Activity implements a {
    private LinearLayout am;
    private TextView an;
    private TextView ao;
    private WebView ap;
    private ProgressBar aq;
    private b ar;
    private com.sina.weibo.sdk.web.a.b as;
    private String at;

    /* renamed from: com.sina.weibo.sdk.web.WebActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements b.a {
        public final /* synthetic */ WebActivity au;

        public AnonymousClass1(WebActivity webActivity) {
        }

        @Override // com.sina.weibo.sdk.web.b.b.a
        public final void onComplete() {
        }

        @Override // com.sina.weibo.sdk.web.b.b.a
        public final void onError(String str) {
        }
    }

    /* renamed from: com.sina.weibo.sdk.web.WebActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ WebActivity au;

        public AnonymousClass2(WebActivity webActivity) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.sina.weibo.sdk.web.WebActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ WebActivity au;

        public AnonymousClass3(WebActivity webActivity) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.sina.weibo.sdk.web.WebActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends WebChromeClient {
        public final /* synthetic */ WebActivity au;

        public AnonymousClass4(WebActivity webActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
        }
    }

    public static /* synthetic */ b a(WebActivity webActivity) {
    }

    public static /* synthetic */ WebView b(WebActivity webActivity) {
    }

    public static /* synthetic */ com.sina.weibo.sdk.web.a.b c(WebActivity webActivity) {
    }

    public static /* synthetic */ void d(WebActivity webActivity) {
    }

    public static /* synthetic */ ProgressBar e(WebActivity webActivity) {
    }

    private static boolean j(String str) {
    }

    public static /* synthetic */ boolean k(String str) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void p() {
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void q() {
    }

    private static void a(WebView webView, String str) {
    }
}
