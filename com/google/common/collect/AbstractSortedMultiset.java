package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {
    @GwtTransient
    public final Comparator<? super E> comparator;
    @MonotonicNonNullDecl
    private transient SortedMultiset<E> descendingMultiset;

    /* renamed from: com.google.common.collect.AbstractSortedMultiset$1DescendingMultisetImpl  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1DescendingMultisetImpl extends DescendingMultiset<E> {
        public final /* synthetic */ AbstractSortedMultiset this$0;

        public C1DescendingMultisetImpl(AbstractSortedMultiset abstractSortedMultiset) {
        }

        @Override // com.google.common.collect.DescendingMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.DescendingMultiset
        public SortedMultiset<E> forwardMultiset() {
        }

        @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }
    }

    public AbstractSortedMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
    }

    public SortedMultiset<E> createDescendingMultiset() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public /* bridge */ /* synthetic */ Set createElementSet() {
    }

    public abstract Iterator<Multiset.Entry<E>> descendingEntryIterator();

    public Iterator<E> descendingIterator() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> descendingMultiset() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(@NullableDecl E e2, BoundType boundType, @NullableDecl E e3, BoundType boundType2) {
    }

    public AbstractSortedMultiset(Comparator<? super E> comparator) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public NavigableSet<E> createElementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ SortedSet elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
    }
}
