package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ConstrainableInputStream extends BufferedInputStream {
    private static final int DefaultSize = 32768;
    private final boolean capped;
    private boolean interrupted;
    private final int maxSize;
    private int remaining;
    private long startTime;
    private long timeout;

    private ConstrainableInputStream(InputStream inputStream, int i2, int i3) {
    }

    private boolean expired() {
    }

    public static ConstrainableInputStream wrap(InputStream inputStream, int i2, int i3) {
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
    }

    public ByteBuffer readToByteBuffer(int i2) throws IOException {
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    public ConstrainableInputStream timeout(long j2, long j3) {
    }
}
