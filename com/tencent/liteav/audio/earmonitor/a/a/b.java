package com.tencent.liteav.audio.earmonitor.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b extends IInterface {
    int a(String str, int i2) throws RemoteException;

    int a(boolean z) throws RemoteException;

    void a(String str) throws RemoteException;

    boolean a() throws RemoteException;

    int b() throws RemoteException;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a extends Binder implements b {
        public static b a(IBinder iBinder) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0189a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f11348a;

            public C0189a(IBinder iBinder) {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.b
            public final boolean a() throws RemoteException {
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.b
            public final int b() throws RemoteException {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.b
            public final int a(boolean z) throws RemoteException {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.b
            public final int a(String str, int i2) throws RemoteException {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.b
            public final void a(String str) throws RemoteException {
            }
        }
    }
}
