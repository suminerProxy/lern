package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AtomicFile {
    private static final String TAG = "AtomicFile";
    private final File backupName;
    private final File baseName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AtomicFileOutputStream extends OutputStream {
        private boolean closed;
        private final FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(File file) throws FileNotFoundException {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
        }
    }

    public AtomicFile(File baseName) {
    }

    private void restoreBackup() {
    }

    public void delete() {
    }

    public void endWrite(OutputStream str) throws IOException {
    }

    public boolean exists() {
    }

    public InputStream openRead() throws FileNotFoundException {
    }

    public OutputStream startWrite() throws IOException {
    }
}
