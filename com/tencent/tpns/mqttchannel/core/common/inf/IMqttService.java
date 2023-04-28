package com.tencent.tpns.mqttchannel.core.common.inf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.tpns.mqttchannel.core.common.data.Request;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IMqttService extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Default implements IMqttService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void getConnectState(IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void ping(IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void sendPublishData(Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void sendRequest(Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void startConnect(IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void stopConnect(IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void subscrbie(Request request, IMqttCallback iMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
        public void unSubscrbie(Request request, IMqttCallback iMqttCallback) {
        }
    }

    void getConnectState(IMqttCallback iMqttCallback);

    void ping(IMqttCallback iMqttCallback);

    void sendPublishData(Request request, IMqttCallback iMqttCallback);

    void sendRequest(Request request, IMqttCallback iMqttCallback);

    void startConnect(IMqttCallback iMqttCallback);

    void stopConnect(IMqttCallback iMqttCallback);

    void subscrbie(Request request, IMqttCallback iMqttCallback);

    void unSubscrbie(Request request, IMqttCallback iMqttCallback);

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Stub extends Binder implements IMqttService {

        /* compiled from: ProGuard */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class Proxy implements IMqttService {

            /* renamed from: a  reason: collision with root package name */
            public static IMqttService f13760a;
            private IBinder b;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void getConnectState(IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void ping(IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void sendPublishData(Request request, IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void sendRequest(Request request, IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void startConnect(IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void stopConnect(IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void subscrbie(Request request, IMqttCallback iMqttCallback) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.inf.IMqttService
            public void unSubscrbie(Request request, IMqttCallback iMqttCallback) {
            }
        }

        public static IMqttService a(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }

        public static IMqttService a() {
        }
    }
}
