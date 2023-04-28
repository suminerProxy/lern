package com.tencent.android.tpns.mqtt;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface IMqttClient {
    void close() throws MqttException;

    void connect() throws MqttSecurityException, MqttException;

    void connect(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException;

    IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException;

    void disconnect() throws MqttException;

    void disconnect(long j2) throws MqttException;

    void disconnectForcibly() throws MqttException;

    void disconnectForcibly(long j2) throws MqttException;

    void disconnectForcibly(long j2, long j3) throws MqttException;

    String getClientId();

    IMqttDeliveryToken[] getPendingDeliveryTokens();

    String getServerURI();

    MqttTopic getTopic(String str);

    boolean isConnected();

    void messageArrivedComplete(int i2, int i3) throws MqttException;

    void publish(String str, MqttMessage mqttMessage) throws MqttException, MqttPersistenceException;

    void publish(String str, byte[] bArr, int i2, boolean z) throws MqttException, MqttPersistenceException;

    void setCallback(MqttCallback mqttCallback);

    void setManualAcks(boolean z);

    void subscribe(String str) throws MqttException, MqttSecurityException;

    void subscribe(String str, int i2) throws MqttException;

    void subscribe(String str, int i2, IMqttMessageListener iMqttMessageListener) throws MqttException;

    void subscribe(String str, IMqttMessageListener iMqttMessageListener) throws MqttException, MqttSecurityException;

    void subscribe(String[] strArr) throws MqttException;

    void subscribe(String[] strArr, int[] iArr) throws MqttException;

    void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken subscribeWithResponse(String str) throws MqttException;

    IMqttToken subscribeWithResponse(String str, int i2) throws MqttException;

    IMqttToken subscribeWithResponse(String str, int i2, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    void unsubscribe(String str) throws MqttException;

    void unsubscribe(String[] strArr) throws MqttException;
}
