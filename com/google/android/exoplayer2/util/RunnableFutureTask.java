package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    private final Object cancelLock;
    private boolean canceled;
    @Nullable
    private Exception exception;
    private final ConditionVariable finished;
    @Nullable
    private R result;
    private final ConditionVariable started;
    @Nullable
    private Thread workThread;

    @UnknownNull
    private R getResult() throws ExecutionException {
    }

    public final void blockUntilFinished() {
    }

    public final void blockUntilStarted() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean interruptIfRunning) {
    }

    public void cancelWork() {
    }

    @UnknownNull
    public abstract R doWork() throws Exception;

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
    }
}
