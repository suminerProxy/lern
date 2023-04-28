package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = null;
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    @RetainedWith
    @LazyInit
    private transient ImmutableSet<K> keySet;
    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;
    @RetainedWith
    @LazyInit
    private transient ImmutableCollection<V> values;

    /* renamed from: com.google.common.collect.ImmutableMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends UnmodifiableIterator<K> {
        public final /* synthetic */ ImmutableMap this$0;
        public final /* synthetic */ UnmodifiableIterator val$entryIterator;

        public AnonymousClass1(ImmutableMap immutableMap, UnmodifiableIterator unmodifiableIterator) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public K next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder<K, V> {
        public Object[] alternatingKeysAndValues;
        public boolean entriesUsed;
        public int size;
        @MonotonicNonNullDecl
        public Comparator<? super V> valueComparator;

        public Builder() {
        }

        private void ensureCapacity(int i2) {
        }

        public ImmutableMap<K, V> build() {
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k2, V v) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
        }

        public void sortEntries() {
        }

        public Builder(int i2) {
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {

        /* renamed from: com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1EntrySetImpl extends ImmutableMapEntrySet<K, V> {
            public final /* synthetic */ IteratorBasedImmutableMap this$0;

            public C1EntrySetImpl(IteratorBasedImmutableMap iteratorBasedImmutableMap) {
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public /* bridge */ /* synthetic */ Iterator iterator() {
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            public ImmutableMap<K, V> map() {
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            }
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        public final /* synthetic */ ImmutableMap this$0;

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> {
            public final /* synthetic */ MapViewOfValuesAsSingletonSets this$1;
            public final /* synthetic */ Iterator val$backingIterator;

            /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00671 extends AbstractMapEntry<K, ImmutableSet<V>> {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ Map.Entry val$backingEntry;

                public C00671(AnonymousClass1 anonymousClass1, Map.Entry entry) {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public /* bridge */ /* synthetic */ Object getValue() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public ImmutableSet<V> getValue() {
                }
            }

            public AnonymousClass1(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, ImmutableSet<V>> next() {
            }
        }

        private MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
        }

        @Override // java.util.Map
        public int size() {
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(@NullableDecl Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        public SerializedForm(ImmutableMap<?, ?> immutableMap) {
        }

        public Object createMap(Builder<Object, Object> builder) {
        }

        public Object readResolve() {
        }
    }

    public static <K, V> Builder<K, V> builder() {
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i2) {
    }

    public static void checkNoConflict(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k2, V v) {
    }

    public static <K, V> ImmutableMap<K, V> of() {
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
    }

    @Override // java.util.Map
    public int hashCode() {
    }

    @Override // java.util.Map
    public boolean isEmpty() {
    }

    public boolean isHashCodeFast() {
    }

    public abstract boolean isPartialView();

    public UnmodifiableIterator<K> keyIterator() {
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k2, V v) {
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
    }

    public String toString() {
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }

    public Object writeReplace() {
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v) {
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2) {
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
    }
}
