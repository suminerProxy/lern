package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DoubleMath {
    private static final double LN_2 = 0.0d;
    @VisibleForTesting
    public static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    @VisibleForTesting
    public static final double[] everySixteenthFactorial = null;

    /* renamed from: com.google.common.math.DoubleMath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d2) {
    }

    public static double factorial(int i2) {
    }

    public static int fuzzyCompare(double d2, double d3, double d4) {
    }

    public static boolean fuzzyEquals(double d2, double d3, double d4) {
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d2) {
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d2) {
    }

    public static double log2(double d2) {
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
    }

    @GwtIncompatible
    public static double roundIntermediate(double d2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static int roundToInt(double d2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static long roundToLong(double d2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static int log2(double d2, RoundingMode roundingMode) {
    }

    @Deprecated
    public static double mean(int... iArr) {
    }

    @Deprecated
    public static double mean(long... jArr) {
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
    }
}
