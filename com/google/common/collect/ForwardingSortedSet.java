package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    private int unsafeCompare(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    public E first() {
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e2) {
    }

    @Override // java.util.SortedSet
    public E last() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    @Beta
    public boolean standardContains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    @Beta
    public boolean standardRemove(@NullableDecl Object obj) {
    }

    @Beta
    public SortedSet<E> standardSubSet(E e2, E e3) {
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e2, E e3) {
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e2) {
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Set delegate() {
    }
}
