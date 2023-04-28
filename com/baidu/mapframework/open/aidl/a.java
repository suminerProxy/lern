package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMapOpenService.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a extends IInterface {
    void a(b bVar) throws RemoteException;

    /* compiled from: IMapOpenService.java */
    /* renamed from: com.baidu.mapframework.open.aidl.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AbstractBinderC0033a extends Binder implements a {

        /* compiled from: IMapOpenService.java */
        /* renamed from: com.baidu.mapframework.open.aidl.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class C0034a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f2212a;
            private IBinder b;

            public C0034a(IBinder iBinder) {
            }

            @Override // com.baidu.mapframework.open.aidl.a
            public void a(b bVar) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static a a(IBinder iBinder) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        public static a a() {
        }
    }
}
