package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @GwtTransient
    public final Map<R, Map<C, V>> backingMap;
    @MonotonicNonNullDecl
    private transient Set<C> columnKeySet;
    @MonotonicNonNullDecl
    private transient StandardTable<R, C, V>.ColumnMap columnMap;
    @GwtTransient
    public final Supplier<? extends Map<C, V>> factory;
    @MonotonicNonNullDecl
    private transient Map<R, Map<C, V>> rowMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        public Iterator<Map.Entry<C, V>> columnIterator;
        @NullableDecl
        public Map.Entry<R, Map<C, V>> rowEntry;
        public final Iterator<Map.Entry<R, Map<C, V>>> rowIterator;
        public final /* synthetic */ StandardTable this$0;

        private CellIterator(StandardTable standardTable) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Table.Cell<R, C, V> next() {
        }

        public /* synthetic */ CellIterator(StandardTable standardTable, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Column extends Maps.ViewCachingAbstractMap<R, V> {
        public final C columnKey;
        public final /* synthetic */ StandardTable this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public final /* synthetic */ Column this$1;

            private EntrySet(Column column) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }

            public /* synthetic */ EntrySet(Column column, AnonymousClass1 anonymousClass1) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {
            public final Iterator<Map.Entry<R, Map<C, V>>> iterator;
            public final /* synthetic */ Column this$1;

            /* renamed from: com.google.common.collect.StandardTable$Column$EntrySetIterator$1EntryImpl  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C1EntryImpl extends AbstractMapEntry<R, V> {
                public final /* synthetic */ EntrySetIterator this$2;
                public final /* synthetic */ Map.Entry val$entry;

                public C1EntryImpl(EntrySetIterator entrySetIterator, Map.Entry entry) {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public R getKey() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V getValue() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                }
            }

            private EntrySetIterator(Column column) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<R, V> computeNext() {
            }

            public /* synthetic */ EntrySetIterator(Column column, AnonymousClass1 anonymousClass1) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class KeySet extends Maps.KeySet<R, V> {
            public final /* synthetic */ Column this$1;

            public KeySet(Column column) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class Values extends Maps.Values<R, V> {
            public final /* synthetic */ Column this$1;

            public Values(Column column) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
            }
        }

        public Column(StandardTable standardTable, C c) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<R, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<R> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @CanIgnoreReturnValue
        public boolean removeFromColumnIf(Predicate<? super Map.Entry<R, V>> predicate) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public final /* synthetic */ StandardTable this$0;

        private ColumnKeySet(StandardTable standardTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        public /* synthetic */ ColumnKeySet(StandardTable standardTable, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {
        public final /* synthetic */ StandardTable this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            public final /* synthetic */ ColumnMap this$1;

            /* renamed from: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements Function<C, Map<R, V>> {
                public final /* synthetic */ ColumnMapEntrySet this$2;

                public AnonymousClass1(ColumnMapEntrySet columnMapEntrySet) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public Map<R, V> apply(C c) {
                }
            }

            public ColumnMapEntrySet(ColumnMap columnMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public final /* synthetic */ ColumnMap this$1;

            public ColumnMapValues(ColumnMap columnMap) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
            }
        }

        private ColumnMap(StandardTable standardTable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<Map<R, V>> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        public /* synthetic */ ColumnMap(StandardTable standardTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {
        @NullableDecl
        public Map<C, V> backingRowMap;
        public final R rowKey;
        public final /* synthetic */ StandardTable this$0;

        /* renamed from: com.google.common.collect.StandardTable$Row$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterator<Map.Entry<C, V>> {
            public final /* synthetic */ Row this$1;
            public final /* synthetic */ Iterator val$iterator;

            public AnonymousClass1(Row row, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            public Map.Entry<C, V> next() {
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$Row$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends ForwardingMapEntry<C, V> {
            public final /* synthetic */ Row this$1;
            public final /* synthetic */ Map.Entry val$entry;

            public AnonymousClass2(Row row, Map.Entry entry) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Object delegate() {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public boolean equals(Object obj) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public V setValue(V v) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            public Map.Entry<C, V> delegate() {
            }
        }

        public Row(StandardTable standardTable, R r) {
        }

        public Map<C, V> backingRowMap() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        public Map<C, V> computeBackingRowMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<C, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        public void maintainEmptyInvariant() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        public Map.Entry<C, V> wrapEntry(Map.Entry<C, V> entry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {
        public final /* synthetic */ StandardTable this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            public final /* synthetic */ RowMap this$1;

            /* renamed from: com.google.common.collect.StandardTable$RowMap$EntrySet$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements Function<R, Map<C, V>> {
                public final /* synthetic */ EntrySet this$2;

                public AnonymousClass1(EntrySet entrySet) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public Map<C, V> apply(R r) {
                }
            }

            public EntrySet(RowMap rowMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        public RowMap(StandardTable standardTable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public final /* synthetic */ StandardTable this$0;

        private TableSet(StandardTable standardTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        public /* synthetic */ TableSet(StandardTable standardTable, AnonymousClass1 anonymousClass1) {
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
    }

    public static /* synthetic */ boolean access$300(StandardTable standardTable, Object obj, Object obj2, Object obj3) {
    }

    public static /* synthetic */ boolean access$400(StandardTable standardTable, Object obj, Object obj2, Object obj3) {
    }

    public static /* synthetic */ Map access$900(StandardTable standardTable, Object obj) {
    }

    private boolean containsMapping(Object obj, Object obj2, Object obj3) {
    }

    private Map<C, V> getOrCreate(R r) {
    }

    @CanIgnoreReturnValue
    private Map<R, V> removeColumn(Object obj) {
    }

    private boolean removeMapping(Object obj, Object obj2, Object obj3) {
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<C> columnKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@NullableDecl Object obj) {
    }

    public Iterator<C> createColumnKeyIterator() {
    }

    public Map<R, Map<C, V>> createRowMap() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<R> rowKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ColumnKeyIterator extends AbstractIterator<C> {
        public Iterator<Map.Entry<C, V>> entryIterator;
        public final Iterator<Map<C, V>> mapIterator;
        public final Map<C, V> seen;
        public final /* synthetic */ StandardTable this$0;

        private ColumnKeyIterator(StandardTable standardTable) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public C computeNext() {
        }

        public /* synthetic */ ColumnKeyIterator(StandardTable standardTable, AnonymousClass1 anonymousClass1) {
        }
    }
}
