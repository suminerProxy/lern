package com.facebook.stetho.server;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CompositeInputStream extends InputStream {
    private int mCurrentIndex;
    private final InputStream[] mStreams;

    public CompositeInputStream(InputStream[] inputStreamArr) {
    }

    private void closeAll(int i2) throws IOException {
    }

    private boolean tryMoveToNextStream() {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }
}
