package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Iterators {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator val$iterator;

        public AnonymousClass1(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass10<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Enumeration val$enumeration;

        public AnonymousClass10(Enumeration enumeration) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass11<T> implements Enumeration<T> {
        public final /* synthetic */ Iterator val$iterator;

        public AnonymousClass11(Iterator it) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public T nextElement() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<T> implements Iterator<T> {
        public Iterator<T> iterator;
        public final /* synthetic */ Iterable val$iterable;

        public AnonymousClass2(Iterable iterable) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<T> extends UnmodifiableIterator<T> {
        public int index;
        public final /* synthetic */ Object[] val$elements;

        public AnonymousClass3(Object[] objArr) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4<T> extends UnmodifiableIterator<List<T>> {
        public final /* synthetic */ Iterator val$iterator;
        public final /* synthetic */ boolean val$pad;
        public final /* synthetic */ int val$size;

        public AnonymousClass4(Iterator it, int i2, boolean z) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public List<T> next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5<T> extends AbstractIterator<T> {
        public final /* synthetic */ Predicate val$retainIfTrue;
        public final /* synthetic */ Iterator val$unfiltered;

        public AnonymousClass5(Iterator it, Predicate predicate) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public T computeNext() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* renamed from: com.google.common.collect.Iterators$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass6<F, T> extends TransformedIterator<F, T> {
        public final /* synthetic */ Function val$function;

        public AnonymousClass6(Iterator it, Function function) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public T transform(F f2) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass7<T> implements Iterator<T> {
        private int count;
        public final /* synthetic */ Iterator val$iterator;
        public final /* synthetic */ int val$limitSize;

        public AnonymousClass7(int i2, Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass8<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator val$iterator;

        public AnonymousClass8(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass9<T> extends UnmodifiableIterator<T> {
        public boolean done;
        public final /* synthetic */ Object val$value;

        public AnonymousClass9(Object obj) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        public static final UnmodifiableListIterator<Object> EMPTY = null;
        private final T[] array;
        private final int offset;

        public ArrayItr(T[] tArr, int i2, int i3, int i4) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public T get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator;
        @NullableDecl
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
        @NullableDecl
        private Iterator<? extends T> toRemove;
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
        }

        @NullableDecl
        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EmptyModifiableIterator implements Iterator<Object> {
        private static final /* synthetic */ EmptyModifiableIterator[] $VALUES = null;
        public static final EmptyModifiableIterator INSTANCE = null;

        private EmptyModifiableIterator(String str, int i2) {
        }

        public static EmptyModifiableIterator valueOf(String str) {
        }

        public static EmptyModifiableIterator[] values() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        public final Queue<PeekingIterator<T>> queue;

        /* renamed from: com.google.common.collect.Iterators$MergingIterator$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Comparator<PeekingIterator<T>> {
            public final /* synthetic */ MergingIterator this$0;
            public final /* synthetic */ Comparator val$itemComparator;

            public AnonymousClass1(MergingIterator mergingIterator, Comparator comparator) {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            }

            public int compare(PeekingIterator<T> peekingIterator, PeekingIterator<T> peekingIterator2) {
            }
        }

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        @NullableDecl
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public E next() {
        }

        @Override // com.google.common.collect.PeekingIterator
        public E peek() {
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
        }
    }

    private Iterators() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i2) {
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
    }

    public static <T> ListIterator<T> cast(Iterator<T> it) {
    }

    public static void checkNonnegative(int i2) {
    }

    public static void clear(Iterator<?> it) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
    }

    public static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
    }

    private static <T> Iterator<T> consumingForArray(T... tArr) {
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
    }

    public static boolean contains(Iterator<?> it, @NullableDecl Object obj) {
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
    }

    public static <T> UnmodifiableListIterator<T> emptyListIterator() {
    }

    public static <T> Iterator<T> emptyModifiableIterator() {
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
    }

    public static int frequency(Iterator<?> it, @NullableDecl Object obj) {
    }

    public static <T> T get(Iterator<T> it, int i2) {
    }

    public static <T> T getLast(Iterator<T> it) {
    }

    @NullableDecl
    public static <T> T getNext(Iterator<? extends T> it, @NullableDecl T t) {
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i2) {
    }

    @Beta
    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i2) {
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i2) {
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(Iterator<T> it, int i2, boolean z) {
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
    }

    @NullableDecl
    public static <T> T pollNext(Iterator<T> it) {
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@NullableDecl T t) {
    }

    public static int size(Iterator<?> it) {
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
    }

    public static String toString(Iterator<?> it) {
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, Function<? super F, ? extends T> function) {
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> it) {
    }

    public static <T> UnmodifiableListIterator<T> forArray(T[] tArr, int i2, int i3, int i4) {
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
    }

    @NullableDecl
    public static <T> T getLast(Iterator<? extends T> it, @NullableDecl T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
    }

    @NullableDecl
    public static <T> T get(Iterator<? extends T> it, int i2, @NullableDecl T t) {
    }

    @NullableDecl
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, @NullableDecl T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
    }

    @NullableDecl
    public static <T> T getOnlyElement(Iterator<? extends T> it, @NullableDecl T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
    }
}
