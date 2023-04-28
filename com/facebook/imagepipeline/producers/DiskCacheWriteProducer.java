package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DiskCacheWriteProducer implements Producer<EncodedImage> {
    @VisibleForTesting
    public static final String PRODUCER_NAME = "DiskCacheWriteProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    private final Producer<EncodedImage> mInputProducer;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DiskCacheWriteConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final CacheKeyFactory mCacheKeyFactory;
        private final BufferedDiskCache mDefaultBufferedDiskCache;
        private final ProducerContext mProducerContext;
        private final BufferedDiskCache mSmallImageBufferedDiskCache;

        public /* synthetic */ DiskCacheWriteConsumer(Consumer consumer, ProducerContext producerContext, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        private DiskCacheWriteConsumer(final Consumer<EncodedImage> consumer, final ProducerContext producerContext, final BufferedDiskCache defaultBufferedDiskCache, final BufferedDiskCache smallImageBufferedDiskCache, final CacheKeyFactory cacheKeyFactory) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public DiskCacheWriteProducer(BufferedDiskCache defaultBufferedDiskCache, BufferedDiskCache smallImageBufferedDiskCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> inputProducer) {
        this.mDefaultBufferedDiskCache = defaultBufferedDiskCache;
        this.mSmallImageBufferedDiskCache = smallImageBufferedDiskCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = inputProducer;
    }

    private void maybeStartInputProducer(Consumer<EncodedImage> consumerOfDiskCacheWriteProducer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            producerContext.putOriginExtra("disk", "nil-result_write");
            consumerOfDiskCacheWriteProducer.onNewResult(null, 1);
            return;
        }
        if (producerContext.getImageRequest().isCacheEnabled(32)) {
            consumerOfDiskCacheWriteProducer = new DiskCacheWriteConsumer(consumerOfDiskCacheWriteProducer, producerContext, this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory, null);
        }
        this.mInputProducer.produceResults(consumerOfDiskCacheWriteProducer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        maybeStartInputProducer(consumer, producerContext);
    }
}
