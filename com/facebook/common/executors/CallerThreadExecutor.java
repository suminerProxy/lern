package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CallerThreadExecutor extends AbstractExecutorService {
    private static final CallerThreadExecutor sInstance = null;

    private CallerThreadExecutor() {
    }

    public static CallerThreadExecutor getInstance() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
    }
}
