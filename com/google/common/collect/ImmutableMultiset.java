package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    @LazyInit
    private transient ImmutableList<E> asList;
    @LazyInit
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;

    /* renamed from: com.google.common.collect.ImmutableMultiset$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends UnmodifiableIterator<E> {
        @MonotonicNonNullDecl
        public E element;
        public int remaining;
        public final /* synthetic */ ImmutableMultiset this$0;
        public final /* synthetic */ Iterator val$entryIterator;

        public AnonymousClass1(ImmutableMultiset immutableMultiset, Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder<E> extends ImmutableCollection.Builder<E> {
        public boolean buildInvoked;
        public ObjectCountHashMap<E> contents;
        public boolean isLinkedHash;

        public Builder() {
        }

        @NullableDecl
        public static <T> ObjectCountHashMap<T> tryGetMap(Iterable<T> iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterable iterable) {
        }

        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e2, int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection build() {
        }

        @CanIgnoreReturnValue
        public Builder<E> setCount(E e2, int i2) {
        }

        public Builder(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object[] objArr) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterator it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
        }

        public Builder(boolean z) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;
        public final /* synthetic */ ImmutableMultiset this$0;

        private EntrySet(ImmutableMultiset immutableMultiset) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        public Object writeReplace() {
        }

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public Multiset.Entry<E> get(int i2) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
        }

        public Object readResolve() {
        }
    }

    public static <E> Builder<E> builder() {
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends Multiset.Entry<? extends E>> collection) {
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
    }

    private ImmutableSet<Multiset.Entry<E>> createEntrySet() {
    }

    public static <E> ImmutableMultiset<E> of() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e2, int i2) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i2) {
    }

    public abstract ImmutableSet<E> elementSet();

    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@NullableDecl Object obj) {
    }

    public abstract Multiset.Entry<E> getEntry(int i2);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(Object obj, int i2) {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e2, int i2) {
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
    }

    public static <E> ImmutableMultiset<E> of(E e2) {
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e2, int i2, int i3) {
    }

    public static <E> ImmutableMultiset<E> of(E e2, E e3) {
    }

    public static <E> ImmutableMultiset<E> of(E e2, E e3, E e4) {
    }

    public static <E> ImmutableMultiset<E> of(E e2, E e3, E e4, E e5) {
    }

    public static <E> ImmutableMultiset<E> of(E e2, E e3, E e4, E e5, E e6) {
    }

    public static <E> ImmutableMultiset<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
    }
}
