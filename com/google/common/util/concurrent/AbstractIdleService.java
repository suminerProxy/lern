package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractIdleService implements Service {
    private final Service delegate;
    private final Supplier<String> threadNameSupplier;

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Executor {
        public final /* synthetic */ AbstractIdleService this$0;

        public AnonymousClass1(AbstractIdleService abstractIdleService) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class DelegateService extends AbstractService {
        public final /* synthetic */ AbstractIdleService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ DelegateService this$1;

            public AnonymousClass1(DelegateService delegateService) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ DelegateService this$1;

            public AnonymousClass2(DelegateService delegateService) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private DelegateService(AbstractIdleService abstractIdleService) {
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

        public /* synthetic */ DelegateService(AbstractIdleService abstractIdleService, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ThreadNameSupplier implements Supplier<String> {
        public final /* synthetic */ AbstractIdleService this$0;

        private ThreadNameSupplier(AbstractIdleService abstractIdleService) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ String get() {
        }

        public /* synthetic */ ThreadNameSupplier(AbstractIdleService abstractIdleService, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public String get2() {
        }
    }

    public static /* synthetic */ Supplier access$200(AbstractIdleService abstractIdleService) {
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

    public Executor executor() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    public String serviceName() {
    }

    public abstract void shutDown() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
    }

    public abstract void startUp() throws Exception;

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
