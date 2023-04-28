package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DataSourceInputStream extends InputStream {
    private boolean closed;
    private final DataSource dataSource;
    private final DataSpec dataSpec;
    private boolean opened;
    private final byte[] singleByteArray;
    private long totalBytesRead;

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
    }

    private void checkOpened() throws IOException {
    }

    public long bytesRead() {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void open() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) throws IOException {
    }
}
