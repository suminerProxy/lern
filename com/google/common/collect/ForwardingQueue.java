package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Queue;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Queue<E> delegate();

    @Override // java.util.Queue
    public E element() {
    }

    @CanIgnoreReturnValue
    public boolean offer(E e2) {
    }

    @Override // java.util.Queue
    public E peek() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E remove() {
    }

    public boolean standardOffer(E e2) {
    }

    public E standardPeek() {
    }

    public E standardPoll() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }
}
