package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ListIterator;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i2) {
    }

    @Override // com.google.common.collect.ImmutableAsList
    public ImmutableCollection<E> delegateCollection() {
    }

    public ImmutableList<? extends E> delegateList() {
    }

    @Override // java.util.List
    public E get(int i2) {
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

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public UnmodifiableListIterator<E> listIterator(int i2) {
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr, int i2) {
    }
}
