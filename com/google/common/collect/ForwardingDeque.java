package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(E e2) {
    }

    @Override // java.util.Deque
    public void addLast(E e2) {
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Deque<E> delegate();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
    }

    @Override // java.util.Deque
    public E getFirst() {
    }

    @Override // java.util.Deque
    public E getLast() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(E e2) {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(E e2) {
    }

    @Override // java.util.Deque
    public E peekFirst() {
    }

    @Override // java.util.Deque
    public E peekLast() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pop() {
    }

    @Override // java.util.Deque
    public void push(E e2) {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeFirst() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeLast() {
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Queue delegate() {
    }
}
