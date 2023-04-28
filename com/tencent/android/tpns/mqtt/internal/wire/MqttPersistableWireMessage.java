package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttPersistable;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class MqttPersistableWireMessage extends MqttWireMessage implements MqttPersistable {
    public MqttPersistableWireMessage(byte b) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public byte[] getHeaderBytes() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getHeaderLength() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getHeaderOffset() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public byte[] getPayloadBytes() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getPayloadLength() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getPayloadOffset() throws MqttPersistenceException {
    }
}
