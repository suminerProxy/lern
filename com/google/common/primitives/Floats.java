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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Floats {
    public static final int BYTES = 4;

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final float[] array;
        public final int end;
        public final int start;

        public FloatArrayAsList(float[] fArr) {
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
        public List<Float> subList(int i2, int i3) {
        }

        public float[] toFloatArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        public FloatArrayAsList(float[] fArr, int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i2) {
        }

        public Float set(int i2, Float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FloatConverter extends Converter<String, Float> implements Serializable {
        public static final FloatConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Float f2) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Float doForward(String str) {
        }

        public String toString() {
        }

        /* renamed from: doBackward  reason: avoid collision after fix types in other method */
        public String doBackward2(Float f2) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public Float doForward2(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LexicographicalComparator implements Comparator<float[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private LexicographicalComparator(String str, int i2) {
        }

        public static LexicographicalComparator valueOf(String str) {
        }

        public static LexicographicalComparator[] values() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(float[] fArr, float[] fArr2) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(float[] fArr, float[] fArr2) {
        }
    }

    private Floats() {
    }

    public static /* synthetic */ int access$000(float[] fArr, float f2, int i2, int i3) {
    }

    public static /* synthetic */ int access$100(float[] fArr, float f2, int i2, int i3) {
    }

    public static List<Float> asList(float... fArr) {
    }

    public static int compare(float f2, float f3) {
    }

    public static float[] concat(float[]... fArr) {
    }

    @Beta
    public static float constrainToRange(float f2, float f3, float f4) {
    }

    public static boolean contains(float[] fArr, float f2) {
    }

    public static float[] ensureCapacity(float[] fArr, int i2, int i3) {
    }

    public static int hashCode(float f2) {
    }

    public static int indexOf(float[] fArr, float f2) {
    }

    public static boolean isFinite(float f2) {
    }

    public static String join(String str, float... fArr) {
    }

    public static int lastIndexOf(float[] fArr, float f2) {
    }

    public static Comparator<float[]> lexicographicalComparator() {
    }

    public static float max(float... fArr) {
    }

    public static float min(float... fArr) {
    }

    public static void reverse(float[] fArr) {
    }

    public static void sortDescending(float[] fArr) {
    }

    @Beta
    public static Converter<String, Float> stringConverter() {
    }

    public static float[] toArray(Collection<? extends Number> collection) {
    }

    @Beta
    @NullableDecl
    @GwtIncompatible
    public static Float tryParse(String str) {
    }

    private static int indexOf(float[] fArr, float f2, int i2, int i3) {
    }

    private static int lastIndexOf(float[] fArr, float f2, int i2, int i3) {
    }

    public static int indexOf(float[] fArr, float[] fArr2) {
    }

    public static void reverse(float[] fArr, int i2, int i3) {
    }

    public static void sortDescending(float[] fArr, int i2, int i3) {
    }
}
