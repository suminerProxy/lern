package cn.sharesdk.tencent.qq;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import java.util.HashMap;

/* compiled from: QQAuthorizeWebviewClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends cn.sharesdk.framework.authorize.b {

    /* compiled from: QQAuthorizeWebviewClient.java */
    /* renamed from: cn.sharesdk.tencent.qq.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f354a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: QQAuthorizeWebviewClient.java */
    /* renamed from: cn.sharesdk.tencent.qq.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f355a;
        public final /* synthetic */ a b;

        public AnonymousClass2(a aVar, SslErrorHandler sslErrorHandler) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public a(WebAuthorizeActivity webAuthorizeActivity) {
    }

    private void a(HashMap<String, String> hashMap) {
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
    }
}
