package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.ClientComms;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ScheduledExecutorPingSender implements MqttPingSender {
    private static final String CLASS_NAME = "ScheduledExecutorPingSender";
    private static final Logger log = null;
    private String clientid;
    private ClientComms comms;
    private ScheduledExecutorService executorService;
    private ScheduledFuture scheduledFuture;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PingRunnable extends TTask {
        private static final String methodName = "PingTask.run";
        public final /* synthetic */ ScheduledExecutorPingSender this$0;

        private PingRunnable(ScheduledExecutorPingSender scheduledExecutorPingSender) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }

        public /* synthetic */ PingRunnable(ScheduledExecutorPingSender scheduledExecutorPingSender, AnonymousClass1 anonymousClass1) {
        }
    }

    public ScheduledExecutorPingSender(ScheduledExecutorService scheduledExecutorService) {
    }

    public static /* synthetic */ String access$100(ScheduledExecutorPingSender scheduledExecutorPingSender) {
    }

    public static /* synthetic */ Logger access$200() {
    }

    public static /* synthetic */ ClientComms access$300(ScheduledExecutorPingSender scheduledExecutorPingSender) {
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
