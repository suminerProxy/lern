package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.TitleLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RegisterView extends ResizeLayout {

    /* renamed from: a  reason: collision with root package name */
    private TitleLayout f157a;
    private RelativeLayout b;
    private WebView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f158d;

    /* renamed from: cn.sharesdk.framework.authorize.RegisterView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegisterView f159a;

        public AnonymousClass1(RegisterView registerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.framework.authorize.RegisterView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f160a;
        public final /* synthetic */ RegisterView b;

        public AnonymousClass2(RegisterView registerView, int i2) {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
        }
    }

    public RegisterView(Context context) {
    }

    public static /* synthetic */ TextView a(RegisterView registerView) {
    }

    private int b(Context context) {
    }

    public TitleLayout c() {
    }

    public RelativeLayout d() {
    }

    private void a(Context context) {
    }

    public RegisterView(Context context, AttributeSet attributeSet) {
    }

    public WebView b() {
    }

    public View a() {
    }

    public void a(boolean z) {
    }
}
