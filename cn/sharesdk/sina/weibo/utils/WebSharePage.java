package cn.sharesdk.sina.weibo.utils;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.FakeActivity;
import com.mob.tools.RxMob;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WebSharePage extends FakeActivity implements View.OnClickListener {
    private static final String SHARE_URL = "http://service.weibo.com/share/mobilesdk.php";
    private static final String UPLOAD_PIC_URL = "http://service.weibo.com/share/mobilesdk_uppic.php";
    private AuthorizeListener actionListener;
    private String appKey;
    private Button btnRetry;
    private cn.sharesdk.sina.weibo.sdk.a.a layout;
    private LinearLayout llRetry;
    private int pageStatus;
    private Platform.ShareParams params;
    private String token;
    private TextView tvBack;
    private WebView webView;

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebSharePage f308a;

        public AnonymousClass1(WebSharePage webSharePage) {
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

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ShareSDKCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f309a;
        public final /* synthetic */ ShareSDKCallback b;
        public final /* synthetic */ WebSharePage c;

        public AnonymousClass2(WebSharePage webSharePage, String str, ShareSDKCallback shareSDKCallback) {
        }

        public void a(String str) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(String str) {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements RxMob.OnSubscribe<String> {
        public final /* synthetic */ WebSharePage this$0;

        public AnonymousClass3(WebSharePage webSharePage) {
        }

        @Override // com.mob.tools.RxMob.OnSubscribe
        public void call(RxMob.Subscriber<String> subscriber) {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends RxMob.Subscriber<String> {
        public final /* synthetic */ WebSharePage this$0;

        /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ShareSDKCallback<String> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f310a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            public void a(String str) {
            }

            @Override // cn.sharesdk.framework.ShareSDKCallback
            public /* synthetic */ void onCallback(String str) {
            }
        }

        /* renamed from: cn.sharesdk.sina.weibo.utils.WebSharePage$4$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements ShareSDKCallback<String> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f311a;

            public AnonymousClass2(AnonymousClass4 anonymousClass4) {
            }

            public void a(String str) {
            }

            @Override // cn.sharesdk.framework.ShareSDKCallback
            public /* synthetic */ void onCallback(String str) {
            }
        }

        public AnonymousClass4(WebSharePage webSharePage) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onCompleted() {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onError(Throwable th) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public /* bridge */ /* synthetic */ void onNext(String str) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onStart() {
        }

        /* renamed from: onNext  reason: avoid collision after fix types in other method */
        public void onNext2(String str) {
        }
    }

    public static /* synthetic */ int access$000(WebSharePage webSharePage) {
    }

    public static /* synthetic */ int access$002(WebSharePage webSharePage, int i2) {
    }

    public static /* synthetic */ LinearLayout access$100(WebSharePage webSharePage) {
    }

    public static /* synthetic */ void access$1000(WebSharePage webSharePage, String str, ShareSDKCallback shareSDKCallback) {
    }

    public static /* synthetic */ WebView access$200(WebSharePage webSharePage) {
    }

    public static /* synthetic */ AuthorizeListener access$300(WebSharePage webSharePage) {
    }

    public static /* synthetic */ void access$400(WebSharePage webSharePage, String str) {
    }

    public static /* synthetic */ Platform.ShareParams access$500(WebSharePage webSharePage) {
    }

    public static /* synthetic */ String access$600(WebSharePage webSharePage) {
    }

    public static /* synthetic */ String access$700(WebSharePage webSharePage) {
    }

    public static /* synthetic */ Activity access$800(WebSharePage webSharePage) {
    }

    public static /* synthetic */ String access$900(WebSharePage webSharePage) {
    }

    private String getPicId() {
    }

    private void getReqUrl(String str, ShareSDKCallback<String> shareSDKCallback) {
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

    public void setAppKey(String str, String str2) {
    }

    public void setListener(AuthorizeListener authorizeListener) {
    }

    public void setShareParams(Platform.ShareParams shareParams) {
    }
}
