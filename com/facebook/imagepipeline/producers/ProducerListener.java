package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ProducerListener {
    void onProducerEvent(String requestId, String producerName, String eventName);

    void onProducerFinishWithCancellation(String requestId, String producerName, @Nullable Map<String, String> extraMap);

    void onProducerFinishWithFailure(String requestId, String producerName, Throwable t, @Nullable Map<String, String> extraMap);

    void onProducerFinishWithSuccess(String requestId, String producerName, @Nullable Map<String, String> extraMap);

    void onProducerStart(String requestId, String producerName);

    void onUltimateProducerReached(String requestId, String producerName, boolean successful);

    boolean requiresExtraMap(String requestId);
}
