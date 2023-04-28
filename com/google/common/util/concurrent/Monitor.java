package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Monitor {
    @GuardedBy("lock")
    private Guard activeGuards;
    private final boolean fair;
    private final ReentrantLock lock;

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Guard {
        public final Condition condition;
        @Weak
        public final Monitor monitor;
        @NullableDecl
        @GuardedBy("monitor.lock")
        public Guard next;
        @GuardedBy("monitor.lock")
        public int waiterCount;

        public Guard(Monitor monitor) {
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
    }

    public static /* synthetic */ ReentrantLock access$000(Monitor monitor) {
    }

    @GuardedBy("lock")
    private void await(Guard guard, boolean z) throws InterruptedException {
    }

    @GuardedBy("lock")
    private boolean awaitNanos(Guard guard, long j2, boolean z) throws InterruptedException {
    }

    @GuardedBy("lock")
    private void awaitUninterruptibly(Guard guard, boolean z) {
    }

    @GuardedBy("lock")
    private void beginWaitingFor(Guard guard) {
    }

    @GuardedBy("lock")
    private void endWaitingFor(Guard guard) {
    }

    private static long initNanoTime(long j2) {
    }

    @GuardedBy("lock")
    private boolean isSatisfied(Guard guard) {
    }

    private static long remainingNanos(long j2, long j3) {
    }

    @GuardedBy("lock")
    private void signalAllWaiters() {
    }

    @GuardedBy("lock")
    private void signalNextWaiter() {
    }

    private static long toSafeNanos(long j2, TimeUnit timeUnit) {
    }

    public void enter() {
    }

    public boolean enterIf(Guard guard) {
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
    }

    public void enterInterruptibly() throws InterruptedException {
    }

    public void enterWhen(Guard guard) throws InterruptedException {
    }

    public void enterWhenUninterruptibly(Guard guard) {
    }

    public int getOccupiedDepth() {
    }

    public int getQueueLength() {
    }

    public int getWaitQueueLength(Guard guard) {
    }

    public boolean hasQueuedThread(Thread thread) {
    }

    public boolean hasQueuedThreads() {
    }

    public boolean hasWaiters(Guard guard) {
    }

    public boolean isFair() {
    }

    public boolean isOccupied() {
    }

    public boolean isOccupiedByCurrentThread() {
    }

    public void leave() {
    }

    public boolean tryEnter() {
    }

    public boolean tryEnterIf(Guard guard) {
    }

    public void waitFor(Guard guard) throws InterruptedException {
    }

    public void waitForUninterruptibly(Guard guard) {
    }

    public Monitor(boolean z) {
    }

    public boolean enter(long j2, TimeUnit timeUnit) {
    }

    public boolean enterInterruptibly(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean waitFor(Guard guard, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean waitForUninterruptibly(Guard guard, long j2, TimeUnit timeUnit) {
    }

    public boolean enterIf(Guard guard, long j2, TimeUnit timeUnit) {
    }

    public boolean enterIfInterruptibly(Guard guard, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean enterWhen(Guard guard, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    public boolean enterWhenUninterruptibly(Guard guard, long j2, TimeUnit timeUnit) {
    }
}
