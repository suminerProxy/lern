package com.tencent.turingfd.sdk.mfa;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ucT3w implements s7Dnc {

    /* renamed from: a  reason: collision with root package name */
    public nyvKz f14197a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ShGzN extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14198a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ AtomicReference c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f14199d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14200e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f14201f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ucT3w f14202g;

        public ShGzN(ucT3w uct3w, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, Context context, AtomicReference atomicReference4, Object obj) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class spXPg implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14203a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ Object c;

        public spXPg(AtomicReference atomicReference, AtomicReference atomicReference2, Object obj) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public abstract String a(IBinder iBinder) throws Exception;

    @Override // com.tencent.turingfd.sdk.mfa.s7Dnc
    public void a(Context context) {
    }

    @Override // com.tencent.turingfd.sdk.mfa.s7Dnc
    public nyvKz b(Context context) {
    }

    public final nyvKz c(Context context) {
    }

    public final int a(Context context, AtomicReference<IBinder> atomicReference, AtomicReference<ServiceConnection> atomicReference2) {
    }

    public final int a(Context context, AtomicReference<IBinder> atomicReference, AtomicReference<ServiceConnection> atomicReference2, AtomicReference<String> atomicReference3) {
    }
}
