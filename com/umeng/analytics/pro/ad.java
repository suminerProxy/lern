package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: HuaweiDeviceIdSupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ad implements z {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14687a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static final int b = 1;
    private static final int c = 2;

    /* compiled from: HuaweiDeviceIdSupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f14689a;

        public b(IBinder iBinder) {
        }

        public String a() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        public boolean b() throws RemoteException {
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
    }

    /* compiled from: HuaweiDeviceIdSupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14688a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
        }

        public IBinder a() throws InterruptedException {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }
}
