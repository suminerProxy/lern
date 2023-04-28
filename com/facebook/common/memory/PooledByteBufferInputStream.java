package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PooledByteBufferInputStream extends InputStream {
    @VisibleForTesting
    public int mMark;
    @VisibleForTesting
    public int mOffset;
    @VisibleForTesting
    public final PooledByteBuffer mPooledByteBuffer;

    public PooledByteBufferInputStream(PooledByteBuffer pooledByteBuffer) {
    }

    @Override // java.io.InputStream
    public int available() {
    }

    @Override // java.io.InputStream
    public void mark(int readlimit) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.InputStream
    public int read() {
    }

    @Override // java.io.InputStream
    public void reset() {
    }

    @Override // java.io.InputStream
    public long skip(long byteCount) {
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) {
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) {
    }
}
