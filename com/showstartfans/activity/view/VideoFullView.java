package com.showstartfans.activity.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.github.lzyzsd.jsbridge.BridgeWebView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoFullView extends LinearLayout {
    public boolean b;
    private FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f7088d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f7089e;

    /* renamed from: f  reason: collision with root package name */
    private BridgeWebView f7090f;

    /* renamed from: g  reason: collision with root package name */
    private ImageButton f7091g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebChromeClient f7092a;
        public final /* synthetic */ VideoFullView b;

        public a(VideoFullView videoFullView, WebChromeClient webChromeClient) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    public VideoFullView(Context context) {
    }

    public static /* synthetic */ WebChromeClient.CustomViewCallback a(VideoFullView videoFullView) {
    }

    public static /* synthetic */ WebChromeClient.CustomViewCallback b(VideoFullView videoFullView, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public static /* synthetic */ Activity c(VideoFullView videoFullView) {
    }

    public static /* synthetic */ void d(VideoFullView videoFullView) {
    }

    private void e() {
    }

    private /* synthetic */ void f(View view) {
    }

    private void j() {
    }

    public /* synthetic */ void g(View view) {
    }

    public void h() {
    }

    public void i() {
    }

    public void k(BridgeWebView bridgeWebView, WebChromeClient webChromeClient) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    public VideoFullView(Context context, AttributeSet attributeSet) {
    }

    public VideoFullView(Context context, AttributeSet attributeSet, int i2) {
    }
}
