package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SSLNetworkModule extends TCPNetworkModule {
    private static final String CLASS_NAME = "SSLNetworkModule";
    private static final Logger log = null;
    private String[] enabledCiphers;
    private int handshakeTimeoutSecs;
    private String host;
    private HostnameVerifier hostnameVerifier;
    private int port;

    public SSLNetworkModule(SSLSocketFactory sSLSocketFactory, String str, int i2, String str2) {
    }

    public String[] getEnabledCiphers() {
    }

    public HostnameVerifier getSSLHostnameVerifier() {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public String getServerURI() {
    }

    public void setEnabledCiphers(String[] strArr) {
    }

    public void setSSLHostnameVerifier(HostnameVerifier hostnameVerifier) {
    }

    public void setSSLhandshakeTimeout(int i2) {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public void start() throws IOException, MqttException {
    }
}
