package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttPubComp extends MqttAck {
    public MqttPubComp(byte b, byte[] bArr) throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() throws MqttException {
    }

    public MqttPubComp(MqttPublish mqttPublish) {
    }

    public MqttPubComp(int i2) {
    }
}
