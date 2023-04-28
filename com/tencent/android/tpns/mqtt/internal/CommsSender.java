package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.internal.wire.MqttOutputStream;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommsSender extends TTask {
    private static final String CLASS_NAME = "CommsSender";
    private static final Logger log = null;
    private ClientComms clientComms;
    private ClientState clientState;
    private Object lifecycle;
    private MqttOutputStream out;
    private boolean running;
    private final Semaphore runningSemaphore;
    private Thread sendThread;
    private Future senderFuture;
    private String threadName;
    private CommsTokenStore tokenStore;

    public CommsSender(ClientComms clientComms, ClientState clientState, CommsTokenStore commsTokenStore, OutputStream outputStream) {
    }

    private void handleRunException(MqttWireMessage mqttWireMessage, Exception exc) {
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
    }

    public void start(String str, ExecutorService executorService) {
    }

    public void stop() {
    }
}
