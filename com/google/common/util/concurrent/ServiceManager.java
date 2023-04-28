package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ServiceManager {
    private static final ListenerCallQueue.Event<Listener> HEALTHY_EVENT = null;
    private static final ListenerCallQueue.Event<Listener> STOPPED_EVENT = null;
    private static final Logger logger = null;
    private final ImmutableList<Service> services;
    private final ServiceManagerState state;

    /* renamed from: com.google.common.util.concurrent.ServiceManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements ListenerCallQueue.Event<Listener> {
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements ListenerCallQueue.Event<Listener> {
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(Listener listener) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }

        public /* synthetic */ EmptyServiceManagerWarning(AnonymousClass1 anonymousClass1) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NoOpService extends AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
        }

        public /* synthetic */ NoOpService(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ServiceListener extends Service.Listener {
        public final Service service;
        public final WeakReference<ServiceManagerState> state;

        public ServiceListener(Service service, WeakReference<ServiceManagerState> weakReference) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
    }

    public static /* synthetic */ Logger access$200() {
    }

    public static /* synthetic */ ListenerCallQueue.Event access$300() {
    }

    public static /* synthetic */ ListenerCallQueue.Event access$400() {
    }

    public void addListener(Listener listener, Executor executor) {
    }

    public void awaitHealthy() {
    }

    public void awaitStopped() {
    }

    public boolean isHealthy() {
    }

    public ImmutableMultimap<Service.State, Service> servicesByState() {
    }

    @CanIgnoreReturnValue
    public ServiceManager startAsync() {
    }

    public ImmutableMap<Service, Long> startupTimes() {
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
    }

    public String toString() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ServiceManagerState {
        public final Monitor.Guard awaitHealthGuard;
        public final ListenerCallQueue<Listener> listeners;
        public final Monitor monitor;
        public final int numberOfServices;
        @GuardedBy("monitor")
        public boolean ready;
        @GuardedBy("monitor")
        public final SetMultimap<Service.State, Service> servicesByState;
        @GuardedBy("monitor")
        public final Map<Service, Stopwatch> startupTimers;
        @GuardedBy("monitor")
        public final Multiset<Service.State> states;
        public final Monitor.Guard stoppedGuard;
        @GuardedBy("monitor")
        public boolean transitioned;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Function<Map.Entry<Service, Long>, Long> {
            public final /* synthetic */ ServiceManagerState this$0;

            public AnonymousClass1(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Long apply(Map.Entry<Service, Long> entry) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public Long apply2(Map.Entry<Service, Long> entry) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements ListenerCallQueue.Event<Listener> {
            public final /* synthetic */ ServiceManagerState this$0;
            public final /* synthetic */ Service val$service;

            public AnonymousClass2(ServiceManagerState serviceManagerState, Service service) {
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public /* bridge */ /* synthetic */ void call(Listener listener) {
            }

            public String toString() {
            }

            /* renamed from: call  reason: avoid collision after fix types in other method */
            public void call2(Listener listener) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class AwaitHealthGuard extends Monitor.Guard {
            public final /* synthetic */ ServiceManagerState this$0;

            public AwaitHealthGuard(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class StoppedGuard extends Monitor.Guard {
            public final /* synthetic */ ServiceManagerState this$0;

            public StoppedGuard(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
            }
        }

        public ServiceManagerState(ImmutableCollection<Service> immutableCollection) {
        }

        public void addListener(Listener listener, Executor executor) {
        }

        public void awaitHealthy() {
        }

        public void awaitStopped() {
        }

        @GuardedBy("monitor")
        public void checkHealthy() {
        }

        public void dispatchListenerEvents() {
        }

        public void enqueueFailedEvent(Service service) {
        }

        public void enqueueHealthyEvent() {
        }

        public void enqueueStoppedEvent() {
        }

        public void markReady() {
        }

        public ImmutableMultimap<Service.State, Service> servicesByState() {
        }

        public ImmutableMap<Service, Long> startupTimes() {
        }

        public void transitionService(Service service, Service.State state, Service.State state2) {
        }

        public void tryStartTiming(Service service) {
        }

        public void awaitStopped(long j2, TimeUnit timeUnit) throws TimeoutException {
        }

        public void awaitHealthy(long j2, TimeUnit timeUnit) throws TimeoutException {
        }
    }

    public void addListener(Listener listener) {
    }

    public void awaitHealthy(long j2, TimeUnit timeUnit) throws TimeoutException {
    }

    public void awaitStopped(long j2, TimeUnit timeUnit) throws TimeoutException {
    }
}
