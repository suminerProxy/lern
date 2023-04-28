package com.facebook.imagepipeline.producers;

import android.os.Looper;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.instrumentation.FrescoInstrumenter;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ThreadHandoffProducer<T> implements Producer<T> {
    public static final String PRODUCER_NAME = "BackgroundThreadHandoffProducer";
    private final Producer<T> mInputProducer;
    private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    public ThreadHandoffProducer(final Producer<T> inputProducer, final ThreadHandoffProducerQueue inputThreadHandoffProducerQueue) {
        this.mInputProducer = (Producer) Preconditions.checkNotNull(inputProducer);
        this.mThreadHandoffProducerQueue = inputThreadHandoffProducerQueue;
    }

    @Nullable
    private static String getInstrumentationTag(ProducerContext context) {
        if (FrescoInstrumenter.isTracing()) {
            return "ThreadHandoffProducer_produceResults_" + context.getId();
        }
        return null;
    }

    private static boolean shouldRunImmediately(ProducerContext context) {
        return context.getImagePipelineConfig().getExperiments().handoffOnUiThreadOnly() && Looper.getMainLooper().getThread() != Thread.currentThread();
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<T> consumer, final ProducerContext context) {
        boolean isTracing;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("ThreadHandoffProducer#produceResults");
            }
            ProducerListener2 producerListener = context.getProducerListener();
            if (shouldRunImmediately(context)) {
                producerListener.onProducerStart(context, PRODUCER_NAME);
                producerListener.onProducerFinishWithSuccess(context, PRODUCER_NAME, null);
                this.mInputProducer.produceResults(consumer, context);
                if (isTracing) {
                    return;
                }
                return;
            }
            StatefulProducerRunnable<T> statefulProducerRunnable = new StatefulProducerRunnable<T>(this, consumer, producerListener, context, PRODUCER_NAME, producerListener, context, consumer) { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer.1
                public final /* synthetic */ ThreadHandoffProducer this$0;
                public final /* synthetic */ Consumer val$consumer;
                public final /* synthetic */ ProducerContext val$context;
                public final /* synthetic */ ProducerListener2 val$producerListener;

                @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                public void disposeResult(@Nullable T ignored) {
                }

                @Override // com.facebook.common.executors.StatefulRunnable
                @Nullable
                public T getResult() throws Exception {
                }

                @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                public void onSuccess(@Nullable T ignored) {
                }
            };
            context.addCallbacks(new BaseProducerContextCallbacks(this, statefulProducerRunnable) { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer.2
                public final /* synthetic */ ThreadHandoffProducer this$0;
                public final /* synthetic */ StatefulProducerRunnable val$statefulRunnable;

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onCancellationRequested() {
                }
            });
            this.mThreadHandoffProducerQueue.addToQueueOrExecute(FrescoInstrumenter.decorateRunnable(statefulProducerRunnable, getInstrumentationTag(context)));
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }
}
