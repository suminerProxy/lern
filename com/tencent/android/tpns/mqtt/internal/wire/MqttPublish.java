package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttMessage;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttPublish extends MqttPersistableWireMessage {
    private byte[] encodedPayload;
    private MqttMessage message;
    private String topicName;

    public MqttPublish(String str, MqttMessage mqttMessage) {
    }

    public static byte[] encodePayload(MqttMessage mqttMessage) {
    }

    public MqttMessage getMessage() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte getMessageInfo() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getPayload() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttPersistableWireMessage, com.tencent.android.tpns.mqtt.MqttPersistable
    public int getPayloadLength() {
    }

    public String getTopicName() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public boolean isMessageIdRequired() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public void setMessageId(int i2) {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public String toString() {
    }

    public MqttPublish(byte b, byte[] bArr) throws MqttException, IOException {
    }
}
