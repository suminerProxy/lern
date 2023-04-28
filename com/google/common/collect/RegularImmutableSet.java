package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet<Object> EMPTY = null;
    @VisibleForTesting
    public final transient Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    @VisibleForTesting
    public final transient Object[] table;

    public RegularImmutableSet(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i2) {
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
    }
}
