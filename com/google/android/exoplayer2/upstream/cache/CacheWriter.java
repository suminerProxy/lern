package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    @Nullable
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ProgressListener {
        void onProgress(long requestLength, long bytesCached, long newBytesCached);
    }

    public CacheWriter(CacheDataSource dataSource, DataSpec dataSpec, @Nullable byte[] temporaryBuffer, @Nullable ProgressListener progressListener) {
    }

    private long getLength() {
    }

    private void onNewBytesCached(long newBytesCached) {
    }

    private void onRequestEndPosition(long endPosition) {
    }

    private long readBlockToCache(long position, long length) throws IOException {
    }

    private void throwIfCanceled() throws InterruptedIOException {
    }

    @WorkerThread
    public void cache() throws IOException {
    }

    public void cancel() {
    }
}
