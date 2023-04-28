package com.mobile.auth.gatewayauth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.manager.CrashManager;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.TokenMaskManager;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.manager.f;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.InitResult;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.utils.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PhoneNumberAuthHelper {
    @Keep
    public static final int SERVICE_TYPE_AUTH = 1;
    @Keep
    public static final int SERVICE_TYPE_LOGIN = 2;

    /* renamed from: a  reason: collision with root package name */
    public static volatile PhoneNumberAuthHelper f4845a;
    private TokenResultListener b;
    private SystemManager c;

    /* renamed from: d  reason: collision with root package name */
    private com.mobile.auth.gatewayauth.manager.b f4846d;

    /* renamed from: e  reason: collision with root package name */
    private VendorSdkInfoManager f4847e;

    /* renamed from: f  reason: collision with root package name */
    private TokenMaskManager f4848f;

    /* renamed from: g  reason: collision with root package name */
    private com.mobile.auth.gatewayauth.manager.d f4849g;

    /* renamed from: h  reason: collision with root package name */
    private CrashManager f4850h;

    /* renamed from: i  reason: collision with root package name */
    private f f4851i;

    /* renamed from: j  reason: collision with root package name */
    private Future f4852j;

    /* renamed from: k  reason: collision with root package name */
    private d f4853k;

    /* renamed from: l  reason: collision with root package name */
    private com.mobile.auth.s.a f4854l;

    /* renamed from: m  reason: collision with root package name */
    private String f4855m;

    /* renamed from: n  reason: collision with root package name */
    private ResultCodeProcessor f4856n;

    /* renamed from: o  reason: collision with root package name */
    private ResultCodeProcessor f4857o;

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4858a;

        /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C01221 implements RequestCallback<ConfigRule, Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f4859a;
            public final /* synthetic */ AnonymousClass1 b;

            public C01221(AnonymousClass1 anonymousClass1, CountDownLatch countDownLatch) {
            }

            public void a(ConfigRule configRule) {
            }

            public void a(Void r1) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onError(Void r1) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onSuccess(ConfigRule configRule) {
            }
        }

        public AnonymousClass1(PhoneNumberAuthHelper phoneNumberAuthHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements TokenResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoginResultListener f4860a;
        public final /* synthetic */ String b;
        public final /* synthetic */ PhoneNumberAuthHelper c;

        public AnonymousClass10(PhoneNumberAuthHelper phoneNumberAuthHelper, PreLoginResultListener preLoginResultListener, String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenFailed(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass11 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4861a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ MonitorStruct c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4862d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4863e;

        public AnonymousClass11(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, MonitorStruct monitorStruct, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass12 implements RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4864a;
        public final /* synthetic */ MonitorStruct b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TokenResultListener f4865d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4866e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f4867f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4868g;

        public AnonymousClass12(PhoneNumberAuthHelper phoneNumberAuthHelper, c cVar, MonitorStruct monitorStruct, String str, TokenResultListener tokenResultListener, String str2, String str3) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void a(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass13 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4869a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        public AnonymousClass13(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, int i2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass14 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4870a;
        public final /* synthetic */ int b;
        public final /* synthetic */ PhoneNumberAuthHelper c;

        public AnonymousClass14(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, Context context, int i2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass15 implements TokenResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoginResultListener f4871a;
        public final /* synthetic */ String b;
        public final /* synthetic */ PhoneNumberAuthHelper c;

        public AnonymousClass15(PhoneNumberAuthHelper phoneNumberAuthHelper, PreLoginResultListener preLoginResultListener, String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenFailed(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass16 implements RequestCallback<Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4872a;

        public AnonymousClass16(PhoneNumberAuthHelper phoneNumberAuthHelper) {
        }

        public void a(String str) {
        }

        public void a(Void r1) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(Void r1) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass17 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4873a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MonitorStruct f4874d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4875e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4876f;

        public AnonymousClass17(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass18 implements RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4877a;
        public final /* synthetic */ MonitorStruct b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4878d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ TokenResultListener f4879e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f4880f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f4881g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4882h;

        public AnonymousClass18(PhoneNumberAuthHelper phoneNumberAuthHelper, c cVar, MonitorStruct monitorStruct, ResultCodeProcessor resultCodeProcessor, String str, TokenResultListener tokenResultListener, String str2, String str3) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void a(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass19 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4883a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MonitorStruct f4884d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4885e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4886f;

        public AnonymousClass19(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements RequestCallback<com.mobile.auth.gatewayauth.manager.base.d, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4887a;
        public final /* synthetic */ MonitorStruct b;
        public final /* synthetic */ TokenResultListener c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ResultCodeProcessor f4888d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4889e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f4890f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4891g;

        public AnonymousClass2(PhoneNumberAuthHelper phoneNumberAuthHelper, c cVar, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str, String str2) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void b(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass20 implements RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4892a;
        public final /* synthetic */ MonitorStruct b;
        public final /* synthetic */ long c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CacheKey f4893d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4894e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ResultCodeProcessor f4895f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ TokenResultListener f4896g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f4897h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4898i;

        public AnonymousClass20(PhoneNumberAuthHelper phoneNumberAuthHelper, c cVar, MonitorStruct monitorStruct, long j2, CacheKey cacheKey, String str, ResultCodeProcessor resultCodeProcessor, TokenResultListener tokenResultListener, String str2) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void a(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass21 implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4899a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4900d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4901e;

        public AnonymousClass21(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str2) {
        }

        @Override // com.mobile.auth.gatewayauth.e
        public void a(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.e
        public void a(String str, String str2) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass22 extends e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4902a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4903d;

        public AnonymousClass22(PhoneNumberAuthHelper phoneNumberAuthHelper, boolean z, TokenResultListener tokenResultListener, String str) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a() {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.a
        public void a(Throwable th) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass23 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4904a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$23$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements RequestCallback<Void, String> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass23 f4905a;

            public AnonymousClass1(AnonymousClass23 anonymousClass23) {
            }

            public void a(String str) {
            }

            public void a(Void r1) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onError(String str) {
            }

            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
            public /* synthetic */ void onSuccess(Void r1) {
            }
        }

        public AnonymousClass23(PhoneNumberAuthHelper phoneNumberAuthHelper, int i2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass24 implements RequestCallback<Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4906a;

        public AnonymousClass24(PhoneNumberAuthHelper phoneNumberAuthHelper) {
        }

        public void a(String str) {
        }

        public void a(Void r1) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(Void r1) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass25 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4907a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        public AnonymousClass25(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, int i2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass26 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4908a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        public AnonymousClass26(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, int i2) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass27 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f4909a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4910d;

        public AnonymousClass27(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, long j2, TokenResultListener tokenResultListener2, ResultCodeProcessor resultCodeProcessor) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass28 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4911a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MonitorStruct f4912d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4913e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4914f;

        public AnonymousClass28(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4915a;
        public final /* synthetic */ TokenResultListener b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MonitorStruct f4916d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4917e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4918f;

        public AnonymousClass3(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements RequestCallback<com.mobile.auth.gatewayauth.manager.base.d, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4919a;
        public final /* synthetic */ MonitorStruct b;
        public final /* synthetic */ ResultCodeProcessor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TokenResultListener f4920d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4921e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f4922f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4923g;

        public AnonymousClass4(PhoneNumberAuthHelper phoneNumberAuthHelper, c cVar, MonitorStruct monitorStruct, ResultCodeProcessor resultCodeProcessor, TokenResultListener tokenResultListener, String str, String str2) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void b(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoginResultListener f4924a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        public AnonymousClass5(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, PreLoginResultListener preLoginResultListener) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4925a;
        public final /* synthetic */ PreLoginResultListener b;
        public final /* synthetic */ PhoneNumberAuthHelper c;

        public AnonymousClass6(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, int i2, PreLoginResultListener preLoginResultListener) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements TokenResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoginResultListener f4926a;
        public final /* synthetic */ PhoneNumberAuthHelper b;

        public AnonymousClass7(PhoneNumberAuthHelper phoneNumberAuthHelper, PreLoginResultListener preLoginResultListener) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenFailed(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenSuccess(String str) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends e.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4927a;
        public final /* synthetic */ PreLoginResultListener b;
        public final /* synthetic */ PhoneNumberAuthHelper c;

        public AnonymousClass8(PhoneNumberAuthHelper phoneNumberAuthHelper, TokenResultListener tokenResultListener, int i2, PreLoginResultListener preLoginResultListener) {
        }

        @Override // com.mobile.auth.gatewayauth.utils.e.b
        public void a() {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 implements RequestCallback<Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberAuthHelper f4928a;

        public AnonymousClass9(PhoneNumberAuthHelper phoneNumberAuthHelper) {
        }

        public void a(String str) {
        }

        public void a(Void r2) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(String str) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(Void r1) {
        }
    }

    private PhoneNumberAuthHelper(Context context, TokenResultListener tokenResultListener) {
    }

    public static /* synthetic */ com.mobile.auth.gatewayauth.manager.b a(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    private void a() {
    }

    private void a(Context context) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, int i2, ResultCodeProcessor resultCodeProcessor, boolean z, TokenResultListener tokenResultListener) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, long j2, PreLoginResultListener preLoginResultListener) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, long j2, PreLoginResultListener preLoginResultListener, ResultCodeProcessor resultCodeProcessor, boolean z) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, long j2, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, Context context, int i2, ResultCodeProcessor resultCodeProcessor, boolean z, TokenResultListener tokenResultListener) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, boolean z, boolean z2, String str, String str2, MonitorStruct monitorStruct, TokenResultListener tokenResultListener) {
    }

    public static /* synthetic */ void a(PhoneNumberAuthHelper phoneNumberAuthHelper, boolean z, boolean z2, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str5) {
    }

    private void a(String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
    }

    private void a(String str, boolean z, MonitorStruct monitorStruct, boolean z2) {
    }

    private void a(boolean z, String str, TokenResultListener tokenResultListener) {
    }

    private void a(boolean z, boolean z2, String str, String str2, MonitorStruct monitorStruct, TokenResultListener tokenResultListener) {
    }

    private void a(boolean z, boolean z2, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str5) {
    }

    private boolean a(long j2, CacheKey cacheKey, String str, boolean z, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, String str2) {
    }

    public static /* synthetic */ boolean a(PhoneNumberAuthHelper phoneNumberAuthHelper, long j2, CacheKey cacheKey, String str, boolean z, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, String str2) {
    }

    public static /* synthetic */ boolean a(PhoneNumberAuthHelper phoneNumberAuthHelper, boolean z, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str, MonitorStruct monitorStruct, String str2) {
    }

    public static /* synthetic */ boolean a(PhoneNumberAuthHelper phoneNumberAuthHelper, boolean z, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str, TokenResultListener tokenResultListener, String str2) {
    }

    private boolean a(String str, String str2) {
    }

    private boolean a(boolean z, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str, MonitorStruct monitorStruct, String str2) {
    }

    private boolean a(boolean z, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str, TokenResultListener tokenResultListener, String str2) {
    }

    public static /* synthetic */ SystemManager b(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    private Future b() {
    }

    public static /* synthetic */ void b(PhoneNumberAuthHelper phoneNumberAuthHelper, String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
    }

    private void b(String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
    }

    private void c() {
    }

    public static /* synthetic */ void c(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    @Keep
    public static void checkCellularNetworkStatus(PhoneNumberAuthHelper phoneNumberAuthHelper, Activity activity, String str, String str2) {
    }

    public static /* synthetic */ void d(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ VendorSdkInfoManager e(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ f f(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ com.mobile.auth.s.a g(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    @Keep
    public static PhoneNumberAuthHelper getInstance(Context context, TokenResultListener tokenResultListener) {
    }

    @Keep
    public static String getVersion() {
    }

    public static /* synthetic */ com.mobile.auth.gatewayauth.manager.d h(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ ResultCodeProcessor i(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ Future j(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    @SafeProtector
    private native void justGetLoginPhone(Context context, int i2, ResultCodeProcessor resultCodeProcessor, boolean z, TokenResultListener tokenResultListener);

    @SafeProtector
    private void justGetLoginToken(long j2, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor) {
    }

    @SafeProtector
    private native void justGetToken(int i2, ResultCodeProcessor resultCodeProcessor, boolean z, TokenResultListener tokenResultListener);

    @SafeProtector
    private native void justPreLogin(long j2, PreLoginResultListener preLoginResultListener, ResultCodeProcessor resultCodeProcessor, boolean z);

    @SafeProtector
    private native void justPreVerify(long j2, PreLoginResultListener preLoginResultListener);

    public static /* synthetic */ TokenResultListener k(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public static /* synthetic */ ResultCodeProcessor l(PhoneNumberAuthHelper phoneNumberAuthHelper) {
    }

    public void a(long j2, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor) {
    }

    public void a(String str, String str2, MonitorStruct monitorStruct, ResultCodeProcessor resultCodeProcessor, TokenResultListener tokenResultListener) {
    }

    @Keep
    public void accelerateLoginPage(int i2, PreLoginResultListener preLoginResultListener) {
    }

    @Keep
    public void accelerateVerify(int i2, PreLoginResultListener preLoginResultListener) {
    }

    @Keep
    public void addAuthRegistViewConfig(String str, AuthRegisterViewConfig authRegisterViewConfig) {
    }

    @Keep
    public void addAuthRegisterXmlConfig(AuthRegisterXmlConfig authRegisterXmlConfig) {
    }

    @Keep
    @Deprecated
    public InitResult checkAuthEnvEnable() {
    }

    @Keep
    public void checkEnvAvailable(@IntRange(from = 1, to = 2) int i2) {
    }

    @Keep
    @Deprecated
    public boolean checkEnvAvailable() {
    }

    @Keep
    public void clearPreInfo() {
    }

    @Keep
    @Deprecated
    public ArrayList<Object> getAllCustomBodyViews() {
    }

    @Keep
    @Deprecated
    public LinkedHashMap<String, AuthRegisterViewConfig> getAuthRegistViewConfigList() {
    }

    @Keep
    @Deprecated
    public ArrayList<AuthRegisterXmlConfig> getAuthRegisterXmlConfigList() {
    }

    @Keep
    @Deprecated
    public void getAuthToken(int i2) {
    }

    @Keep
    public String getCurrentCarrierName() {
    }

    @Keep
    @Deprecated
    public void getLoginToken(int i2) {
    }

    @Keep
    public void getLoginToken(Context context, int i2) {
    }

    @Keep
    public PnsReporter getReporter() {
    }

    @Keep
    public void getVerifyToken(int i2) {
    }

    @Keep
    public void hideLoginLoading() {
    }

    @Keep
    @Deprecated
    public void onDestroy() {
    }

    @Keep
    @Deprecated
    public void preLogin(int i2, PreLoginResultListener preLoginResultListener) {
    }

    @Keep
    @Deprecated
    public void quitAuthActivity() {
    }

    @Keep
    public void quitLoginPage() {
    }

    @Keep
    public void removeAuthRegisterViewConfig() {
    }

    @Keep
    public void removeAuthRegisterXmlConfig() {
    }

    @Keep
    public void setActivityResultListener(ActivityResultListener activityResultListener) {
    }

    @Keep
    public void setAuthListener(TokenResultListener tokenResultListener) {
    }

    @Keep
    public void setAuthSDKInfo(String str) {
    }

    @Keep
    public void setAuthUIConfig(AuthUIConfig authUIConfig) {
    }

    @Keep
    @Deprecated
    public void setDebugMode(boolean z) {
    }

    @Keep
    @Deprecated
    public void setLoggerEnable(boolean z) {
    }

    @Keep
    public void setUIClickListener(AuthUIControlClickListener authUIControlClickListener) {
    }

    @Keep
    @Deprecated
    public void setUploadEnable(boolean z) {
    }
}
