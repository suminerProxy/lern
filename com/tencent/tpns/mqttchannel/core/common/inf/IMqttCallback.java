package com.tencent.tpns.mqttchannel.core.common.inf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IMqttCallback extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a extends Binder implements IMqttCallback {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class C0265a implements IMqttCallback {

            /* renamed from: a  reason: collision with root package name */
            public static IMqttCallback f13759a;
            private IBinder b;

            public C0265a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback
            public void handleCallback(int i2, String str) {
            }
        }

        public a() {
            attachInterface(this, "com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback");
        }

        public static IMqttCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMqttCallback)) {
                return (IMqttCallback) queryLocalInterface;
            }
            return new C0265a(iBinder);
        }

        public static IMqttCallback getDefaultImpl() {
            return C0265a.f13759a;
        }

        public static boolean setDefaultImpl(IMqttCallback iMqttCallback) {
            if (C0265a.f13759a == null) {
                if (iMqttCallback != null) {
                    C0265a.f13759a = iMqttCallback;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback");
                return true;
            }
            parcel.enforceInterface("com.tencent.tpns.mqttchannel.core.common.inf.IMqttCallback");
            handleCallback(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void handleCallback(int i2, String str);
}
