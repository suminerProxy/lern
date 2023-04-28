package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    @NullableDecl
    private final T lowerEndpoint;
    @MonotonicNonNullDecl
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    @NullableDecl
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType) {
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType, @NullableDecl T t2, BoundType boundType2) {
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @NullableDecl T t, BoundType boundType) {
    }

    public Comparator<? super T> comparator() {
    }

    public boolean contains(@NullableDecl T t) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public BoundType getLowerBoundType() {
    }

    public T getLowerEndpoint() {
    }

    public BoundType getUpperBoundType() {
    }

    public T getUpperEndpoint() {
    }

    public boolean hasLowerBound() {
    }

    public boolean hasUpperBound() {
    }

    public int hashCode() {
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
    }

    public boolean isEmpty() {
    }

    public GeneralRange<T> reverse() {
    }

    public String toString() {
    }

    public boolean tooHigh(@NullableDecl T t) {
    }

    public boolean tooLow(@NullableDecl T t) {
    }
}
