package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.Executor;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ExperimentalThreadHandoffProducerQueueImpl implements ThreadHandoffProducerQueue {
    private final Executor mExecutor;

    public ExperimentalThreadHandoffProducerQueueImpl(Executor executor) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void addToQueueOrExecute(Runnable runnable) {
        this.mExecutor.execute(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public boolean isQueueing() {
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void remove(Runnable runnable) {
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void startQueueing() {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void stopQueuing() {
        throw new UnsupportedOperationException();
    }
}
