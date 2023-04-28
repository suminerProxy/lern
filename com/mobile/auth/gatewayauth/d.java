package com.mobile.auth.gatewayauth;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.utils.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AuthUIConfig f4943a = null;
    private static final ConcurrentHashMap<Integer, d> b = null;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private AuthUIControlClickListener f4944d;

    /* renamed from: e  reason: collision with root package name */
    private volatile WeakReference<Activity> f4945e;

    /* renamed from: f  reason: collision with root package name */
    private AuthUIConfig f4946f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedHashMap<String, AuthRegisterViewConfig> f4947g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<AuthRegisterXmlConfig> f4948h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Object> f4949i;

    /* renamed from: j  reason: collision with root package name */
    private int f4950j;

    /* renamed from: k  reason: collision with root package name */
    private com.mobile.auth.s.a f4951k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<Activity> f4952l;

    /* renamed from: m  reason: collision with root package name */
    private TokenResultListener f4953m;

    /* renamed from: n  reason: collision with root package name */
    private ActivityResultListener f4954n;

    /* renamed from: o  reason: collision with root package name */
    private PhoneNumberAuthHelper f4955o;

    /* renamed from: p  reason: collision with root package name */
    private SystemManager f4956p;
    private ResultCodeProcessor q;
    private com.mobile.auth.gatewayauth.manager.d r;
    private long s;
    private long t;
    private volatile boolean u;
    private Application.ActivityLifecycleCallbacks v;

    /* renamed from: com.mobile.auth.gatewayauth.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4957a;

        public AnonymousClass1(d dVar) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.d$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4958a;

        public AnonymousClass2(d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a() {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a(Throwable th) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.d$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4959a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4960d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f4961e;

        public AnonymousClass3(d dVar, boolean z, boolean z2, String str, String str2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a() {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a(Throwable th) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void b() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.d$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements TokenResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4962a;

        public AnonymousClass4(d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenFailed(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenSuccess(String str) {
        }
    }

    public d(Context context, com.mobile.auth.gatewayauth.manager.d dVar, SystemManager systemManager, PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ int a(d dVar) {
    }

    public static d a(int i2) {
    }

    public static /* synthetic */ WeakReference a(d dVar, WeakReference weakReference) {
    }

    public static void a(AuthUIConfig authUIConfig, Activity activity) {
    }

    private void a(String str, boolean z) {
    }

    private void a(boolean z, String str, String str2, boolean z2) {
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
    }

    public static /* synthetic */ WeakReference b(d dVar) {
    }

    private void b(String str, String str2) {
    }

    public static /* synthetic */ Application.ActivityLifecycleCallbacks c(d dVar) {
    }

    private void c(String str, String str2) {
    }

    public static /* synthetic */ com.mobile.auth.s.a d(d dVar) {
    }

    public static /* synthetic */ TokenResultListener e(d dVar) {
    }

    public static /* synthetic */ SystemManager f(d dVar) {
    }

    public static /* synthetic */ com.mobile.auth.gatewayauth.manager.d g(d dVar) {
    }

    public ResultCodeProcessor a() {
    }

    public void a(long j2) {
    }

    public void a(long j2, String str, String str2, ResultCodeProcessor resultCodeProcessor, e eVar) {
    }

    public void a(long j2, boolean z, boolean z2) {
    }

    public void a(Activity activity) {
    }

    public void a(ActivityResultListener activityResultListener) {
    }

    public void a(AuthRegisterXmlConfig authRegisterXmlConfig) {
    }

    public void a(AuthUIConfig authUIConfig) {
    }

    public void a(AuthUIControlClickListener authUIControlClickListener) {
    }

    public void a(TokenResultListener tokenResultListener) {
    }

    public void a(ResultCodeProcessor resultCodeProcessor) {
    }

    public void a(Object obj) {
    }

    public void a(String str, AuthRegisterViewConfig authRegisterViewConfig) {
    }

    public void a(String str, String str2) {
    }

    public void a(String str, String str2, boolean z) {
    }

    public void a(boolean z) {
    }

    public void a(boolean z, String str, String str2) {
    }

    public void a(boolean z, boolean z2) {
    }

    public void b() {
    }

    public void b(ResultCodeProcessor resultCodeProcessor) {
    }

    public void c() {
    }

    public ActivityResultListener d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public AuthUIConfig h() {
    }

    public LinkedHashMap<String, AuthRegisterViewConfig> i() {
    }

    public ArrayList<AuthRegisterXmlConfig> j() {
    }

    public ArrayList<Object> k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public com.mobile.auth.s.a o() {
    }

    public boolean p() {
    }
}
