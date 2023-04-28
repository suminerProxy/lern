package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.ClientComms;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimerPingSender implements MqttPingSender {
    private static final String CLASS_NAME = "TimerPingSender";
    private static final Logger log = null;
    private ClientComms comms;
    private Timer timer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PingTask extends TimerTask {
        private static final String methodName = "PingTask.run";
        public final /* synthetic */ TimerPingSender this$0;

        private PingTask(TimerPingSender timerPingSender) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ PingTask(TimerPingSender timerPingSender, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ Logger access$100() {
    }

    public static /* synthetic */ ClientComms access$200(TimerPingSender timerPingSender) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPingSender
    public void init(ClientComms clientComms) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPingSender
    public void schedule(long j2) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPingSender
    public void start() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPingSender
    public void stop() {
    }
}
