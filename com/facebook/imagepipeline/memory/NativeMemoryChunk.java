package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.nativeloader.NativeLoader;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NativeMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "NativeMemoryChunk";
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    static {
        NativeLoader.loadLibrary(ImagePipelineNativeLoader.DSO_NAME);
    }

    public NativeMemoryChunk(final int size) {
        Preconditions.checkArgument(Boolean.valueOf(size > 0));
        this.mSize = size;
        this.mNativePtr = nativeAllocate(size);
        this.mIsClosed = false;
    }

    private void doCopy(final int offset, final MemoryChunk other, final int otherOffset, final int count) {
        if (other instanceof NativeMemoryChunk) {
            Preconditions.checkState(!isClosed());
            Preconditions.checkState(!other.isClosed());
            MemoryChunkUtil.checkBounds(offset, other.getSize(), otherOffset, count, this.mSize);
            nativeMemcpy(other.getNativePtr() + otherOffset, this.mNativePtr + offset, count);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @DoNotStrip
    private static native long nativeAllocate(int size);

    @DoNotStrip
    private static native void nativeCopyFromByteArray(long address, byte[] array, int offset, int count);

    @DoNotStrip
    private static native void nativeCopyToByteArray(long address, byte[] array, int offset, int count);

    @DoNotStrip
    private static native void nativeFree(long address);

    @DoNotStrip
    private static native void nativeMemcpy(long toPtr, long fromPtr, int count);

    @DoNotStrip
    private static native byte nativeReadByte(long fromPtr);

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(final int offset, final MemoryChunk other, final int otherOffset, final int count) {
        Preconditions.checkNotNull(other);
        if (other.getUniqueId() == getUniqueId()) {
            String str = "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(other)) + " which share the same address " + Long.toHexString(this.mNativePtr);
            Preconditions.checkArgument(Boolean.FALSE);
        }
        if (other.getUniqueId() < getUniqueId()) {
            synchronized (other) {
                synchronized (this) {
                    doCopy(offset, other, otherOffset, count);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (other) {
                doCopy(offset, other, otherOffset, count);
            }
        }
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        String str = "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ";
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    @Nullable
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
        return this.mSize;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int read(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count) {
        int adjustByteCount;
        Preconditions.checkNotNull(byteArray);
        Preconditions.checkState(!isClosed());
        adjustByteCount = MemoryChunkUtil.adjustByteCount(memoryOffset, count, this.mSize);
        MemoryChunkUtil.checkBounds(memoryOffset, byteArray.length, byteArrayOffset, adjustByteCount, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + memoryOffset, byteArray, byteArrayOffset, adjustByteCount);
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int write(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count) {
        int adjustByteCount;
        Preconditions.checkNotNull(byteArray);
        Preconditions.checkState(!isClosed());
        adjustByteCount = MemoryChunkUtil.adjustByteCount(memoryOffset, count, this.mSize);
        MemoryChunkUtil.checkBounds(memoryOffset, byteArray.length, byteArrayOffset, adjustByteCount, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + memoryOffset, byteArray, byteArrayOffset, adjustByteCount);
        return adjustByteCount;
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0L;
        this.mIsClosed = true;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized byte read(final int offset) {
        boolean z = true;
        Preconditions.checkState(!isClosed());
        Preconditions.checkArgument(Boolean.valueOf(offset >= 0));
        if (offset >= this.mSize) {
            z = false;
        }
        Preconditions.checkArgument(Boolean.valueOf(z));
        return nativeReadByte(this.mNativePtr + offset);
    }
}
