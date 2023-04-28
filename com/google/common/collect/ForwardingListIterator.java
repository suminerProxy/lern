package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.ListIterator;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public void add(E e2) {
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public abstract ListIterator<E> delegate();

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
    }

    @Override // java.util.ListIterator
    @CanIgnoreReturnValue
    public E previous() {
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
    }

    @Override // java.util.ListIterator
    public void set(E e2) {
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Iterator delegate() {
    }
}
