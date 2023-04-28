package com.mob.apc.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class d extends Binder implements IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f3401a;

        public a(IBinder iBinder) {
        }

        @Override // com.mob.apc.a.d
        public e a(e eVar) throws RemoteException {
        }

        @Override // com.mob.apc.a.d, android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
        }
    }

    public static d a(IBinder iBinder) {
    }

    public abstract e a(e eVar) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
    }
}
