package com.tencent.tpns.mqttchannel.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.IMqttChannel;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import com.tencent.tpns.mqttchannel.core.common.data.Request;
import com.tencent.tpns.mqttchannel.core.common.inf.IMqttService;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c implements IMqttChannel {

    /* renamed from: a  reason: collision with root package name */
    private Context f13735a;
    private Intent b;
    private Boolean c;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f13736d;

    /* renamed from: e  reason: collision with root package name */
    private ServiceConnection f13737e;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public IMqttService f13738a;
        public final /* synthetic */ a b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ OnMqttCallback f13739d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f13740e;

        /* renamed from: f  reason: collision with root package name */
        private ServiceConnection f13741f;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class ServiceConnectionC02631 implements ServiceConnection {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f13742a;

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02641 extends TTask {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ServiceConnectionC02631 f13743a;

                public C02641(ServiceConnectionC02631 serviceConnectionC02631) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public ServiceConnectionC02631(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public AnonymousClass1(c cVar, a aVar, String str, OnMqttCallback onMqttCallback) {
        }

        public static /* synthetic */ ServiceConnection a(AnonymousClass1 anonymousClass1, ServiceConnection serviceConnection) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13744a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass10(c cVar, Request request, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13745a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass11(c cVar, Request request, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13746a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass2(c cVar, Request request, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f13747a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass3(c cVar, Request request, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13748a;

        public AnonymousClass4(c cVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnMqttCallback f13749a;
        public final /* synthetic */ c b;

        public AnonymousClass5(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13750a;

        public AnonymousClass6(c cVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnMqttCallback f13751a;
        public final /* synthetic */ c b;

        public AnonymousClass7(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnMqttCallback f13752a;
        public final /* synthetic */ c b;

        public AnonymousClass8(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnMqttCallback f13753a;
        public final /* synthetic */ c b;

        public AnonymousClass9(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(IMqttService iMqttService) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(IMqttService iMqttService);
    }

    public c(Context context) {
    }

    public static /* synthetic */ Context a(c cVar) {
    }

    public static /* synthetic */ Intent b(c cVar) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void bindAccount(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void getConnectState(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void ping(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendPublishData(String str, String str2, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendRequest(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void startConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void stopConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void subscrbie(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unBindAccount(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unSubscrbie(String str, OnMqttCallback onMqttCallback) {
    }

    private long a() {
    }

    private void a(a aVar, String str, OnMqttCallback onMqttCallback) {
    }
}
