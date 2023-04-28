package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class FluentIterable<E> implements Iterable<E> {
    private final Optional<Iterable<E>> iterableDelegate;

    /* renamed from: com.google.common.collect.FluentIterable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends FluentIterable<E> {
        public final /* synthetic */ Iterable val$iterable;

        public AnonymousClass1(Iterable iterable, Iterable iterable2) {
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.FluentIterable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$inputs;

        public AnonymousClass2(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.FluentIterable$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable[] val$inputs;

        /* renamed from: com.google.common.collect.FluentIterable$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
            public final /* synthetic */ AnonymousClass3 this$0;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public /* bridge */ /* synthetic */ Object get(int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Iterator<? extends T> get(int i2) {
            }
        }

        public AnonymousClass3(Iterable[] iterableArr) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public FluentIterable<E> apply(Iterable<E> iterable) {
        }
    }

    public FluentIterable() {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
    }

    private static <T> FluentIterable<T> concatNoDefensiveCopy(Iterable<? extends T>... iterableArr) {
    }

    public static <E> FluentIterable<E> from(Iterable<E> iterable) {
    }

    private Iterable<E> getDelegate() {
    }

    @Beta
    public static <E> FluentIterable<E> of() {
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
    }

    @Beta
    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
    }

    public final boolean contains(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C c) {
    }

    public final FluentIterable<E> cycle() {
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
    }

    public final Optional<E> first() {
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
    }

    public final E get(int i2) {
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> function) {
    }

    public final boolean isEmpty() {
    }

    @Beta
    public final String join(Joiner joiner) {
    }

    public final Optional<E> last() {
    }

    public final FluentIterable<E> limit(int i2) {
    }

    public final int size() {
    }

    public final FluentIterable<E> skip(int i2) {
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
    }

    public final ImmutableList<E> toList() {
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
    }

    public final ImmutableMultiset<E> toMultiset() {
    }

    public final ImmutableSet<E> toSet() {
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
    }

    public String toString() {
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
    }

    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> function) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
    }

    @Beta
    public static <E> FluentIterable<E> from(E[] eArr) {
    }

    @Beta
    public static <E> FluentIterable<E> of(@NullableDecl E e2, E... eArr) {
    }

    @Beta
    public final FluentIterable<E> append(E... eArr) {
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> cls) {
    }

    public FluentIterable(Iterable<E> iterable) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
    }

    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
    }
}
