package com.tencent.android.tpns.mqtt.internal.websocket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ExtendedByteArrayOutputStream extends ByteArrayOutputStream {
    public final WebSocketNetworkModule webSocketNetworkModule;
    public final WebSocketSecureNetworkModule webSocketSecureNetworkModule;

    public ExtendedByteArrayOutputStream(WebSocketNetworkModule webSocketNetworkModule) {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    public OutputStream getSocketOutputStream() throws IOException {
    }

    public ExtendedByteArrayOutputStream(WebSocketSecureNetworkModule webSocketSecureNetworkModule) {
    }
}
