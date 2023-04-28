package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    /* renamed from: com.google.common.collect.RegularContiguousSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSequentialIterator<C> {
        public final C last;
        public final /* synthetic */ RegularContiguousSet this$0;

        public AnonymousClass1(RegularContiguousSet regularContiguousSet, Comparable comparable) {
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        public /* bridge */ /* synthetic */ Object computeNext(Object obj) {
        }

        public C computeNext(C c) {
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AbstractSequentialIterator<C> {
        public final C first;
        public final /* synthetic */ RegularContiguousSet this$0;

        public AnonymousClass2(RegularContiguousSet regularContiguousSet, Comparable comparable) {
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        public /* bridge */ /* synthetic */ Object computeNext(Object obj) {
        }

        public C computeNext(C c) {
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends ImmutableAsList<C> {
        public final /* synthetic */ RegularContiguousSet this$0;

        public AnonymousClass3(RegularContiguousSet regularContiguousSet) {
        }

        @Override // com.google.common.collect.ImmutableAsList
        public /* bridge */ /* synthetic */ ImmutableCollection delegateCollection() {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableAsList
        public ImmutableSortedSet<C> delegateCollection() {
        }

        @Override // java.util.List
        public C get(int i2) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final DiscreteDomain<C> domain;
        public final Range<C> range;

        public /* synthetic */ SerializedForm(Range range, DiscreteDomain discreteDomain, AnonymousClass1 anonymousClass1) {
        }

        private Object readResolve() {
        }

        private SerializedForm(Range<C> range, DiscreteDomain<C> discreteDomain) {
        }
    }

    public RegularContiguousSet(Range<C> range, DiscreteDomain<C> discreteDomain) {
    }

    public static /* synthetic */ boolean access$000(Comparable comparable, Comparable comparable2) {
    }

    private static boolean equalsOrThrow(Comparable<?> comparable, @NullableDecl Comparable<?> comparable2) {
    }

    private ContiguousSet<C> intersectionInCurrentDomain(Range<C> range) {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object first() {
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public int indexOf(Object obj) {
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object last() {
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<C> descendingIterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> headSetImpl(C c, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<C> iterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
    }
}
