package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.Token;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttToken implements IMqttToken {
    public Token internalTok;

    public MqttToken() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public IMqttActionListener getActionCallback() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public IMqttAsyncClient getClient() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public MqttException getException() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public int[] getGrantedQos() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public int getMessageId() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public MqttWireMessage getResponse() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public boolean getSessionPresent() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public String[] getTopics() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public Object getUserContext() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public boolean isComplete() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public void setActionCallback(IMqttActionListener iMqttActionListener) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public void setUserContext(Object obj) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public void waitForCompletion() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttToken
    public void waitForCompletion(long j2) throws MqttException {
    }

    public MqttToken(String str) {
    }
}
