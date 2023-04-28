package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface PooledByteBufferFactory {
    PooledByteBuffer newByteBuffer(int size);

    PooledByteBuffer newByteBuffer(InputStream inputStream) throws IOException;

    PooledByteBuffer newByteBuffer(InputStream inputStream, int initialCapacity) throws IOException;

    PooledByteBuffer newByteBuffer(byte[] bytes);

    PooledByteBufferOutputStream newOutputStream();

    PooledByteBufferOutputStream newOutputStream(int initialCapacity);
}
