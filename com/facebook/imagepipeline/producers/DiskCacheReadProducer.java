package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import e.h;
import e.j;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DiskCacheReadProducer implements Producer<EncodedImage> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "DiskCacheProducer";
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    private final Producer<EncodedImage> mInputProducer;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;

    public DiskCacheReadProducer(BufferedDiskCache defaultBufferedDiskCache, BufferedDiskCache smallImageBufferedDiskCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> inputProducer) {
        this.mDefaultBufferedDiskCache = defaultBufferedDiskCache;
        this.mSmallImageBufferedDiskCache = smallImageBufferedDiskCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = inputProducer;
    }

    @Nullable
    @VisibleForTesting
    public static Map<String, String> getExtraMap(final ProducerListener2 listener, final ProducerContext producerContext, final boolean valueFound, final int sizeInBytes) {
        if (listener.requiresExtraMap(producerContext, PRODUCER_NAME)) {
            if (valueFound) {
                return ImmutableMap.of("cached_value_found", String.valueOf(valueFound), "encodedImageSize", String.valueOf(sizeInBytes));
            }
            return ImmutableMap.of("cached_value_found", String.valueOf(valueFound));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTaskCancelled(j<?> task) {
        return task.H() || (task.J() && (task.E() instanceof CancellationException));
    }

    private void maybeStartInputProducer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            producerContext.putOriginExtra("disk", "nil-result_read");
            consumer.onNewResult(null, 1);
            return;
        }
        this.mInputProducer.produceResults(consumer, producerContext);
    }

    private h<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        return new h<EncodedImage, Void>(this, producerContext.getProducerListener(), producerContext, consumer) { // from class: com.facebook.imagepipeline.producers.DiskCacheReadProducer.1
            public final /* synthetic */ DiskCacheReadProducer this$0;
            public final /* synthetic */ Consumer val$consumer;
            public final /* synthetic */ ProducerListener2 val$listener;
            public final /* synthetic */ ProducerContext val$producerContext;

            @Override // e.h
            public /* bridge */ /* synthetic */ Void then(j<EncodedImage> task) throws Exception {
            }

            @Override // e.h
            /* renamed from: then  reason: avoid collision after fix types in other method */
            public Void then2(j<EncodedImage> task) throws Exception {
            }
        };
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean isCancelled, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks(this, isCancelled) { // from class: com.facebook.imagepipeline.producers.DiskCacheReadProducer.2
            public final /* synthetic */ DiskCacheReadProducer this$0;
            public final /* synthetic */ AtomicBoolean val$isCancelled;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        if (!producerContext.getImageRequest().isCacheEnabled(16)) {
            maybeStartInputProducer(consumer, producerContext);
            return;
        }
        producerContext.getProducerListener().onProducerStart(producerContext, PRODUCER_NAME);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
        BufferedDiskCache bufferedDiskCache = imageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL ? this.mSmallImageBufferedDiskCache : this.mDefaultBufferedDiskCache;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bufferedDiskCache.get(encodedCacheKey, atomicBoolean).q(onFinishDiskReads(consumer, producerContext));
        subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
    }
}
