package com.facebook.imagepipeline.cache;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.instrumentation.FrescoInstrumenter;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import e.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BufferedDiskCache {
    private static final Class<?> TAG = BufferedDiskCache.class;
    private final FileCache mFileCache;
    private final ImageCacheStatsTracker mImageCacheStatsTracker;
    private final PooledByteBufferFactory mPooledByteBufferFactory;
    private final PooledByteStreams mPooledByteStreams;
    private final Executor mReadExecutor;
    private final StagingArea mStagingArea = StagingArea.getInstance();
    private final Executor mWriteExecutor;

    public BufferedDiskCache(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, Executor readExecutor, Executor writeExecutor, ImageCacheStatsTracker imageCacheStatsTracker) {
        this.mFileCache = fileCache;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mPooledByteStreams = pooledByteStreams;
        this.mReadExecutor = readExecutor;
        this.mWriteExecutor = writeExecutor;
        this.mImageCacheStatsTracker = imageCacheStatsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInStagingAreaAndFileCache(final CacheKey key) {
        EncodedImage encodedImage = this.mStagingArea.get(key);
        if (encodedImage != null) {
            encodedImage.close();
            FLog.v(TAG, "Found image for %s in staging area", key.getUriString());
            this.mImageCacheStatsTracker.onStagingAreaHit(key);
            return true;
        }
        FLog.v(TAG, "Did not find image for %s in staging area", key.getUriString());
        this.mImageCacheStatsTracker.onStagingAreaMiss(key);
        try {
            return this.mFileCache.hasKey(key);
        } catch (Exception unused) {
            return false;
        }
    }

    private j<Boolean> containsAsync(final CacheKey key) {
        try {
            final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_containsAsync");
            return j.e(new Callable<Boolean>() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                    try {
                        return Boolean.valueOf(BufferedDiskCache.this.checkInStagingAreaAndFileCache(key));
                    } finally {
                    }
                }
            }, this.mReadExecutor);
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache read for %s", key.getUriString());
            return j.C(e2);
        }
    }

    private j<EncodedImage> foundPinnedImage(CacheKey key, EncodedImage pinnedImage) {
        FLog.v(TAG, "Found image for %s in staging area", key.getUriString());
        this.mImageCacheStatsTracker.onStagingAreaHit(key);
        return j.D(pinnedImage);
    }

    private j<EncodedImage> getAsync(final CacheKey key, final AtomicBoolean isCancelled) {
        try {
            final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_getAsync");
            return j.e(new Callable<EncodedImage>() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                @Nullable
                public EncodedImage call() throws Exception {
                    Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                    try {
                        if (!isCancelled.get()) {
                            EncodedImage encodedImage = BufferedDiskCache.this.mStagingArea.get(key);
                            if (encodedImage != null) {
                                FLog.v(BufferedDiskCache.TAG, "Found image for %s in staging area", key.getUriString());
                                BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaHit(key);
                            } else {
                                FLog.v(BufferedDiskCache.TAG, "Did not find image for %s in staging area", key.getUriString());
                                BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaMiss(key);
                                try {
                                    PooledByteBuffer readFromDiskCache = BufferedDiskCache.this.readFromDiskCache(key);
                                    if (readFromDiskCache == null) {
                                        return null;
                                    }
                                    CloseableReference of = CloseableReference.of(readFromDiskCache);
                                    try {
                                        encodedImage = new EncodedImage(of);
                                    } finally {
                                        CloseableReference.closeSafely(of);
                                    }
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                            if (Thread.interrupted()) {
                                FLog.v(BufferedDiskCache.TAG, "Host thread was interrupted, decreasing reference count");
                                if (encodedImage != null) {
                                    encodedImage.close();
                                }
                                throw new InterruptedException();
                            }
                            return encodedImage;
                        }
                        throw new CancellationException();
                    } catch (Throwable th) {
                        try {
                            FrescoInstrumenter.markFailure(onBeforeSubmitWork, th);
                            throw th;
                        } finally {
                            FrescoInstrumenter.onEndWork(onBeginWork);
                        }
                    }
                }
            }, this.mReadExecutor);
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache read for %s", key.getUriString());
            return j.C(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public PooledByteBuffer readFromDiskCache(final CacheKey key) throws IOException {
        try {
            Class<?> cls = TAG;
            FLog.v(cls, "Disk cache read for %s", key.getUriString());
            BinaryResource resource = this.mFileCache.getResource(key);
            if (resource == null) {
                FLog.v(cls, "Disk cache miss for %s", key.getUriString());
                this.mImageCacheStatsTracker.onDiskCacheMiss(key);
                return null;
            }
            FLog.v(cls, "Found entry in disk cache for %s", key.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheHit(key);
            InputStream openStream = resource.openStream();
            PooledByteBuffer newByteBuffer = this.mPooledByteBufferFactory.newByteBuffer(openStream, (int) resource.size());
            openStream.close();
            FLog.v(cls, "Successful read from disk cache for %s", key.getUriString());
            return newByteBuffer;
        } catch (IOException e2) {
            FLog.w(TAG, e2, "Exception reading from cache for %s", key.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheGetFail(key);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeToDiskCache(final CacheKey key, final EncodedImage encodedImage) {
        Class<?> cls = TAG;
        FLog.v(cls, "About to write to disk-cache for key %s", key.getUriString());
        try {
            this.mFileCache.insert(key, new WriterCallback() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.7
                @Override // com.facebook.cache.common.WriterCallback
                public void write(OutputStream os) throws IOException {
                    InputStream inputStream = encodedImage.getInputStream();
                    Preconditions.checkNotNull(inputStream);
                    BufferedDiskCache.this.mPooledByteStreams.copy(inputStream, os);
                }
            });
            this.mImageCacheStatsTracker.onDiskCachePut(key);
            FLog.v(cls, "Successful disk-cache write for key %s", key.getUriString());
        } catch (IOException e2) {
            FLog.w(TAG, e2, "Failed to write to disk-cache for key %s", key.getUriString());
        }
    }

    public void addKeyForAsyncProbing(final CacheKey key) {
        Preconditions.checkNotNull(key);
        this.mFileCache.probe(key);
    }

    public j<Void> clearAll() {
        this.mStagingArea.clearAll();
        final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_clearAll");
        try {
            return j.e(new Callable<Void>() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.6
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                    try {
                        BufferedDiskCache.this.mStagingArea.clearAll();
                        BufferedDiskCache.this.mFileCache.clearAll();
                        return null;
                    } finally {
                    }
                }
            }, this.mWriteExecutor);
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache clear", new Object[0]);
            return j.C(e2);
        }
    }

    public j<Boolean> contains(final CacheKey key) {
        if (containsSync(key)) {
            return j.D(Boolean.TRUE);
        }
        return containsAsync(key);
    }

    public boolean containsSync(CacheKey key) {
        return this.mStagingArea.containsKey(key) || this.mFileCache.hasKeySync(key);
    }

    public boolean diskCheckSync(final CacheKey key) {
        if (containsSync(key)) {
            return true;
        }
        return checkInStagingAreaAndFileCache(key);
    }

    public j<EncodedImage> get(CacheKey key, AtomicBoolean isCancelled) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("BufferedDiskCache#get");
            }
            EncodedImage encodedImage = this.mStagingArea.get(key);
            if (encodedImage != null) {
                return foundPinnedImage(key, encodedImage);
            }
            j<EncodedImage> async = getAsync(key, isCancelled);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            return async;
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public long getSize() {
        return this.mFileCache.getSize();
    }

    public j<Void> probe(final CacheKey key) {
        Preconditions.checkNotNull(key);
        try {
            final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_probe");
            return j.e(new Callable<Void>() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.2
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                    try {
                        BufferedDiskCache.this.mFileCache.probe(key);
                        return null;
                    } finally {
                        FrescoInstrumenter.onEndWork(onBeginWork);
                    }
                }
            }, this.mWriteExecutor);
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache probe for %s", key.getUriString());
            return j.C(e2);
        }
    }

    public void put(final CacheKey key, EncodedImage encodedImage) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("BufferedDiskCache#put");
            }
            Preconditions.checkNotNull(key);
            Preconditions.checkArgument(Boolean.valueOf(EncodedImage.isValid(encodedImage)));
            this.mStagingArea.put(key, encodedImage);
            final EncodedImage cloneOrNull = EncodedImage.cloneOrNull(encodedImage);
            try {
                final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_putAsync");
                this.mWriteExecutor.execute(new Runnable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                        try {
                            BufferedDiskCache.this.writeToDiskCache(key, cloneOrNull);
                        } finally {
                        }
                    }
                });
            } catch (Exception e2) {
                FLog.w(TAG, e2, "Failed to schedule disk-cache write for %s", key.getUriString());
                this.mStagingArea.remove(key, encodedImage);
                EncodedImage.closeSafely(cloneOrNull);
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public j<Void> remove(final CacheKey key) {
        Preconditions.checkNotNull(key);
        this.mStagingArea.remove(key);
        try {
            final Object onBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_remove");
            return j.e(new Callable<Void>() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache.5
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Object onBeginWork = FrescoInstrumenter.onBeginWork(onBeforeSubmitWork, null);
                    try {
                        BufferedDiskCache.this.mStagingArea.remove(key);
                        BufferedDiskCache.this.mFileCache.remove(key);
                        return null;
                    } finally {
                    }
                }
            }, this.mWriteExecutor);
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache remove for %s", key.getUriString());
            return j.C(e2);
        }
    }
}
