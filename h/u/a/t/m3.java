package h.u.a.t;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.Key;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.showstartfans.activity.activitys.maintab.VideoDetailActivity;
import com.showstartfans.activity.activitys.other.WebViewActivity;
import com.showstartfans.activity.eventmodel.ChangeMusicStatusEvent;
import com.showstartfans.activity.eventmodel.OpenOtherMediaEvent;
import com.showstartfans.activity.eventmodel.RefreshVideoDetailEvent;
import com.showstartfans.activity.widget.video.VideoWebActivity;
import java.util.ArrayList;
import org.greenrobot.eventbus.EventBus;

/* compiled from: WebUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24548a = 1;
    public static final int b = 2;
    private static final String c = "webview/service_template.html";

    /* compiled from: WebUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeWebView f24549a;

        public a(BridgeWebView bridgeWebView) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* compiled from: WebUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebChromeClient f24550a;
        public final /* synthetic */ FrameLayout b;

        public b(WebChromeClient webChromeClient, FrameLayout frameLayout) {
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

    /* compiled from: WebUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c implements BridgeWebView.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24551a;
        public final /* synthetic */ String b;

        public c(Context context, String str) {
        }

        @Override // com.github.lzyzsd.jsbridge.BridgeWebView.c
        public void a(int i2, ArrayList<String> arrayList) {
        }

        @Override // com.github.lzyzsd.jsbridge.BridgeWebView.c
        public void onUrlClick(String str) {
        }
    }

    /* compiled from: WebUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        String a(boolean z, String str);
    }

    public static void a(Context context, String str, int i2) {
        h.y.a.m.i iVar = new h.y.a.m.i();
        iVar.put("mediaId", str);
        iVar.put("mediaType", Integer.valueOf(i2));
        h.y.a.m.h.m(context.getApplicationContext(), "/app/mmedia/click", "4", "", iVar, z0.f24615a);
    }

    public static void b(Context context, BridgeWebView bridgeWebView, String str) {
        try {
            bridgeWebView.setOnImageOpenListener(new c(context, str));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(BridgeWebView bridgeWebView, FrameLayout frameLayout, WebChromeClient webChromeClient) {
        bridgeWebView.setWebChromeClient(new b(webChromeClient, frameLayout));
    }

    public static boolean d(BridgeWebView bridgeWebView, String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(host) && scheme.equals("showstart") && host.equals("openvideo")) {
                EventBus.getDefault().post(new ChangeMusicStatusEvent());
                EventBus.getDefault().post(new OpenOtherMediaEvent());
                String substring = str.substring(str.indexOf("=") + 1);
                if (!TextUtils.isEmpty(substring)) {
                    try {
                        VideoDetailActivity.V0(bridgeWebView.getContext(), Integer.parseInt(substring), "", false, 0);
                        EventBus.getDefault().post(new RefreshVideoDetailEvent(Integer.parseInt(substring)));
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return false;
    }

    public static void e(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            h.y.a.n.p0.j().E("抱歉，视频资源没有找到。");
            return;
        }
        a3.a();
        Intent intent = new Intent(activity, VideoWebActivity.class);
        intent.putExtra("url", str2);
        activity.startActivity(intent);
    }

    public static /* synthetic */ void f(h.y.a.m.n nVar) {
    }

    public static void g(BridgeWebView bridgeWebView, String str) {
        h.y.a.n.c1 c1Var = h.y.a.n.c1.f26277a;
        h(bridgeWebView, str, h.y.a.n.c1.c(), null);
    }

    public static void h(BridgeWebView bridgeWebView, String str, boolean z, d dVar) {
        try {
            String replace = h.l.a.a.a.b(bridgeWebView.getContext(), z ? "webview/vocalconcer_detail_night.html" : "webview/vocalconcer_detail.html").replace("{content}", str);
            if (z) {
                replace = replace.replace("#161616", "#dddddd");
            }
            if (dVar != null) {
                replace = dVar.a(z, replace);
            }
            String userAgentString = bridgeWebView.getSettings().getUserAgentString();
            bridgeWebView.getSettings().setUserAgentString(userAgentString + ";showstart/" + h.y.a.n.m0.J(bridgeWebView.getContext()) + " (RichText)");
            bridgeWebView.setWebViewClientFromSide(new a(bridgeWebView));
            bridgeWebView.t(h.y.a.f.k.v, replace);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void i(Context context, String str) {
        j(context, str, 1.0f, true);
    }

    public static void j(Context context, String str, float f2, boolean z) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra(Key.ALPHA, f2);
        intent.putExtra("showTitleBar", z);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
