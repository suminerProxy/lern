package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SmoothRateLimiter extends RateLimiter {
    public double maxPermits;
    private long nextFreeTicketMicros;
    public double stableIntervalMicros;
    public double storedPermits;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SmoothBursty extends SmoothRateLimiter {
        public final double maxBurstSeconds;

        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d2) {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d2, double d3) {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d2, double d3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j2, TimeUnit timeUnit, double d2) {
        }

        private double permitsToTime(double d2) {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d2, double d3) {
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d2, double d3) {
        }
    }

    public /* synthetic */ SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch, AnonymousClass1 anonymousClass1) {
    }

    public abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
    }

    public abstract void doSetRate(double d2, double d3);

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double d2, long j2) {
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long j2) {
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int i2, long j2) {
    }

    public void resync(long j2) {
    }

    public abstract long storedPermitsToWaitTime(double d2, double d3);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
    }
}
