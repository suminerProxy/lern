package com.google.android.exoplayer2.source.smoothstreaming.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SsDownloader extends SegmentDownloader<SsManifest> {
    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public /* bridge */ /* synthetic */ List getSegments(DataSource dataSource, SsManifest manifest, boolean allowIncompleteList) throws IOException, InterruptedException {
    }

    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }

    /* renamed from: getSegments  reason: avoid collision after fix types in other method */
    public List<SegmentDownloader.Segment> getSegments2(DataSource dataSource, SsManifest manifest, boolean allowIncompleteList) {
    }

    public SsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<SsManifest> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }
}
