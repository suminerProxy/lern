package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BufferMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "BufferMemoryChunk";
    @Nullable
    private ByteBuffer mBuffer;
    private final long mId;
    private final int mSize;

    public BufferMemoryChunk(final int size) {
    }

    private void doCopy(final int offset, final MemoryChunk other, final int otherOffset, final int count) {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(final int offset, final MemoryChunk other, final int otherOffset, final int count) {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    @Nullable
    public synchronized ByteBuffer getByteBuffer() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized boolean isClosed() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int read(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count) {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int write(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count) {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized byte read(final int offset) {
    }
}
