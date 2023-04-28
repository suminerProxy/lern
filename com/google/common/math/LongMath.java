package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.RoundingMode;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LongMath {
    @VisibleForTesting
    public static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    @VisibleForTesting
    public static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    @VisibleForTesting
    public static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;
    public static final int[] biggestBinomials = null;
    @VisibleForTesting
    public static final int[] biggestSimpleBinomials = null;
    public static final long[] factorials = null;
    @VisibleForTesting
    @GwtIncompatible
    public static final long[] halfPowersOf10 = null;
    @VisibleForTesting
    public static final byte[] maxLog10ForLeadingZeros = null;
    private static final long[][] millerRabinBaseSets = null;
    @VisibleForTesting
    @GwtIncompatible
    public static final long[] powersOf10 = null;

    /* renamed from: com.google.common.math.LongMath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class MillerRabinTester {
        private static final /* synthetic */ MillerRabinTester[] $VALUES = null;
        public static final MillerRabinTester LARGE = null;
        public static final MillerRabinTester SMALL = null;

        /* renamed from: com.google.common.math.LongMath$MillerRabinTester$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends MillerRabinTester {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j2, long j3, long j4) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j2, long j3) {
            }
        }

        /* renamed from: com.google.common.math.LongMath$MillerRabinTester$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends MillerRabinTester {
            public AnonymousClass2(String str, int i2) {
            }

            private long plusMod(long j2, long j3, long j4) {
            }

            private long times2ToThe32Mod(long j2, long j3) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j2, long j3, long j4) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j2, long j3) {
            }
        }

        private MillerRabinTester(String str, int i2) {
        }

        private long powMod(long j2, long j3, long j4) {
        }

        public static boolean test(long j2, long j3) {
        }

        private boolean testWitness(long j2, long j3) {
        }

        public static MillerRabinTester valueOf(String str) {
        }

        public static MillerRabinTester[] values() {
        }

        public abstract long mulMod(long j2, long j3, long j4);

        public abstract long squareMod(long j2, long j3);

        public /* synthetic */ MillerRabinTester(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    private LongMath() {
    }

    public static long binomial(int i2, int i3) {
    }

    @Beta
    public static long ceilingPowerOfTwo(long j2) {
    }

    @GwtIncompatible
    public static long checkedAdd(long j2, long j3) {
    }

    public static long checkedMultiply(long j2, long j3) {
    }

    @GwtIncompatible
    public static long checkedPow(long j2, int i2) {
    }

    @GwtIncompatible
    public static long checkedSubtract(long j2, long j3) {
    }

    @GwtIncompatible
    public static long divide(long j2, long j3, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static long factorial(int i2) {
    }

    public static boolean fitsInInt(long j2) {
    }

    @Beta
    public static long floorPowerOfTwo(long j2) {
    }

    public static long gcd(long j2, long j3) {
    }

    public static boolean isPowerOfTwo(long j2) {
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j2) {
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j2, long j3) {
    }

    @GwtIncompatible
    public static int log10(long j2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static int log10Floor(long j2) {
    }

    public static int log2(long j2, RoundingMode roundingMode) {
    }

    public static long mean(long j2, long j3) {
    }

    @GwtIncompatible
    public static int mod(long j2, int i2) {
    }

    public static long multiplyFraction(long j2, long j3, long j4) {
    }

    @GwtIncompatible
    public static long pow(long j2, int i2) {
    }

    @Beta
    public static long saturatedAdd(long j2, long j3) {
    }

    @Beta
    public static long saturatedMultiply(long j2, long j3) {
    }

    @Beta
    public static long saturatedPow(long j2, int i2) {
    }

    @Beta
    public static long saturatedSubtract(long j2, long j3) {
    }

    @GwtIncompatible
    public static long sqrt(long j2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static long mod(long j2, long j3) {
    }
}
