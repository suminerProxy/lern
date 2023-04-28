package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.cache.disk.DiskStorageCache;
import com.facebook.cache.disk.FileCache;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DiskStorageCacheFactory implements FileCacheFactory {
    private DiskStorageFactory mDiskStorageFactory;

    public DiskStorageCacheFactory(DiskStorageFactory diskStorageFactory) {
        this.mDiskStorageFactory = diskStorageFactory;
    }

    public static DiskStorageCache buildDiskStorageCache(DiskCacheConfig diskCacheConfig, DiskStorage diskStorage) {
        return buildDiskStorageCache(diskCacheConfig, diskStorage, Executors.newSingleThreadExecutor());
    }

    @Override // com.facebook.imagepipeline.core.FileCacheFactory
    public FileCache get(DiskCacheConfig diskCacheConfig) {
        return buildDiskStorageCache(diskCacheConfig, this.mDiskStorageFactory.get(diskCacheConfig));
    }

    public static DiskStorageCache buildDiskStorageCache(DiskCacheConfig diskCacheConfig, DiskStorage diskStorage, Executor executorForBackgroundInit) {
        return new DiskStorageCache(diskStorage, diskCacheConfig.getEntryEvictionComparatorSupplier(), new DiskStorageCache.Params(diskCacheConfig.getMinimumSizeLimit(), diskCacheConfig.getLowDiskSpaceSizeLimit(), diskCacheConfig.getDefaultSizeLimit()), diskCacheConfig.getCacheEventListener(), diskCacheConfig.getCacheErrorLogger(), diskCacheConfig.getDiskTrimmableRegistry(), executorForBackgroundInit, diskCacheConfig.getIndexPopulateAtStartupEnabled());
    }
}
