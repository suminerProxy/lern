package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface MemoryChunk {
    void close();

    void copy(final int offset, final MemoryChunk other, final int otherOffset, final int count);

    @Nullable
    ByteBuffer getByteBuffer();

    long getNativePtr() throws UnsupportedOperationException;

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(final int offset);

    int read(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count);

    int write(final int memoryOffset, final byte[] byteArray, final int byteArrayOffset, final int count);
}
