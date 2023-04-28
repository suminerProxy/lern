package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractService implements Service {
    private static final ListenerCallQueue.Event<Service.Listener> RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_NEW_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STOPPING_EVENT = null;
    private final Monitor.Guard hasReachedRunning;
    private final Monitor.Guard isStartable;
    private final Monitor.Guard isStoppable;
    private final Monitor.Guard isStopped;
    private final ListenerCallQueue<Service.Listener> listeners;
    private final Monitor monitor;
    private volatile StateSnapshot snapshot;

    /* renamed from: com.google.common.util.concurrent.AbstractService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements ListenerCallQueue.Event<Service.Listener> {
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements ListenerCallQueue.Event<Service.Listener> {
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements ListenerCallQueue.Event<Service.Listener> {
        public final /* synthetic */ Service.State val$from;

        public AnonymousClass3(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements ListenerCallQueue.Event<Service.Listener> {
        public final /* synthetic */ Service.State val$from;

        public AnonymousClass4(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements ListenerCallQueue.Event<Service.Listener> {
        public final /* synthetic */ AbstractService this$0;
        public final /* synthetic */ Throwable val$cause;
        public final /* synthetic */ Service.State val$from;

        public AnonymousClass5(AbstractService abstractService, Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class HasReachedRunningGuard extends Monitor.Guard {
        public final /* synthetic */ AbstractService this$0;

        public HasReachedRunningGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class IsStartableGuard extends Monitor.Guard {
        public final /* synthetic */ AbstractService this$0;

        public IsStartableGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class IsStoppableGuard extends Monitor.Guard {
        public final /* synthetic */ AbstractService this$0;

        public IsStoppableGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class IsStoppedGuard extends Monitor.Guard {
        public final /* synthetic */ AbstractService this$0;

        public IsStoppedGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StateSnapshot {
        @NullableDecl
        public final Throwable failure;
        public final boolean shutdownWhenStartupFinishes;
        public final Service.State state;

        public StateSnapshot(Service.State state) {
        }

        public Service.State externalState() {
        }

        public Throwable failureCause() {
        }

        public StateSnapshot(Service.State state, boolean z, @NullableDecl Throwable th) {
        }
    }

    public static /* synthetic */ Monitor access$000(AbstractService abstractService) {
    }

    @GuardedBy("monitor")
    private void checkCurrentState(Service.State state) {
    }

    private void dispatchListenerEvents() {
    }

    private void enqueueFailedEvent(Service.State state, Throwable th) {
    }

    private void enqueueRunningEvent() {
    }

    private void enqueueStartingEvent() {
    }

    private void enqueueStoppingEvent(Service.State state) {
    }

    private void enqueueTerminatedEvent(Service.State state) {
    }

    private static ListenerCallQueue.Event<Service.Listener> stoppingEvent(Service.State state) {
    }

    private static ListenerCallQueue.Event<Service.Listener> terminatedEvent(Service.State state) {
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

    @ForOverride
    public void doCancelStart() {
    }

    @ForOverride
    public abstract void doStart();

    @ForOverride
    public abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    public final void notifyFailed(Throwable th) {
    }

    public final void notifyStarted() {
    }

    public final void notifyStopped() {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
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
}
