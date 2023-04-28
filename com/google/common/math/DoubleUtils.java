package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.BigInteger;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DoubleUtils {
    public static final int EXPONENT_BIAS = 1023;
    public static final long EXPONENT_MASK = 9218868437227405312L;
    public static final long IMPLICIT_BIT = 4503599627370496L;
    @VisibleForTesting
    public static final long ONE_BITS = 4607182418800017408L;
    public static final int SIGNIFICAND_BITS = 52;
    public static final long SIGNIFICAND_MASK = 4503599627370495L;
    public static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
    }

    public static double ensureNonNegative(double d2) {
    }

    public static long getSignificand(double d2) {
    }

    public static boolean isFinite(double d2) {
    }

    public static boolean isNormal(double d2) {
    }

    public static double nextDown(double d2) {
    }

    public static double scaleNormalize(double d2) {
    }
}
