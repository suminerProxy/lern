package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    @MonotonicNonNullDecl
    private transient Set<E> elementSet;
    @MonotonicNonNullDecl
    private transient Set<Multiset.Entry<E>> entrySet;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ElementSet extends Multisets.ElementSet<E> {
        public final /* synthetic */ AbstractMultiset this$0;

        public ElementSet(AbstractMultiset abstractMultiset) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public Multiset<E> multiset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySet extends Multisets.EntrySet<E> {
        public final /* synthetic */ AbstractMultiset this$0;

        public EntrySet(AbstractMultiset abstractMultiset) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public Multiset<E> multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@NullableDecl Object obj) {
    }

    public Set<E> createElementSet() {
    }

    public Set<Multiset.Entry<E>> createEntrySet() {
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    public Set<E> elementSet() {
    }

    public abstract Iterator<Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i2) {
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
    }

    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i2) {
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
    }

    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i2, int i3) {
    }
}
