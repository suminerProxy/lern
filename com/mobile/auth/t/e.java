package com.mobile.auth.t;

import com.mobile.auth.aj.h;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.manager.a;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class e implements h<com.mobile.auth.z.e> {

    /* renamed from: a  reason: collision with root package name */
    private com.mobile.auth.gatewayauth.manager.f f5176a;

    /* renamed from: com.mobile.auth.t.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements RequestCallback<a.C0124a, com.mobile.auth.gatewayauth.manager.base.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.mobile.auth.z.e f5177a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ e c;

        public AnonymousClass1(e eVar, com.mobile.auth.z.e eVar2, CountDownLatch countDownLatch) {
        }

        public void a(a.C0124a c0124a) {
        }

        public void a(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.d dVar) {
        }

        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
        public /* synthetic */ void onSuccess(a.C0124a c0124a) {
        }
    }

    public e(com.mobile.auth.gatewayauth.manager.f fVar) {
    }

    public com.mobile.auth.z.e a() {
    }

    public abstract void a(RequestCallback requestCallback, com.mobile.auth.gatewayauth.manager.a aVar);

    public com.mobile.auth.z.e b() {
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ Object call() throws Exception {
    }

    @Override // com.mobile.auth.aj.h
    public /* synthetic */ com.mobile.auth.z.e f() {
    }
}
