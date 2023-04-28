package com.tencent.android.tpns.mqtt.internal.websocket;

import com.tencent.android.tpns.mqtt.logging.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WebSocketReceiver extends TTask {
    private static final String CLASS_NAME = "WebSocketReceiver";
    private static final Logger log = null;
    private InputStream input;
    private Object lifecycle;
    private PipedOutputStream pipedOutputStream;
    private Thread receiverThread;
    private volatile boolean receiving;
    private boolean running;
    private boolean stopping;

    public WebSocketReceiver(InputStream inputStream, PipedInputStream pipedInputStream) throws IOException {
    }

    private void closeOutputStream() {
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
    }

    public boolean isReceiving() {
    }

    public boolean isRunning() {
    }

    public void start(String str) {
    }

    public void stop() {
    }
}
