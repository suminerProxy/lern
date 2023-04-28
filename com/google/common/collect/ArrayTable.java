package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    @MonotonicNonNullDecl
    private transient ArrayTable<R, C, V>.ColumnMap columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    @MonotonicNonNullDecl
    private transient ArrayTable<R, C, V>.RowMap rowMap;

    /* renamed from: com.google.common.collect.ArrayTable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractIndexedListIterator<Table.Cell<R, C, V>> {
        public final /* synthetic */ ArrayTable this$0;

        public AnonymousClass1(ArrayTable arrayTable, int i2) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public Table.Cell<R, C, V> get(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends Tables.AbstractCell<R, C, V> {
        public final int columnIndex;
        public final int rowIndex;
        public final /* synthetic */ ArrayTable this$0;
        public final /* synthetic */ int val$index;

        public AnonymousClass2(ArrayTable arrayTable, int i2) {
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends AbstractIndexedListIterator<V> {
        public final /* synthetic */ ArrayTable this$0;

        public AnonymousClass3(ArrayTable arrayTable, int i2) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public V get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {
        private final ImmutableMap<K, Integer> keyIndex;

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractMapEntry<K, V> {
            public final /* synthetic */ ArrayMap this$0;
            public final /* synthetic */ int val$index;

            public AnonymousClass1(ArrayMap arrayMap, int i2) {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public K getKey() {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public V getValue() {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public V setValue(V v) {
            }
        }

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIndexedListIterator<Map.Entry<K, V>> {
            public final /* synthetic */ ArrayMap this$0;

            public AnonymousClass2(ArrayMap arrayMap, int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public /* bridge */ /* synthetic */ Object get(int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Map.Entry<K, V> get(int i2) {
            }
        }

        public /* synthetic */ ArrayMap(ImmutableMap immutableMap, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
        }

        public Map.Entry<K, V> getEntry(int i2) {
        }

        public K getKey(int i2) {
        }

        public abstract String getKeyRole();

        @NullableDecl
        public abstract V getValue(int i2);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @NullableDecl
        public abstract V setValue(int i2, V v);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        private ArrayMap(ImmutableMap<K, Integer> immutableMap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Column extends ArrayMap<R, V> {
        public final int columnIndex;
        public final /* synthetic */ ArrayTable this$0;

        public Column(ArrayTable arrayTable, int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V getValue(int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V setValue(int i2, V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ColumnMap extends ArrayMap<C, Map<R, V>> {
        public final /* synthetic */ ArrayTable this$0;

        public /* synthetic */ ColumnMap(ArrayTable arrayTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public /* bridge */ /* synthetic */ Object getValue(int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public /* bridge */ /* synthetic */ Object setValue(int i2, Object obj) {
        }

        private ColumnMap(ArrayTable arrayTable) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<R, V> getValue(int i2) {
        }

        public Map<R, V> put(C c, Map<R, V> map) {
        }

        public Map<R, V> setValue(int i2, Map<R, V> map) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Row extends ArrayMap<C, V> {
        public final int rowIndex;
        public final /* synthetic */ ArrayTable this$0;

        public Row(ArrayTable arrayTable, int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V getValue(int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V setValue(int i2, V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class RowMap extends ArrayMap<R, Map<C, V>> {
        public final /* synthetic */ ArrayTable this$0;

        public /* synthetic */ RowMap(ArrayTable arrayTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public /* bridge */ /* synthetic */ Object getValue(int i2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public /* bridge */ /* synthetic */ Object setValue(int i2, Object obj) {
        }

        private RowMap(ArrayTable arrayTable) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<C, V> getValue(int i2) {
        }

        public Map<C, V> put(R r, Map<C, V> map) {
        }

        public Map<C, V> setValue(int i2, Map<C, V> map) {
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
    }

    public static /* synthetic */ Table.Cell access$000(ArrayTable arrayTable, int i2) {
    }

    public static /* synthetic */ ImmutableList access$100(ArrayTable arrayTable) {
    }

    public static /* synthetic */ ImmutableList access$200(ArrayTable arrayTable) {
    }

    public static /* synthetic */ ImmutableMap access$300(ArrayTable arrayTable) {
    }

    public static /* synthetic */ ImmutableMap access$600(ArrayTable arrayTable) {
    }

    public static /* synthetic */ Object access$800(ArrayTable arrayTable, int i2) {
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
    }

    private Table.Cell<R, C, V> getCell(int i2) {
    }

    private V getValue(int i2) {
    }

    public V at(int i2, int i3) {
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @Deprecated
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
    }

    public ImmutableList<C> columnKeyList() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
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

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public V erase(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    public void eraseAll() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @Deprecated
    public V remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
    }

    public ImmutableList<R> rowKeyList() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set rowKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
    }

    @CanIgnoreReturnValue
    public V set(int i2, int i3, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<V> valuesIterator() {
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, V> table) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
    }

    private ArrayTable(Table<R, C, V> table) {
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
    }
}
