package com.tencent.android.tpns.mqtt;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MqttPersistable {
    byte[] getHeaderBytes() throws MqttPersistenceException;

    int getHeaderLength() throws MqttPersistenceException;

    int getHeaderOffset() throws MqttPersistenceException;

    byte[] getPayloadBytes() throws MqttPersistenceException;

    int getPayloadLength() throws MqttPersistenceException;

    int getPayloadOffset() throws MqttPersistenceException;
}
