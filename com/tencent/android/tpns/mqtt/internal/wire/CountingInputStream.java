package com.tencent.android.tpns.mqtt.internal.wire;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CountingInputStream extends InputStream {
    private int counter;
    private InputStream in;

    public CountingInputStream(InputStream inputStream) {
    }

    public int getCounter() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    public void resetCounter() {
    }
}
