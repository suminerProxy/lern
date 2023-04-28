package cn.sharesdk.tencent.qzone.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.RegisterView;
import cn.sharesdk.framework.g;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DH;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShareActivity extends FakeActivity {
    private d adapter;
    private PlatformActionListener pa;
    private boolean resultFailed;
    private boolean resultOk;
    private RegisterView rv;
    private String scheme;
    private String uriScheme;
    private boolean useClient;
    private WebView webView;

    /* renamed from: cn.sharesdk.tencent.qzone.utils.ShareActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareActivity f375a;

        public AnonymousClass1(ShareActivity shareActivity) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qzone.utils.ShareActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareActivity f376a;

        /* renamed from: cn.sharesdk.tencent.qzone.utils.ShareActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f377a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(ShareActivity shareActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qzone.utils.ShareActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareActivity f378a;

        public AnonymousClass3(ShareActivity shareActivity) {
        }

        @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }
    }

    public static /* synthetic */ boolean access$002(ShareActivity shareActivity, boolean z) {
    }

    public static /* synthetic */ PlatformActionListener access$100(ShareActivity shareActivity) {
    }

    public static /* synthetic */ String access$200(ShareActivity shareActivity) {
    }

    public static /* synthetic */ RegisterView access$300(ShareActivity shareActivity) {
    }

    public static /* synthetic */ String access$400(ShareActivity shareActivity) {
    }

    public static /* synthetic */ void access$500(ShareActivity shareActivity, String str) {
    }

    public static /* synthetic */ void access$600(ShareActivity shareActivity, String str) {
    }

    private void afterShare(String str) {
    }

    private void clientShare() {
    }

    private d getAdapter() {
    }

    private void launchQZone(String str) {
    }

    private void webShare() {
    }

    public RegisterView getBodyView() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
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
    public void onPause() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onRestart() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onStart() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
    }

    public void setAppId(String str) {
    }

    public void setScheme(String str, boolean z) {
    }

    public void setSharedCallback(PlatformActionListener platformActionListener) {
    }
}
