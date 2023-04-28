package com.mobile.auth.gatewayauth.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.model.TokenRet;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SystemManager {

    /* renamed from: a  reason: collision with root package name */
    private Context f4964a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private com.mobile.auth.s.a f4965d;

    /* renamed from: e  reason: collision with root package name */
    private com.mobile.auth.gatewayauth.manager.base.b f4966e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f4967f;

    /* renamed from: com.mobile.auth.gatewayauth.manager.SystemManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends com.mobile.auth.aj.a<com.mobile.auth.z.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringBuffer f4968a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ SystemManager c;

        public AnonymousClass1(SystemManager systemManager, com.mobile.auth.ak.c cVar, long j2, StringBuffer stringBuffer, CountDownLatch countDownLatch) {
        }

        @Override // com.mobile.auth.aj.a
        public /* bridge */ /* synthetic */ void a(com.mobile.auth.z.d dVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.mobile.auth.z.d dVar) {
        }
    }

    public SystemManager(Context context, com.mobile.auth.s.a aVar) {
    }

    private TokenRet b(ResultCodeProcessor resultCodeProcessor) {
    }

    @SafeProtector
    private native String requestCellularIp();

    public TokenRet a(ResultCodeProcessor resultCodeProcessor) {
    }

    public String a() {
    }

    public void a(String str) {
    }

    public synchronized <T> boolean a(String str, com.mobile.auth.gatewayauth.manager.base.a<T> aVar, long j2) {
    }

    public String b() {
    }

    public String c() {
    }

    @SafeProtector
    public native synchronized void cacheEncryptInfo(String str, String str2);

    @SafeProtector
    public native TokenRet checkEnvSafe(ResultCodeProcessor resultCodeProcessor);

    public boolean d() {
    }

    public boolean e() {
    }

    public String f() {
    }

    public Context g() {
    }

    @SafeProtector
    public native CacheKey getSimCacheKey(boolean z);

    @SafeProtector
    public native CacheKey getVendorCacheKey();

    public String h() {
    }

    public String i() {
    }

    public String j() {
    }

    public String k() {
    }

    public String l() {
    }

    @SafeProtector
    public native synchronized String loadEncryptCacheFromDisk(String str);

    public String m() {
    }

    public String n() {
    }

    public String o() {
    }

    public String p() {
    }

    public String q() {
    }

    @SafeProtector
    @SuppressLint({"MissingPermission"})
    public native void setupWifi();
}
