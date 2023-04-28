package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface TimeLimiter {
    @CanIgnoreReturnValue
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j2, TimeUnit timeUnit) throws TimeoutException, ExecutionException;

    @CanIgnoreReturnValue
    <T> T callWithTimeout(Callable<T> callable, long j2, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException;

    <T> T newProxy(T t, Class<T> cls, long j2, TimeUnit timeUnit);

    void runUninterruptiblyWithTimeout(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException;

    void runWithTimeout(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException, InterruptedException;
}
