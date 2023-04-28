package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@TargetApi(27)
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AshmemMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "AshmemMemoryChunk";
    @Nullable
    private ByteBuffer mByteBuffer;
    private final long mId;
    @Nullable
    private SharedMemory mSharedMemory;

    public AshmemMemoryChunk(final int size) {
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
    public ByteBuffer getByteBuffer() {
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

    @VisibleForTesting
    public AshmemMemoryChunk() {
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized byte read(final int offset) {
    }
}
