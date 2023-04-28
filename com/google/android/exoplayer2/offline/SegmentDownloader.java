package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private static final long MAX_MERGED_SEGMENT_START_TIME_DIFF_US = 20000000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    /* renamed from: com.google.android.exoplayer2.offline.SegmentDownloader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends RunnableFutureTask<M, IOException> {
        public final /* synthetic */ SegmentDownloader this$0;
        public final /* synthetic */ DataSource val$dataSource;
        public final /* synthetic */ DataSpec val$dataSpec;

        public AnonymousClass1(final SegmentDownloader this$0, final DataSource val$dataSource, final DataSpec val$dataSpec) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public /* bridge */ /* synthetic */ Object doWork() throws Exception {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public M doWork() throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long contentLength, int totalSegments, long bytesDownloaded, int segmentsDownloaded) {
        }

        private float getPercentDownloaded() {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long requestLength, long bytesCached, long newBytesCached) {
        }

        public void onSegmentDownloaded() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long startTimeUs, DataSpec dataSpec) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Segment other) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(Segment other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;
        @Nullable
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource dataSource, @Nullable ProgressNotifier progressNotifier, byte[] temporaryBuffer) {
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

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }

    public static /* synthetic */ ParsingLoadable.Parser access$000(SegmentDownloader segmentDownloader) {
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnable) throws InterruptedException {
    }

    private static boolean canMergeSegments(DataSpec dataSpec1, DataSpec dataSpec2) {
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
    }

    private static void mergeSegments(List<Segment> segments, CacheKeyFactory keyFactory) {
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnable) {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
    }

    public final <T> T execute(RunnableFutureTask<T, ?> runnable, boolean removing) throws InterruptedException, IOException {
    }

    public final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean removing) throws InterruptedException, IOException {
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M manifest, boolean removing) throws IOException, InterruptedException;

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
    }

    private void removeActiveRunnable(int index) {
    }
}
