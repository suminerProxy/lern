package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttMessage;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttConnect extends MqttWireMessage {
    public static final String KEY = "Con";
    private int MqttVersion;
    private boolean cleanSession;
    private String clientId;
    private int keepAliveInterval;
    private char[] password;
    private String userName;
    private String willDestination;
    private MqttMessage willMessage;

    public MqttConnect(byte b, byte[] bArr) throws IOException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public String getKey() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte getMessageInfo() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getPayload() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() throws MqttException {
    }

    public boolean isCleanSession() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public boolean isMessageIdRequired() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage
    public String toString() {
    }

    public MqttConnect(String str, int i2, boolean z, int i3, String str2, char[] cArr, MqttMessage mqttMessage, String str3) {
    }
}
