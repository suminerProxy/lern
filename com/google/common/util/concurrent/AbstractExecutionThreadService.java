package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractExecutionThreadService implements Service {
    private static final Logger logger = null;
    private final Service delegate;

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractService {
        public final /* synthetic */ AbstractExecutionThreadService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00811 implements Supplier<String> {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00811(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ String get() {
            }

            @Override // com.google.common.base.Supplier
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public String get2() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(AbstractExecutionThreadService abstractExecutionThreadService) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Executor {
        public final /* synthetic */ AbstractExecutionThreadService this$0;

        public AnonymousClass2(AbstractExecutionThreadService abstractExecutionThreadService) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    public static /* synthetic */ Logger access$000() {
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

    public abstract void run() throws Exception;

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

    public void triggerShutdown() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j2, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j2, TimeUnit timeUnit) throws TimeoutException {
    }
}
