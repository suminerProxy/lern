package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    private static final AtomicHelper ATOMIC_HELPER = null;
    private static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = null;
    @NullableDecl
    private volatile Listener listeners;
    @NullableDecl
    private volatile Object value;
    @NullableDecl
    private volatile Waiter waiters;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        public abstract boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        public abstract boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void putNext(Waiter waiter, Waiter waiter2);

        public abstract void putThread(Waiter waiter, Thread thread);

        public /* synthetic */ AtomicHelper(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Cancellation {
        public static final Cancellation CAUSELESS_CANCELLED = null;
        public static final Cancellation CAUSELESS_INTERRUPTED = null;
        @NullableDecl
        public final Throwable cause;
        public final boolean wasInterrupted;

        public Cancellation(boolean z, @NullableDecl Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Failure {
        public static final Failure FALLBACK_INSTANCE = null;
        public final Throwable exception;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 extends Throwable {
            public AnonymousClass1(String str) {
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
            }
        }

        public Failure(Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Listener {
        public static final Listener TOMBSTONE = null;
        public final Executor executor;
        @NullableDecl
        public Listener next;
        public final Runnable task;

        public Listener(Runnable runnable, Executor executor) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putThread(Waiter waiter, Thread thread) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SetFuture<V> implements Runnable {
        public final ListenableFuture<? extends V> future;
        public final AbstractFuture<V> owner;

        public SetFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putThread(Waiter waiter, Thread thread) {
        }

        public /* synthetic */ SynchronizedHelper(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Trusted<V> extends ListenableFuture<V> {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnsafeAtomicHelper extends AtomicHelper {
        public static final long LISTENERS_OFFSET = 0;
        public static final Unsafe UNSAFE = null;
        public static final long VALUE_OFFSET = 0;
        public static final long WAITERS_OFFSET = 0;
        public static final long WAITER_NEXT_OFFSET = 0;
        public static final long WAITER_THREAD_OFFSET = 0;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: run  reason: avoid collision after fix types in other method */
            public Unsafe run2() throws Exception {
            }
        }

        private UnsafeAtomicHelper() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putNext(Waiter waiter, Waiter waiter2) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public void putThread(Waiter waiter, Thread thread) {
        }

        public /* synthetic */ UnsafeAtomicHelper(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Waiter {
        public static final Waiter TOMBSTONE = null;
        @NullableDecl
        public volatile Waiter next;
        @NullableDecl
        public volatile Thread thread;

        public Waiter(boolean z) {
        }

        public void setNext(Waiter waiter) {
        }

        public void unpark() {
        }

        public Waiter() {
        }
    }

    public static /* synthetic */ AtomicHelper access$200() {
    }

    public static /* synthetic */ boolean access$300() {
    }

    public static /* synthetic */ Object access$400(AbstractFuture abstractFuture) {
    }

    public static /* synthetic */ Object access$402(AbstractFuture abstractFuture, Object obj) {
    }

    public static /* synthetic */ Object access$500(ListenableFuture listenableFuture) {
    }

    public static /* synthetic */ void access$600(AbstractFuture abstractFuture) {
    }

    public static /* synthetic */ Waiter access$800(AbstractFuture abstractFuture) {
    }

    public static /* synthetic */ Waiter access$802(AbstractFuture abstractFuture, Waiter waiter) {
    }

    public static /* synthetic */ Listener access$900(AbstractFuture abstractFuture) {
    }

    public static /* synthetic */ Listener access$902(AbstractFuture abstractFuture, Listener listener) {
    }

    private void addDoneString(StringBuilder sb) {
    }

    private static CancellationException cancellationExceptionWithCause(@NullableDecl String str, @NullableDecl Throwable th) {
    }

    private Listener clearListeners(Listener listener) {
    }

    private static void complete(AbstractFuture<?> abstractFuture) {
    }

    private static void executeListener(Runnable runnable, Executor executor) {
    }

    private V getDoneValue(Object obj) throws ExecutionException {
    }

    private static Object getFutureValue(ListenableFuture<?> listenableFuture) {
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
    }

    private void releaseWaiters() {
    }

    private void removeWaiter(Waiter waiter) {
    }

    private String userObjectToString(Object obj) {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
    }

    @Beta
    @ForOverride
    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    public final void maybePropagateCancellationTo(@NullableDecl Future<?> future) {
    }

    @NullableDecl
    public String pendingToString() {
    }

    @CanIgnoreReturnValue
    public boolean set(@NullableDecl V v) {
    }

    @CanIgnoreReturnValue
    public boolean setException(Throwable th) {
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
    }

    public String toString() {
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @NullableDecl
    public final Throwable tryInternalFastPathGetFailure() {
    }

    public final boolean wasInterrupted() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
    }
}
