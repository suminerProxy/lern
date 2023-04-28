package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IDeviceIdManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface a extends IInterface {
    String a(String str) throws RemoteException;

    boolean a() throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    String c(String str) throws RemoteException;

    String d(String str) throws RemoteException;

    String e(String str) throws RemoteException;

    /* compiled from: IDeviceIdManager.java */
    /* renamed from: com.umeng.analytics.pro.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class AbstractBinderC0272a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14671a = 1;
        public static final int b = 2;
        public static final int c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f14672d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f14673e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f14674f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f14675g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final String f14676h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        public static a a(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        /* compiled from: IDeviceIdManager.java */
        /* renamed from: com.umeng.analytics.pro.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0273a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f14677a;

            public C0273a(IBinder iBinder) {
            }

            @Override // com.umeng.analytics.pro.a
            public String a(String str) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.umeng.analytics.pro.a
            public String b(String str) throws RemoteException {
            }

            public String c() {
            }

            @Override // com.umeng.analytics.pro.a
            public String c(String str) throws RemoteException {
            }

            @Override // com.umeng.analytics.pro.a
            public String d(String str) throws RemoteException {
            }

            @Override // com.umeng.analytics.pro.a
            public String e(String str) throws RemoteException {
            }

            @Override // com.umeng.analytics.pro.a
            public boolean a() throws RemoteException {
            }

            @Override // com.umeng.analytics.pro.a
            public String b() throws RemoteException {
            }
        }
    }
}
