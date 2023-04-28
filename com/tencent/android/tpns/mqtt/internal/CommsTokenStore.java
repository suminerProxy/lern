package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.MqttDeliveryToken;
import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.MqttToken;
import com.tencent.android.tpns.mqtt.internal.wire.MqttPublish;
import com.tencent.android.tpns.mqtt.internal.wire.MqttWireMessage;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommsTokenStore {
    private static final String CLASS_NAME = "CommsTokenStore";
    private static final Logger log = null;
    private MqttException closedResponse;
    private String logContext;
    private Hashtable tokens;

    public CommsTokenStore(String str) {
    }

    public void clear() {
    }

    public int count() {
    }

    public MqttDeliveryToken[] getOutstandingDelTokens() {
    }

    public Vector getOutstandingTokens() {
    }

    public MqttToken getToken(MqttWireMessage mqttWireMessage) {
    }

    public void open() {
    }

    public void quiesce(MqttException mqttException) {
    }

    public MqttToken removeToken(MqttWireMessage mqttWireMessage) {
    }

    public MqttDeliveryToken restoreToken(MqttPublish mqttPublish) {
    }

    public void saveToken(MqttToken mqttToken, MqttWireMessage mqttWireMessage) throws MqttException {
    }

    public String toString() {
    }

    public MqttToken removeToken(String str) {
    }

    public MqttToken getToken(String str) {
    }

    public void saveToken(MqttToken mqttToken, String str) {
    }
}
