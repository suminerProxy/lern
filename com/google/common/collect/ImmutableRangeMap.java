package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = null;
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ImmutableList<Range<K>> {
        public final /* synthetic */ ImmutableRangeMap this$0;
        public final /* synthetic */ int val$len;
        public final /* synthetic */ int val$off;
        public final /* synthetic */ Range val$range;

        public AnonymousClass1(ImmutableRangeMap immutableRangeMap, int i2, int i3, Range range) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.List
        public Range<K> get(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ImmutableRangeMap<K, V> {
        public final /* synthetic */ ImmutableRangeMap this$0;
        public final /* synthetic */ ImmutableRangeMap val$outer;
        public final /* synthetic */ Range val$range;

        public AnonymousClass2(ImmutableRangeMap immutableRangeMap, ImmutableList immutableList, ImmutableList immutableList2, Range range, ImmutableRangeMap immutableRangeMap2) {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ RangeMap subRangeMap(Range range) {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder<K extends Comparable<?>, V> {
        private final List<Map.Entry<Range<K>, V>> entries;

        public ImmutableRangeMap<K, V> build() {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Range<K> range, V v) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(RangeMap<K, ? extends V> rangeMap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
        }

        public Object createRangeMap() {
        }

        public Object readResolve() {
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
    }

    public static /* synthetic */ ImmutableList access$000(ImmutableRangeMap immutableRangeMap) {
    }

    public static <K extends Comparable<?>, V> Builder<K, V> builder() {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ Map asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public void clear() {
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public V get(K k2) {
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public Map.Entry<Range<K>, V> getEntry(K k2) {
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public void put(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public void putAll(RangeMap<K, V> rangeMap) {
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public void putCoalescing(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    @Deprecated
    public void remove(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ RangeMap subRangeMap(Range range) {
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
    }

    public Object writeReplace() {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
    }
}
