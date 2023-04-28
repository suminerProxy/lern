package cn.sharesdk.sina.weibo.utils;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.FakeActivity;
import com.mob.tools.RxMob;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WebAuthPage extends FakeActivity implements View.OnClickListener {
    private static final String AUTH_URL = "https://open.weibo.cn/oauth2/authorize";
    public static final String SCOPE = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";
    private AuthorizeListener actionListener;
    private String appKey;
    private Button btnRetry;
    private cn.sharesdk.sina.weibo.sdk.a.a layout;
    private LinearLayout llRetry;
    private int pageStatus;
    private String redirectUrl;
    private String token;
    private TextView tvBack;
    private WebView webView;

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebAuthPage$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebAuthPage f307a;

        public AnonymousClass1(WebAuthPage webAuthPage) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebAuthPage$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements RxMob.OnSubscribe<String> {
        public final /* synthetic */ WebAuthPage this$0;

        public AnonymousClass2(WebAuthPage webAuthPage) {
        }

        @Override // com.mob.tools.RxMob.OnSubscribe
        public void call(RxMob.Subscriber<String> subscriber) {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebAuthPage$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends RxMob.Subscriber<String> {
        public final /* synthetic */ WebAuthPage this$0;

        public AnonymousClass3(WebAuthPage webAuthPage) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onCompleted() {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onError(Throwable th) {
        }
    }

    public static /* synthetic */ int access$000(WebAuthPage webAuthPage) {
    }

    public static /* synthetic */ int access$002(WebAuthPage webAuthPage, int i2) {
    }

    public static /* synthetic */ LinearLayout access$100(WebAuthPage webAuthPage) {
    }

    public static /* synthetic */ WebView access$200(WebAuthPage webAuthPage) {
    }

    public static /* synthetic */ String access$300(WebAuthPage webAuthPage) {
    }

    public static /* synthetic */ AuthorizeListener access$400(WebAuthPage webAuthPage) {
    }

    public static /* synthetic */ void access$500(WebAuthPage webAuthPage, String str) {
    }

    public static /* synthetic */ String access$600(WebAuthPage webAuthPage) {
    }

    private String getAuthorizeUrl() {
    }

    private void initView() {
    }

    private String loadWebView() {
    }

    private void reCode(String str) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onKeyEvent(int i2, KeyEvent keyEvent) {
    }

    public void setAuthParams(String str, String str2, String str3) {
    }

    public void setListener(AuthorizeListener authorizeListener) {
    }
}
