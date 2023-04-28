package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;
    private static final Supplier<ReadWriteLock> READ_WRITE_LOCK_SUPPLIER = null;
    private static final Supplier<ReadWriteLock> WEAK_SAFE_READ_WRITE_LOCK_SUPPLIER = null;

    /* renamed from: com.google.common.util.concurrent.Striped$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Lock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Lock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Lock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Lock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Supplier<Semaphore> {
        public final /* synthetic */ int val$permits;

        public AnonymousClass3(int i2) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Semaphore get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Semaphore get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements Supplier<Semaphore> {
        public final /* synthetic */ int val$permits;

        public AnonymousClass4(int i2) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Semaphore get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Semaphore get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ ReadWriteLock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public ReadWriteLock get2() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass6 implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ ReadWriteLock get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public ReadWriteLock get2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        public /* synthetic */ CompactStriped(int i2, Supplier supplier, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }

        private CompactStriped(int i2, Supplier<L> supplier) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        public final ConcurrentMap<Integer, L> locks;
        public final int size;
        public final Supplier<L> supplier;

        public LargeLazyStriped(int i2, Supplier<L> supplier) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PaddedLock extends ReentrantLock {
        public long unused1;
        public long unused2;
        public long unused3;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PaddedSemaphore extends Semaphore {
        public long unused1;
        public long unused2;
        public long unused3;

        public PaddedSemaphore(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        public final int mask;

        public PowerOfTwoStriped(int i2) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        public final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        public final ReferenceQueue<L> queue;
        public final int size;
        public final Supplier<L> supplier;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ArrayReference<L> extends WeakReference<L> {
            public final int index;

            public ArrayReference(L l2, int i2, ReferenceQueue<L> referenceQueue) {
            }
        }

        public SmallLazyStriped(int i2, Supplier<L> supplier) {
        }

        private void drainQueue() {
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate;

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
        }
    }

    public /* synthetic */ Striped(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ int access$200(int i2) {
    }

    public static /* synthetic */ int access$300(int i2) {
    }

    private static int ceilToPowerOfTwo(int i2) {
    }

    public static <L> Striped<L> custom(int i2, Supplier<L> supplier) {
    }

    private static <L> Striped<L> lazy(int i2, Supplier<L> supplier) {
    }

    public static Striped<Lock> lazyWeakLock(int i2) {
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i2) {
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i2, int i3) {
    }

    public static Striped<Lock> lock(int i2) {
    }

    public static Striped<ReadWriteLock> readWriteLock(int i2) {
    }

    public static Striped<Semaphore> semaphore(int i2, int i3) {
    }

    private static int smear(int i2) {
    }

    public Iterable<L> bulkGet(Iterable<?> iterable) {
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i2);

    public abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }
}
