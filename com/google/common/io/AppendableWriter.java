package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.Writer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AppendableWriter extends Writer {
    private boolean closed;
    private final Appendable target;

    public AppendableWriter(Appendable appendable) {
    }

    private void checkNotClosed() throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
    }

    @Override // java.io.Writer
    public void write(int i2) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence) throws IOException {
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str, int i2, int i3) throws IOException {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
    }
}
