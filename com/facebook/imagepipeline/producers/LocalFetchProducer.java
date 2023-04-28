package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Closeables;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LocalFetchProducer implements Producer<EncodedImage> {
    private final Executor mExecutor;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    public LocalFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory) {
        this.mExecutor = executor;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
    }

    public EncodedImage getByteBufferBackedEncodedImage(InputStream inputStream, int length) throws IOException {
        CloseableReference of;
        CloseableReference closeableReference = null;
        try {
            if (length <= 0) {
                of = CloseableReference.of(this.mPooledByteBufferFactory.newByteBuffer(inputStream));
            } else {
                of = CloseableReference.of(this.mPooledByteBufferFactory.newByteBuffer(inputStream, length));
            }
            closeableReference = of;
            return new EncodedImage(closeableReference);
        } finally {
            Closeables.closeQuietly(inputStream);
            CloseableReference.closeSafely(closeableReference);
        }
    }

    @Nullable
    public abstract EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException;

    public EncodedImage getEncodedImage(InputStream inputStream, int length) throws IOException {
        return getByteBufferBackedEncodedImage(inputStream, length);
    }

    public abstract String getProducerName();

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        ImageRequest imageRequest = producerContext.getImageRequest();
        producerContext.putOriginExtra("local", "fetch");
        StatefulProducerRunnable<EncodedImage> statefulProducerRunnable = new StatefulProducerRunnable<EncodedImage>(this, consumer, producerListener, producerContext, getProducerName(), imageRequest, producerListener, producerContext) { // from class: com.facebook.imagepipeline.producers.LocalFetchProducer.1
            public final /* synthetic */ LocalFetchProducer this$0;
            public final /* synthetic */ ImageRequest val$imageRequest;
            public final /* synthetic */ ProducerListener2 val$listener;
            public final /* synthetic */ ProducerContext val$producerContext;

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void disposeResult(Object result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public /* bridge */ /* synthetic */ Object getResult() throws Exception {
            }

            public void disposeResult(EncodedImage result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public EncodedImage getResult() throws Exception {
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks(this, statefulProducerRunnable) { // from class: com.facebook.imagepipeline.producers.LocalFetchProducer.2
            public final /* synthetic */ LocalFetchProducer this$0;
            public final /* synthetic */ StatefulProducerRunnable val$cancellableProducerRunnable;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
        this.mExecutor.execute(statefulProducerRunnable);
    }
}
