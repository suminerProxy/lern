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
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Iterables {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;

        public AnonymousClass1(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass10<T> implements Function<Iterable<? extends T>, Iterator<? extends T>> {
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<T> extends FluentIterable<List<T>> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$size;

        public AnonymousClass2(Iterable iterable, int i2) {
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<T> extends FluentIterable<List<T>> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$size;

        public AnonymousClass3(Iterable iterable, int i2) {
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4<T> extends FluentIterable<T> {
        public final /* synthetic */ Predicate val$retainIfTrue;
        public final /* synthetic */ Iterable val$unfiltered;

        public AnonymousClass4(Iterable iterable, Predicate predicate) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$fromIterable;
        public final /* synthetic */ Function val$function;

        public AnonymousClass5(Iterable iterable, Function function) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass6<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$numberToSkip;

        /* renamed from: com.google.common.collect.Iterables$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterator<T> {
            public boolean atStart;
            public final /* synthetic */ AnonymousClass6 this$0;
            public final /* synthetic */ Iterator val$iterator;

            public AnonymousClass1(AnonymousClass6 anonymousClass6, Iterator it) {
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

        public AnonymousClass6(Iterable iterable, int i2) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass7<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$limitSize;

        public AnonymousClass7(Iterable iterable, int i2) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass8<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;

        public AnonymousClass8(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass9<T> extends FluentIterable<T> {
        public final /* synthetic */ Comparator val$comparator;
        public final /* synthetic */ Iterable val$iterables;

        public AnonymousClass9(Iterable iterable, Comparator comparator) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        private final Iterable<? extends T> iterable;

        public /* synthetic */ UnmodifiableIterable(Iterable iterable, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }

        private UnmodifiableIterable(Iterable<? extends T> iterable) {
        }
    }

    private Iterables() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    private static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
    }

    public static boolean contains(Iterable<?> iterable, @NullableDecl Object obj) {
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static int frequency(Iterable<?> iterable, @NullableDecl Object obj) {
    }

    public static <T> T get(Iterable<T> iterable, int i2) {
    }

    @NullableDecl
    public static <T> T getFirst(Iterable<? extends T> iterable, @NullableDecl T t) {
    }

    public static <T> T getLast(Iterable<T> iterable) {
    }

    private static <T> T getLastInNonemptyList(List<T> list) {
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static boolean isEmpty(Iterable<?> iterable) {
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i2) {
    }

    @Beta
    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i2) {
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i2) {
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
    }

    @NullableDecl
    public static <T> T removeFirstMatching(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
    }

    public static int size(Iterable<?> iterable) {
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i2) {
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, Predicate<? super T> predicate, int i2, int i3) {
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
    }

    public static <T> Function<Iterable<? extends T>, Iterator<? extends T>> toIterator() {
    }

    public static String toString(Iterable<?> iterable) {
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, Function<? super F, ? extends T> function) {
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
    }

    @NullableDecl
    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, @NullableDecl T t) {
    }

    @NullableDecl
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @NullableDecl T t) {
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
    }

    @GwtIncompatible
    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
    }

    public static Object[] toArray(Iterable<?> iterable) {
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> immutableCollection) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
    }

    @NullableDecl
    public static <T> T get(Iterable<? extends T> iterable, int i2, @NullableDecl T t) {
    }

    @NullableDecl
    public static <T> T getLast(Iterable<? extends T> iterable, @NullableDecl T t) {
    }
}
