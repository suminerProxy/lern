package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ThumbnailBranchProducer implements Producer<EncodedImage> {
    private final ThumbnailProducer<EncodedImage>[] mThumbnailProducers;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ThumbnailConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final ProducerContext mProducerContext;
        private final int mProducerIndex;
        @Nullable
        private final ResizeOptions mResizeOptions;
        public final /* synthetic */ ThumbnailBranchProducer this$0;

        public ThumbnailConsumer(final ThumbnailBranchProducer this$0, final Consumer<EncodedImage> consumer, final ProducerContext producerContext, int producerIndex) {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable t) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public ThumbnailBranchProducer(ThumbnailProducer<EncodedImage>... thumbnailProducers) {
        ThumbnailProducer<EncodedImage>[] thumbnailProducerArr = (ThumbnailProducer[]) Preconditions.checkNotNull(thumbnailProducers);
        this.mThumbnailProducers = thumbnailProducerArr;
        Preconditions.checkElementIndex(0, thumbnailProducerArr.length);
    }

    private int findFirstProducerForSize(int startIndex, @Nullable ResizeOptions resizeOptions) {
        while (true) {
            ThumbnailProducer<EncodedImage>[] thumbnailProducerArr = this.mThumbnailProducers;
            if (startIndex >= thumbnailProducerArr.length) {
                return -1;
            }
            if (thumbnailProducerArr[startIndex].canProvideImageForSize(resizeOptions)) {
                return startIndex;
            }
            startIndex++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean produceResultsFromThumbnailProducer(int startIndex, Consumer<EncodedImage> consumer, ProducerContext context) {
        int findFirstProducerForSize = findFirstProducerForSize(startIndex, context.getImageRequest().getResizeOptions());
        if (findFirstProducerForSize == -1) {
            return false;
        }
        this.mThumbnailProducers[findFirstProducerForSize].produceResults(new ThumbnailConsumer(this, consumer, context, findFirstProducerForSize), context);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext context) {
        if (context.getImageRequest().getResizeOptions() == null) {
            consumer.onNewResult(null, 1);
        } else if (produceResultsFromThumbnailProducer(0, consumer, context)) {
        } else {
            consumer.onNewResult(null, 1);
        }
    }
}
