package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SortedMultisets {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        @Weak
        private final SortedMultiset<E> multiset;

        public ElementSet(SortedMultiset<E> sortedMultiset) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // java.util.SortedSet
        public E first() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // java.util.SortedSet
        public E last() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public /* bridge */ /* synthetic */ Multiset multiset() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final SortedMultiset<E> multiset() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        public NavigableElementSet(SortedMultiset<E> sortedMultiset) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
        }
    }

    private SortedMultisets() {
    }

    public static /* synthetic */ Object access$000(Multiset.Entry entry) {
    }

    public static /* synthetic */ Object access$100(Multiset.Entry entry) {
    }

    private static <E> E getElementOrNull(@NullableDecl Multiset.Entry<E> entry) {
    }

    private static <E> E getElementOrThrow(Multiset.Entry<E> entry) {
    }
}
