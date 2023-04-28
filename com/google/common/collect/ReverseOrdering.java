package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Ordering<? super T> forwardOrder;

    public ReverseOrdering(Ordering<? super T> ordering) {
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(E e2, E e3) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(E e2, E e3) {
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
    }

    public String toString() {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(E e2, E e3, E e4, E... eArr) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(E e2, E e3, E e4, E... eArr) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterator<E> it) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterator<E> it) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterable<E> iterable) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterable<E> iterable) {
    }
}
