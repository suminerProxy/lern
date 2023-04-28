package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.RoundingMode;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class IntMath {
    @VisibleForTesting
    public static final int FLOOR_SQRT_MAX_INT = 46340;
    @VisibleForTesting
    public static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    @VisibleForTesting
    public static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    @VisibleForTesting
    public static int[] biggestBinomials;
    private static final int[] factorials = null;
    @VisibleForTesting
    public static final int[] halfPowersOf10 = null;
    @VisibleForTesting
    public static final byte[] maxLog10ForLeadingZeros = null;
    @VisibleForTesting
    public static final int[] powersOf10 = null;

    /* renamed from: com.google.common.math.IntMath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    private IntMath() {
    }

    public static int binomial(int i2, int i3) {
    }

    @Beta
    public static int ceilingPowerOfTwo(int i2) {
    }

    public static int checkedAdd(int i2, int i3) {
    }

    public static int checkedMultiply(int i2, int i3) {
    }

    public static int checkedPow(int i2, int i3) {
    }

    public static int checkedSubtract(int i2, int i3) {
    }

    public static int divide(int i2, int i3, RoundingMode roundingMode) {
    }

    public static int factorial(int i2) {
    }

    @Beta
    public static int floorPowerOfTwo(int i2) {
    }

    public static int gcd(int i2, int i3) {
    }

    public static boolean isPowerOfTwo(int i2) {
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i2) {
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int i2, int i3) {
    }

    @GwtIncompatible
    public static int log10(int i2, RoundingMode roundingMode) {
    }

    private static int log10Floor(int i2) {
    }

    public static int log2(int i2, RoundingMode roundingMode) {
    }

    public static int mean(int i2, int i3) {
    }

    public static int mod(int i2, int i3) {
    }

    @GwtIncompatible
    public static int pow(int i2, int i3) {
    }

    @Beta
    public static int saturatedAdd(int i2, int i3) {
    }

    @Beta
    public static int saturatedMultiply(int i2, int i3) {
    }

    @Beta
    public static int saturatedPow(int i2, int i3) {
    }

    @Beta
    public static int saturatedSubtract(int i2, int i3) {
    }

    @GwtIncompatible
    public static int sqrt(int i2, RoundingMode roundingMode) {
    }

    private static int sqrtFloor(int i2) {
    }
}
