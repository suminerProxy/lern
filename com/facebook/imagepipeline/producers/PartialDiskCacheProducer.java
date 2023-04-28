package com.facebook.imagepipeline.producers;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import e.h;
import e.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PartialDiskCacheProducer implements Producer<EncodedImage> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "PartialDiskCacheProducer";
    private final ByteArrayPool mByteArrayPool;
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    private final Producer<EncodedImage> mInputProducer;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PartialDiskCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private static final int READ_SIZE = 16384;
        private final ByteArrayPool mByteArrayPool;
        private final BufferedDiskCache mDefaultBufferedDiskCache;
        private final boolean mIsDiskCacheEnabledForWrite;
        @Nullable
        private final EncodedImage mPartialEncodedImageFromCache;
        private final CacheKey mPartialImageCacheKey;
        private final PooledByteBufferFactory mPooledByteBufferFactory;

        public /* synthetic */ PartialDiskCacheConsumer(Consumer consumer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, EncodedImage encodedImage, boolean z, AnonymousClass1 anonymousClass1) {
        }

        private void copy(InputStream from, OutputStream to, int length) throws IOException {
        }

        private PooledByteBufferOutputStream merge(EncodedImage initialData, EncodedImage remainingData) throws IOException {
        }

        private void sendFinalResultToConsumer(PooledByteBufferOutputStream pooledOutputStream) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        private PartialDiskCacheConsumer(final Consumer<EncodedImage> consumer, final BufferedDiskCache defaultBufferedDiskCache, final CacheKey partialImageCacheKey, final PooledByteBufferFactory pooledByteBufferFactory, final ByteArrayPool byteArrayPool, @Nullable final EncodedImage partialEncodedImageFromCache, final boolean isDiskCacheEnabledForWrite) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public PartialDiskCacheProducer(BufferedDiskCache defaultBufferedDiskCache, CacheKeyFactory cacheKeyFactory, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, Producer<EncodedImage> inputProducer) {
        this.mDefaultBufferedDiskCache = defaultBufferedDiskCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mByteArrayPool = byteArrayPool;
        this.mInputProducer = inputProducer;
    }

    private static Uri createUriForPartialCacheKey(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
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

    private h<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> consumer, final ProducerContext producerContext, final CacheKey partialImageCacheKey) {
        return new h<EncodedImage, Void>(this, producerContext.getProducerListener(), producerContext, consumer, partialImageCacheKey) { // from class: com.facebook.imagepipeline.producers.PartialDiskCacheProducer.1
            public final /* synthetic */ PartialDiskCacheProducer this$0;
            public final /* synthetic */ Consumer val$consumer;
            public final /* synthetic */ ProducerListener2 val$listener;
            public final /* synthetic */ CacheKey val$partialImageCacheKey;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void startInputProducer(Consumer<EncodedImage> consumerOfPartialDiskCacheProducer, ProducerContext producerContext, CacheKey partialImageCacheKey, @Nullable EncodedImage partialResultFromCache) {
        this.mInputProducer.produceResults(new PartialDiskCacheConsumer(consumerOfPartialDiskCacheProducer, this.mDefaultBufferedDiskCache, partialImageCacheKey, this.mPooledByteBufferFactory, this.mByteArrayPool, partialResultFromCache, producerContext.getImageRequest().isCacheEnabled(32), null), producerContext);
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean isCancelled, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks(this, isCancelled) { // from class: com.facebook.imagepipeline.producers.PartialDiskCacheProducer.2
            public final /* synthetic */ PartialDiskCacheProducer this$0;
            public final /* synthetic */ AtomicBoolean val$isCancelled;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        boolean isCacheEnabled = producerContext.getImageRequest().isCacheEnabled(16);
        ProducerListener2 producerListener = producerContext.getProducerListener();
        producerListener.onProducerStart(producerContext, PRODUCER_NAME);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, createUriForPartialCacheKey(imageRequest), producerContext.getCallerContext());
        if (!isCacheEnabled) {
            producerListener.onProducerFinishWithSuccess(producerContext, PRODUCER_NAME, getExtraMap(producerListener, producerContext, false, 0));
            startInputProducer(consumer, producerContext, encodedCacheKey, null);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mDefaultBufferedDiskCache.get(encodedCacheKey, atomicBoolean).q(onFinishDiskReads(consumer, producerContext, encodedCacheKey));
        subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
    }
}
