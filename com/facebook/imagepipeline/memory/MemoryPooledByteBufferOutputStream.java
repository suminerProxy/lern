package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MemoryPooledByteBufferOutputStream extends PooledByteBufferOutputStream {
    @Nullable
    private CloseableReference<MemoryChunk> mBufRef;
    private int mCount;
    private final MemoryChunkPool mPool;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InvalidStreamException extends RuntimeException {
    }

    public MemoryPooledByteBufferOutputStream(MemoryChunkPool pool) {
        this(pool, pool.getMinBufferSize());
    }

    private void ensureValid() {
        if (!CloseableReference.isValid(this.mBufRef)) {
            throw new InvalidStreamException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
        this.mCount = -1;
        super.close();
    }

    @VisibleForTesting
    public void realloc(int newLength) {
        ensureValid();
        Preconditions.checkNotNull(this.mBufRef);
        if (newLength <= this.mBufRef.get().getSize()) {
            return;
        }
        MemoryChunk memoryChunk = this.mPool.get(newLength);
        Preconditions.checkNotNull(this.mBufRef);
        this.mBufRef.get().copy(0, memoryChunk, 0, this.mCount);
        this.mBufRef.close();
        this.mBufRef = CloseableReference.of(memoryChunk, this.mPool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public int size() {
        return this.mCount;
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        write(new byte[]{(byte) oneByte});
    }

    public MemoryPooledByteBufferOutputStream(MemoryChunkPool pool, int initialCapacity) {
        Preconditions.checkArgument(Boolean.valueOf(initialCapacity > 0));
        MemoryChunkPool memoryChunkPool = (MemoryChunkPool) Preconditions.checkNotNull(pool);
        this.mPool = memoryChunkPool;
        this.mCount = 0;
        this.mBufRef = CloseableReference.of(memoryChunkPool.get(initialCapacity), memoryChunkPool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public MemoryPooledByteBuffer toByteBuffer() {
        ensureValid();
        return new MemoryPooledByteBuffer((CloseableReference) Preconditions.checkNotNull(this.mBufRef), this.mCount);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int offset, int count) throws IOException {
        if (offset >= 0 && count >= 0 && offset + count <= buffer.length) {
            ensureValid();
            realloc(this.mCount + count);
            ((MemoryChunk) ((CloseableReference) Preconditions.checkNotNull(this.mBufRef)).get()).write(this.mCount, buffer, offset, count);
            this.mCount += count;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + offset + "; regionLength=" + count);
    }
}
