package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BitmapMemoryCacheGetProducer extends BitmapMemoryCacheProducer {
    private static final String ORIGIN_SUBCATEGORY = "pipe_ui";
    public static final String PRODUCER_NAME = "BitmapMemoryCacheGetProducer";

    public BitmapMemoryCacheGetProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<CloseableImage>> inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    public String getOriginSubcategory() {
        return ORIGIN_SUBCATEGORY;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    public String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    public Consumer<CloseableReference<CloseableImage>> wrapConsumer(final Consumer<CloseableReference<CloseableImage>> consumer, final CacheKey cacheKey, boolean isMemoryCacheEnabled) {
        return consumer;
    }
}
