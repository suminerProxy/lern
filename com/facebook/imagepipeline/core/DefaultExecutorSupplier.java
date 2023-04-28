package com.facebook.imagepipeline.core;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {
    private static final int NUM_IO_BOUND_THREADS = 2;
    private static final int NUM_LIGHTWEIGHT_BACKGROUND_THREADS = 1;
    private final Executor mBackgroundExecutor;
    private final ScheduledExecutorService mBackgroundScheduledExecutorService;
    private final Executor mDecodeExecutor;
    private final Executor mIoBoundExecutor = Executors.newFixedThreadPool(2, new PriorityThreadFactory(10, "FrescoIoBoundExecutor", true));
    private final Executor mLightWeightBackgroundExecutor = Executors.newFixedThreadPool(1, new PriorityThreadFactory(10, "FrescoLightWeightBackgroundExecutor", true));

    public DefaultExecutorSupplier(int numCpuBoundThreads) {
        this.mDecodeExecutor = Executors.newFixedThreadPool(numCpuBoundThreads, new PriorityThreadFactory(10, "FrescoDecodeExecutor", true));
        this.mBackgroundExecutor = Executors.newFixedThreadPool(numCpuBoundThreads, new PriorityThreadFactory(10, "FrescoBackgroundExecutor", true));
        this.mBackgroundScheduledExecutorService = Executors.newScheduledThreadPool(numCpuBoundThreads, new PriorityThreadFactory(10, "FrescoBackgroundExecutor", true));
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forBackgroundTasks() {
        return this.mBackgroundExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forDecode() {
        return this.mDecodeExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forLightweightBackgroundTasks() {
        return this.mLightWeightBackgroundExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forLocalStorageRead() {
        return this.mIoBoundExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forLocalStorageWrite() {
        return this.mIoBoundExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public Executor forThumbnailProducer() {
        return this.mIoBoundExecutor;
    }

    @Override // com.facebook.imagepipeline.core.ExecutorSupplier
    public ScheduledExecutorService scheduledExecutorServiceForBackgroundTasks() {
        return this.mBackgroundScheduledExecutorService;
    }
}
