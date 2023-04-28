package com.tencent.android.tpush.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.protocol.k;
import com.tencent.android.tpush.service.util.f;
import com.tencent.android.tpush.stat.ServiceStat;
import com.tencent.tpns.baseapi.base.security.Security;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.ErrCode;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import com.tencent.tpns.mqttchannel.core.services.MqttServiceImpl;
import com.tencent.tpns.mqttchannel.services.BaseMqttClientService;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class XGVipPushService extends BaseMqttClientService {
    private static volatile String b = null;
    private static long c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static JSONArray f8795d = null;

    /* renamed from: e  reason: collision with root package name */
    private static long f8796e = 270000;

    /* renamed from: f  reason: collision with root package name */
    private static Service f8797f;

    /* renamed from: k  reason: collision with root package name */
    private static MqttServiceImpl f8798k;

    /* renamed from: g  reason: collision with root package name */
    private Handler f8800g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8801h = false;

    /* renamed from: i  reason: collision with root package name */
    private com.tencent.android.tpush.service.channel.a f8802i = new com.tencent.android.tpush.service.channel.a();

    /* renamed from: j  reason: collision with root package name */
    private boolean f8803j = false;

    /* renamed from: a  reason: collision with root package name */
    public TTask f8799a = new TTask(this) { // from class: com.tencent.android.tpush.service.XGVipPushService.4

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XGVipPushService f8807a;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.service.XGVipPushService$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends TTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f8808a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    };

    private void b(Context context) {
        CommonWorkingThread.getInstance().execute(new TTask(this, context) { // from class: com.tencent.android.tpush.service.XGVipPushService.3

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8806a;
            public final /* synthetic */ XGVipPushService b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    private void d() {
        CommonWorkingThread.getInstance().execute(new TTask(this) { // from class: com.tencent.android.tpush.service.XGVipPushService.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ XGVipPushService f8804a;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    private void e() {
        TLogger.d("XGVipPushService", "action - initCheckMessageHandler, on 60s later");
        Handler handler = new Handler();
        this.f8800g = handler;
        handler.postDelayed(this.f8799a, 60000L);
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public IBinder onBind(Intent intent) {
        TLogger.ii("XGVipPushService", "Service onBind()");
        if (!this.f8801h) {
            a(intent, "onBind");
            this.f8801h = true;
        }
        return super.onBind(intent);
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onConnectComplete(boolean z) {
        TLogger.ii("XGVipPushService", "onConnectComplete isReconnect:" + z);
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onConnectionLost() {
        TLogger.ii("XGVipPushService", "onConnectionLost");
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Security.checkTpnsSecurityLibSo(this);
        c = System.currentTimeMillis();
        f8797f = this;
        if (f8798k == null) {
            f8798k = new MqttServiceImpl(getApplicationContext(), this);
        }
        try {
            d.a(f8798k).a((OnMqttCallback) null);
        } catch (Throwable th) {
            TLogger.ee("XGVipPushService", "Service startConnect error : ", th);
        }
        Context applicationContext = getApplicationContext();
        b.b(applicationContext);
        ServiceStat.init(applicationContext);
        a.a().b(applicationContext);
        d();
        a(applicationContext);
        TLogger.ii("XGVipPushService", "Service onCreate() : " + getPackageName());
        if (i.a(getApplicationContext()) > 0) {
            f.e(getApplicationContext());
        }
        b(applicationContext);
        e();
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public void onDestroy() {
        b.b().c();
        TLogger.flush();
        super.onDestroy();
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onHeartBeat() {
        TLogger.ii("XGVipPushService", "heartBeat");
        com.tencent.android.tpush.a.b(this);
        f.d(this);
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onMessageArrived(String str, String str2) {
        TLogger.ii("XGVipPushService", "onMessageArrived: topic:" + str + ", message:" + str2);
        if (i.b(this, str)) {
            try {
                k kVar = new k();
                kVar.a(str2);
                com.tencent.android.tpush.service.b.a.a().a(kVar.b, kVar.f8980a, this.f8802i);
            } catch (JSONException e2) {
                TLogger.ee("XGVipPushService", "decode push msg fail", e2);
                ServiceStat.reportErrCode(this, ErrCode.INNER_ERROR_JSON, "onMessageArrived:" + str2, 0L, "inner");
            }
        }
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        TLogger.i("XGVipPushService", "Service onStart() : " + getPackageName());
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i2, int i3) {
        TLogger.ii("XGVipPushService", "Service onStartCommand() : " + getPackageName());
        super.onStartCommand(intent, i2, i3);
        a(intent, "onStartCommand");
        return 2;
    }

    public static Service b() {
        return f8797f;
    }

    public static MqttServiceImpl a() {
        return f8798k;
    }

    public static void a(Context context) {
        CommonWorkingThread.getInstance().execute(new TTask(context) { // from class: com.tencent.android.tpush.service.XGVipPushService.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8805a;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    private synchronized void a(Intent intent, String str) {
        JSONArray jSONArray;
        TLogger.d("XGVipPushService", "initServiceHandler with method : " + str);
        if (i.a(getApplicationContext()) > 0) {
            TLogger.ee("XGVipPushService", "initGlobal error");
            f.e(getApplicationContext());
            return;
        }
        if (intent != null) {
            if (f8795d == null) {
                f8795d = new JSONArray();
            }
            String action = intent.getAction();
            if (!i.b(action) && (jSONArray = f8795d) != null && jSONArray.length() < 10) {
                try {
                    action = action.replace("com.tencent.android.tpush.action", "");
                } catch (Throwable th) {
                    TLogger.w("XGVipPushService", "unexpected for initServiceHandler:" + th.getMessage());
                }
                f8795d.put(action);
            }
        }
        d();
        b.b().a(intent);
    }
}
