package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PooledByteStreams {
    private static final int DEFAULT_TEMP_BUF_SIZE = 16384;
    private final ByteArrayPool mByteArrayPool;
    private final int mTempBufSize;

    public PooledByteStreams(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 16384);
    }

    public long copy(final InputStream from, final OutputStream to) throws IOException {
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        long j2 = 0;
        while (true) {
            try {
                int read = from.read(bArr, 0, this.mTempBufSize);
                if (read == -1) {
                    return j2;
                }
                to.write(bArr, 0, read);
                j2 += read;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
    }

    @VisibleForTesting
    public PooledByteStreams(ByteArrayPool byteArrayPool, int tempBufSize) {
        Preconditions.checkArgument(Boolean.valueOf(tempBufSize > 0));
        this.mTempBufSize = tempBufSize;
        this.mByteArrayPool = byteArrayPool;
    }

    public long copy(final InputStream from, final OutputStream to, final long bytesToCopy) throws IOException {
        long j2 = 0;
        Preconditions.checkState(bytesToCopy > 0);
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        while (j2 < bytesToCopy) {
            try {
                int read = from.read(bArr, 0, (int) Math.min(this.mTempBufSize, bytesToCopy - j2));
                if (read == -1) {
                    break;
                }
                to.write(bArr, 0, read);
                j2 += read;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
        return j2;
    }
}
