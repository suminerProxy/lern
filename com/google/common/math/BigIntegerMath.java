package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BigIntegerMath {
    private static final double LN_10 = 0.0d;
    private static final double LN_2 = 0.0d;
    @VisibleForTesting
    public static final BigInteger SQRT2_PRECOMPUTED_BITS = null;
    @VisibleForTesting
    public static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    /* renamed from: com.google.common.math.BigIntegerMath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    private BigIntegerMath() {
    }

    public static BigInteger binomial(int i2, int i3) {
    }

    @Beta
    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
    }

    public static BigInteger factorial(int i2) {
    }

    @GwtIncompatible
    public static boolean fitsInLong(BigInteger bigInteger) {
    }

    @Beta
    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
    }

    public static BigInteger listProduct(List<BigInteger> list) {
    }

    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    private static BigInteger sqrtApproxWithDoubles(BigInteger bigInteger) {
    }

    @GwtIncompatible
    private static BigInteger sqrtFloor(BigInteger bigInteger) {
    }

    public static BigInteger listProduct(List<BigInteger> list, int i2, int i3) {
    }
}
