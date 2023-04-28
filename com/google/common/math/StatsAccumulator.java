package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class StatsAccumulator {
    private long count;
    private double max;
    private double mean;
    private double min;
    private double sumOfSquaresOfDeltas;

    public static double calculateNewMeanNonFinite(double d2, double d3) {
    }

    public void add(double d2) {
    }

    public void addAll(Iterable<? extends Number> iterable) {
    }

    public long count() {
    }

    public double max() {
    }

    public double mean() {
    }

    public double min() {
    }

    public final double populationStandardDeviation() {
    }

    public final double populationVariance() {
    }

    public final double sampleStandardDeviation() {
    }

    public final double sampleVariance() {
    }

    public Stats snapshot() {
    }

    public final double sum() {
    }

    public double sumOfSquaresOfDeltas() {
    }

    public void addAll(Iterator<? extends Number> it) {
    }

    public void addAll(double... dArr) {
    }

    public void addAll(int... iArr) {
    }

    public void addAll(long... jArr) {
    }

    public void addAll(Stats stats) {
    }
}
