package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SwallowResultProducer<T> implements Producer<Void> {
    private final Producer<T> mInputProducer;

    public SwallowResultProducer(Producer<T> inputProducer) {
        this.mInputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<Void> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new DelegatingConsumer<T, Void>(this, consumer) { // from class: com.facebook.imagepipeline.producers.SwallowResultProducer.1
            public final /* synthetic */ SwallowResultProducer this$0;

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onNewResultImpl(@Nullable T newResult, int status) {
            }
        }, producerContext);
    }
}
