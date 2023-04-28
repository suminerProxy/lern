package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    @NullableDecl
    private T nextOrNull;

    public AbstractSequentialIterator(@NullableDecl T t) {
    }

    @NullableDecl
    public abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
    }

    @Override // java.util.Iterator
    public final T next() {
    }
}
