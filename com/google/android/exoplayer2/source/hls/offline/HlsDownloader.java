package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
    }

    private void addMediaPlaylistDataSpecs(List<Uri> mediaPlaylistUrls, List<DataSpec> out) {
    }

    private void addSegment(HlsMediaPlaylist mediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> seenEncryptionKeyUris, ArrayList<SegmentDownloader.Segment> out) {
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public /* bridge */ /* synthetic */ List getSegments(DataSource dataSource, HlsPlaylist playlist, boolean removing) throws IOException, InterruptedException {
    }

    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }

    /* renamed from: getSegments  reason: avoid collision after fix types in other method */
    public List<SegmentDownloader.Segment> getSegments2(DataSource dataSource, HlsPlaylist playlist, boolean removing) throws IOException, InterruptedException {
    }

    public HlsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<HlsPlaylist> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }
}
