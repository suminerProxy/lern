package com.tencent.turingfd.sdk.mfa;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class rBDKv {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14149a = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ShGzN {

        /* renamed from: a  reason: collision with root package name */
        public int f14150a;
        public yMdp8 b;

        public ShGzN(int i2, yMdp8 ymdp8) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class spXPg implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14151a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f14152d;

        /* renamed from: com.tencent.turingfd.sdk.mfa.rBDKv$spXPg$spXPg  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C0271spXPg extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IBinder f14153a;
            public final /* synthetic */ spXPg b;

            public C0271spXPg(spXPg spxpg, IBinder iBinder) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public spXPg(AtomicReference atomicReference, long j2, Object obj, Context context) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static HnGHR a(Context context) {
    }

    public static HnGHR b(Context context) {
    }

    public static ShGzN a(byte[] bArr) {
    }
}
