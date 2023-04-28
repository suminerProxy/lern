package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IDeviceIdService.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* compiled from: IDeviceIdService.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14769a = 1;
        public static final int b = 2;
        public static final int c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final String f14770d = "com.samsung.android.deviceidservice.IDeviceIdService";

        public static b a(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        /* compiled from: IDeviceIdService.java */
        /* renamed from: com.umeng.analytics.pro.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0274a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f14771a;

            public C0274a(IBinder iBinder) {
            }

            @Override // com.umeng.analytics.pro.b
            public String a() throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String b() {
            }

            @Override // com.umeng.analytics.pro.b
            public String b(String str) throws RemoteException {
            }

            @Override // com.umeng.analytics.pro.b
            public String a(String str) throws RemoteException {
            }
        }
    }
}
