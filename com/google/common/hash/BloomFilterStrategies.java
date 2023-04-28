package com.google.common.hash;

import com.google.common.hash.BloomFilter;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BloomFilterStrategies implements BloomFilter.Strategy {
    private static final /* synthetic */ BloomFilterStrategies[] $VALUES = null;
    public static final BloomFilterStrategies MURMUR128_MITZ_32 = null;
    public static final BloomFilterStrategies MURMUR128_MITZ_64 = null;

    /* renamed from: com.google.common.hash.BloomFilterStrategies$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass1 extends BloomFilterStrategies {
        public AnonymousClass1(String str, int i2) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i2, LockFreeBitArray lockFreeBitArray) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i2, LockFreeBitArray lockFreeBitArray) {
        }
    }

    /* renamed from: com.google.common.hash.BloomFilterStrategies$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum AnonymousClass2 extends BloomFilterStrategies {
        public AnonymousClass2(String str, int i2) {
        }

        private long lowerEight(byte[] bArr) {
        }

        private long upperEight(byte[] bArr) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i2, LockFreeBitArray lockFreeBitArray) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i2, LockFreeBitArray lockFreeBitArray) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        public final AtomicLongArray data;

        public LockFreeBitArray(long j2) {
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
        }

        public long bitCount() {
        }

        public long bitSize() {
        }

        public LockFreeBitArray copy() {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        public boolean get(long j2) {
        }

        public int hashCode() {
        }

        public void putAll(LockFreeBitArray lockFreeBitArray) {
        }

        public boolean set(long j2) {
        }

        public LockFreeBitArray(long[] jArr) {
        }
    }

    private BloomFilterStrategies(String str, int i2) {
    }

    public static BloomFilterStrategies valueOf(String str) {
    }

    public static BloomFilterStrategies[] values() {
    }

    public /* synthetic */ BloomFilterStrategies(String str, int i2, AnonymousClass1 anonymousClass1) {
    }
}
