package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e2) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e2) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e2) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i2) {
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Deque delegate() {
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Queue delegate() {
    }
}
