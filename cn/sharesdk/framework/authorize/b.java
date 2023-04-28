package cn.sharesdk.framework.authorize;

import android.webkit.WebView;
import cn.sharesdk.framework.g;

/* compiled from: AuthorizeWebviewClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class b extends g {
    public WebAuthorizeActivity activity;
    public AuthorizeListener listener;
    public String redirectUri;

    public b(WebAuthorizeActivity webAuthorizeActivity) {
    }

    public abstract void onComplete(String str);

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
    }
}
