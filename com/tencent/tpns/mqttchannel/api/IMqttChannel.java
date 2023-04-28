package com.tencent.tpns.mqttchannel.api;

import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IMqttChannel {
    void bindAccount(String str, OnMqttCallback onMqttCallback);

    void getConnectState(OnMqttCallback onMqttCallback);

    void ping(OnMqttCallback onMqttCallback);

    void sendPublishData(String str, String str2, OnMqttCallback onMqttCallback);

    void sendRequest(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback);

    void startConnect(OnMqttCallback onMqttCallback);

    void stopConnect(OnMqttCallback onMqttCallback);

    void subscrbie(String str, OnMqttCallback onMqttCallback);

    void unBindAccount(OnMqttCallback onMqttCallback);

    void unSubscrbie(String str, OnMqttCallback onMqttCallback);
}
