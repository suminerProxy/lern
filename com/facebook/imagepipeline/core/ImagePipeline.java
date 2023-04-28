package com.facebook.imagepipeline.core;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.facebook.cache.common.CacheKey;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.SimpleDataSource;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter;
import com.facebook.imagepipeline.datasource.ProducerToDataSourceAdapter;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.ForwardingRequestListener2;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.InternalRequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import e.h;
import e.j;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePipeline {
    private static final CancellationException PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
    private final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final CacheKeyFactory mCacheKeyFactory;
    @Nullable
    private final CallerContextVerifier mCallerContextVerifier;
    private final ImagePipelineConfigInterface mConfig;
    private final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    private AtomicLong mIdCounter = new AtomicLong();
    private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
    private final Supplier<Boolean> mLazyDataSource;
    private final BufferedDiskCache mMainBufferedDiskCache;
    private final ProducerSequenceFactory mProducerSequenceFactory;
    private final RequestListener mRequestListener;
    private final RequestListener2 mRequestListener2;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;
    private final Supplier<Boolean> mSuppressBitmapPrefetchingSupplier;
    private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$imagepipeline$request$ImageRequest$CacheChoice;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            $SwitchMap$com$facebook$imagepipeline$request$ImageRequest$CacheChoice = iArr;
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$request$ImageRequest$CacheChoice[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ImagePipeline(ProducerSequenceFactory producerSequenceFactory, Set<RequestListener> requestListeners, Set<RequestListener2> requestListener2s, Supplier<Boolean> isPrefetchEnabledSupplier, MemoryCache<CacheKey, CloseableImage> bitmapMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache, BufferedDiskCache mainBufferedDiskCache, BufferedDiskCache smallImageBufferedDiskCache, CacheKeyFactory cacheKeyFactory, ThreadHandoffProducerQueue threadHandoffProducerQueue, Supplier<Boolean> suppressBitmapPrefetchingSupplier, Supplier<Boolean> lazyDataSource, @Nullable CallerContextVerifier callerContextVerifier, ImagePipelineConfigInterface config) {
        this.mProducerSequenceFactory = producerSequenceFactory;
        this.mRequestListener = new ForwardingRequestListener(requestListeners);
        this.mRequestListener2 = new ForwardingRequestListener2(requestListener2s);
        this.mIsPrefetchEnabledSupplier = isPrefetchEnabledSupplier;
        this.mBitmapMemoryCache = bitmapMemoryCache;
        this.mEncodedMemoryCache = encodedMemoryCache;
        this.mMainBufferedDiskCache = mainBufferedDiskCache;
        this.mSmallImageBufferedDiskCache = smallImageBufferedDiskCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mThreadHandoffProducerQueue = threadHandoffProducerQueue;
        this.mSuppressBitmapPrefetchingSupplier = suppressBitmapPrefetchingSupplier;
        this.mLazyDataSource = lazyDataSource;
        this.mCallerContextVerifier = callerContextVerifier;
        this.mConfig = config;
    }

    private Predicate<CacheKey> predicateForUri(final Uri uri) {
        return new Predicate<CacheKey>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.8
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(CacheKey key) {
                return key.containsUri(uri);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>> submitFetchRequest(com.facebook.imagepipeline.producers.Producer<com.facebook.common.references.CloseableReference<T>> r15, com.facebook.imagepipeline.request.ImageRequest r16, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r17, @javax.annotation.Nullable java.lang.Object r18, @javax.annotation.Nullable com.facebook.imagepipeline.listener.RequestListener r19, @javax.annotation.Nullable java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.systrace.FrescoSystrace.beginSection(r0)
        Lc:
            com.facebook.imagepipeline.producers.InternalRequestListener r0 = new com.facebook.imagepipeline.producers.InternalRequestListener
            r3 = r16
            r2 = r19
            com.facebook.imagepipeline.listener.RequestListener r2 = r14.getRequestListenerForRequest(r3, r2)
            com.facebook.imagepipeline.listener.RequestListener2 r4 = r1.mRequestListener2
            r0.<init>(r2, r4)
            com.facebook.callercontext.CallerContextVerifier r2 = r1.mCallerContextVerifier
            r4 = 0
            r7 = r18
            if (r2 == 0) goto L25
            r2.verifyCallerContext(r7, r4)
        L25:
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r2 = r16.getLowestPermittedRequestLevel()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5 = r17
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r8 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.getMax(r2, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            com.facebook.imagepipeline.producers.SettableProducerContext r13 = new com.facebook.imagepipeline.producers.SettableProducerContext     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r5 = r14.generateUniqueFutureId()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 0
            boolean r2 = r16.getProgressiveRenderingEnabled()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L49
            android.net.Uri r2 = r16.getSourceUri()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = com.facebook.common.util.UriUtil.isNetworkUri(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L47
            goto L49
        L47:
            r10 = r4
            goto L4b
        L49:
            r2 = 1
            r10 = r2
        L4b:
            com.facebook.imagepipeline.common.Priority r11 = r16.getPriority()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            com.facebook.imagepipeline.core.ImagePipelineConfigInterface r12 = r1.mConfig     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r13
            r3 = r16
            r4 = r5
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r15
            com.facebook.datasource.DataSource r0 = com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter.create(r15, r13, r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r2 == 0) goto L6b
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
        L6b:
            return r0
        L6c:
            r0 = move-exception
            goto L7d
        L6e:
            r0 = move-exception
            com.facebook.datasource.DataSource r0 = com.facebook.datasource.DataSources.immediateFailedDataSource(r0)     // Catch: java.lang.Throwable -> L6c
            boolean r2 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r2 == 0) goto L7c
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
        L7c:
            return r0
        L7d:
            boolean r2 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r2 == 0) goto L86
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.ImagePipeline.submitFetchRequest(com.facebook.imagepipeline.producers.Producer, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, com.facebook.imagepipeline.listener.RequestListener, java.lang.String):com.facebook.datasource.DataSource");
    }

    private DataSource<Void> submitPrefetchRequest(Producer<Void> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable Object callerContext, Priority priority, @Nullable RequestListener requestListener) {
        InternalRequestListener internalRequestListener = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.mRequestListener2);
        CallerContextVerifier callerContextVerifier = this.mCallerContextVerifier;
        if (callerContextVerifier != null) {
            callerContextVerifier.verifyCallerContext(callerContext, true);
        }
        try {
            return ProducerToDataSourceAdapter.create(producerSequence, new SettableProducerContext(imageRequest, generateUniqueFutureId(), internalRequestListener, callerContext, ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), lowestPermittedRequestLevelOnSubmit), true, false, priority, this.mConfig), internalRequestListener);
        } catch (Exception e2) {
            return DataSources.immediateFailedDataSource(e2);
        }
    }

    public void clearCaches() {
        clearMemoryCaches();
        clearDiskCaches();
    }

    public void clearDiskCaches() {
        this.mMainBufferedDiskCache.clearAll();
        this.mSmallImageBufferedDiskCache.clearAll();
    }

    public void clearMemoryCaches() {
        Predicate<CacheKey> predicate = new Predicate<CacheKey>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.5
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(CacheKey key) {
                return true;
            }
        };
        this.mBitmapMemoryCache.removeAll(predicate);
        this.mEncodedMemoryCache.removeAll(predicate);
    }

    public void evictFromCache(final Uri uri) {
        evictFromMemoryCache(uri);
        evictFromDiskCache(uri);
    }

    public void evictFromDiskCache(final Uri uri) {
        evictFromDiskCache(ImageRequest.fromUri(uri));
    }

    public void evictFromMemoryCache(final Uri uri) {
        Predicate<CacheKey> predicateForUri = predicateForUri(uri);
        this.mBitmapMemoryCache.removeAll(predicateForUri);
        this.mEncodedMemoryCache.removeAll(predicateForUri);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, @Nullable Object callerContext) {
        return fetchDecodedImage(imageRequest, callerContext, ImageRequest.RequestLevel.FULL_FETCH);
    }

    public DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest imageRequest, @Nullable Object callerContext) {
        return fetchEncodedImage(imageRequest, callerContext, null);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache(ImageRequest imageRequest, @Nullable Object callerContext) {
        return fetchDecodedImage(imageRequest, callerContext, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    public String generateUniqueFutureId() {
        return String.valueOf(this.mIdCounter.getAndIncrement());
    }

    public MemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
        return this.mBitmapMemoryCache;
    }

    @Nullable
    public CacheKey getCacheKey(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ImagePipeline#getCacheKey");
        }
        CacheKeyFactory cacheKeyFactory = this.mCacheKeyFactory;
        CacheKey cacheKey = null;
        if (cacheKeyFactory != null && imageRequest != null) {
            if (imageRequest.getPostprocessor() != null) {
                cacheKey = cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, callerContext);
            } else {
                cacheKey = cacheKeyFactory.getBitmapCacheKey(imageRequest, callerContext);
            }
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return cacheKey;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.mCacheKeyFactory;
    }

    @Nullable
    public CloseableReference<CloseableImage> getCachedImage(@Nullable CacheKey cacheKey) {
        MemoryCache<CacheKey, CloseableImage> memoryCache = this.mBitmapMemoryCache;
        if (memoryCache == null || cacheKey == null) {
            return null;
        }
        CloseableReference<CloseableImage> closeableReference = memoryCache.get(cacheKey);
        if (closeableReference == null || closeableReference.get().getQualityInfo().isOfFullQuality()) {
            return closeableReference;
        }
        closeableReference.close();
        return null;
    }

    public RequestListener getCombinedRequestListener(@Nullable RequestListener listener) {
        if (listener == null) {
            return this.mRequestListener;
        }
        return new ForwardingRequestListener(this.mRequestListener, listener);
    }

    public ImagePipelineConfigInterface getConfig() {
        return this.mConfig;
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest imageRequest, @Nullable final Object callerContext, final ImageRequest.RequestLevel requestLevel) {
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.1
            public String toString() {
                return Objects.toStringHelper(this).add(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, imageRequest.getSourceUri()).toString();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest, callerContext, requestLevel);
            }
        };
    }

    public Supplier<DataSource<CloseableReference<PooledByteBuffer>>> getEncodedImageDataSourceSupplier(final ImageRequest imageRequest, @Nullable final Object callerContext) {
        return new Supplier<DataSource<CloseableReference<PooledByteBuffer>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.4
            public String toString() {
                return Objects.toStringHelper(this).add(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, imageRequest.getSourceUri()).toString();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<PooledByteBuffer>> get() {
                return ImagePipeline.this.fetchEncodedImage(imageRequest, callerContext);
            }
        };
    }

    public ProducerSequenceFactory getProducerSequenceFactory() {
        return this.mProducerSequenceFactory;
    }

    public RequestListener getRequestListenerForRequest(ImageRequest imageRequest, @Nullable RequestListener requestListener) {
        if (requestListener == null) {
            if (imageRequest.getRequestListener() == null) {
                return this.mRequestListener;
            }
            return new ForwardingRequestListener(this.mRequestListener, imageRequest.getRequestListener());
        } else if (imageRequest.getRequestListener() == null) {
            return new ForwardingRequestListener(this.mRequestListener, requestListener);
        } else {
            return new ForwardingRequestListener(this.mRequestListener, requestListener, imageRequest.getRequestListener());
        }
    }

    public long getUsedDiskCacheSize() {
        return this.mMainBufferedDiskCache.getSize() + this.mSmallImageBufferedDiskCache.getSize();
    }

    public boolean hasCachedImage(@Nullable CacheKey cacheKey) {
        MemoryCache<CacheKey, CloseableImage> memoryCache = this.mBitmapMemoryCache;
        if (memoryCache == null || cacheKey == null) {
            return false;
        }
        return memoryCache.contains((MemoryCache<CacheKey, CloseableImage>) cacheKey);
    }

    public boolean isInBitmapMemoryCache(final Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.mBitmapMemoryCache.contains(predicateForUri(uri));
    }

    public DataSource<Boolean> isInDiskCache(final Uri uri) {
        return isInDiskCache(ImageRequest.fromUri(uri));
    }

    public boolean isInDiskCacheSync(final Uri uri) {
        return isInDiskCacheSync(uri, ImageRequest.CacheChoice.SMALL) || isInDiskCacheSync(uri, ImageRequest.CacheChoice.DEFAULT);
    }

    public boolean isInEncodedMemoryCache(final Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.mEncodedMemoryCache.contains(predicateForUri(uri));
    }

    public Supplier<Boolean> isLazyDataSource() {
        return this.mLazyDataSource;
    }

    public boolean isPaused() {
        return this.mThreadHandoffProducerQueue.isQueueing();
    }

    public void pause() {
        this.mThreadHandoffProducerQueue.startQueueing();
    }

    public DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, @Nullable Object callerContext) {
        return prefetchToBitmapCache(imageRequest, callerContext, null);
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, @Nullable Object callerContext) {
        return prefetchToDiskCache(imageRequest, callerContext, Priority.MEDIUM);
    }

    public DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, @Nullable Object callerContext) {
        return prefetchToEncodedCache(imageRequest, callerContext, Priority.MEDIUM);
    }

    public void resume() {
        this.mThreadHandoffProducerQueue.stopQueuing();
    }

    public void evictFromDiskCache(final ImageRequest imageRequest) {
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        this.mMainBufferedDiskCache.remove(encodedCacheKey);
        this.mSmallImageBufferedDiskCache.remove(encodedCacheKey);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, @Nullable Object callerContext, @Nullable RequestListener requestListener) {
        return fetchDecodedImage(imageRequest, callerContext, ImageRequest.RequestLevel.FULL_FETCH, requestListener);
    }

    public DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest imageRequest, @Nullable Object callerContext, @Nullable RequestListener requestListener) {
        Preconditions.checkNotNull(imageRequest.getSourceUri());
        try {
            Producer<CloseableReference<PooledByteBuffer>> encodedImageProducerSequence = this.mProducerSequenceFactory.getEncodedImageProducerSequence(imageRequest);
            if (imageRequest.getResizeOptions() != null) {
                imageRequest = ImageRequestBuilder.fromRequest(imageRequest).setResizeOptions(null).build();
            }
            return submitFetchRequest(encodedImageProducerSequence, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, requestListener, null);
        } catch (Exception e2) {
            return DataSources.immediateFailedDataSource(e2);
        }
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest imageRequest, @Nullable final Object callerContext, final ImageRequest.RequestLevel requestLevel, @Nullable final RequestListener requestListener) {
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.2
            public String toString() {
                return Objects.toStringHelper(this).add(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, imageRequest.getSourceUri()).toString();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest, callerContext, requestLevel, requestListener);
            }
        };
    }

    public DataSource<Boolean> isInDiskCache(final ImageRequest imageRequest) {
        final CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        final SimpleDataSource create = SimpleDataSource.create();
        this.mMainBufferedDiskCache.contains(encodedCacheKey).u(new h<Boolean, j<Boolean>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // e.h
            public j<Boolean> then(j<Boolean> task) throws Exception {
                if (task.H() || task.J() || !task.F().booleanValue()) {
                    return ImagePipeline.this.mSmallImageBufferedDiskCache.contains(encodedCacheKey);
                }
                return j.D(Boolean.TRUE);
            }
        }).q(new h<Boolean, Void>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.6
            @Override // e.h
            public Void then(j<Boolean> task) throws Exception {
                create.setResult(Boolean.valueOf((task.H() || task.J() || !task.F().booleanValue()) ? false : true));
                return null;
            }
        });
        return create;
    }

    public DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, @Nullable Object callerContext, @Nullable RequestListener requestListener) {
        boolean booleanValue;
        Producer<Void> decodedImagePrefetchProducerSequence;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ImagePipeline#prefetchToBitmapCache");
            }
            if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> immediateFailedDataSource = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return immediateFailedDataSource;
            }
            try {
                Boolean shouldDecodePrefetches = imageRequest.shouldDecodePrefetches();
                if (shouldDecodePrefetches != null) {
                    booleanValue = !shouldDecodePrefetches.booleanValue();
                } else {
                    booleanValue = this.mSuppressBitmapPrefetchingSupplier.get().booleanValue();
                }
                if (booleanValue) {
                    decodedImagePrefetchProducerSequence = this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest);
                } else {
                    decodedImagePrefetchProducerSequence = this.mProducerSequenceFactory.getDecodedImagePrefetchProducerSequence(imageRequest);
                }
                DataSource<Void> submitPrefetchRequest = submitPrefetchRequest(decodedImagePrefetchProducerSequence, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, Priority.MEDIUM, requestListener);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return submitPrefetchRequest;
            } catch (Exception e2) {
                DataSource<Void> immediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return immediateFailedDataSource2;
            }
        } catch (Throwable th) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            throw th;
        }
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, @Nullable Object callerContext, @Nullable RequestListener requestListener) {
        return prefetchToDiskCache(imageRequest, callerContext, Priority.MEDIUM, requestListener);
    }

    public DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, @Nullable Object callerContext, @Nullable RequestListener requestListener) {
        return prefetchToEncodedCache(imageRequest, callerContext, Priority.MEDIUM, requestListener);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, @Nullable Object callerContext, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit) {
        return fetchDecodedImage(imageRequest, callerContext, lowestPermittedRequestLevelOnSubmit, null);
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest imageRequest, @Nullable final Object callerContext, final ImageRequest.RequestLevel requestLevel, @Nullable final RequestListener requestListener, @Nullable final String uiComponentId) {
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.3
            public String toString() {
                return Objects.toStringHelper(this).add(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, imageRequest.getSourceUri()).toString();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest, callerContext, requestLevel, requestListener, uiComponentId);
            }
        };
    }

    public boolean isInBitmapMemoryCache(final ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CloseableReference<CloseableImage> closeableReference = this.mBitmapMemoryCache.get(this.mCacheKeyFactory.getBitmapCacheKey(imageRequest, null));
        try {
            return CloseableReference.isValid(closeableReference);
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public boolean isInDiskCacheSync(final Uri uri, final ImageRequest.CacheChoice cacheChoice) {
        return isInDiskCacheSync(ImageRequestBuilder.newBuilderWithSource(uri).setCacheChoice(cacheChoice).build());
    }

    public boolean isInEncodedMemoryCache(final ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CloseableReference<PooledByteBuffer> closeableReference = this.mEncodedMemoryCache.get(this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null));
        try {
            return CloseableReference.isValid(closeableReference);
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, @Nullable Object callerContext, Priority priority) {
        return prefetchToDiskCache(imageRequest, callerContext, priority, null);
    }

    public DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, @Nullable Object callerContext, Priority priority) {
        return prefetchToEncodedCache(imageRequest, callerContext, priority, null);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, @Nullable Object callerContext, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable RequestListener requestListener) {
        return fetchDecodedImage(imageRequest, callerContext, lowestPermittedRequestLevelOnSubmit, requestListener, null);
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, @Nullable Object callerContext, Priority priority, @Nullable RequestListener requestListener) {
        if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
            return DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
        }
        try {
            return submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, priority, requestListener);
        } catch (Exception e2) {
            return DataSources.immediateFailedDataSource(e2);
        }
    }

    public DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, @Nullable Object callerContext, Priority priority, @Nullable RequestListener requestListener) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ImagePipeline#prefetchToEncodedCache");
            }
            if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> immediateFailedDataSource = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return immediateFailedDataSource;
            }
            try {
                DataSource<Void> submitPrefetchRequest = submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, priority, requestListener);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return submitPrefetchRequest;
            } catch (Exception e2) {
                DataSource<Void> immediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return immediateFailedDataSource2;
            }
        } catch (Throwable th) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            throw th;
        }
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, @Nullable Object callerContext, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable RequestListener requestListener, @Nullable String uiComponentId) {
        try {
            return submitFetchRequest(this.mProducerSequenceFactory.getDecodedImageProducerSequence(imageRequest), imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId);
        } catch (Exception e2) {
            return DataSources.immediateFailedDataSource(e2);
        }
    }

    public boolean isInDiskCacheSync(final ImageRequest imageRequest) {
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        int i2 = AnonymousClass9.$SwitchMap$com$facebook$imagepipeline$request$ImageRequest$CacheChoice[imageRequest.getCacheChoice().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            return this.mSmallImageBufferedDiskCache.diskCheckSync(encodedCacheKey);
        }
        return this.mMainBufferedDiskCache.diskCheckSync(encodedCacheKey);
    }

    public <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producerSequence, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ImagePipeline#submitFetchRequest");
        }
        try {
            try {
                DataSource<CloseableReference<T>> create = CloseableProducerToDataSourceAdapter.create(producerSequence, settableProducerContext, new InternalRequestListener(requestListener, this.mRequestListener2));
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return create;
            } catch (Exception e2) {
                DataSource<CloseableReference<T>> immediateFailedDataSource = DataSources.immediateFailedDataSource(e2);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return immediateFailedDataSource;
            }
        } catch (Throwable th) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            throw th;
        }
    }
}
