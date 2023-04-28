package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DelayProducer implements Producer<CloseableReference<CloseableImage>> {
    @Nullable
    private final ScheduledExecutorService mBackgroundTasksExecutor;
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;

    public DelayProducer(final Producer<CloseableReference<CloseableImage>> inputProducer, @Nullable final ScheduledExecutorService backgroundTasksExecutor) {
        this.mInputProducer = inputProducer;
        this.mBackgroundTasksExecutor = backgroundTasksExecutor;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext context) {
        ImageRequest imageRequest = context.getImageRequest();
        ScheduledExecutorService scheduledExecutorService = this.mBackgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable(this, consumer, context) { // from class: com.facebook.imagepipeline.producers.DelayProducer.1
                public final /* synthetic */ DelayProducer this$0;
                public final /* synthetic */ Consumer val$consumer;
                public final /* synthetic */ ProducerContext val$context;

                @Override // java.lang.Runnable
                public void run() {
                }
            }, imageRequest.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.mInputProducer.produceResults(consumer, context);
        }
    }
}
