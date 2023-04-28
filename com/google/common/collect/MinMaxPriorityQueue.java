package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;
    @VisibleForTesting
    public final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        public /* synthetic */ Builder(Comparator comparator, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ Ordering access$200(Builder builder) {
        }

        public static /* synthetic */ int access$300(Builder builder) {
        }

        private <T extends B> Ordering<T> ordering() {
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i2) {
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i2) {
        }

        private Builder(Comparator<B> comparator) {
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Heap {
        public final Ordering<E> ordering;
        @Weak
        @MonotonicNonNullDecl
        public MinMaxPriorityQueue<E>.Heap otherHeap;
        public final /* synthetic */ MinMaxPriorityQueue this$0;

        public Heap(MinMaxPriorityQueue minMaxPriorityQueue, Ordering<E> ordering) {
        }

        public static /* synthetic */ boolean access$400(Heap heap, int i2) {
        }

        private int getGrandparentIndex(int i2) {
        }

        private int getLeftChildIndex(int i2) {
        }

        private int getParentIndex(int i2) {
        }

        private int getRightChildIndex(int i2) {
        }

        private boolean verifyIndex(int i2) {
        }

        public void bubbleUp(int i2, E e2) {
        }

        @CanIgnoreReturnValue
        public int bubbleUpAlternatingLevels(int i2, E e2) {
        }

        public int compareElements(int i2, int i3) {
        }

        public int crossOver(int i2, E e2) {
        }

        public int crossOverUp(int i2, E e2) {
        }

        public int fillHoleAt(int i2) {
        }

        public int findMin(int i2, int i3) {
        }

        public int findMinChild(int i2) {
        }

        public int findMinGrandChild(int i2) {
        }

        public int swapWithConceptuallyLastElement(E e2) {
        }

        public MoveDesc<E> tryCrossOverAndBubbleUp(int i2, int i3, E e2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MoveDesc<E> {
        public final E replaced;
        public final E toTrickle;

        public MoveDesc(E e2, E e3) {
        }
    }

    public /* synthetic */ MinMaxPriorityQueue(Builder builder, int i2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Object[] access$500(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    public static /* synthetic */ int access$600(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    public static /* synthetic */ int access$700(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    private int calculateNewCapacity() {
    }

    private static int capAtMaximumSize(int i2, int i3) {
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
    }

    public static Builder<Comparable> expectedSize(int i2) {
    }

    private MoveDesc<E> fillHole(int i2, E e2) {
    }

    private int getMaxElementIndex() {
    }

    private void growIfNeeded() {
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i2) {
    }

    @VisibleForTesting
    public static int initialQueueSize(int i2, int i3, Iterable<?> iterable) {
    }

    @VisibleForTesting
    public static boolean isEvenLevel(int i2) {
    }

    public static Builder<Comparable> maximumSize(int i2) {
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
    }

    private E removeAndGet(int i2) {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e2) {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
    }

    @VisibleForTesting
    public int capacity() {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    public Comparator<? super E> comparator() {
    }

    public E elementData(int i2) {
    }

    @VisibleForTesting
    public boolean isIntact() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e2) {
    }

    @Override // java.util.Queue
    public E peek() {
    }

    public E peekFirst() {
    }

    public E peekLast() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
    }

    @CanIgnoreReturnValue
    public E pollLast() {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public MoveDesc<E> removeAt(int i2) {
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
    }

    @CanIgnoreReturnValue
    public E removeLast() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i2) {
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        @MonotonicNonNullDecl
        private Queue<E> forgetMeNot;
        @NullableDecl
        private E lastFromForgetMeNot;
        private int nextCursor;
        @MonotonicNonNullDecl
        private List<E> skipMe;
        public final /* synthetic */ MinMaxPriorityQueue this$0;

        private QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue) {
        }

        private void checkModCount() {
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e2) {
        }

        private void nextNotInSkipMe(int i2) {
        }

        private boolean removeExact(Object obj) {
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

        public /* synthetic */ QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue, AnonymousClass1 anonymousClass1) {
        }
    }
}
