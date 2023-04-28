package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.MqttPersistable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttPersistentData implements MqttPersistable {
    private int hLength;
    private int hOffset;
    private byte[] header;
    private String key;
    private int pLength;
    private int pOffset;
    private byte[] payload;

    public MqttPersistentData(String str, byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public byte[] getHeaderBytes() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getHeaderLength() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getHeaderOffset() {
    }

    public String getKey() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public byte[] getPayloadBytes() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getPayloadLength() {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttPersistable
    public int getPayloadOffset() {
    }
}
