package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@CanIgnoreReturnValue
@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CycleDetectingLockFactory {
    private static final ThreadLocal<ArrayList<LockGraphNode>> acquiredLocks = null;
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, LockGraphNode>> lockGraphNodesPerType = null;
    private static final Logger logger = null;
    public final Policy policy;

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends ThreadLocal<ArrayList<LockGraphNode>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<LockGraphNode> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<LockGraphNode> initialValue2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface CycleDetectingLock {
        LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        public final /* synthetic */ CycleDetectingLockFactory this$0;

        public /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        private CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z) {
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        public final /* synthetic */ CycleDetectingLockFactory this$0;
        private final CycleDetectingReentrantWriteLock writeLock;

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public LockGraphNode getLockGraphNode() {
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock readLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock writeLock() {
        }

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, LockGraphNode lockGraphNode, boolean z) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExampleStackTrace extends IllegalStateException {
        public static final StackTraceElement[] EMPTY_STACK_TRACE = null;
        public static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = null;

        public ExampleStackTrace(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LockGraphNode {
        public final Map<LockGraphNode, ExampleStackTrace> allowedPriorLocks;
        public final Map<LockGraphNode, PotentialDeadlockException> disallowedPriorLocks;
        public final String lockName;

        public LockGraphNode(String str) {
        }

        @NullableDecl
        private ExampleStackTrace findPathTo(LockGraphNode lockGraphNode, Set<LockGraphNode> set) {
        }

        public void checkAcquiredLock(Policy policy, LockGraphNode lockGraphNode) {
        }

        public void checkAcquiredLocks(Policy policy, List<LockGraphNode> list) {
        }

        public String getLockName() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Policies implements Policy {
        private static final /* synthetic */ Policies[] $VALUES = null;
        public static final Policies DISABLED = null;
        public static final Policies THROW = null;
        public static final Policies WARN = null;

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends Policies {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends Policies {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends Policies {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        private Policies(String str, int i2) {
        }

        public static Policies valueOf(String str) {
        }

        public static Policies[] values() {
        }

        public /* synthetic */ Policies(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        public /* synthetic */ PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace, AnonymousClass1 anonymousClass1) {
        }

        public ExampleStackTrace getConflictingStackTrace() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
        }

        private PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
        private final Map<E, LockGraphNode> lockGraphNodes;

        @VisibleForTesting
        public WithExplicitOrdering(Policy policy, Map<E, LockGraphNode> map) {
        }

        public ReentrantLock newReentrantLock(E e2) {
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e2) {
        }

        public ReentrantLock newReentrantLock(E e2, boolean z) {
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e2, boolean z) {
        }
    }

    public /* synthetic */ CycleDetectingLockFactory(Policy policy, AnonymousClass1 anonymousClass1) {
    }

    private void aboutToAcquire(CycleDetectingLock cycleDetectingLock) {
    }

    public static /* synthetic */ Logger access$100() {
    }

    public static /* synthetic */ void access$600(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingLock cycleDetectingLock) {
    }

    public static /* synthetic */ void access$700(CycleDetectingLock cycleDetectingLock) {
    }

    @VisibleForTesting
    public static <E extends Enum<E>> Map<E, LockGraphNode> createNodes(Class<E> cls) {
    }

    private static String getLockName(Enum<?> r2) {
    }

    private static Map<? extends Enum, LockGraphNode> getOrCreateNodes(Class<? extends Enum> cls) {
    }

    private static void lockStateChanged(CycleDetectingLock cycleDetectingLock) {
    }

    public static CycleDetectingLockFactory newInstance(Policy policy) {
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy) {
    }

    public ReentrantLock newReentrantLock(String str) {
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
    }

    private CycleDetectingLockFactory(Policy policy) {
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Weak
        public final CycleDetectingReentrantReadWriteLock readWriteLock;
        public final /* synthetic */ CycleDetectingLockFactory this$0;

        public CycleDetectingReentrantReadLock(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Weak
        public final CycleDetectingReentrantReadWriteLock readWriteLock;
        public final /* synthetic */ CycleDetectingLockFactory this$0;

        public CycleDetectingReentrantWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
        }
    }
}
