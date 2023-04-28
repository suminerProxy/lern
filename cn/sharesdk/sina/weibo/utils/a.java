package cn.sharesdk.sina.weibo.utils;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;

/* compiled from: SinaWeiboAuthorizeWebviewClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends cn.sharesdk.framework.authorize.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f312a;

    /* compiled from: SinaWeiboAuthorizeWebviewClient.java */
    /* renamed from: cn.sharesdk.sina.weibo.utils.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform f313a;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;

        public AnonymousClass1(a aVar, Platform platform, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public a(WebAuthorizeActivity webAuthorizeActivity) {
    }

    public static /* synthetic */ AuthorizeListener a(a aVar) {
    }

    public static /* synthetic */ AuthorizeListener b(a aVar) {
    }

    public static /* synthetic */ AuthorizeListener c(a aVar) {
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
    }

    private void a(Platform platform, String str) {
    }

    private Intent a(String str) {
    }
}
