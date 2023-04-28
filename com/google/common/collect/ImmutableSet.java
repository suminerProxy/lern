package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    public static final int MAX_TABLE_SIZE = 1073741824;
    @RetainedWith
    @NullableDecl
    @LazyInit
    private transient ImmutableList<E> asList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;
        @VisibleForTesting
        @NullableDecl
        public Object[] hashTable;

        public Builder() {
        }

        private void addDeduping(E e2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterable iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection build() {
        }

        public Builder(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterator it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object[] objArr) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
        }

        public Object readResolve() {
        }
    }

    public static /* synthetic */ boolean access$000(int i2, int i3) {
    }

    public static /* synthetic */ ImmutableSet access$100(int i2, Object[] objArr) {
    }

    public static <E> Builder<E> builder() {
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i2) {
    }

    @VisibleForTesting
    public static int chooseTableSize(int i2) {
    }

    private static <E> ImmutableSet<E> construct(int i2, Object... objArr) {
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
    }

    public static <E> ImmutableSet<E> of() {
    }

    private static boolean shouldTrim(int i2, int i3) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
    }

    public ImmutableList<E> createAsList() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
    }

    public boolean isHashCodeFast() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
    }

    public static <E> ImmutableSet<E> of(E e2) {
    }

    public static <E> ImmutableSet<E> of(E e2, E e3) {
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4) {
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5) {
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
    }

    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5, E e6) {
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
    }
}
