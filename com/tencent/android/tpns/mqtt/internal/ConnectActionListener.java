package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.IMqttActionListener;
import com.tencent.android.tpns.mqtt.IMqttToken;
import com.tencent.android.tpns.mqtt.MqttAsyncClient;
import com.tencent.android.tpns.mqtt.MqttCallbackExtended;
import com.tencent.android.tpns.mqtt.MqttClientPersistence;
import com.tencent.android.tpns.mqtt.MqttConnectOptions;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;
import com.tencent.android.tpns.mqtt.MqttToken;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ConnectActionListener implements IMqttActionListener {
    private MqttAsyncClient client;
    private ClientComms comms;
    private MqttCallbackExtended mqttCallbackExtended;
    private MqttConnectOptions options;
    private int originalMqttVersion;
    private MqttClientPersistence persistence;
    private boolean reconnect;
    private IMqttActionListener userCallback;
    private Object userContext;
    private MqttToken userToken;

    public ConnectActionListener(MqttAsyncClient mqttAsyncClient, MqttClientPersistence mqttClientPersistence, ClientComms clientComms, MqttConnectOptions mqttConnectOptions, MqttToken mqttToken, Object obj, IMqttActionListener iMqttActionListener, boolean z) {
    }

    public void connect() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
    public void onFailure(IMqttToken iMqttToken, Throwable th) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttActionListener
    public void onSuccess(IMqttToken iMqttToken) {
    }

    public void setMqttCallbackExtended(MqttCallbackExtended mqttCallbackExtended) {
    }
}
