package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardDescendingSet extends Sets.DescendingSet<E> {
        public final /* synthetic */ ForwardingNavigableSet this$0;

        public StandardDescendingSet(ForwardingNavigableSet forwardingNavigableSet) {
        }
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e2) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract NavigableSet<E> delegate();

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

    public E standardCeiling(E e2) {
    }

    public E standardFirst() {
    }

    public E standardFloor(E e2) {
    }

    public SortedSet<E> standardHeadSet(E e2) {
    }

    public E standardHigher(E e2) {
    }

    public E standardLast() {
    }

    public E standardLower(E e2) {
    }

    public E standardPollFirst() {
    }

    public E standardPollLast() {
    }

    @Beta
    public NavigableSet<E> standardSubSet(E e2, boolean z, E e3, boolean z2) {
    }

    public SortedSet<E> standardTailSet(E e2) {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e2, boolean z) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    public SortedSet<E> standardSubSet(E e2, E e3) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Set delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ SortedSet delegate() {
    }
}
