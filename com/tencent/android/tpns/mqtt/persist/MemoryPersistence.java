package com.tencent.android.tpns.mqtt.persist;

import com.tencent.android.tpns.mqtt.MqttClientPersistence;
import com.tencent.android.tpns.mqtt.MqttPersistable;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MemoryPersistence implements MqttClientPersistence {
    private Hashtable data;

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void close() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public MqttPersistable get(String str) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public Enumeration keys() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void open(String str, String str2) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
    }
}
