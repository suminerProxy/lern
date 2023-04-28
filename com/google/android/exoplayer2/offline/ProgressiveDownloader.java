package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    @Nullable
    private Downloader.ProgressListener progressListener;

    /* renamed from: com.google.android.exoplayer2.offline.ProgressiveDownloader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends RunnableFutureTask<Void, IOException> {
        public final /* synthetic */ ProgressiveDownloader this$0;

        public AnonymousClass1(final ProgressiveDownloader this$0) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public void cancelWork() {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public /* bridge */ /* synthetic */ Void doWork() throws Exception {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: doWork  reason: avoid collision after fix types in other method */
        public Void doWork2() throws IOException {
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
    }

    public static /* synthetic */ void a(ProgressiveDownloader progressiveDownloader, long j2, long j3, long j4) {
    }

    public static /* synthetic */ CacheWriter access$000(ProgressiveDownloader progressiveDownloader) {
    }

    private void onProgress(long contentLength, long bytesCached, long newBytesCached) {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(@Nullable Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }
}
