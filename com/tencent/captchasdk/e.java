package com.tencent.captchasdk;

import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private a f10027a;
    private Context b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private WebView f10028d;

    /* renamed from: e  reason: collision with root package name */
    private String f10029e;

    /* renamed from: f  reason: collision with root package name */
    private int f10030f;

    /* renamed from: g  reason: collision with root package name */
    private final WebChromeClient f10031g;

    /* renamed from: h  reason: collision with root package name */
    private final WebViewClient f10032h;

    /* renamed from: com.tencent.captchasdk.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f10033a;

        /* renamed from: com.tencent.captchasdk.e$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C01661 extends WebViewClient {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f10034a;

            public C01661(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            }
        }

        public AnonymousClass1(e eVar) {
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
        }
    }

    /* renamed from: com.tencent.captchasdk.e$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f10035a;

        public AnonymousClass2(e eVar) {
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* renamed from: com.tencent.captchasdk.e$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ValueCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f10036a;

        public AnonymousClass3(e eVar) {
        }

        public void a(String str) {
        }

        @Override // android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2, int i3);

        void a(int i2, String str);

        void a(String str);
    }

    public e(Context context, a aVar, String str, WebView webView, String str2, int i2) {
    }

    private void a(Uri uri) {
    }

    public static /* synthetic */ void a(e eVar, Uri uri) {
    }

    private boolean a(Context context) {
    }

    private void b(Uri uri) {
    }

    private void c(Uri uri) {
    }

    private void d(Uri uri) {
    }

    private void e(Uri uri) {
    }

    public void a() {
    }

    public void b() {
    }
}
