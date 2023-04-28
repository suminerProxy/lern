package cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.ResizeLayout;
import com.mob.tools.utils.DH;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WebAuthorizeActivity extends AbstractAuthorizeActivity implements Handler.Callback, ResizeLayout.OnResizeListener {
    public static final int MSG_AUTH_URL_GOT = 2;
    private AuthorizeAdapter adapter;
    public AuthorizeListener listener;
    private RegisterView rv;
    private WebView webView;

    /* renamed from: cn.sharesdk.framework.authorize.WebAuthorizeActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebAuthorizeActivity f162a;

        /* renamed from: cn.sharesdk.framework.authorize.WebAuthorizeActivity$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00091 extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f163a;

            public C00091(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(WebAuthorizeActivity webAuthorizeActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.framework.authorize.WebAuthorizeActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebAuthorizeActivity f164a;

        /* renamed from: cn.sharesdk.framework.authorize.WebAuthorizeActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f165a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public AnonymousClass2(WebAuthorizeActivity webAuthorizeActivity) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ Activity access$100(WebAuthorizeActivity webAuthorizeActivity) {
    }

    private AuthorizeAdapter getAdapter() {
    }

    @Override // cn.sharesdk.framework.authorize.ResizeLayout.OnResizeListener
    public void OnResize(int i2, int i3, int i4, int i5) {
    }

    public RegisterView getBodyView() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
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

    public void setAuthorizeListener(AuthorizeListener authorizeListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        private float[] f166a;

        private a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }
}
