package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface IMqttToken {
    IMqttActionListener getActionCallback();

    IMqttAsyncClient getClient();

    MqttException getException();

    int[] getGrantedQos();

    int getMessageId();

    MqttWireMessage getResponse();

    boolean getSessionPresent();

    String[] getTopics();

    Object getUserContext();

    boolean isComplete();

    void setActionCallback(IMqttActionListener iMqttActionListener);

    void setUserContext(Object obj);

    void waitForCompletion() throws MqttException;

    void waitForCompletion(long j2) throws MqttException;
}
