package com.facebook.stetho.dumpapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Framer {
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    private static final String TAG = "FramingSocket";
    private final DataInputStream mInput;
    private final DataOutputStream mMultiplexedOutputStream;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ClosedHelper {
        private volatile boolean mClosed;

        private ClosedHelper() {
        }

        public void close() {
        }

        public void throwIfClosed() throws IOException {
        }

        public /* synthetic */ ClosedHelper(AnonymousClass1 anonymousClass1) {
        }
    }

    public Framer(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static /* synthetic */ DataInputStream access$200(Framer framer) {
    }

    public static /* synthetic */ DataOutputStream access$300(Framer framer) {
    }

    private static <T extends Throwable> T handleSuppression(@Nullable T t, T t2) {
    }

    public PrintStream getStderr() {
    }

    public InputStream getStdin() {
    }

    public PrintStream getStdout() {
    }

    public byte readFrameType() throws IOException {
    }

    public int readInt() throws IOException {
    }

    public String readString() throws IOException {
    }

    public void writeBlob(byte[] bArr, int i2, int i3) throws IOException {
    }

    public void writeExitCode(int i2) throws IOException {
    }

    public void writeIntFrame(byte b, int i2) throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class FramingInputStream extends InputStream {
        private final ClosedHelper mClosedHelper;
        public final /* synthetic */ Framer this$0;

        private FramingInputStream(Framer framer) {
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
        }

        public /* synthetic */ FramingInputStream(Framer framer, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class FramingOutputStream extends OutputStream {
        private final ClosedHelper mClosedHelper;
        private final byte mPrefix;
        public final /* synthetic */ Framer this$0;

        public FramingOutputStream(Framer framer, byte b) {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
        }
    }
}
