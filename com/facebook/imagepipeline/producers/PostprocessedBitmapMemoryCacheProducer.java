package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.infer.annotation.Nullsafe;
import com.tencent.bugly.idasc.Bugly;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PostprocessedBitmapMemoryCacheProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String PRODUCER_NAME = "PostprocessedBitmapMemoryCacheProducer";
    @VisibleForTesting
    public static final String VALUE_FOUND = "cached_value_found";
    private final CacheKeyFactory mCacheKeyFactory;
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;
    private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CachedPostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        private final CacheKey mCacheKey;
        private final boolean mIsBitmapCacheEnabledForWrite;
        private final boolean mIsRepeatedProcessor;
        private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;

        public CachedPostprocessorConsumer(final Consumer<CloseableReference<CloseableImage>> consumer, final CacheKey cacheKey, final boolean isRepeatedProcessor, final MemoryCache<CacheKey, CloseableImage> memoryCache, boolean isBitmapCacheEnabledForWrite) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable CloseableReference<CloseableImage> newResult, int status) {
        }
    }

    public PostprocessedBitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<CloseableImage>> inputProducer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = inputProducer;
    }

    public String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        ImageRequest imageRequest = producerContext.getImageRequest();
        Object callerContext = producerContext.getCallerContext();
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null && postprocessor.getPostprocessorCacheKey() != null) {
            producerListener.onProducerStart(producerContext, getProducerName());
            CacheKey postprocessedBitmapCacheKey = this.mCacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, callerContext);
            CloseableReference<CloseableImage> closeableReference = producerContext.getImageRequest().isCacheEnabled(1) ? this.mMemoryCache.get(postprocessedBitmapCacheKey) : null;
            if (closeableReference != null) {
                producerListener.onProducerFinishWithSuccess(producerContext, getProducerName(), producerListener.requiresExtraMap(producerContext, getProducerName()) ? ImmutableMap.of("cached_value_found", "true") : null);
                producerListener.onUltimateProducerReached(producerContext, PRODUCER_NAME, true);
                producerContext.putOriginExtra("memory_bitmap", "postprocessed");
                consumer.onProgressUpdate(1.0f);
                consumer.onNewResult(closeableReference, 1);
                closeableReference.close();
                return;
            }
            CachedPostprocessorConsumer cachedPostprocessorConsumer = new CachedPostprocessorConsumer(consumer, postprocessedBitmapCacheKey, postprocessor instanceof RepeatedPostprocessor, this.mMemoryCache, producerContext.getImageRequest().isCacheEnabled(2));
            producerListener.onProducerFinishWithSuccess(producerContext, getProducerName(), producerListener.requiresExtraMap(producerContext, getProducerName()) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
            this.mInputProducer.produceResults(cachedPostprocessorConsumer, producerContext);
            return;
        }
        this.mInputProducer.produceResults(consumer, producerContext);
    }
}
