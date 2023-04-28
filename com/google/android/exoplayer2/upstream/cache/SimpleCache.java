package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SimpleCache implements Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final String TAG = "SimpleCache";
    private static final String UID_FILE_SUFFIX = ".uid";
    private static final HashSet<File> lockedCacheDirs = null;
    private final File cacheDir;
    private final CachedContentIndex contentIndex;
    private final CacheEvictor evictor;
    @Nullable
    private final CacheFileMetadataIndex fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.SimpleCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ SimpleCache this$0;
        public final /* synthetic */ ConditionVariable val$conditionVariable;

        public AnonymousClass1(final SimpleCache this$0, String name, final ConditionVariable val$conditionVariable) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor) {
    }

    public static /* synthetic */ void access$000(SimpleCache simpleCache) {
    }

    public static /* synthetic */ CacheEvictor access$100(SimpleCache simpleCache) {
    }

    private void addSpan(SimpleCacheSpan span) {
    }

    private static void createCacheDirectories(File cacheDir) throws Cache.CacheException {
    }

    private static long createUid(File directory) throws IOException {
    }

    @WorkerThread
    public static void delete(File cacheDir, @Nullable DatabaseProvider databaseProvider) {
    }

    private SimpleCacheSpan getSpan(String key, long position, long length) {
    }

    private void initialize() {
    }

    public static synchronized boolean isCacheFolderLocked(File cacheFolder) {
    }

    private void loadDirectory(File directory, boolean isRoot, @Nullable File[] files, @Nullable Map<String, CacheFileMetadata> fileMetadata) {
    }

    private static long loadUid(File[] files) {
    }

    private static synchronized boolean lockFolder(File cacheDir) {
    }

    private void notifySpanAdded(SimpleCacheSpan span) {
    }

    private void notifySpanRemoved(CacheSpan span) {
    }

    private void notifySpanTouched(SimpleCacheSpan oldSpan, CacheSpan newSpan) {
    }

    private static long parseUid(String fileName) {
    }

    private void removeSpanInternal(CacheSpan span) {
    }

    private void removeStaleSpans() {
    }

    private SimpleCacheSpan touchSpan(String key, SimpleCacheSpan span) {
    }

    private static synchronized void unlockFolder(File cacheDir) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String key, Cache.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(String key, ContentMetadataMutations mutations) throws Cache.CacheException {
    }

    public synchronized void checkInitialization() throws Cache.CacheException {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file, long length) throws Cache.CacheException {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(String key, long position, long length) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(String key, long position, long length) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String key) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String key) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> getKeys() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean isCached(String key, long position, long length) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan holeSpan) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(String key, Cache.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(String key) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(CacheSpan span) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String key, long position, long length) throws Cache.CacheException {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized CacheSpan startReadWrite(String key, long position, long length) throws InterruptedException, Cache.CacheException {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    public synchronized CacheSpan startReadWriteNonBlocking(String key, long position, long length) throws Cache.CacheException {
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable byte[] secretKey) {
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable byte[] secretKey, boolean encrypt) {
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, DatabaseProvider databaseProvider) {
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable DatabaseProvider databaseProvider, @Nullable byte[] legacyIndexSecretKey, boolean legacyIndexEncrypt, boolean preferLegacyIndex) {
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, CachedContentIndex contentIndex, @Nullable CacheFileMetadataIndex fileIndex) {
    }
}
