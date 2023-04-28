package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public PairedStats(Stats stats, Stats stats2, double d2) {
    }

    private static double ensureInUnitRange(double d2) {
    }

    private static double ensurePositive(double d2) {
    }

    public static PairedStats fromByteArray(byte[] bArr) {
    }

    public long count() {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public LinearTransformation leastSquaresFit() {
    }

    public double pearsonsCorrelationCoefficient() {
    }

    public double populationCovariance() {
    }

    public double sampleCovariance() {
    }

    public double sumOfProductsOfDeltas() {
    }

    public byte[] toByteArray() {
    }

    public String toString() {
    }

    public Stats xStats() {
    }

    public Stats yStats() {
    }
}
