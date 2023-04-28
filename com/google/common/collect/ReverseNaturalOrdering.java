package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {
    public static final ReverseNaturalOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Iterable iterable) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Iterable iterable) {
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable> Ordering<S> reverse() {
    }

    public String toString() {
    }

    public int compare(Comparable comparable, Comparable comparable2) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Object obj, Object obj2, Object obj3, Object[] objArr) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Object obj, Object obj2, Object obj3, Object[] objArr) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object max(Iterator it) {
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ Object min(Iterator it) {
    }

    public <E extends Comparable> E max(E e2, E e3) {
    }

    public <E extends Comparable> E min(E e2, E e3) {
    }

    public <E extends Comparable> E max(E e2, E e3, E e4, E... eArr) {
    }

    public <E extends Comparable> E min(E e2, E e3, E e4, E... eArr) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable> E max(Iterator<E> it) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable> E min(Iterator<E> it) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable> E max(Iterable<E> iterable) {
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable> E min(Iterable<E> iterable) {
    }
}
