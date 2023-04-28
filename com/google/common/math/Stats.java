package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Stats implements Serializable {
    public static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long j2, double d2, double d3, double d4, double d5) {
    }

    public static Stats fromByteArray(byte[] bArr) {
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
    }

    public static Stats of(Iterable<? extends Number> iterable) {
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
    }

    public long count() {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public double max() {
    }

    public double mean() {
    }

    public double min() {
    }

    public double populationStandardDeviation() {
    }

    public double populationVariance() {
    }

    public double sampleStandardDeviation() {
    }

    public double sampleVariance() {
    }

    public double sum() {
    }

    public double sumOfSquaresOfDeltas() {
    }

    public byte[] toByteArray() {
    }

    public String toString() {
    }

    public void writeTo(ByteBuffer byteBuffer) {
    }

    public static double meanOf(Iterator<? extends Number> it) {
    }

    public static Stats of(Iterator<? extends Number> it) {
    }

    public static Stats of(double... dArr) {
    }

    public static double meanOf(double... dArr) {
    }

    public static Stats of(int... iArr) {
    }

    public static Stats of(long... jArr) {
    }

    public static double meanOf(int... iArr) {
    }

    public static double meanOf(long... jArr) {
    }
}
