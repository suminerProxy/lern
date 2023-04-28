package com.facebook.imagepipeline.producers;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ThreadHandoffProducerQueue {
    void addToQueueOrExecute(Runnable runnable);

    boolean isQueueing();

    void remove(Runnable runnable);

    void startQueueing();

    void stopQueuing();
}
