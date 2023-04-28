package com.tencent.tpns.mqttchannel.api;

import android.content.Context;
import com.tencent.tpns.mqttchannel.core.a.c;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MqttChannel implements IMqttChannel {

    /* renamed from: a  reason: collision with root package name */
    private static MqttChannel f13731a;
    private c b;

    private MqttChannel(Context context) {
    }

    public static synchronized MqttChannel getInstance(Context context) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void bindAccount(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void getConnectState(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void ping(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendPublishData(String str, String str2, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendRequest(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void startConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void stopConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void subscrbie(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unBindAccount(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unSubscrbie(String str, OnMqttCallback onMqttCallback) {
    }
}
