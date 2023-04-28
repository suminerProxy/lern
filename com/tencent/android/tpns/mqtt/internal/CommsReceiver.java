package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.internal.wire.MqttInputStream;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommsReceiver extends TTask {
    private static final String CLASS_NAME = "CommsReceiver";
    private static final Logger log = null;
    private ClientComms clientComms;
    private ClientState clientState;
    private MqttInputStream in;
    private Object lifecycle;
    private Thread recThread;
    private Future receiverFuture;
    private volatile boolean receiving;
    private boolean running;
    private final Semaphore runningSemaphore;
    private String threadName;
    private CommsTokenStore tokenStore;

    public CommsReceiver(ClientComms clientComms, ClientState clientState, CommsTokenStore commsTokenStore, InputStream inputStream) {
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
    }

    public boolean isReceiving() {
    }

    public boolean isRunning() {
    }

    public void start(String str, ExecutorService executorService) {
    }

    public void stop() {
    }
}
