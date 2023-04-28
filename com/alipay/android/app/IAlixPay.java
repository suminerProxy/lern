package com.alipay.android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IAlixPay extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Stub extends Binder implements IAlixPay {
        private static final String DESCRIPTOR = "com.alipay.android.app.IAlixPay";
        public static final int TRANSACTION_Pay = 1;
        public static final int TRANSACTION_prePay = 5;
        public static final int TRANSACTION_registerCallback = 3;
        public static final int TRANSACTION_test = 2;
        public static final int TRANSACTION_unregisterCallback = 4;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class a implements IAlixPay {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f489a;

            public a(IBinder iBinder) {
            }

            @Override // com.alipay.android.app.IAlixPay
            public String Pay(String str) throws RemoteException {
            }

            public String a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.alipay.android.app.IAlixPay
            public String prePay(String str) throws RemoteException {
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
            }

            @Override // com.alipay.android.app.IAlixPay
            public String test() throws RemoteException {
            }

            @Override // com.alipay.android.app.IAlixPay
            public void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
            }
        }

        public static IAlixPay asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    String Pay(String str) throws RemoteException;

    String prePay(String str) throws RemoteException;

    void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;

    String test() throws RemoteException;

    void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;
}
