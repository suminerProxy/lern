package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = null;
    private final double[] array;
    private final int end;
    private final transient int start;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        public /* synthetic */ AsList(ImmutableDoubleArray immutableDoubleArray, AnonymousClass1 anonymousClass1) {
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

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i2) {
        }
    }

    public /* synthetic */ ImmutableDoubleArray(double[] dArr, int i2, int i3, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ double[] access$000(ImmutableDoubleArray immutableDoubleArray) {
    }

    public static /* synthetic */ int access$100(ImmutableDoubleArray immutableDoubleArray) {
    }

    public static /* synthetic */ ImmutableDoubleArray access$200() {
    }

    public static /* synthetic */ boolean access$500(double d2, double d3) {
    }

    private static boolean areEqual(double d2, double d3) {
    }

    public static Builder builder(int i2) {
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
    }

    private boolean isPartialView() {
    }

    public static ImmutableDoubleArray of() {
    }

    public List<Double> asList() {
    }

    public boolean contains(double d2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public double get(int i2) {
    }

    public int hashCode() {
    }

    public int indexOf(double d2) {
    }

    public boolean isEmpty() {
    }

    public int lastIndexOf(double d2) {
    }

    public int length() {
    }

    public Object readResolve() {
    }

    public ImmutableDoubleArray subArray(int i2, int i3) {
    }

    public double[] toArray() {
    }

    public String toString() {
    }

    public ImmutableDoubleArray trimmed() {
    }

    public Object writeReplace() {
    }

    private ImmutableDoubleArray(double[] dArr) {
    }

    public static ImmutableDoubleArray of(double d2) {
    }

    @CanIgnoreReturnValue
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private double[] array;
        private int count;

        public Builder(int i2) {
        }

        private void ensureRoomFor(int i2) {
        }

        private static int expandedCapacity(int i2, int i3) {
        }

        public Builder add(double d2) {
        }

        public Builder addAll(double[] dArr) {
        }

        @CheckReturnValue
        public ImmutableDoubleArray build() {
        }

        public Builder addAll(Iterable<Double> iterable) {
        }

        public Builder addAll(Collection<Double> collection) {
        }

        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i2, int i3) {
    }

    public static Builder builder() {
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
    }

    public static ImmutableDoubleArray of(double d2, double d3) {
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
    }

    public static ImmutableDoubleArray of(double d2, double d3, double d4) {
    }

    public static ImmutableDoubleArray of(double d2, double d3, double d4, double d5) {
    }

    public static ImmutableDoubleArray of(double d2, double d3, double d4, double d5, double d6) {
    }

    public static ImmutableDoubleArray of(double d2, double d3, double d4, double d5, double d6, double d7) {
    }

    public static ImmutableDoubleArray of(double d2, double... dArr) {
    }
}
