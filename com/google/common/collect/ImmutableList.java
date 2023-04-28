package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final UnmodifiableListIterator<Object> EMPTY_ITR = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterable iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection build() {
        }

        public Builder(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterator it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableList<E> build() {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object[] objArr) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e2) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Itr<E> extends AbstractIndexedListIterator<E> {
        private final ImmutableList<E> list;

        public Itr(ImmutableList<E> immutableList, int i2) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public E get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
        }

        private int reverseIndex(int i2) {
        }

        private int reversePosition(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
        }

        public Object readResolve() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SubList extends ImmutableList<E> {
        public final transient int length;
        public final transient int offset;
        public final /* synthetic */ ImmutableList this$0;

        public SubList(ImmutableList immutableList, int i2, int i3) {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] internalArray() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i2, int i3) {
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
    }

    public static <E> Builder<E> builder() {
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i2) {
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
    }

    public static <E> ImmutableList<E> of() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> asList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i2) {
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i2) {
    }

    public ImmutableList<E> reverse() {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i2, E e2) {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
    }

    public ImmutableList<E> subListUnchecked(int i2, int i3) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i2) {
    }

    public static <E> ImmutableList<E> of(E e2) {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i2, int i3) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3) {
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4) {
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i2) {
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5) {
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
    }

    @SafeVarargs
    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
    }
}
