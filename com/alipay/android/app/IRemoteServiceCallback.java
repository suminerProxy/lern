package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IRemoteServiceCallback extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        private static final String DESCRIPTOR = "com.alipay.android.app.IRemoteServiceCallback";
        public static final int TRANSACTION_isHideLoadingScreen = 3;
        public static final int TRANSACTION_payEnd = 2;
        public static final int TRANSACTION_startActivity = 1;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class a implements IRemoteServiceCallback {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f490a;

            public a(IBinder iBinder) {
            }

            public String a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() throws RemoteException {
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z, String str) throws RemoteException {
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i2, Bundle bundle) throws RemoteException {
            }
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    boolean isHideLoadingScreen() throws RemoteException;

    void payEnd(boolean z, String str) throws RemoteException;

    void startActivity(String str, String str2, int i2, Bundle bundle) throws RemoteException;
}
