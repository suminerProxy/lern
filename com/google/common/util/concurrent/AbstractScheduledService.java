package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractScheduledService implements Service {
    private static final Logger logger = null;
    private final AbstractService delegate;

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Service.Listener {
        public final /* synthetic */ AbstractScheduledService this$0;
        public final /* synthetic */ ScheduledExecutorService val$executor;

        public AnonymousClass1(AbstractScheduledService abstractScheduledService, ScheduledExecutorService scheduledExecutorService) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1ThreadFactoryImpl implements ThreadFactory {
        public final /* synthetic */ AbstractScheduledService this$0;

        public C1ThreadFactoryImpl(AbstractScheduledService abstractScheduledService) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class CustomScheduler extends Scheduler {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class ReschedulableCallable extends ForwardingFuture<Void> implements Callable<Void> {
            @NullableDecl
            @GuardedBy("lock")
            private Future<Void> currentFuture;
            private final ScheduledExecutorService executor;
            private final ReentrantLock lock;
            private final AbstractService service;
            public final /* synthetic */ CustomScheduler this$0;
            private final Runnable wrappedRunnable;

            public ReschedulableCallable(CustomScheduler customScheduler, AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Object delegate() {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean isCancelled() {
            }

            public void reschedule() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
            public Future<Void> delegate() {
            }
        }

        @Beta
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Schedule {
            private final long delay;
            private final TimeUnit unit;

            public Schedule(long j2, TimeUnit timeUnit) {
            }

            public static /* synthetic */ long access$800(Schedule schedule) {
            }

            public static /* synthetic */ TimeUnit access$900(Schedule schedule) {
            }
        }

        public abstract Schedule getNextSchedule() throws Exception;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        public final Future<?> schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 extends Scheduler {
            public final /* synthetic */ long val$delay;
            public final /* synthetic */ long val$initialDelay;
            public final /* synthetic */ TimeUnit val$unit;

            public AnonymousClass1(long j2, long j3, TimeUnit timeUnit) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Future<?> schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass2 extends Scheduler {
            public final /* synthetic */ long val$initialDelay;
            public final /* synthetic */ long val$period;
            public final /* synthetic */ TimeUnit val$unit;

            public AnonymousClass2(long j2, long j3, TimeUnit timeUnit) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Future<?> schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }
        }

        public /* synthetic */ Scheduler(AnonymousClass1 anonymousClass1) {
        }

        public static Scheduler newFixedDelaySchedule(long j2, long j3, TimeUnit timeUnit) {
        }

        public static Scheduler newFixedRateSchedule(long j2, long j3, TimeUnit timeUnit) {
        }

        public abstract Future<?> schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private Scheduler() {
        }
    }

    public static /* synthetic */ Logger access$400() {
    }

    public static /* synthetic */ AbstractService access$500(AbstractScheduledService abstractScheduledService) {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
    }

    public ScheduledExecutorService executor() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    public abstract void runOneIteration() throws Exception;

    public abstract Scheduler scheduler();

    public String serviceName() {
    }

    public void shutDown() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
    }

    public String toString() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j2, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j2, TimeUnit timeUnit) throws TimeoutException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ServiceDelegate extends AbstractService {
        @MonotonicNonNullDecl
        private volatile ScheduledExecutorService executorService;
        private final ReentrantLock lock;
        @MonotonicNonNullDecl
        private volatile Future<?> runningTask;
        private final Runnable task;
        public final /* synthetic */ AbstractScheduledService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Supplier<String> {
            public final /* synthetic */ ServiceDelegate this$1;

            public AnonymousClass1(ServiceDelegate serviceDelegate) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ String get() {
            }

            @Override // com.google.common.base.Supplier
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public String get2() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ ServiceDelegate this$1;

            public AnonymousClass2(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ ServiceDelegate this$1;

            public AnonymousClass3(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class Task implements Runnable {
            public final /* synthetic */ ServiceDelegate this$1;

            public Task(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private ServiceDelegate(AbstractScheduledService abstractScheduledService) {
        }

        public static /* synthetic */ ReentrantLock access$200(ServiceDelegate serviceDelegate) {
        }

        public static /* synthetic */ Future access$300(ServiceDelegate serviceDelegate) {
        }

        public static /* synthetic */ Future access$302(ServiceDelegate serviceDelegate, Future future) {
        }

        public static /* synthetic */ ScheduledExecutorService access$600(ServiceDelegate serviceDelegate) {
        }

        public static /* synthetic */ Runnable access$700(ServiceDelegate serviceDelegate) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
        }

        public /* synthetic */ ServiceDelegate(AbstractScheduledService abstractScheduledService, AnonymousClass1 anonymousClass1) {
        }
    }
}
