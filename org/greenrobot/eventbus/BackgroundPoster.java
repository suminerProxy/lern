package org.greenrobot.eventbus;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class BackgroundPoster implements Runnable, Poster {
    private final EventBus eventBus;
    private volatile boolean executorRunning;
    private final PendingPostQueue queue;

    public BackgroundPoster(EventBus eventBus) {
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(Subscription subscription, Object obj) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
