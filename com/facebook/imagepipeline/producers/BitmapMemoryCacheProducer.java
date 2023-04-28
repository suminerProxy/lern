package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.HasImageMetadata;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import com.tencent.bugly.idasc.Bugly;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BitmapMemoryCacheProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    private static final String ORIGIN_SUBCATEGORY = "pipe_bg";
    public static final String PRODUCER_NAME = "BitmapMemoryCacheProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;
    private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;

    public BitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<CloseableImage>> inputProducer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = inputProducer;
    }

    private static void maybeSetExtrasFromCloseableImage(HasImageMetadata imageWithMeta, ProducerContext producerContext) {
        producerContext.putExtras(imageWithMeta.getExtras());
    }

    public String getOriginSubcategory() {
        return ORIGIN_SUBCATEGORY;
    }

    public String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext) {
        boolean isTracing;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("BitmapMemoryCacheProducer#produceResults");
            }
            ProducerListener2 producerListener = producerContext.getProducerListener();
            producerListener.onProducerStart(producerContext, getProducerName());
            CacheKey bitmapCacheKey = this.mCacheKeyFactory.getBitmapCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
            CloseableReference<CloseableImage> closeableReference = producerContext.getImageRequest().isCacheEnabled(1) ? this.mMemoryCache.get(bitmapCacheKey) : null;
            if (closeableReference != null) {
                maybeSetExtrasFromCloseableImage(closeableReference.get(), producerContext);
                boolean isOfFullQuality = closeableReference.get().getQualityInfo().isOfFullQuality();
                if (isOfFullQuality) {
                    producerListener.onProducerFinishWithSuccess(producerContext, getProducerName(), producerListener.requiresExtraMap(producerContext, getProducerName()) ? ImmutableMap.of("cached_value_found", "true") : null);
                    producerListener.onUltimateProducerReached(producerContext, getProducerName(), true);
                    producerContext.putOriginExtra("memory_bitmap", getOriginSubcategory());
                    consumer.onProgressUpdate(1.0f);
                }
                consumer.onNewResult(closeableReference, BaseConsumer.simpleStatusForIsLast(isOfFullQuality));
                closeableReference.close();
                if (isOfFullQuality) {
                    if (isTracing) {
                        return;
                    }
                    return;
                }
            }
            if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                producerListener.onProducerFinishWithSuccess(producerContext, getProducerName(), producerListener.requiresExtraMap(producerContext, getProducerName()) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                producerListener.onUltimateProducerReached(producerContext, getProducerName(), false);
                producerContext.putOriginExtra("memory_bitmap", getOriginSubcategory());
                consumer.onNewResult(null, 1);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                    return;
                }
                return;
            }
            Consumer<CloseableReference<CloseableImage>> wrapConsumer = wrapConsumer(consumer, bitmapCacheKey, producerContext.getImageRequest().isCacheEnabled(2));
            producerListener.onProducerFinishWithSuccess(producerContext, getProducerName(), producerListener.requiresExtraMap(producerContext, getProducerName()) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("mInputProducer.produceResult");
            }
            this.mInputProducer.produceResults(wrapConsumer, producerContext);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public Consumer<CloseableReference<CloseableImage>> wrapConsumer(final Consumer<CloseableReference<CloseableImage>> consumer, final CacheKey cacheKey, final boolean isBitmapCacheEnabledForWrite) {
        return new DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>(this, consumer, cacheKey, isBitmapCacheEnabledForWrite) { // from class: com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer.1
            public final /* synthetic */ BitmapMemoryCacheProducer this$0;
            public final /* synthetic */ CacheKey val$cacheKey;
            public final /* synthetic */ boolean val$isBitmapCacheEnabledForWrite;

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
            }

            public void onNewResultImpl(@Nullable CloseableReference<CloseableImage> newResult, int status) {
            }
        };
    }
}
