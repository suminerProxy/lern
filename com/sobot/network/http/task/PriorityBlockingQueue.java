package com.sobot.network.http.task;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PriorityBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
    private static final long serialVersionUID = -6903933977591709194L;
    private final int capacity;
    private final AtomicInteger count;
    public transient PriorityBlockingQueue<E>.Node<E> head;
    private transient PriorityBlockingQueue<E>.Node<E> last;
    private final Condition notEmpty;
    private final Condition notFull;
    private final ReentrantLock putLock;
    private final ReentrantLock takeLock;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Itr implements Iterator<E> {
        private PriorityBlockingQueue<E>.Node<E> current;
        private E currentElement;
        private PriorityBlockingQueue<E>.Node<E> lastRet;
        public final /* synthetic */ PriorityBlockingQueue this$0;

        public Itr(PriorityBlockingQueue priorityBlockingQueue) {
        }

        private PriorityBlockingQueue<E>.Node<E> nextNode(PriorityBlockingQueue<E>.Node<E> node) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Node<T> {
        public PriorityBlockingQueue<E>.Node<T> next;
        public final /* synthetic */ PriorityBlockingQueue this$0;
        private PriorityObject<?> value;
        private boolean valueAsT;

        public Node(PriorityBlockingQueue priorityBlockingQueue, T t) {
        }

        public int getPriority() {
        }

        public T getValue() {
        }

        public void setValue(T t) {
        }
    }

    public PriorityBlockingQueue() {
    }

    private E _dequeue() {
    }

    private void _enqueue(PriorityBlockingQueue<E>.Node<E> node) {
    }

    private synchronized E opQueue(PriorityBlockingQueue<E>.Node<E> node) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void signalNotEmpty() {
    }

    private void signalNotFull() {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
    }

    public void fullyLock() {
    }

    public void fullyUnlock() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.Queue
    public E peek() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e2) throws InterruptedException {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
    }

    public void unlink(PriorityBlockingQueue<E>.Node<E> node, PriorityBlockingQueue<E>.Node<E> node2) {
    }

    public PriorityBlockingQueue(int i2) {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
    }

    public PriorityBlockingQueue(Collection<? extends E> collection) {
    }

    @Override // java.util.Queue
    public E poll() {
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e2) {
    }
}
