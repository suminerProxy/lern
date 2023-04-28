package com.tencent.android.tpush.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a extends Binder implements b {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.rpc.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0156a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static b f8793a;
            private IBinder b;

            public C0156a(IBinder iBinder) {
            }

            @Override // com.tencent.android.tpush.rpc.b
            public void a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static b a(IBinder iBinder) {
        }

        public static b b() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }
    }

    void a();
}
