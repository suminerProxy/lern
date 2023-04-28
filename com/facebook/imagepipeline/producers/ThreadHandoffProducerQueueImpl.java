package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ThreadHandoffProducerQueueImpl implements ThreadHandoffProducerQueue {
    private final Executor mExecutor;
    private boolean mQueueing = false;
    private final Deque<Runnable> mRunnableList = new ArrayDeque();

    public ThreadHandoffProducerQueueImpl(Executor executor) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    private void execInQueue() {
        while (!this.mRunnableList.isEmpty()) {
            this.mExecutor.execute(this.mRunnableList.pop());
        }
        this.mRunnableList.clear();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void addToQueueOrExecute(Runnable runnable) {
        if (this.mQueueing) {
            this.mRunnableList.add(runnable);
        } else {
            this.mExecutor.execute(runnable);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized boolean isQueueing() {
        return this.mQueueing;
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void remove(Runnable runnable) {
        this.mRunnableList.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void startQueueing() {
        this.mQueueing = true;
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void stopQueuing() {
        this.mQueueing = false;
        execInQueue();
    }
}
