package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisingId.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* compiled from: AdvertisingId.java */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0281a {

        /* renamed from: a  reason: collision with root package name */
        private final String f15293a;
        private final boolean b;

        public C0281a(String str, boolean z) {
        }

        public static /* synthetic */ String a(C0281a c0281a) {
        }

        private String b() {
        }

        public boolean a() {
        }
    }

    public static String a(Context context) {
    }

    public static String b(Context context) {
    }

    private static C0281a c(Context context) throws Exception {
    }

    /* compiled from: AdvertisingId.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15294a;
        private final LinkedBlockingQueue<IBinder> b;

        private b() {
        }

        public IBinder a() throws InterruptedException {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        }
    }

    /* compiled from: AdvertisingId.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f15295a;

        public c(IBinder iBinder) {
        }

        public String a() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        public boolean a(boolean z) throws RemoteException {
        }
    }
}
