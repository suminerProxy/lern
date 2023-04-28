package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import com.tencent.bugly.idasc.Bugly;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class EncodedMemoryCacheProducer implements Producer<EncodedImage> {
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "EncodedMemoryCacheProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final Producer<EncodedImage> mInputProducer;
    private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EncodedMemoryCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final boolean mEncodedCacheEnabled;
        private final boolean mIsEncodedCacheEnabledForWrite;
        private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
        private final CacheKey mRequestedCacheKey;

        public EncodedMemoryCacheConsumer(Consumer<EncodedImage> consumer, MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKey requestedCacheKey, boolean isEncodedCacheEnabledForWrite, boolean encodedCacheEnabled) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> inputProducer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("EncodedMemoryCacheProducer#produceResults");
            }
            ProducerListener2 producerListener = producerContext.getProducerListener();
            producerListener.onProducerStart(producerContext, PRODUCER_NAME);
            CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
            CloseableReference<PooledByteBuffer> closeableReference = producerContext.getImageRequest().isCacheEnabled(4) ? this.mMemoryCache.get(encodedCacheKey) : null;
            if (closeableReference != null) {
                EncodedImage encodedImage = new EncodedImage(closeableReference);
                try {
                    producerListener.onProducerFinishWithSuccess(producerContext, PRODUCER_NAME, producerListener.requiresExtraMap(producerContext, PRODUCER_NAME) ? ImmutableMap.of("cached_value_found", "true") : null);
                    producerListener.onUltimateProducerReached(producerContext, PRODUCER_NAME, true);
                    producerContext.putOriginExtra("memory_encoded");
                    consumer.onProgressUpdate(1.0f);
                    consumer.onNewResult(encodedImage, 1);
                    CloseableReference.closeSafely(closeableReference);
                } finally {
                    EncodedImage.closeSafely(encodedImage);
                }
            } else if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                producerListener.onProducerFinishWithSuccess(producerContext, PRODUCER_NAME, producerListener.requiresExtraMap(producerContext, PRODUCER_NAME) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                producerListener.onUltimateProducerReached(producerContext, PRODUCER_NAME, false);
                producerContext.putOriginExtra("memory_encoded", "nil-result");
                consumer.onNewResult(null, 1);
                CloseableReference.closeSafely(closeableReference);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            } else {
                EncodedMemoryCacheConsumer encodedMemoryCacheConsumer = new EncodedMemoryCacheConsumer(consumer, this.mMemoryCache, encodedCacheKey, producerContext.getImageRequest().isCacheEnabled(8), producerContext.getImagePipelineConfig().getExperiments().isEncodedCacheEnabled());
                producerListener.onProducerFinishWithSuccess(producerContext, PRODUCER_NAME, producerListener.requiresExtraMap(producerContext, PRODUCER_NAME) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                this.mInputProducer.produceResults(encodedMemoryCacheConsumer, producerContext);
                CloseableReference.closeSafely(closeableReference);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }
}
