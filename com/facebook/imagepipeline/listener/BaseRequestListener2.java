package com.facebook.imagepipeline.listener;

import androidx.annotation.NonNull;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BaseRequestListener2 implements RequestListener2 {
    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerEvent(@NonNull ProducerContext producerContext, @NonNull String producerName, @NonNull String eventName) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithCancellation(@NonNull ProducerContext producerContext, @NonNull String producerName, @Nullable Map<String, String> extraMap) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithFailure(@NonNull ProducerContext producerContext, String producerName, @Nullable Throwable t, @Nullable Map<String, String> extraMap) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithSuccess(@NonNull ProducerContext producerContext, @NonNull String producerName, @Nullable Map<String, String> extraMap) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerStart(@NonNull ProducerContext producerContext, @NonNull String producerName) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(@NonNull ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(@NonNull ProducerContext producerContext, @Nullable Throwable throwable) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(@NonNull ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(@NonNull ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onUltimateProducerReached(@NonNull ProducerContext producerContext, @NonNull String producerName, boolean successful) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public boolean requiresExtraMap(@NonNull ProducerContext producerContext, @NonNull String producerName) {
    }
}
