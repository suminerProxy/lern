package com.tencent.android.tpns.mqtt.internal.websocket;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.internal.SSLNetworkModule;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebSocketSecureNetworkModule extends SSLNetworkModule {
    private static final String CLASS_NAME = "WebSocketSecureNetworkModule";
    private static final Logger log = null;
    private String host;
    private ByteArrayOutputStream outputStream;
    private PipedInputStream pipedInputStream;
    private int port;
    public ByteBuffer recievedPayload;
    private String uri;
    private WebSocketReceiver webSocketReceiver;

    public WebSocketSecureNetworkModule(SSLSocketFactory sSLSocketFactory, String str, String str2, int i2, String str3) {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public InputStream getInputStream() throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public OutputStream getOutputStream() throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.SSLNetworkModule, com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public String getServerURI() {
    }

    public InputStream getSocketInputStream() throws IOException {
    }

    public OutputStream getSocketOutputStream() throws IOException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.SSLNetworkModule, com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public void start() throws IOException, MqttException {
    }

    @Override // com.tencent.android.tpns.mqtt.internal.TCPNetworkModule, com.tencent.android.tpns.mqtt.internal.NetworkModule
    public void stop() throws IOException {
    }
}
