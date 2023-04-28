package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttSuback extends MqttAck {
    private int[] grantedQos;

    public MqttSuback(byte b, byte[] bArr) throws IOException {
    }

    public int[] getGrantedQos() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttAck, com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public String toString() {
    }
}
