package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.IMqttMessageListener;
import com.tencent.android.tpns.mqtt.MqttCallback;
import com.tencent.android.tpns.mqtt.MqttCallbackExtended;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttMessage;
import com.tencent.android.tpns.mqtt.MqttToken;
import com.tencent.android.tpns.mqtt.internal.wire.MqttPublish;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommsCallback extends TTask {
    private static final String CLASS_NAME = "CommsCallback";
    private static final int INBOUND_QUEUE_SIZE = 10;
    private static final Logger log = null;
    private Future callbackFuture;
    private Thread callbackThread;
    private Hashtable callbacks;
    private ClientComms clientComms;
    private ClientState clientState;
    private Vector completeQueue;
    private Object lifecycle;
    private boolean manualAcks;
    private Vector messageQueue;
    private MqttCallback mqttCallback;
    private boolean quiescing;
    private MqttCallbackExtended reconnectInternalCallback;
    public boolean running;
    private final Semaphore runningSemaphore;
    private Object spaceAvailable;
    private String threadName;
    private Object workAvailable;

    public CommsCallback(ClientComms clientComms) {
    }

    private void handleActionComplete(MqttToken mqttToken) throws MqttException {
    }

    private void handleMessage(MqttPublish mqttPublish) throws MqttException, Exception {
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
    }

    public void asyncOperationComplete(MqttToken mqttToken) {
    }

    public void connectionLost(MqttException mqttException) {
    }

    public boolean deliverMessage(String str, int i2, MqttMessage mqttMessage) throws Exception {
    }

    public void fireActionEvent(MqttToken mqttToken) {
    }

    public Thread getThread() {
    }

    public boolean isQuiesced() {
    }

    public void messageArrived(MqttPublish mqttPublish) {
    }

    public void messageArrivedComplete(int i2, int i3) throws MqttException {
    }

    public void quiesce() {
    }

    public void removeMessageListener(String str) {
    }

    public void removeMessageListeners() {
    }

    public void setCallback(MqttCallback mqttCallback) {
    }

    public void setClientState(ClientState clientState) {
    }

    public void setManualAcks(boolean z) {
    }

    public void setMessageListener(String str, IMqttMessageListener iMqttMessageListener) {
    }

    public void setReconnectCallback(MqttCallbackExtended mqttCallbackExtended) {
    }

    public void start(String str, ExecutorService executorService) {
    }

    public void stop() {
    }
}
