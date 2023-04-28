package com.tencent.liteav.audio.earmonitor.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface a extends IInterface {
    List a() throws RemoteException;

    void a(String str, String str2) throws RemoteException;

    boolean a(int i2) throws RemoteException;

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class AbstractBinderC0187a extends Binder implements a {
        public static a a(IBinder iBinder) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }

        /* renamed from: com.tencent.liteav.audio.earmonitor.a.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0188a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f11347a;

            public C0188a(IBinder iBinder) {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.a
            public final List a() throws RemoteException {
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.a
            public final boolean a(int i2) throws RemoteException {
            }

            @Override // com.tencent.liteav.audio.earmonitor.a.a.a
            public final void a(String str, String str2) throws RemoteException {
            }
        }
    }
}
