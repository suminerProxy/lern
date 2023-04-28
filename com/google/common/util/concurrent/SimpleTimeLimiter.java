package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements InvocationHandler {
        public final /* synthetic */ SimpleTimeLimiter this$0;
        public final /* synthetic */ Set val$interruptibleMethods;
        public final /* synthetic */ Object val$target;
        public final /* synthetic */ long val$timeoutDuration;
        public final /* synthetic */ TimeUnit val$timeoutUnit;

        /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class CallableC00821 implements Callable<Object> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ Object[] val$args;
            public final /* synthetic */ Method val$method;

            public CallableC00821(AnonymousClass1 anonymousClass1, Method method, Object[] objArr) {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
            }
        }

        public AnonymousClass1(SimpleTimeLimiter simpleTimeLimiter, Object obj, long j2, TimeUnit timeUnit, Set set) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
    }

    public static /* synthetic */ Exception access$000(Exception exc, boolean z) throws Exception {
    }

    public static /* synthetic */ Object access$100(SimpleTimeLimiter simpleTimeLimiter, Callable callable, long j2, TimeUnit timeUnit, boolean z) throws Exception {
    }

    private <T> T callWithTimeout(Callable<T> callable, long j2, TimeUnit timeUnit, boolean z) throws Exception {
    }

    private static void checkPositiveTimeout(long j2) {
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
    }

    private static boolean declaresInterruptedEx(Method method) {
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
    }

    private static Exception throwCause(Exception exc, boolean z) throws Exception {
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th) throws ExecutionException {
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j2, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j2, TimeUnit timeUnit) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j2, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
    }
}
