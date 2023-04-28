package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class RateLimiter {
    @MonotonicNonNullDecl
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SleepingStopwatch {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 extends SleepingStopwatch {
            public final Stopwatch stopwatch;

            @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
            public long readMicros() {
            }

            @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
            public void sleepMicrosUninterruptibly(long j2) {
            }
        }

        public static SleepingStopwatch createFromSystemTimer() {
        }

        public abstract long readMicros();

        public abstract void sleepMicrosUninterruptibly(long j2);
    }

    public RateLimiter(SleepingStopwatch sleepingStopwatch) {
    }

    private boolean canAcquire(long j2, long j3) {
    }

    private static void checkPermits(int i2) {
    }

    public static RateLimiter create(double d2) {
    }

    private Object mutex() {
    }

    @CanIgnoreReturnValue
    public double acquire() {
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double d2, long j2);

    public final double getRate() {
    }

    public abstract long queryEarliestAvailable(long j2);

    public final long reserve(int i2) {
    }

    public final long reserveAndGetWaitLength(int i2, long j2) {
    }

    public abstract long reserveEarliestAvailable(int i2, long j2);

    public final void setRate(double d2) {
    }

    public String toString() {
    }

    public boolean tryAcquire(long j2, TimeUnit timeUnit) {
    }

    @VisibleForTesting
    public static RateLimiter create(double d2, SleepingStopwatch sleepingStopwatch) {
    }

    @CanIgnoreReturnValue
    public double acquire(int i2) {
    }

    public boolean tryAcquire(int i2) {
    }

    public boolean tryAcquire() {
    }

    public static RateLimiter create(double d2, long j2, TimeUnit timeUnit) {
    }

    public boolean tryAcquire(int i2, long j2, TimeUnit timeUnit) {
    }

    @VisibleForTesting
    public static RateLimiter create(double d2, long j2, TimeUnit timeUnit, double d3, SleepingStopwatch sleepingStopwatch) {
    }
}
