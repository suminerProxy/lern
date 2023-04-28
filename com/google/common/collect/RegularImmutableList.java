package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> EMPTY = null;
    @VisibleForTesting
    public final transient Object[] array;
    private final transient int size;

    public RegularImmutableList(Object[] objArr, int i2) {
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i2) {
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

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }
}
