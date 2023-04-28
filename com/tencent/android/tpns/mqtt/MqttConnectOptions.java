package com.tencent.android.tpns.mqtt;

import java.util.Properties;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MqttConnectOptions {
    public static final boolean CLEAN_SESSION_DEFAULT = true;
    public static final int CONNECTION_TIMEOUT_DEFAULT = 30;
    public static final int KEEP_ALIVE_INTERVAL_DEFAULT = 60;
    public static final int MAX_INFLIGHT_DEFAULT = 10;
    public static final int MQTT_VERSION_3_1 = 3;
    public static final int MQTT_VERSION_3_1_1 = 4;
    public static final int MQTT_VERSION_DEFAULT = 0;
    public static final int URI_TYPE_LOCAL = 2;
    public static final int URI_TYPE_SSL = 1;
    public static final int URI_TYPE_TCP = 0;
    public static final int URI_TYPE_WS = 3;
    public static final int URI_TYPE_WSS = 4;
    private int MqttVersion;
    private boolean automaticReconnect;
    private boolean cleanSession;
    private int connectionTimeout;
    private int keepAliveInterval;
    private int maxInflight;
    private char[] password;
    private String[] serverURIs;
    private SocketFactory socketFactory;
    private Properties sslClientProps;
    private HostnameVerifier sslHostnameVerifier;
    private String userName;
    private String willDestination;
    private MqttMessage willMessage;

    public static int validateURI(String str) {
    }

    private void validateWill(String str, Object obj) {
    }

    public int getConnectionTimeout() {
    }

    public Properties getDebug() {
    }

    public int getKeepAliveInterval() {
    }

    public int getMaxInflight() {
    }

    public int getMqttVersion() {
    }

    public char[] getPassword() {
    }

    public HostnameVerifier getSSLHostnameVerifier() {
    }

    public Properties getSSLProperties() {
    }

    public String[] getServerURIs() {
    }

    public SocketFactory getSocketFactory() {
    }

    public String getUserName() {
    }

    public String getWillDestination() {
    }

    public MqttMessage getWillMessage() {
    }

    public boolean isAutomaticReconnect() {
    }

    public boolean isCleanSession() {
    }

    public void setAutomaticReconnect(boolean z) {
    }

    public void setCleanSession(boolean z) {
    }

    public void setConnectionTimeout(int i2) {
    }

    public void setKeepAliveInterval(int i2) throws IllegalArgumentException {
    }

    public void setMaxInflight(int i2) {
    }

    public void setMqttVersion(int i2) throws IllegalArgumentException {
    }

    public void setPassword(char[] cArr) {
    }

    public void setSSLHostnameVerifier(HostnameVerifier hostnameVerifier) {
    }

    public void setSSLProperties(Properties properties) {
    }

    public void setServerURIs(String[] strArr) {
    }

    public void setSocketFactory(SocketFactory socketFactory) {
    }

    public void setUserName(String str) {
    }

    public void setWill(MqttTopic mqttTopic, byte[] bArr, int i2, boolean z) {
    }

    public String toString() {
    }

    public void setWill(String str, byte[] bArr, int i2, boolean z) {
    }

    public void setWill(String str, MqttMessage mqttMessage, int i2, boolean z) {
    }
}
