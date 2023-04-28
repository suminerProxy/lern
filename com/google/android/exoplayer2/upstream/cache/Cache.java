package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CacheException extends IOException {
        public CacheException(String message) {
        }

        public CacheException(Throwable cause) {
        }

        public CacheException(String message, Throwable cause) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan span);

        void onSpanRemoved(Cache cache, CacheSpan span);

        void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan);
    }

    NavigableSet<CacheSpan> addListener(String key, Listener listener);

    @WorkerThread
    void applyContentMetadataMutations(String key, ContentMetadataMutations mutations) throws CacheException;

    @WorkerThread
    void commitFile(File file, long length) throws CacheException;

    long getCacheSpace();

    long getCachedBytes(String key, long position, long length);

    long getCachedLength(String key, long position, long length);

    NavigableSet<CacheSpan> getCachedSpans(String key);

    ContentMetadata getContentMetadata(String key);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String key, long position, long length);

    @WorkerThread
    void release();

    void releaseHoleSpan(CacheSpan holeSpan);

    void removeListener(String key, Listener listener);

    @WorkerThread
    void removeResource(String key);

    @WorkerThread
    void removeSpan(CacheSpan span);

    @WorkerThread
    File startFile(String key, long position, long length) throws CacheException;

    @WorkerThread
    CacheSpan startReadWrite(String key, long position, long length) throws InterruptedException, CacheException;

    @Nullable
    @WorkerThread
    CacheSpan startReadWriteNonBlocking(String key, long position, long length) throws CacheException;
}
