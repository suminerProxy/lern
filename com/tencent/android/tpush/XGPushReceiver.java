package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.XGVipPushService;
import com.tencent.android.tpush.service.d;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.base.util.Util;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XGPushReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private Context f8580a;

    public void a(Context context, Intent intent) {
        TLogger.d("XGPushReceiver", "ping from alarmManager");
        Util.getWakeCpu(context);
        d.a(XGVipPushService.a()).b((OnMqttCallback) null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            this.f8580a = context;
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            com.tencent.android.tpush.service.b.b(context.getApplicationContext());
            if (XGPushConfig.enableDebug) {
                TLogger.d("XGPushReceiver", "PushReceiver received " + action + " @@ " + context.getPackageName());
            }
            CommonWorkingThread.getInstance().execute(new TTask(this, context, action, intent) { // from class: com.tencent.android.tpush.XGPushReceiver.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Context f8581a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Intent c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ XGPushReceiver f8582d;

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            });
            return;
        }
        Process.killProcess(Process.myPid());
    }
}
