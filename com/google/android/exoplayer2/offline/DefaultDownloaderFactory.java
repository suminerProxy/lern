package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> CONSTRUCTORS = null;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory cacheDataSourceFactory) {
    }

    private static SparseArray<Constructor<? extends Downloader>> createDownloaderConstructors() {
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> clazz) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest request) {
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
    }

    private Downloader createDownloader(DownloadRequest request, int contentType) {
    }
}
