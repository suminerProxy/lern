package com.cmic.sso.sdk.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.cmic.sso.sdk.AuthThemeConfig;
import com.mobile.auth.f.e;
import com.mobile.auth.f.f;
import com.mobile.auth.f.g;
import com.mobile.auth.k.h;
import com.mobile.auth.k.v;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LoginAuthActivity extends Activity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2966a = null;
    private Handler b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f2967d;

    /* renamed from: e  reason: collision with root package name */
    private com.cmic.sso.sdk.widget.a f2968e;

    /* renamed from: f  reason: collision with root package name */
    private com.cmic.sso.sdk.widget.a f2969f;

    /* renamed from: g  reason: collision with root package name */
    private com.cmic.sso.sdk.widget.a f2970g;

    /* renamed from: h  reason: collision with root package name */
    private Bundle f2971h;

    /* renamed from: i  reason: collision with root package name */
    private f f2972i;

    /* renamed from: j  reason: collision with root package name */
    private String f2973j;

    /* renamed from: k  reason: collision with root package name */
    private CheckBox f2974k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f2975l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout f2976m;

    /* renamed from: n  reason: collision with root package name */
    private long f2977n;

    /* renamed from: o  reason: collision with root package name */
    private int f2978o;

    /* renamed from: p  reason: collision with root package name */
    private a f2979p;
    private e q;
    private boolean r;
    private LinearLayout s;
    private String t;
    private AuthThemeConfig u;
    private int v;
    private int w;
    private boolean x;
    private Dialog y;

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2980a;

        public AnonymousClass1(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2981a;

        public AnonymousClass2(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2982a;

        public AnonymousClass3(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements h.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2983a;

        public AnonymousClass4(LoginAuthActivity loginAuthActivity) {
        }
    }

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2984a;

        public AnonymousClass5(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2985a;

        public AnonymousClass6(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<LoginAuthActivity> f2986a;

        public a(LoginAuthActivity loginAuthActivity) {
        }

        private void a(Message message) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b extends v.a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<LoginAuthActivity> f2987a;
        public WeakReference<c> b;

        /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$b$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LoginAuthActivity f2988a;
            public final /* synthetic */ b b;

            /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$b$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class C00481 implements g {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass1 f2989a;

                public C00481(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.mobile.auth.f.g
                public void a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
                }
            }

            public AnonymousClass1(b bVar, LoginAuthActivity loginAuthActivity) {
            }

            @Override // com.mobile.auth.f.g
            public void a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
            }
        }

        /* renamed from: com.cmic.sso.sdk.activity.LoginAuthActivity$b$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LoginAuthActivity f2990a;
            public final /* synthetic */ b b;

            public AnonymousClass2(b bVar, LoginAuthActivity loginAuthActivity) {
            }

            @Override // com.mobile.auth.f.g
            public void a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
            }
        }

        public b(LoginAuthActivity loginAuthActivity, c cVar) {
        }

        public static /* synthetic */ boolean a(b bVar) {
        }

        private boolean b() {
        }

        @Override // com.mobile.auth.k.v.a
        public void a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f2991a;
        private Bundle b;
        private boolean c;

        public c(LoginAuthActivity loginAuthActivity, Bundle bundle) {
        }

        public static /* synthetic */ boolean a(c cVar, boolean z) {
        }

        private synchronized boolean a(boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ com.cmic.sso.sdk.widget.a a(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ void a(LoginAuthActivity loginAuthActivity, String str, String str2, Bundle bundle, JSONObject jSONObject) {
    }

    private void a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
    }

    private void a(boolean z) {
    }

    public static /* synthetic */ boolean a(LoginAuthActivity loginAuthActivity, boolean z) {
    }

    public static /* synthetic */ com.cmic.sso.sdk.widget.a b(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ com.cmic.sso.sdk.widget.a c(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ RelativeLayout d(LoginAuthActivity loginAuthActivity) {
    }

    private void d() {
    }

    public static /* synthetic */ AuthThemeConfig e(LoginAuthActivity loginAuthActivity) {
    }

    private void e() {
    }

    public static /* synthetic */ CheckBox f(LoginAuthActivity loginAuthActivity) {
    }

    private void f() {
    }

    public static /* synthetic */ a g(LoginAuthActivity loginAuthActivity) {
    }

    private void g() {
    }

    private RelativeLayout h() {
    }

    public static /* synthetic */ void h(LoginAuthActivity loginAuthActivity) {
    }

    private LinearLayout i() {
    }

    public static /* synthetic */ boolean i(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ Bundle j(LoginAuthActivity loginAuthActivity) {
    }

    private String j() {
    }

    public static /* synthetic */ f k(LoginAuthActivity loginAuthActivity) {
    }

    private void k() {
    }

    private void l() {
    }

    private void m() {
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 21)
    public void onClick(View view) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
    }

    @Override // android.app.Activity
    public void onResume() {
    }
}
