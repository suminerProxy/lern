package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ListenableFuture val$future;
        public final /* synthetic */ BlockingQueue val$queue;

        public AnonymousClass1(BlockingQueue blockingQueue, ListenableFuture listenableFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Executor {
        public final /* synthetic */ Executor val$executor;
        public final /* synthetic */ Supplier val$nameSupplier;

        public AnonymousClass2(Executor executor, Supplier supplier) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends WrappingExecutorService {
        public final /* synthetic */ Supplier val$nameSupplier;

        public AnonymousClass3(ExecutorService executorService, Supplier supplier) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 extends WrappingScheduledExecutorService {
        public final /* synthetic */ Supplier val$nameSupplier;

        public AnonymousClass4(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 implements Executor {
        public boolean thrownFromDelegate;
        public final /* synthetic */ Executor val$delegate;
        public final /* synthetic */ AbstractFuture val$future;

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass5 this$0;
            public final /* synthetic */ Runnable val$command;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass5(Executor executor, AbstractFuture abstractFuture) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ListeningDecorator extends AbstractListeningExecutorService {
        private final ExecutorService delegate;

        public ListeningDecorator(ExecutorService executorService) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        public final ScheduledExecutorService delegate;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            private final ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
            }

            /* renamed from: compareTo  reason: avoid collision after fix types in other method */
            public int compareTo2(Delayed delayed) {
            }
        }

        @GwtIncompatible
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            private final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        }
    }

    private MoreExecutors() {
    }

    public static /* synthetic */ void access$000(ThreadPoolExecutor threadPoolExecutor) {
    }

    @Beta
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j2, TimeUnit timeUnit) {
    }

    public static Executor directExecutor() {
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j2, TimeUnit timeUnit) {
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j2, TimeUnit timeUnit) {
    }

    @GwtIncompatible
    public static <T> T invokeAnyImpl(ListeningExecutorService listeningExecutorService, Collection<? extends Callable<T>> collection, boolean z, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @GwtIncompatible
    private static boolean isAppEngine() {
    }

    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
    }

    @Beta
    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
    }

    @GwtIncompatible
    public static Thread newThread(String str, Runnable runnable) {
    }

    @Beta
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
    }

    public static Executor rejectionPropagatingExecutor(Executor executor, AbstractFuture<?> abstractFuture) {
    }

    @GwtIncompatible
    public static Executor renamingDecorator(Executor executor, Supplier<String> supplier) {
    }

    @CanIgnoreReturnValue
    @Beta
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j2, TimeUnit timeUnit) {
    }

    @GwtIncompatible
    private static <T> ListenableFuture<T> submitAndAddQueueListener(ListeningExecutorService listeningExecutorService, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
    }

    @GwtIncompatible
    private static void useDaemonThreadFactory(ThreadPoolExecutor threadPoolExecutor) {
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
    }

    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
    }

    @VisibleForTesting
    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ Application this$0;
            public final /* synthetic */ ExecutorService val$service;
            public final /* synthetic */ long val$terminationTimeout;
            public final /* synthetic */ TimeUnit val$timeUnit;

            public AnonymousClass1(Application application, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public final void addDelayedShutdownHook(ExecutorService executorService, long j2, TimeUnit timeUnit) {
        }

        @VisibleForTesting
        public void addShutdownHook(Thread thread) {
        }

        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j2, TimeUnit timeUnit) {
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j2, TimeUnit timeUnit) {
        }

        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        }
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DirectExecutorService extends AbstractListeningExecutorService {
        private final Object lock;
        @GuardedBy("lock")
        private int runningTasks;
        @GuardedBy("lock")
        private boolean shutdown;

        private DirectExecutorService() {
        }

        private void endTask() {
        }

        private void startTask() {
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
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

        public /* synthetic */ DirectExecutorService(AnonymousClass1 anonymousClass1) {
        }
    }

    @GwtIncompatible
    public static ExecutorService renamingDecorator(ExecutorService executorService, Supplier<String> supplier) {
    }

    @GwtIncompatible
    public static ScheduledExecutorService renamingDecorator(ScheduledExecutorService scheduledExecutorService, Supplier<String> supplier) {
    }
}
