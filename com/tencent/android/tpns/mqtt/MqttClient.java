package com.tencent.android.tpns.mqtt;

import com.tencent.android.tpns.mqtt.util.Debug;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttClient implements IMqttClient {
    public MqttAsyncClient aClient;
    public long timeToWait;

    public MqttClient(String str, String str2) throws MqttException {
    }

    public static String generateClientId() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void close() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void connect() throws MqttSecurityException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void disconnect() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void disconnectForcibly() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public String getClientId() {
    }

    public String getCurrentServerURI() {
    }

    public Debug getDebug() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public String getServerURI() {
    }

    public long getTimeToWait() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public MqttTopic getTopic(String str) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public boolean isConnected() {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void messageArrivedComplete(int i2, int i3) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void publish(String str, byte[] bArr, int i2, boolean z) throws MqttException, MqttPersistenceException {
    }

    public void reconnect() throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void setCallback(MqttCallback mqttCallback) {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void setManualAcks(boolean z) {
    }

    public void setTimeToWait(long j2) throws IllegalArgumentException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String str) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String str) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void unsubscribe(String str) throws MqttException {
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence) throws MqttException {
    }

    public void close(boolean z) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void connect(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void disconnect(long j2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void disconnectForcibly(long j2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String[] strArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void unsubscribe(String[] strArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void disconnectForcibly(long j2, long j3) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i2) throws MqttException {
    }

    public void disconnectForcibly(long j2, long j3, boolean z) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i2, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void publish(String str, MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String str, int i2) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr) throws MqttException {
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence, ScheduledExecutorService scheduledExecutorService) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String[] strArr, int[] iArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String str, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String str, int i2, IMqttMessageListener iMqttMessageListener) throws MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.IMqttClient
    public void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
    }
}
