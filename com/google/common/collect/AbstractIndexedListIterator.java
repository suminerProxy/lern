package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int i2) {
    }

    public abstract E get(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
    }

    @Override // java.util.ListIterator
    public final E previous() {
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
    }

    public AbstractIndexedListIterator(int i2, int i3) {
    }
}
