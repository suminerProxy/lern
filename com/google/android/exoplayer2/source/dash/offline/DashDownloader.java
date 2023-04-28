package com.google.android.exoplayer2.source.dash.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {

    /* renamed from: com.google.android.exoplayer2.source.dash.offline.DashDownloader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends RunnableFutureTask<ChunkIndex, IOException> {
        public final /* synthetic */ DataSource val$dataSource;
        public final /* synthetic */ Representation val$representation;
        public final /* synthetic */ int val$trackType;

        public AnonymousClass1(final DashDownloader this$0, final DataSource val$dataSource, final int val$trackType, final Representation val$representation) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public /* bridge */ /* synthetic */ ChunkIndex doWork() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public ChunkIndex doWork() throws IOException {
        }
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
    }

    private static void addSegment(long startTimeUs, String baseUrl, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> out) {
    }

    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long periodStartUs, long periodDurationUs, boolean removing, ArrayList<SegmentDownloader.Segment> out) throws IOException, InterruptedException {
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(DataSource dataSource, int trackType, Representation representation, boolean removing) throws IOException, InterruptedException {
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public /* bridge */ /* synthetic */ List getSegments(DataSource dataSource, DashManifest manifest, boolean removing) throws IOException, InterruptedException {
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }

    /* renamed from: getSegments  reason: avoid collision after fix types in other method */
    public List<SegmentDownloader.Segment> getSegments2(DataSource dataSource, DashManifest manifest, boolean removing) throws IOException, InterruptedException {
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }
}
