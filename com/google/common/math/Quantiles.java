package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.Map;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Quantiles {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Scale {
        private final int scale;

        public /* synthetic */ Scale(int i2, AnonymousClass1 anonymousClass1) {
        }

        public ScaleAndIndex index(int i2) {
        }

        public ScaleAndIndexes indexes(int... iArr) {
        }

        private Scale(int i2) {
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        public /* synthetic */ ScaleAndIndex(int i2, int i3, AnonymousClass1 anonymousClass1) {
        }

        public double compute(Collection<? extends Number> collection) {
        }

        public double computeInPlace(double... dArr) {
        }

        private ScaleAndIndex(int i2, int i3) {
        }

        public double compute(double... dArr) {
        }

        public double compute(long... jArr) {
        }

        public double compute(int... iArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        public /* synthetic */ ScaleAndIndexes(int i2, int[] iArr, AnonymousClass1 anonymousClass1) {
        }

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
        }

        private ScaleAndIndexes(int i2, int[] iArr) {
        }

        public Map<Integer, Double> compute(double... dArr) {
        }

        public Map<Integer, Double> compute(long... jArr) {
        }

        public Map<Integer, Double> compute(int... iArr) {
        }
    }

    public static /* synthetic */ void access$300(int i2, int i3) {
    }

    public static /* synthetic */ double[] access$400(long[] jArr) {
    }

    public static /* synthetic */ double[] access$500(int[] iArr) {
    }

    public static /* synthetic */ boolean access$600(double[] dArr) {
    }

    public static /* synthetic */ void access$700(int i2, double[] dArr, int i3, int i4) {
    }

    public static /* synthetic */ double access$800(double d2, double d3, double d4, double d5) {
    }

    public static /* synthetic */ void access$900(int[] iArr, int i2, int i3, double[] dArr, int i4, int i5) {
    }

    private static void checkIndex(int i2, int i3) {
    }

    private static int chooseNextSelection(int[] iArr, int i2, int i3, int i4, int i5) {
    }

    private static boolean containsNaN(double... dArr) {
    }

    private static double interpolate(double d2, double d3, double d4, double d5) {
    }

    private static double[] intsToDoubles(int[] iArr) {
    }

    private static double[] longsToDoubles(long[] jArr) {
    }

    public static ScaleAndIndex median() {
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i2, int i3) {
    }

    private static int partition(double[] dArr, int i2, int i3) {
    }

    public static Scale percentiles() {
    }

    public static Scale quartiles() {
    }

    public static Scale scale(int i2) {
    }

    private static void selectAllInPlace(int[] iArr, int i2, int i3, double[] dArr, int i4, int i5) {
    }

    private static void selectInPlace(int i2, double[] dArr, int i3, int i4) {
    }

    private static void swap(double[] dArr, int i2, int i3) {
    }
}
