package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    @Nullable
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;
    @Nullable
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    @Nullable
    private DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    @Nullable
    private DataSpec currentDataSpec;
    @Nullable
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    @Nullable
    private final EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    @Nullable
    private DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface CacheIgnoredReason {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {
        void onCacheIgnored(int reason);

        void onCachedBytesRead(long cacheSizeBytes, long cachedBytesRead);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements DataSource.Factory {
        private Cache cache;
        private boolean cacheIsReadOnly;
        private CacheKeyFactory cacheKeyFactory;
        private DataSource.Factory cacheReadDataSourceFactory;
        @Nullable
        private DataSink.Factory cacheWriteDataSinkFactory;
        @Nullable
        private EventListener eventListener;
        private int flags;
        @Nullable
        private DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        @Nullable
        private PriorityTaskManager upstreamPriorityTaskManager;

        private CacheDataSource createDataSourceInternal(@Nullable DataSource upstreamDataSource, int flags, int upstreamPriority) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        public CacheDataSource createDataSourceForDownloading() {
        }

        public CacheDataSource createDataSourceForRemovingDownload() {
        }

        @Nullable
        public Cache getCache() {
        }

        public CacheKeyFactory getCacheKeyFactory() {
        }

        @Nullable
        public PriorityTaskManager getUpstreamPriorityTaskManager() {
        }

        public Factory setCache(Cache cache) {
        }

        public Factory setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
        }

        public Factory setCacheReadDataSourceFactory(DataSource.Factory cacheReadDataSourceFactory) {
        }

        public Factory setCacheWriteDataSinkFactory(@Nullable DataSink.Factory cacheWriteDataSinkFactory) {
        }

        public Factory setEventListener(@Nullable EventListener eventListener) {
        }

        public Factory setFlags(int flags) {
        }

        public Factory setUpstreamDataSourceFactory(@Nullable DataSource.Factory upstreamDataSourceFactory) {
        }

        public Factory setUpstreamPriority(int upstreamPriority) {
        }

        public Factory setUpstreamPriorityTaskManager(@Nullable PriorityTaskManager upstreamPriorityTaskManager) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public CacheDataSource createDataSource() {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Flags {
    }

    public /* synthetic */ CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i2, PriorityTaskManager priorityTaskManager, int i3, EventListener eventListener, AnonymousClass1 anonymousClass1) {
    }

    private void closeCurrentSource() throws IOException {
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String key, Uri defaultUri) {
    }

    private void handleBeforeThrow(Throwable exception) {
    }

    private boolean isBypassingCache() {
    }

    private boolean isReadingFromCache() {
    }

    private boolean isReadingFromUpstream() {
    }

    private boolean isWritingToCache() {
    }

    private void notifyBytesRead() {
    }

    private void notifyCacheIgnored(int reason) {
    }

    private void openNextSource(DataSpec requestDataSpec, boolean checkCache) throws IOException {
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String key) throws IOException {
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
    }

    public Cache getCache() {
    }

    public CacheKeyFactory getCacheKeyFactory() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource) {
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, int flags) {
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, int flags, @Nullable EventListener eventListener) {
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, int flags, @Nullable EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
    }

    private CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, @Nullable CacheKeyFactory cacheKeyFactory, int flags, @Nullable PriorityTaskManager upstreamPriorityTaskManager, int upstreamPriority, @Nullable EventListener eventListener) {
    }
}
