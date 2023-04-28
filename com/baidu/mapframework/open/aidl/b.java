package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IOpenClientCallback.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface b extends IInterface {

    /* compiled from: IOpenClientCallback.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a extends Binder implements b {

        /* compiled from: IOpenClientCallback.java */
        /* renamed from: com.baidu.mapframework.open.aidl.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class C0035a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static b f2213a;
            private IBinder b;

            public C0035a(IBinder iBinder) {
            }

            @Override // com.baidu.mapframework.open.aidl.b
            public void a(IBinder iBinder) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static b a() {
        }

        public static b b(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void a(IBinder iBinder) throws RemoteException;
}
