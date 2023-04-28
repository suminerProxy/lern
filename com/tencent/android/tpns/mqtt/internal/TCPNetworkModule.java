package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TCPNetworkModule implements NetworkModule {
    private static final String CLASS_NAME = "TCPNetworkModule";
    private static final Logger log = null;
    private int conTimeout;
    private SocketFactory factory;
    private String host;
    private int port;
    public Socket socket;
    public Socket tempsocket;

    public TCPNetworkModule(SocketFactory socketFactory, String str, int i2, String str2) {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.NetworkModule
    public InputStream getInputStream() throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.NetworkModule
    public OutputStream getOutputStream() throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.NetworkModule
    public String getServerURI() {
    }

    public void setConnectTimeout(int i2) {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.NetworkModule
    public void start() throws IOException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.NetworkModule
    public void stop() throws IOException {
    }
}
