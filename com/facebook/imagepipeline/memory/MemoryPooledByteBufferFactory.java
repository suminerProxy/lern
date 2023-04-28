package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MemoryPooledByteBufferFactory implements PooledByteBufferFactory {
    private final MemoryChunkPool mPool;
    private final PooledByteStreams mPooledByteStreams;

    public MemoryPooledByteBufferFactory(MemoryChunkPool pool, PooledByteStreams pooledByteStreams) {
        this.mPool = pool;
        this.mPooledByteStreams = pooledByteStreams;
    }

    @VisibleForTesting
    public MemoryPooledByteBuffer newByteBuf(InputStream inputStream, MemoryPooledByteBufferOutputStream outputStream) throws IOException {
        this.mPooledByteStreams.copy(inputStream, outputStream);
        return outputStream.toByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBufferOutputStream newOutputStream() {
        return new MemoryPooledByteBufferOutputStream(this.mPool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBufferOutputStream newOutputStream(int initialCapacity) {
        return new MemoryPooledByteBufferOutputStream(this.mPool, initialCapacity);
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBuffer newByteBuffer(int size) {
        Preconditions.checkArgument(Boolean.valueOf(size > 0));
        CloseableReference of = CloseableReference.of(this.mPool.get(size), this.mPool);
        try {
            return new MemoryPooledByteBuffer(of, size);
        } finally {
            of.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBuffer newByteBuffer(InputStream inputStream) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.mPool);
        try {
            return newByteBuf(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBuffer newByteBuffer(byte[] bytes) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.mPool, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                return memoryPooledByteBufferOutputStream.toByteBuffer();
            } catch (IOException e2) {
                throw Throwables.propagate(e2);
            }
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public MemoryPooledByteBuffer newByteBuffer(InputStream inputStream, int initialCapacity) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.mPool, initialCapacity);
        try {
            return newByteBuf(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
}
