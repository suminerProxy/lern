package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    public TransformedListIterator(ListIterator<? extends F> listIterator) {
    }

    private ListIterator<? extends F> backingIterator() {
    }

    @Override // java.util.ListIterator
    public void add(T t) {
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
    }

    @Override // java.util.ListIterator
    public final T previous() {
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
    }

    public void set(T t) {
    }
}
