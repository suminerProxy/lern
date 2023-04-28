package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DiscreteDomain<C extends Comparable> {
    public final boolean supportsFastOffset;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        private static final BigIntegerDomain INSTANCE = null;
        private static final BigInteger MAX_LONG = null;
        private static final BigInteger MIN_LONG = null;
        private static final long serialVersionUID = 0;

        public static /* synthetic */ BigIntegerDomain access$300() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(BigInteger bigInteger, BigInteger bigInteger2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ BigInteger next(BigInteger bigInteger) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ BigInteger offset(BigInteger bigInteger, long j2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ BigInteger previous(BigInteger bigInteger) {
        }

        public String toString() {
        }

        /* renamed from: distance  reason: avoid collision after fix types in other method */
        public long distance2(BigInteger bigInteger, BigInteger bigInteger2) {
        }

        /* renamed from: next  reason: avoid collision after fix types in other method */
        public BigInteger next2(BigInteger bigInteger) {
        }

        /* renamed from: offset  reason: avoid collision after fix types in other method */
        public BigInteger offset2(BigInteger bigInteger, long j2) {
        }

        /* renamed from: previous  reason: avoid collision after fix types in other method */
        public BigInteger previous2(BigInteger bigInteger) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        public static /* synthetic */ IntegerDomain access$000() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(Integer num, Integer num2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Integer maxValue() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Integer minValue() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Integer next(Integer num) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Integer offset(Integer num, long j2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Integer previous(Integer num) {
        }

        public String toString() {
        }

        /* renamed from: distance  reason: avoid collision after fix types in other method */
        public long distance2(Integer num, Integer num2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: maxValue  reason: avoid collision after fix types in other method */
        public Integer maxValue2() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: minValue  reason: avoid collision after fix types in other method */
        public Integer minValue2() {
        }

        /* renamed from: next  reason: avoid collision after fix types in other method */
        public Integer next2(Integer num) {
        }

        /* renamed from: offset  reason: avoid collision after fix types in other method */
        public Integer offset2(Integer num, long j2) {
        }

        /* renamed from: previous  reason: avoid collision after fix types in other method */
        public Integer previous2(Integer num) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        private static final LongDomain INSTANCE = null;
        private static final long serialVersionUID = 0;

        public static /* synthetic */ LongDomain access$200() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(Long l2, Long l3) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Long maxValue() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Long minValue() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Long next(Long l2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Long offset(Long l2, long j2) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Long previous(Long l2) {
        }

        public String toString() {
        }

        /* renamed from: distance  reason: avoid collision after fix types in other method */
        public long distance2(Long l2, Long l3) {
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: maxValue  reason: avoid collision after fix types in other method */
        public Long maxValue2() {
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: minValue  reason: avoid collision after fix types in other method */
        public Long minValue2() {
        }

        /* renamed from: next  reason: avoid collision after fix types in other method */
        public Long next2(Long l2) {
        }

        /* renamed from: offset  reason: avoid collision after fix types in other method */
        public Long offset2(Long l2, long j2) {
        }

        /* renamed from: previous  reason: avoid collision after fix types in other method */
        public Long previous2(Long l2) {
        }
    }

    public /* synthetic */ DiscreteDomain(boolean z, AnonymousClass1 anonymousClass1) {
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
    }

    public static DiscreteDomain<Integer> integers() {
    }

    public static DiscreteDomain<Long> longs() {
    }

    public abstract long distance(C c, C c2);

    @CanIgnoreReturnValue
    public C maxValue() {
    }

    @CanIgnoreReturnValue
    public C minValue() {
    }

    public abstract C next(C c);

    public C offset(C c, long j2) {
    }

    public abstract C previous(C c);

    public DiscreteDomain() {
    }

    private DiscreteDomain(boolean z) {
    }
}
