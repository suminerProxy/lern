package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TransformedIterator<F, T> implements Iterator<T> {
    public final Iterator<? extends F> backingIterator;

    public TransformedIterator(Iterator<? extends F> it) {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
    }

    @Override // java.util.Iterator
    public final T next() {
    }

    @Override // java.util.Iterator
    public final void remove() {
    }

    public abstract T transform(F f2);
}
