package com.mobile.auth.gatewayauth.manager;

import android.util.LruCache;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.utils.TokenGenerator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TokenMaskManager {

    /* renamed from: a  reason: collision with root package name */
    private b f4969a;
    private SystemManager b;
    private d c;

    /* renamed from: d  reason: collision with root package name */
    private VendorSdkInfoManager f4970d;

    /* renamed from: e  reason: collision with root package name */
    private f f4971e;

    /* renamed from: f  reason: collision with root package name */
    private TokenGenerator f4972f;

    /* renamed from: g  reason: collision with root package name */
    private com.mobile.auth.s.a f4973g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Map<String, LoginPhoneInfo> f4974h;

    /* renamed from: i  reason: collision with root package name */
    private volatile com.mobile.auth.gatewayauth.manager.base.a<LoginPhoneInfo> f4975i;

    /* renamed from: j  reason: collision with root package name */
    private volatile LruCache<String, com.mobile.auth.gatewayauth.manager.base.a<String>> f4976j;

    /* renamed from: k  reason: collision with root package name */
    private volatile LruCache<String, com.mobile.auth.gatewayauth.manager.base.a<String>> f4977k;

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4978a;

        public AnonymousClass1(TokenMaskManager tokenMaskManager) {
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

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 extends com.mobile.auth.t.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4979a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TokenMaskManager c;

        public AnonymousClass10(TokenMaskManager tokenMaskManager, f fVar, String str, String str2) {
        }

        @Override // com.mobile.auth.t.e
        public void a(RequestCallback requestCallback, a aVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass11 extends com.mobile.auth.aj.a<com.mobile.auth.z.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RequestCallback f4980a;
        public final /* synthetic */ TokenMaskManager b;

        public AnonymousClass11(TokenMaskManager tokenMaskManager, com.mobile.auth.ak.c cVar, long j2, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.e eVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.e eVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass12 extends com.mobile.auth.t.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4981a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TokenMaskManager c;

        public AnonymousClass12(TokenMaskManager tokenMaskManager, f fVar, String str, String str2) {
        }

        @Override // com.mobile.auth.t.e
        public void a(RequestCallback requestCallback, a aVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass13 extends com.mobile.auth.aj.a<com.mobile.auth.z.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RequestCallback f4982a;
        public final /* synthetic */ TokenMaskManager b;

        public AnonymousClass13(TokenMaskManager tokenMaskManager, com.mobile.auth.ak.c cVar, long j2, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.f fVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.f fVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends com.mobile.auth.aj.a<com.mobile.auth.z.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4983a;
        public final /* synthetic */ CacheKey b;
        public final /* synthetic */ RequestCallback c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4984d;

        public AnonymousClass2(TokenMaskManager tokenMaskManager, com.mobile.auth.ak.c cVar, long j2, String str, CacheKey cacheKey, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.f fVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.f fVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends com.mobile.auth.x.e<LoginPhoneInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4985a;

        public AnonymousClass3(TokenMaskManager tokenMaskManager) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends com.mobile.auth.x.e<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4986a;

        public AnonymousClass4(TokenMaskManager tokenMaskManager) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends com.mobile.auth.x.e<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4987a;

        public AnonymousClass5(TokenMaskManager tokenMaskManager) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 implements RequestCallback<com.mobile.auth.z.e, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CacheKey f4988a;
        public final /* synthetic */ RequestCallback b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CacheKey f4989d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ long f4990e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f4991f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f4992g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f4993h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f4994i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f4995j;

        /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass6 f4996a;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
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

        public AnonymousClass6(TokenMaskManager tokenMaskManager, CacheKey cacheKey, RequestCallback requestCallback, String str, CacheKey cacheKey2, long j2, long j3, int i2, String str2, String str3) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        public void a(com.mobile.auth.z.e eVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(com.mobile.auth.z.e eVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends com.mobile.auth.aj.a<com.mobile.auth.z.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RequestCallback f4997a;
        public final /* synthetic */ TokenMaskManager b;

        public AnonymousClass7(TokenMaskManager tokenMaskManager, com.mobile.auth.ak.c cVar, long j2, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.e eVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.e eVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends com.mobile.auth.t.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4998a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TokenMaskManager c;

        public AnonymousClass8(TokenMaskManager tokenMaskManager, f fVar, String str, String str2) {
        }

        @Override // com.mobile.auth.t.e
        public void a(RequestCallback requestCallback, a aVar) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.manager.TokenMaskManager$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends com.mobile.auth.aj.a<com.mobile.auth.z.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4999a;
        public final /* synthetic */ CacheKey b;
        public final /* synthetic */ RequestCallback c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TokenMaskManager f5000d;

        public AnonymousClass9(TokenMaskManager tokenMaskManager, com.mobile.auth.ak.c cVar, long j2, String str, CacheKey cacheKey, RequestCallback requestCallback) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.e eVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.e eVar) {
        }
    }

    public TokenMaskManager(b bVar, SystemManager systemManager, d dVar, f fVar, VendorSdkInfoManager vendorSdkInfoManager) {
    }

    public static /* synthetic */ com.mobile.auth.s.a a(TokenMaskManager tokenMaskManager) {
    }

    public static /* synthetic */ String a(TokenMaskManager tokenMaskManager, String str, boolean z) {
    }

    private native String a(String str, CacheKey cacheKey, long j2);

    private native String a(String str, boolean z);

    public static /* synthetic */ void a(TokenMaskManager tokenMaskManager, CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo) {
    }

    public static /* synthetic */ void a(TokenMaskManager tokenMaskManager, String str, CacheKey cacheKey, String str2, long j2) {
    }

    private native synchronized void a(CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo);

    private native synchronized void a(String str, CacheKey cacheKey, String str2, long j2);

    private native boolean a(String str, String str2, long j2);

    private native synchronized boolean a(String str, String str2, LruCache<String, com.mobile.auth.gatewayauth.manager.base.a<String>> lruCache, long j2);

    private native String b(String str, CacheKey cacheKey, long j2);

    private native synchronized void b();

    public static /* synthetic */ void b(TokenMaskManager tokenMaskManager, String str, CacheKey cacheKey, String str2, long j2) {
    }

    private native synchronized void b(String str, CacheKey cacheKey, String str2, long j2);

    private native boolean b(String str, String str2, long j2);

    private native synchronized void c();

    private native synchronized void d();

    private native synchronized void e();

    private native synchronized void f();

    private native synchronized void g();

    @SafeProtector
    private synchronized String popToken(String str, CacheKey cacheKey, LruCache<String, com.mobile.auth.gatewayauth.manager.base.a<String>> lruCache, String str2, boolean z, long j2) {
    }

    @SafeProtector
    private native void requestMask(long j2, RequestCallback<com.mobile.auth.z.e, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, String str, int i2, String str2, String str3);

    public native LoginPhoneInfo a(CacheKey cacheKey);

    public native synchronized void a();

    public native void a(long j2, RequestCallback<com.mobile.auth.gatewayauth.manager.base.d, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, long j3, String str, String str2, String str3);

    public native void a(long j2, RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, String str, long j3, int i2, String str2, String str3);

    public native boolean a(String str);

    public native void b(long j2, RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, long j3, String str, String str2, String str3);

    public native void b(long j2, RequestCallback<com.mobile.auth.gatewayauth.manager.base.d, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, String str, long j3, int i2, String str2, String str3);

    @SafeProtector
    public native void updateMask(long j2, RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.d> requestCallback, CacheKey cacheKey, int i2, String str, String str2, String str3);
}
