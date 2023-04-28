package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    @Override // com.google.common.collect.RangeSet
    public void add(Range<C> range) {
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public void clear() {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean contains(C c) {
    }

    @Override // com.google.common.collect.RangeSet
    public abstract boolean encloses(Range<C> range);

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.RangeSet
    public final int hashCode() {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.RangeSet
    public abstract Range<C> rangeContaining(C c);

    @Override // com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public final String toString() {
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(Iterable<Range<C>> iterable) {
    }
}
