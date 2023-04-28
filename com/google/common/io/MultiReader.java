package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MultiReader extends Reader {
    @NullableDecl
    private Reader current;
    private final Iterator<? extends CharSource> it;

    public MultiReader(Iterator<? extends CharSource> it) throws IOException {
    }

    private void advance() throws IOException {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Reader
    public int read(@NullableDecl char[] cArr, int i2, int i3) throws IOException {
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
    }

    @Override // java.io.Reader
    public long skip(long j2) throws IOException {
    }
}
