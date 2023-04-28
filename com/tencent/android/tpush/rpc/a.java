package com.tencent.android.tpush.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface a extends IInterface {
    void a();

    void a(String str, b bVar);

    void b();

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.rpc.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class AbstractBinderC0154a extends Binder implements a {
        public static a a(IBinder iBinder) {
        }

        public static a c() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.rpc.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0155a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f8792a;
            private IBinder b;

            public C0155a(IBinder iBinder) {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void b() {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void a(String str, b bVar) {
            }
        }
    }
}
