package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: com.google.common.collect.IndexedImmutableSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ImmutableList<E> {
        public final /* synthetic */ IndexedImmutableSet this$0;

        public AnonymousClass1(IndexedImmutableSet indexedImmutableSet) {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i2) {
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
    }

    public abstract E get(int i2);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
    }
}
