package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSortedSet;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final DiscreteDomain<C> domain;

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
    }

    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
    }

    @Beta
    public static ContiguousSet<Integer> closed(int i2, int i3) {
    }

    @Beta
    public static ContiguousSet<Integer> closedOpen(int i2, int i3) {
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public ImmutableSortedSet<C> createDescendingSet() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSet(Object obj) {
    }

    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
    }

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSet(Object obj, Object obj2) {
    }

    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSet(Object obj) {
    }

    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
    }

    @Override // java.util.AbstractCollection
    public String toString() {
    }

    @Beta
    public static ContiguousSet<Long> closed(long j2, long j3) {
    }

    @Beta
    public static ContiguousSet<Long> closedOpen(long j2, long j3) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSet(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSet(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
    }

    public ContiguousSet<C> headSet(C c) {
    }

    public ContiguousSet<C> subSet(C c, C c2) {
    }

    public ContiguousSet<C> tailSet(C c) {
    }

    @GwtIncompatible
    public ContiguousSet<C> headSet(C c, boolean z) {
    }

    @GwtIncompatible
    public ContiguousSet<C> tailSet(C c, boolean z) {
    }

    @GwtIncompatible
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
    }
}
