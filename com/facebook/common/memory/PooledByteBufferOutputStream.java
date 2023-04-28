package com.facebook.common.memory;

import com.facebook.common.internal.Throwables;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.OutputStream;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class PooledByteBufferOutputStream extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            Throwables.propagate(e2);
        }
    }

    public abstract int size();

    public abstract PooledByteBuffer toByteBuffer();
}
