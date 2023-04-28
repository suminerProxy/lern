package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Stopwatch {
    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    /* renamed from: com.google.common.base.Stopwatch$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit = null;
    }

    public Stopwatch() {
    }

    private static String abbreviate(TimeUnit timeUnit) {
    }

    private static TimeUnit chooseUnit(long j2) {
    }

    public static Stopwatch createStarted() {
    }

    public static Stopwatch createUnstarted() {
    }

    private long elapsedNanos() {
    }

    public long elapsed(TimeUnit timeUnit) {
    }

    public boolean isRunning() {
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
    }

    public String toString() {
    }

    public static Stopwatch createStarted(Ticker ticker) {
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
    }

    public Stopwatch(Ticker ticker) {
    }
}
