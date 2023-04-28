package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class StatefulProducerRunnable<T> extends StatefulRunnable<T> {
    private final Consumer<T> mConsumer;
    private final ProducerContext mProducerContext;
    private final ProducerListener2 mProducerListener;
    private final String mProducerName;

    public StatefulProducerRunnable(Consumer<T> consumer, ProducerListener2 producerListener, ProducerContext producerContext, String producerName) {
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public abstract void disposeResult(@Nullable T result);

    @Nullable
    public Map<String, String> getExtraMapOnCancellation() {
    }

    @Nullable
    public Map<String, String> getExtraMapOnFailure(Exception exception) {
    }

    @Nullable
    public Map<String, String> getExtraMapOnSuccess(@Nullable T result) {
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onCancellation() {
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onFailure(Exception e2) {
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onSuccess(@Nullable T result) {
    }
}
