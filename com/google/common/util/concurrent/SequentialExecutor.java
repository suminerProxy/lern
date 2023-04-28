package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SequentialExecutor implements Executor {
    private static final Logger log = null;
    private final Executor executor;
    @GuardedBy("queue")
    private final Deque<Runnable> queue;
    private final QueueWorker worker;
    @GuardedBy("queue")
    private long workerRunCount;
    @GuardedBy("queue")
    private WorkerRunningState workerRunningState;

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SequentialExecutor this$0;
        public final /* synthetic */ Runnable val$task;

        public AnonymousClass1(SequentialExecutor sequentialExecutor, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class QueueWorker implements Runnable {
        public final /* synthetic */ SequentialExecutor this$0;

        private QueueWorker(SequentialExecutor sequentialExecutor) {
        }

        private void workOnQueue() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ QueueWorker(SequentialExecutor sequentialExecutor, AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WorkerRunningState {
        private static final /* synthetic */ WorkerRunningState[] $VALUES = null;
        public static final WorkerRunningState IDLE = null;
        public static final WorkerRunningState QUEUED = null;
        public static final WorkerRunningState QUEUING = null;
        public static final WorkerRunningState RUNNING = null;

        private WorkerRunningState(String str, int i2) {
        }

        public static WorkerRunningState valueOf(String str) {
        }

        public static WorkerRunningState[] values() {
        }
    }

    public SequentialExecutor(Executor executor) {
    }

    public static /* synthetic */ Deque access$100(SequentialExecutor sequentialExecutor) {
    }

    public static /* synthetic */ WorkerRunningState access$200(SequentialExecutor sequentialExecutor) {
    }

    public static /* synthetic */ WorkerRunningState access$202(SequentialExecutor sequentialExecutor, WorkerRunningState workerRunningState) {
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
    }

    public static /* synthetic */ Logger access$400() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }
}
