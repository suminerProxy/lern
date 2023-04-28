package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.helper.ChromePeerManager;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ResponseHandlingInputStream extends FilterInputStream {
    private static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    @GuardedBy("this")
    private boolean mClosed;
    @Nullable
    private final CountingOutputStream mDecompressedCounter;
    @GuardedBy("this")
    private boolean mEofSeen;
    private long mLastDecompressedCount;
    private final ChromePeerManager mNetworkPeerManager;
    private final OutputStream mOutputStream;
    private final String mRequestId;
    private final ResponseHandler mResponseHandler;
    @GuardedBy("this")
    @Nullable
    private byte[] mSkipBuffer;

    public ResponseHandlingInputStream(InputStream inputStream, String str, OutputStream outputStream, @Nullable CountingOutputStream countingOutputStream, ChromePeerManager chromePeerManager, ResponseHandler responseHandler) {
    }

    private synchronized int checkEOF(int i2) {
    }

    private synchronized void closeOutputStreamQuietly() {
    }

    @Nonnull
    private byte[] getSkipBufferLocked() {
    }

    private IOException handleIOException(IOException iOException) {
    }

    private void handleIOExceptionWritingToStream(IOException iOException) {
    }

    private void reportDecodedSizeIfApplicable() {
    }

    private synchronized void writeToOutputStream(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
    }

    private synchronized void writeToOutputStream(byte[] bArr, int i2, int i3) {
    }
}
