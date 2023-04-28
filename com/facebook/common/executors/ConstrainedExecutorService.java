package com.facebook.common.executors;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstrainedExecutorService extends AbstractExecutorService {
    private static final Class<?> TAG = ConstrainedExecutorService.class;
    private final Executor mExecutor;
    private volatile int mMaxConcurrency;
    private final AtomicInteger mMaxQueueSize;
    private final String mName;
    private final AtomicInteger mPendingWorkers;
    private final Worker mTaskRunner;
    private final BlockingQueue<Runnable> mWorkQueue;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Worker implements Runnable {
        private Worker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) ConstrainedExecutorService.this.mWorkQueue.poll();
                if (runnable == null) {
                    FLog.v(ConstrainedExecutorService.TAG, "%s: Worker has nothing to run", ConstrainedExecutorService.this.mName);
                } else {
                    runnable.run();
                }
                int decrementAndGet = ConstrainedExecutorService.this.mPendingWorkers.decrementAndGet();
                if (!ConstrainedExecutorService.this.mWorkQueue.isEmpty()) {
                    ConstrainedExecutorService.this.startWorkerIfNeeded();
                } else {
                    FLog.v(ConstrainedExecutorService.TAG, "%s: worker finished; %d workers left", ConstrainedExecutorService.this.mName, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = ConstrainedExecutorService.this.mPendingWorkers.decrementAndGet();
                if (!ConstrainedExecutorService.this.mWorkQueue.isEmpty()) {
                    ConstrainedExecutorService.this.startWorkerIfNeeded();
                } else {
                    FLog.v(ConstrainedExecutorService.TAG, "%s: worker finished; %d workers left", ConstrainedExecutorService.this.mName, Integer.valueOf(decrementAndGet2));
                }
                throw th;
            }
        }
    }

    public ConstrainedExecutorService(String name, int maxConcurrency, Executor executor, BlockingQueue<Runnable> workQueue) {
        if (maxConcurrency > 0) {
            this.mName = name;
            this.mExecutor = executor;
            this.mMaxConcurrency = maxConcurrency;
            this.mWorkQueue = workQueue;
            this.mTaskRunner = new Worker();
            this.mPendingWorkers = new AtomicInteger(0);
            this.mMaxQueueSize = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    public static ConstrainedExecutorService newConstrainedExecutor(String name, int maxConcurrency, int queueSize, Executor executor) {
        return new ConstrainedExecutorService(name, maxConcurrency, executor, new LinkedBlockingQueue(queueSize));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWorkerIfNeeded() {
        int i2 = this.mPendingWorkers.get();
        while (i2 < this.mMaxConcurrency) {
            int i3 = i2 + 1;
            if (this.mPendingWorkers.compareAndSet(i2, i3)) {
                FLog.v(TAG, "%s: starting worker %d of %d", this.mName, Integer.valueOf(i3), Integer.valueOf(this.mMaxConcurrency));
                this.mExecutor.execute(this.mTaskRunner);
                return;
            }
            FLog.v(TAG, "%s: race in startWorkerIfNeeded; retrying", this.mName);
            i2 = this.mPendingWorkers.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.mWorkQueue.offer(runnable)) {
            int size = this.mWorkQueue.size();
            int i2 = this.mMaxQueueSize.get();
            if (size > i2 && this.mMaxQueueSize.compareAndSet(i2, size)) {
                FLog.v(TAG, "%s: max pending work in queue = %d", this.mName, Integer.valueOf(size));
            }
            startWorkerIfNeeded();
            return;
        }
        throw new RejectedExecutionException(this.mName + " queue is full, size=" + this.mWorkQueue.size());
    }

    public boolean isIdle() {
        return this.mWorkQueue.isEmpty() && this.mPendingWorkers.get() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
