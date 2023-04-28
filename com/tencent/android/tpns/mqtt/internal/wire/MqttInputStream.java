package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.internal.ClientState;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttInputStream extends InputStream {
    private static final String CLASS_NAME = "MqttInputStream";
    private static final Logger log = null;
    private ByteArrayOutputStream bais;
    private ClientState clientState;
    private DataInputStream in;
    private byte[] packet;
    private long packetLen;
    private long remLen;

    public MqttInputStream(ClientState clientState, InputStream inputStream) {
    }

    private void readFully() throws IOException {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    public MqttWireMessage readMqttWireMessage() throws IOException, MqttException {
    }
}
