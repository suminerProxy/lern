package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: SamsungDeviceIdSupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ai implements z {

    /* compiled from: SamsungDeviceIdSupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14694a;
        private final LinkedBlockingQueue<IBinder> b;

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }

        public IBinder a() throws InterruptedException {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
    }
}
