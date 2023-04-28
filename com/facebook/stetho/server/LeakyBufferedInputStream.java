package com.facebook.stetho.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LeakyBufferedInputStream extends BufferedInputStream {
    private boolean mLeaked;
    private boolean mMarked;

    public LeakyBufferedInputStream(InputStream inputStream, int i2) {
    }

    private byte[] clearBufferLocked() {
    }

    private void throwIfLeaked() {
    }

    private void throwIfMarked() {
    }

    public synchronized InputStream leakBufferAndStream() {
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
    }
}
