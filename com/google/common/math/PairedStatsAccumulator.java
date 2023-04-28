package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PairedStatsAccumulator {
    private double sumOfProductsOfDeltas;
    private final StatsAccumulator xStats;
    private final StatsAccumulator yStats;

    private static double ensureInUnitRange(double d2) {
    }

    private double ensurePositive(double d2) {
    }

    public void add(double d2, double d3) {
    }

    public void addAll(PairedStats pairedStats) {
    }

    public long count() {
    }

    public final LinearTransformation leastSquaresFit() {
    }

    public final double pearsonsCorrelationCoefficient() {
    }

    public double populationCovariance() {
    }

    public final double sampleCovariance() {
    }

    public PairedStats snapshot() {
    }

    public Stats xStats() {
    }

    public Stats yStats() {
    }
}
