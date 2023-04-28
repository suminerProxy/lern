package com.tencent.android.tpns.mqtt.internal.wire;

import com.tencent.android.tpns.mqtt.MqttException;
import com.tencent.android.tpns.mqtt.internal.ClientState;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttOutputStream extends OutputStream {
    private static final String CLASS_NAME = "MqttOutputStream";
    private static final Logger log = null;
    private ClientState clientState;
    private BufferedOutputStream out;

    public MqttOutputStream(ClientState clientState, OutputStream outputStream) {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
    }

    public void write(MqttWireMessage mqttWireMessage) throws IOException, MqttException {
    }
}
