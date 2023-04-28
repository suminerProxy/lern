package com.tencent.thumbplayer.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPPreLoadListenerAidl extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Stub extends Binder implements ITPPreLoadListenerAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl";
        public static final int TRANSACTION_onPrepareDownloadProgressUpdate = 3;
        public static final int TRANSACTION_onPrepareError = 2;
        public static final int TRANSACTION_onPrepareOK = 1;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class Proxy implements ITPPreLoadListenerAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareError(int i2, int i3, String str) throws RemoteException {
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareOK() throws RemoteException {
            }
        }

        public static ITPPreLoadListenerAidl asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) throws RemoteException;

    void onPrepareError(int i2, int i3, String str) throws RemoteException;

    void onPrepareOK() throws RemoteException;
}
