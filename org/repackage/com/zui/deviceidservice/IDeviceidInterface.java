package org.repackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface IDeviceidInterface extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class Stub extends Binder implements IDeviceidInterface {

        /* renamed from: a  reason: collision with root package name */
        public static final int f29938a = 1;
        public static final int b = 2;
        public static final int c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f29939d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f29940e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f29941f = 6;

        /* renamed from: g  reason: collision with root package name */
        private static final String f29942g = "org.repackage.com.zui.deviceidservice.IDeviceidInterface";

        public static IDeviceidInterface a(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static class Proxy implements IDeviceidInterface {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f29943a;

            public Proxy(IBinder iBinder) {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String a() throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String b() throws RemoteException {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public boolean c() throws RemoteException {
            }

            public String d() {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String a(String str) throws RemoteException {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String b(String str) throws RemoteException {
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public boolean c(String str) throws RemoteException {
            }
        }
    }
}
