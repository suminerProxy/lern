package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IComOpenClient extends IInterface {
    String a(String str) throws RemoteException;

    boolean a(String str, String str2, Bundle bundle) throws RemoteException;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a extends Binder implements IComOpenClient {
        public static IComOpenClient a(IBinder iBinder) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        public static IComOpenClient a() {
        }

        /* renamed from: com.baidu.mapframework.open.aidl.IComOpenClient$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class C0032a implements IComOpenClient {

            /* renamed from: a  reason: collision with root package name */
            public static IComOpenClient f2211a;
            private IBinder b;

            public C0032a(IBinder iBinder) {
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public String a(String str) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public boolean a(String str, String str2, Bundle bundle) throws RemoteException {
            }
        }
    }
}
