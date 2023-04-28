package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FileBackedOutputStream extends OutputStream {
    @NullableDecl
    private File file;
    private final int fileThreshold;
    private MemoryOutput memory;
    private OutputStream out;
    private final boolean resetOnFinalize;
    private final ByteSource source;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ByteSource {
        public final /* synthetic */ FileBackedOutputStream this$0;

        public AnonymousClass1(FileBackedOutputStream fileBackedOutputStream) {
        }

        public void finalize() {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ByteSource {
        public final /* synthetic */ FileBackedOutputStream this$0;

        public AnonymousClass2(FileBackedOutputStream fileBackedOutputStream) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        public byte[] getBuffer() {
        }

        public int getCount() {
        }

        public /* synthetic */ MemoryOutput(AnonymousClass1 anonymousClass1) {
        }
    }

    public FileBackedOutputStream(int i2) {
    }

    public static /* synthetic */ InputStream access$100(FileBackedOutputStream fileBackedOutputStream) throws IOException {
    }

    private synchronized InputStream openInputStream() throws IOException {
    }

    private void update(int i2) throws IOException {
    }

    public ByteSource asByteSource() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
    }

    @VisibleForTesting
    public synchronized File getFile() {
    }

    public synchronized void reset() throws IOException {
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i2) throws IOException {
    }

    public FileBackedOutputStream(int i2, boolean z) {
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i2, int i3) throws IOException {
    }
}
