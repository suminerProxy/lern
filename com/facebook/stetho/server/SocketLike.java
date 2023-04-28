package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SocketLike {
    private final LeakyBufferedInputStream mLeakyInput;
    private final LocalSocket mSocket;

    public SocketLike(SocketLike socketLike, LeakyBufferedInputStream leakyBufferedInputStream) {
    }

    public InputStream getInput() throws IOException {
    }

    public OutputStream getOutput() throws IOException {
    }

    public SocketLike(LocalSocket localSocket, LeakyBufferedInputStream leakyBufferedInputStream) {
    }
}
