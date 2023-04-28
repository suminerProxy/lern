package com.tencent.android.tpns.mqtt.internal;

import com.tencent.android.tpns.mqtt.MqttException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface NetworkModule {
    InputStream getInputStream() throws IOException;

    OutputStream getOutputStream() throws IOException;

    String getServerURI();

    void start() throws IOException, MqttException;

    void stop() throws IOException;
}
