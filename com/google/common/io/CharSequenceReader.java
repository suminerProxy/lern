package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CharSequenceReader extends Reader {
    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
    }

    private void checkOpen() throws IOException {
    }

    private boolean hasRemaining() {
    }

    private int remaining() {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i2) throws IOException {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized long skip(long j2) throws IOException {
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i2, int i3) throws IOException {
    }
}
