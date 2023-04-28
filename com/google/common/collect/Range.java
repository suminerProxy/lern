package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    private static final Range<Comparable> ALL = null;
    private static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    /* renamed from: com.google.common.collect.Range$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LowerBoundFn implements Function<Range, Cut> {
        public static final LowerBoundFn INSTANCE = null;

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Cut apply(Range range) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Cut apply2(Range range) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        public static final Ordering<Range<?>> INSTANCE = null;
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        }

        public int compare(Range<?> range, Range<?> range2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UpperBoundFn implements Function<Range, Cut> {
        public static final UpperBoundFn INSTANCE = null;

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Cut apply(Range range) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Cut apply2(Range range) {
        }
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
    }

    public static <C extends Comparable<?>> Range<C> all() {
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
    }

    private static <T> SortedSet<T> cast(Iterable<T> iterable) {
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
    }

    public static <C extends Comparable<?>> Range<C> create(Cut<C> cut, Cut<C> cut2) {
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
    }

    public static <C extends Comparable<?>> Function<Range<C>, Cut<C>> lowerBoundFn() {
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
    }

    public static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
    }

    public static <C extends Comparable<?>> Function<Range<C>, Cut<C>> upperBoundFn() {
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
    }

    public boolean contains(C c) {
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
    }

    public boolean encloses(Range<C> range) {
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
    }

    public Range<C> gap(Range<C> range) {
    }

    public boolean hasLowerBound() {
    }

    public boolean hasUpperBound() {
    }

    public int hashCode() {
    }

    public Range<C> intersection(Range<C> range) {
    }

    public boolean isConnected(Range<C> range) {
    }

    public boolean isEmpty() {
    }

    public BoundType lowerBoundType() {
    }

    public C lowerEndpoint() {
    }

    public Object readResolve() {
    }

    public Range<C> span(Range<C> range) {
    }

    public String toString() {
    }

    public BoundType upperBoundType() {
    }

    public C upperEndpoint() {
    }

    private static String toString(Cut<?> cut, Cut<?> cut2) {
    }

    @Deprecated
    public boolean apply(C c) {
    }
}
