package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = null;
    private static final Pattern CACHE_FILE_PATTERN_V2 = null;
    private static final Pattern CACHE_FILE_PATTERN_V3 = null;
    public static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String key, long position, long length, long lastTouchTimestamp, @Nullable File file) {
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long length, CachedContentIndex index) {
    }

    public static SimpleCacheSpan createHole(String key, long position, long length) {
    }

    public static SimpleCacheSpan createLookup(String key, long position) {
    }

    public static File getCacheFile(File cacheDir, int id, long position, long timestamp) {
    }

    @Nullable
    private static File upgradeFile(File file, CachedContentIndex index) {
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long lastTouchTimestamp) {
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long length, long lastTouchTimestamp, CachedContentIndex index) {
    }
}
