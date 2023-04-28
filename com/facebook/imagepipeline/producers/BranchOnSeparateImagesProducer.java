package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BranchOnSeparateImagesProducer implements Producer<EncodedImage> {
    private final Producer<EncodedImage> mInputProducer1;
    private final Producer<EncodedImage> mInputProducer2;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class OnFirstImageConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private ProducerContext mProducerContext;
        public final /* synthetic */ BranchOnSeparateImagesProducer this$0;

        public /* synthetic */ OnFirstImageConsumer(BranchOnSeparateImagesProducer branchOnSeparateImagesProducer, Consumer consumer, ProducerContext producerContext, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(@Nullable Throwable t) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        private OnFirstImageConsumer(final BranchOnSeparateImagesProducer this$0, Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public BranchOnSeparateImagesProducer(Producer<EncodedImage> inputProducer1, Producer<EncodedImage> inputProducer2) {
        this.mInputProducer1 = inputProducer1;
        this.mInputProducer2 = inputProducer2;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext context) {
        this.mInputProducer1.produceResults(new OnFirstImageConsumer(this, consumer, context, null), context);
    }
}
