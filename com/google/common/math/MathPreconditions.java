package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z, double d2, RoundingMode roundingMode) {
    }

    public static void checkNoOverflow(boolean z, String str, int i2, int i3) {
    }

    public static int checkNonNegative(@NullableDecl String str, int i2) {
    }

    public static int checkPositive(@NullableDecl String str, int i2) {
    }

    public static void checkRoundingUnnecessary(boolean z) {
    }

    public static void checkNoOverflow(boolean z, String str, long j2, long j3) {
    }

    public static long checkNonNegative(@NullableDecl String str, long j2) {
    }

    public static long checkPositive(@NullableDecl String str, long j2) {
    }

    public static BigInteger checkNonNegative(@NullableDecl String str, BigInteger bigInteger) {
    }

    public static BigInteger checkPositive(@NullableDecl String str, BigInteger bigInteger) {
    }

    public static double checkNonNegative(@NullableDecl String str, double d2) {
    }
}
