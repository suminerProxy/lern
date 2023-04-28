package cn.sharesdk.tencent.qq.utils;

import android.app.Activity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import cn.sharesdk.framework.authorize.SSOListener;
import com.mob.tools.FakeActivity;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DownLoadWebPage extends FakeActivity {
    private String downLoadUrl;
    private SSOListener listener;
    private LinearLayout mainlayout;
    private String url;
    private WebView webView;

    /* renamed from: cn.sharesdk.tencent.qq.utils.DownLoadWebPage$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DownLoadWebPage f359a;

        public AnonymousClass1(DownLoadWebPage downLoadWebPage) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    public static /* synthetic */ String access$000(DownLoadWebPage downLoadWebPage) {
    }

    public static /* synthetic */ SSOListener access$100(DownLoadWebPage downLoadWebPage) {
    }

    public static /* synthetic */ SSOListener access$102(DownLoadWebPage downLoadWebPage, SSOListener sSOListener) {
    }

    private void initPage(Activity activity) {
    }

    private void initView() {
    }

    private void initWebView() {
    }

    public void finishOnSuccess() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onKeyEvent(int i2, KeyEvent keyEvent) {
    }

    public void setListener(SSOListener sSOListener) {
    }
}
