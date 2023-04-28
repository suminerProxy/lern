package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private final BloomFilterStrategies.LockFreeBitArray bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] data;
        public final Funnel<? super T> funnel;
        public final int numHashFunctions;
        public final Strategy strategy;

        public SerialForm(BloomFilter<T> bloomFilter) {
        }

        public Object readResolve() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Strategy extends Serializable {
        <T> boolean mightContain(T t, Funnel<? super T> funnel, int i2, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(T t, Funnel<? super T> funnel, int i2, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public /* synthetic */ BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i2, Funnel funnel, Strategy strategy, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ BloomFilterStrategies.LockFreeBitArray access$000(BloomFilter bloomFilter) {
    }

    public static /* synthetic */ int access$100(BloomFilter bloomFilter) {
    }

    public static /* synthetic */ Funnel access$200(BloomFilter bloomFilter) {
    }

    public static /* synthetic */ Strategy access$300(BloomFilter bloomFilter) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i2, double d2) {
    }

    @VisibleForTesting
    public static long optimalNumOfBits(long j2, double d2) {
    }

    @VisibleForTesting
    public static int optimalNumOfHashFunctions(long j2, long j3) {
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
    }

    private Object writeReplace() {
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(T t) {
    }

    public long approximateElementCount() {
    }

    @VisibleForTesting
    public long bitSize() {
    }

    public BloomFilter<T> copy() {
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
    }

    public double expectedFpp() {
    }

    public int hashCode() {
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
    }

    public boolean mightContain(T t) {
    }

    @CanIgnoreReturnValue
    public boolean put(T t) {
    }

    public void putAll(BloomFilter<T> bloomFilter) {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i2, Funnel<? super T> funnel, Strategy strategy) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j2, double d2) {
    }

    @VisibleForTesting
    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j2, double d2, Strategy strategy) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i2) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j2) {
    }
}
