package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Doubles {
    public static final int BYTES = 8;
    @GwtIncompatible
    public static final Pattern FLOATING_POINT_PATTERN = null;

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final double[] array;
        public final int end;
        public final int start;

        public DoubleArrayAsList(double[] dArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
        }

        public double[] toDoubleArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public DoubleArrayAsList(double[] dArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i2) {
        }

        public Double set(int i2, Double d2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        public static final DoubleConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Double d2) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Double doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward  reason: avoid collision after fix types in other method */
        public String doBackward2(Double d2) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public Double doForward2(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<double[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(double[] dArr, double[] dArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(double[] dArr, double[] dArr2) {
        }
    }

    private Doubles() {
    }

    public static /* synthetic */ int access$000(double[] dArr, double d2, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(double[] dArr, double d2, int i2, int i3) {
    }

    public static List<Double> asList(double... dArr) {
    }

    public static int compare(double d2, double d3) {
    }

    public static double[] concat(double[]... dArr) {
    }

    @Beta
    public static double constrainToRange(double d2, double d3, double d4) {
    }

    public static boolean contains(double[] dArr, double d2) {
    }

    public static double[] ensureCapacity(double[] dArr, int i2, int i3) {
    }

    @GwtIncompatible
    private static Pattern fpPattern() {
    }

    public static int hashCode(double d2) {
    }

    public static int indexOf(double[] dArr, double d2) {
    }

    public static boolean isFinite(double d2) {
    }

    public static String join(String str, double... dArr) {
    }

    public static int lastIndexOf(double[] dArr, double d2) {
    }

    public static Comparator<double[]> lexicographicalComparator() {
    }

    public static double max(double... dArr) {
    }

    public static double min(double... dArr) {
    }

    public static void reverse(double[] dArr) {
    }

    public static void sortDescending(double[] dArr) {
    }

    @Beta
    public static Converter<String, Double> stringConverter() {
    }

    public static double[] toArray(Collection<? extends Number> collection) {
    }

    @Beta
    @NullableDecl
    @GwtIncompatible
    public static Double tryParse(String str) {
    }

    private static int indexOf(double[] dArr, double d2, int i2, int i3) {
    }

    private static int lastIndexOf(double[] dArr, double d2, int i2, int i3) {
    }

    public static int indexOf(double[] dArr, double[] dArr2) {
    }

    public static void reverse(double[] dArr, int i2, int i3) {
    }

    public static void sortDescending(double[] dArr, int i2, int i3) {
    }
}
