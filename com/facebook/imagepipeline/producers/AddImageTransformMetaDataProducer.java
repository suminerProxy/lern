package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AddImageTransformMetaDataProducer implements Producer<EncodedImage> {
    private final Producer<EncodedImage> mInputProducer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AddImageTransformMetaDataConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public /* synthetic */ AddImageTransformMetaDataConsumer(Consumer consumer, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public /* bridge */ /* synthetic */ void onNewResultImpl(@Nullable Object newResult, int status) {
        }

        private AddImageTransformMetaDataConsumer(Consumer<EncodedImage> consumer) {
        }

        public void onNewResultImpl(@Nullable EncodedImage newResult, int status) {
        }
    }

    public AddImageTransformMetaDataProducer(Producer<EncodedImage> inputProducer) {
        this.mInputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext context) {
        this.mInputProducer.produceResults(new AddImageTransformMetaDataConsumer(consumer, null), context);
    }
}
