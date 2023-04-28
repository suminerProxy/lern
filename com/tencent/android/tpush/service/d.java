package com.tencent.android.tpush.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.BroadcastAgent;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.ErrCode;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import com.tencent.tpns.mqttchannel.core.common.data.Request;
import com.tencent.tpns.mqttchannel.core.services.MqttServiceImpl;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f8916a;
    private static MqttServiceImpl b;
    private static Context c;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f8917d = b();

    private d(MqttServiceImpl mqttServiceImpl) {
        b = mqttServiceImpl;
        if (c == null) {
            c = XGPushManager.getContext();
        }
        if (c == null) {
            c = b.e();
        }
    }

    public void c(OnMqttCallback onMqttCallback) {
        if (b == null) {
            TLogger.e("SingleMqttServiceImpl", "Already stopped connect");
            return;
        }
        try {
            CommonWorkingThread.getInstance().execute(new TTask(this, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ OnMqttCallback f8920a;
                public final /* synthetic */ d b;

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            });
        } catch (Throwable th) {
            TLogger.e("SingleMqttServiceImpl", "", th);
        }
    }

    public void d(OnMqttCallback onMqttCallback) {
        MqttServiceImpl mqttServiceImpl = b;
        if (mqttServiceImpl == null) {
            try {
                BroadcastAgent.registerReceiver(c, new BroadcastReceiver(this, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.4

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ OnMqttCallback f8921a;
                    public final /* synthetic */ d b;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
            } catch (Throwable th) {
                TLogger.e("SingleMqttServiceImpl", "Receiver not registered exception error : ", th);
            }
            b.a(b.e());
            return;
        }
        try {
            mqttServiceImpl.getIMqttService().getConnectState(onMqttCallback);
        } catch (RemoteException e2) {
            TLogger.e("SingleMqttServiceImpl", "", e2);
        }
    }

    public static synchronized d a(MqttServiceImpl mqttServiceImpl) {
        d dVar;
        synchronized (d.class) {
            if (f8916a == null) {
                f8916a = new d(mqttServiceImpl);
            }
            dVar = f8916a;
        }
        return dVar;
    }

    public void b(OnMqttCallback onMqttCallback) {
        MqttServiceImpl mqttServiceImpl = b;
        if (mqttServiceImpl == null) {
            try {
                BroadcastAgent.registerReceiver(c, new BroadcastReceiver(this, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.2

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ OnMqttCallback f8919a;
                    public final /* synthetic */ d b;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
            } catch (Throwable th) {
                TLogger.e("SingleMqttServiceImpl", "Receiver not registered exception error : ", th);
            }
            b.a(b.e());
            return;
        }
        try {
            mqttServiceImpl.getIMqttService().ping(onMqttCallback);
        } catch (RemoteException e2) {
            TLogger.e("SingleMqttServiceImpl", "", e2);
        }
    }

    public void a(OnMqttCallback onMqttCallback) {
        MqttServiceImpl mqttServiceImpl = b;
        if (mqttServiceImpl == null) {
            try {
                BroadcastAgent.registerReceiver(c, new BroadcastReceiver(this, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.1

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ OnMqttCallback f8918a;
                    public final /* synthetic */ d b;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
            } catch (Throwable th) {
                TLogger.e("SingleMqttServiceImpl", "Receiver not registered exception error : ", th);
            }
            b.a(b.e());
            return;
        }
        try {
            mqttServiceImpl.getIMqttService().startConnect(onMqttCallback);
        } catch (RemoteException e2) {
            TLogger.e("SingleMqttServiceImpl", "", e2);
        }
    }

    private long b() {
        return (((System.currentTimeMillis() % 100000000000L) * 1000) + (Process.myPid() % 1000)) * 1000;
    }

    public void a(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback) {
        try {
            if (jSONObject == null) {
                if (onMqttCallback != null) {
                    onMqttCallback.handleCallback(ErrCode.INNER_ERROR_JSON, "sendRequest jsonParm not alow to null");
                    return;
                }
                return;
            }
            long j2 = this.f8917d + 1;
            this.f8917d = j2;
            onMqttCallback.requestId = j2;
            Request request = new Request(j2, str, jSONObject.toString());
            request.type = 6;
            MqttServiceImpl mqttServiceImpl = b;
            if (mqttServiceImpl == null) {
                BroadcastAgent.registerReceiver(c, new BroadcastReceiver(this, request, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.5

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Request f8922a;
                    public final /* synthetic */ OnMqttCallback b;
                    public final /* synthetic */ d c;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
                b.a(b.e());
                return;
            }
            try {
                mqttServiceImpl.getIMqttService().sendRequest(request, onMqttCallback);
            } catch (RemoteException e2) {
                TLogger.e("SingleMqttServiceImpl", "", e2);
            }
        } catch (Throwable th) {
            TLogger.e("SingleMqttServiceImpl", "", th);
        }
    }

    public void a(String str, String str2, OnMqttCallback onMqttCallback) {
        try {
            if (str2 == null) {
                if (onMqttCallback != null) {
                    onMqttCallback.handleCallback(ErrCode.INNER_ERROR_JSON, "sendPublishData content not alow to null");
                    return;
                }
                return;
            }
            long j2 = this.f8917d + 1;
            this.f8917d = j2;
            Request request = new Request(j2, str, str2);
            request.type = 5;
            MqttServiceImpl mqttServiceImpl = b;
            if (mqttServiceImpl == null) {
                BroadcastAgent.registerReceiver(c, new BroadcastReceiver(this, request, onMqttCallback) { // from class: com.tencent.android.tpush.service.d.6

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Request f8923a;
                    public final /* synthetic */ OnMqttCallback b;
                    public final /* synthetic */ d c;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
                b.a(b.e());
                return;
            }
            try {
                mqttServiceImpl.getIMqttService().sendPublishData(request, onMqttCallback);
            } catch (RemoteException e2) {
                TLogger.e("SingleMqttServiceImpl", "", e2);
            }
        } catch (Throwable th) {
            TLogger.e("SingleMqttServiceImpl", "", th);
        }
    }
}
