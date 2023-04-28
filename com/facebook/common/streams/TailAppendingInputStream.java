package com.facebook.common.streams;

import com.facebook.infer.annotation.Nullsafe;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TailAppendingInputStream extends FilterInputStream {
    private int mMarkedTailOffset;
    private final byte[] mTail;
    private int mTailOffset;

    public TailAppendingInputStream(InputStream inputStream, byte[] tail) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(tail);
        this.mTail = tail;
    }

    private int readNextTailByte() {
        int i2 = this.mTailOffset;
        byte[] bArr = this.mTail;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.mTailOffset = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readLimit) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(readLimit);
            this.mMarkedTailOffset = this.mTailOffset;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : readNextTailByte();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.mTailOffset = this.mMarkedTailOffset;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] buffer) throws IOException {
        return read(buffer, 0, buffer.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] buffer, int offset, int count) throws IOException {
        int read = ((FilterInputStream) this).in.read(buffer, offset, count);
        if (read != -1) {
            return read;
        }
        int i2 = 0;
        if (count == 0) {
            return 0;
        }
        while (i2 < count) {
            int readNextTailByte = readNextTailByte();
            if (readNextTailByte == -1) {
                break;
            }
            buffer[offset + i2] = (byte) readNextTailByte;
            i2++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }
}
