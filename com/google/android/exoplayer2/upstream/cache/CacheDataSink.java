package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final String TAG = "CacheDataSink";
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;
    @Nullable
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    @Nullable
    private File file;
    private final long fragmentSize;
    @Nullable
    private OutputStream outputStream;
    private long outputStreamBytesWritten;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException cause) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements DataSink.Factory {
        private int bufferSize;
        private Cache cache;
        private long fragmentSize;

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public DataSink createDataSink() {
        }

        public Factory setBufferSize(int bufferSize) {
        }

        public Factory setCache(Cache cache) {
        }

        public Factory setFragmentSize(long fragmentSize) {
        }
    }

    public CacheDataSink(Cache cache, long fragmentSize) {
    }

    private void closeCurrentOutputStream() throws IOException {
    }

    private void openNextOutputStream(DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws CacheDataSinkException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] buffer, int offset, int length) throws CacheDataSinkException {
    }

    public CacheDataSink(Cache cache, long fragmentSize, int bufferSize) {
    }
}
