package com.tencent.cloud.huiyansdkface.facelight.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.cloud.huiyansdkface.facelight.b.b.e;
import com.tencent.cloud.huiyansdkface.facelight.process.d;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.c;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaceProtocalActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static int f10378a;
    private d b;
    private e c;

    /* renamed from: d  reason: collision with root package name */
    private c f10379d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f10380e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f10381f;

    /* renamed from: g  reason: collision with root package name */
    private WebView f10382g;

    /* renamed from: h  reason: collision with root package name */
    private String f10383h;

    /* renamed from: i  reason: collision with root package name */
    private String f10384i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10385j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10386k;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceProtocalActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceProtocalActivity f10387a;

        public AnonymousClass1(FaceProtocalActivity faceProtocalActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceProtocalActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceProtocalActivity f10388a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceProtocalActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f10389a;
            public final /* synthetic */ AnonymousClass2 b;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, SslErrorHandler sslErrorHandler) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceProtocalActivity$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class DialogInterface$OnClickListenerC01762 implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f10390a;
            public final /* synthetic */ AnonymousClass2 b;

            public DialogInterface$OnClickListenerC01762(AnonymousClass2 anonymousClass2, SslErrorHandler sslErrorHandler) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public AnonymousClass2(FaceProtocalActivity faceProtocalActivity) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceProtocalActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceProtocalActivity f10391a;

        public AnonymousClass3(FaceProtocalActivity faceProtocalActivity) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private d f10392a;
        private Activity b;

        public a(d dVar, Activity activity) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.c.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.c.b
        public void b() {
        }
    }

    public static /* synthetic */ WebView a(FaceProtocalActivity faceProtocalActivity) {
    }

    public static /* synthetic */ void a(FaceProtocalActivity faceProtocalActivity, String str) {
    }

    private void a(String str) {
    }

    private void b() {
    }

    public static /* synthetic */ void b(FaceProtocalActivity faceProtocalActivity) {
    }

    private void c() {
    }

    public void a() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    @Override // android.app.Activity
    public void onStart() {
    }

    @Override // android.app.Activity
    public void onStop() {
    }
}
