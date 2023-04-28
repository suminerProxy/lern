package com.facebook.common.memory;

import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PooledByteArrayBufferedInputStream extends InputStream {
    private static final String TAG = "PooledByteInputStream";
    private int mBufferOffset;
    private int mBufferedSize;
    private final byte[] mByteArray;
    private boolean mClosed;
    private final InputStream mInputStream;
    private final ResourceReleaser<byte[]> mResourceReleaser;

    public PooledByteArrayBufferedInputStream(InputStream inputStream, byte[] byteArray, ResourceReleaser<byte[]> resourceReleaser) {
    }

    private boolean ensureDataInBuffer() throws IOException {
    }

    private void ensureNotClosed() throws IOException {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void finalize() throws Throwable {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long byteCount) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) throws IOException {
    }
}
