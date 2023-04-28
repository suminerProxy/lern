package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.BufferedMessage;
import com.tencent.android.tpns.mqtt.DisconnectedBufferOptions;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttToken;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DisconnectedMessageBuffer extends TTask {
    private static final String CLASS_NAME = "DisconnectedMessageBuffer";
    private static final Logger log = null;
    private Object bufLock;
    private ArrayList buffer;
    private DisconnectedBufferOptions bufferOpts;
    private IDisconnectedBufferCallback callback;

    public DisconnectedMessageBuffer(DisconnectedBufferOptions disconnectedBufferOptions) {
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
    }

    public void deleteMessage(int i2) {
    }

    public BufferedMessage getMessage(int i2) {
    }

    public int getMessageCount() {
    }

    public boolean isPersistBuffer() {
    }

    public void putMessage(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
    }

    public void setPublishCallback(IDisconnectedBufferCallback iDisconnectedBufferCallback) {
    }
}
