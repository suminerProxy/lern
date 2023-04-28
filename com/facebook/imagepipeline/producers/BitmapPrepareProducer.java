package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BitmapPrepareProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String PRODUCER_NAME = "BitmapPrepareProducer";
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;
    private final int mMaxBitmapSizeBytes;
    private final int mMinBitmapSizeBytes;
    private final boolean mPreparePrefetch;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BitmapPrepareConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        private final int mMaxBitmapSizeBytes;
        private final int mMinBitmapSizeBytes;

        public BitmapPrepareConsumer(Consumer<CloseableReference<CloseableImage>> consumer, int minBitmapSizeBytes, int maxBitmapSizeBytes) {
        }

        private void internalPrepareBitmap(@Nullable CloseableReference<CloseableImage> newResult) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable CloseableReference<CloseableImage> newResult, int status) {
        }
    }

    public BitmapPrepareProducer(final Producer<CloseableReference<CloseableImage>> inputProducer, int minBitmapSizeBytes, int maxBitmapSizeBytes, boolean preparePrefetch) {
        Preconditions.checkArgument(Boolean.valueOf(minBitmapSizeBytes <= maxBitmapSizeBytes));
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
        this.mMinBitmapSizeBytes = minBitmapSizeBytes;
        this.mMaxBitmapSizeBytes = maxBitmapSizeBytes;
        this.mPreparePrefetch = preparePrefetch;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext producerContext) {
        if (producerContext.isPrefetch() && !this.mPreparePrefetch) {
            this.mInputProducer.produceResults(consumer, producerContext);
        } else {
            this.mInputProducer.produceResults(new BitmapPrepareConsumer(consumer, this.mMinBitmapSizeBytes, this.mMaxBitmapSizeBytes), producerContext);
        }
    }
}
