package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IResultReceiver extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Default implements IResultReceiver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i2, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Stub extends Binder implements IResultReceiver {
        private static final String DESCRIPTOR = "android.support.v4.os.IResultReceiver";
        public static final int TRANSACTION_send = 1;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Proxy implements IResultReceiver {
            public static IResultReceiver sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // android.support.v4.os.IResultReceiver
            public void send(int i2, Bundle bundle) throws RemoteException {
            }
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
        }

        public static IResultReceiver getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IResultReceiver iResultReceiver) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void send(int i2, Bundle bundle) throws RemoteException;
}
