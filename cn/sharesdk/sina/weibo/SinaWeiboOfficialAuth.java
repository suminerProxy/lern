package cn.sharesdk.sina.weibo;

import android.app.Activity;
import android.content.Intent;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SinaWeiboOfficialAuth extends FakeActivity {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private String permissions;
    private String redirectUrl;

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SinaWeiboOfficialAuth f273a;

        /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00141 implements SdkListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f274a;

            public C00141(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.sina.weibo.sdk.openapi.SdkListener
            public void onInitFailure(Exception exc) {
            }

            @Override // com.sina.weibo.sdk.openapi.SdkListener
            public void onInitSuccess() {
            }
        }

        public AnonymousClass1(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SinaWeiboOfficialAuth f275a;

        public AnonymousClass2(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements WbAuthListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SinaWeiboOfficialAuth f276a;

        public AnonymousClass3(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onCancel() {
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onComplete(Oauth2AccessToken oauth2AccessToken) {
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onError(UiError uiError) {
        }
    }

    public SinaWeiboOfficialAuth(String str, String str2, String str3, AuthorizeListener authorizeListener) {
    }

    public static /* synthetic */ Activity access$000(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ String access$100(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ String access$200(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ String access$300(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ IWBAPI access$400(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ IWBAPI access$402(SinaWeiboOfficialAuth sinaWeiboOfficialAuth, IWBAPI iwbapi) {
    }

    public static /* synthetic */ Activity access$500(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ Activity access$600(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ AuthorizeListener access$700(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ void access$800(SinaWeiboOfficialAuth sinaWeiboOfficialAuth) {
    }

    public static /* synthetic */ void access$900(SinaWeiboOfficialAuth sinaWeiboOfficialAuth, AuthorizeListener authorizeListener) {
    }

    private String join(Object[] objArr, String str) {
    }

    private void loginManager() {
    }

    private void showWebAuthActivity(AuthorizeListener authorizeListener) {
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
    public void onPause() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
    }

    private String join(Object[] objArr, String str, int i2, int i3) {
    }
}
