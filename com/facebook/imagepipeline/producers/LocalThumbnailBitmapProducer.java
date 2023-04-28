package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@RequiresApi(29)
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalThumbnailBitmapProducer implements Producer<CloseableReference<CloseableImage>> {
    @VisibleForTesting
    public static final String CREATED_THUMBNAIL = "createdThumbnail";
    public static final String PRODUCER_NAME = "LocalThumbnailBitmapProducer";
    private final ContentResolver mContentResolver;
    private final Executor mExecutor;

    public LocalThumbnailBitmapProducer(Executor executor, ContentResolver contentResolver) {
        this.mExecutor = executor;
        this.mContentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<CloseableReference<CloseableImage>> consumer, final ProducerContext context) {
        ProducerListener2 producerListener = context.getProducerListener();
        ImageRequest imageRequest = context.getImageRequest();
        context.putOriginExtra("local", "thumbnail_bitmap");
        StatefulProducerRunnable<CloseableReference<CloseableImage>> statefulProducerRunnable = new StatefulProducerRunnable<CloseableReference<CloseableImage>>(this, consumer, producerListener, context, PRODUCER_NAME, producerListener, context, imageRequest, new CancellationSignal()) { // from class: com.facebook.imagepipeline.producers.LocalThumbnailBitmapProducer.1
            public final /* synthetic */ LocalThumbnailBitmapProducer this$0;
            public final /* synthetic */ CancellationSignal val$cancellationSignal;
            public final /* synthetic */ ProducerContext val$context;
            public final /* synthetic */ ImageRequest val$imageRequest;
            public final /* synthetic */ ProducerListener2 val$listener;

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void disposeResult(Object result) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable
            public /* bridge */ /* synthetic */ Map getExtraMapOnSuccess(@Nullable final CloseableReference<CloseableImage> result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public /* bridge */ /* synthetic */ Object getResult() throws Exception {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onCancellation() {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onFailure(Exception e2) {
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public /* bridge */ /* synthetic */ void onSuccess(@Nullable Object result) {
            }

            public void disposeResult(CloseableReference<CloseableImage> result) {
            }

            /* renamed from: getExtraMapOnSuccess  reason: avoid collision after fix types in other method */
            public Map<String, String> getExtraMapOnSuccess2(@Nullable final CloseableReference<CloseableImage> result) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            @Nullable
            public CloseableReference<CloseableImage> getResult() throws IOException {
            }

            public void onSuccess(@Nullable CloseableReference<CloseableImage> result) {
            }
        };
        context.addCallbacks(new BaseProducerContextCallbacks(this, statefulProducerRunnable) { // from class: com.facebook.imagepipeline.producers.LocalThumbnailBitmapProducer.2
            public final /* synthetic */ LocalThumbnailBitmapProducer this$0;
            public final /* synthetic */ StatefulProducerRunnable val$cancellableProducerRunnable;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
        this.mExecutor.execute(statefulProducerRunnable);
    }
}
