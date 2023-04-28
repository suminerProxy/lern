package com.facebook.common.streams;

import com.facebook.infer.annotation.Nullsafe;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LimitedInputStream extends FilterInputStream {
    private int mBytesToRead;
    private int mBytesToReadWhenMarked;

    public LimitedInputStream(InputStream inputStream, int limit) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        if (limit >= 0) {
            this.mBytesToRead = limit;
            this.mBytesToReadWhenMarked = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.mBytesToRead);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readLimit) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(readLimit);
            this.mBytesToReadWhenMarked = this.mBytesToRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.mBytesToRead == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.mBytesToRead--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.mBytesToReadWhenMarked != -1) {
                ((FilterInputStream) this).in.reset();
                this.mBytesToRead = this.mBytesToReadWhenMarked;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long byteCount) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(byteCount, this.mBytesToRead));
        this.mBytesToRead = (int) (this.mBytesToRead - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        int i2 = this.mBytesToRead;
        if (i2 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(buffer, byteOffset, Math.min(byteCount, i2));
        if (read > 0) {
            this.mBytesToRead -= read;
        }
        return read;
    }
}
