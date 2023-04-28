package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MultiInputStream extends InputStream {
    @NullableDecl
    private InputStream in;
    private Iterator<? extends ByteSource> it;

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
    }

    private void advance() throws IOException {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(@NullableDecl byte[] bArr, int i2, int i3) throws IOException {
    }
}
