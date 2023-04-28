package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Tables {
    private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER = null;

    /* renamed from: com.google.common.collect.Tables$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Function<Map<Object, Object>, Map<Object, Object>> {
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Map<Object, Object> apply(Map<Object, Object> map) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Map<Object, Object> apply2(Map<Object, Object> map) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        @Override // com.google.common.collect.Table.Cell
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        private final C columnKey;
        @NullableDecl
        private final R rowKey;
        @NullableDecl
        private final V value;

        public ImmutableCell(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {
        public final Table<R, C, V1> fromTable;
        public final Function<? super V1, V2> function;

        /* renamed from: com.google.common.collect.Tables$TransformedTable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> {
            public final /* synthetic */ TransformedTable this$0;

            public AnonymousClass1(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Table.Cell<R, C, V2> apply(Table.Cell<R, C, V1> cell) {
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Function<Map<C, V1>, Map<C, V2>> {
            public final /* synthetic */ TransformedTable this$0;

            public AnonymousClass2(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<C, V2> apply(Map<C, V1> map) {
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Function<Map<R, V1>, Map<R, V2>> {
            public final /* synthetic */ TransformedTable this$0;

            public AnonymousClass3(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<R, V2> apply(Map<R, V1> map) {
            }
        }

        public TransformedTable(Table<R, C, V1> table, Function<? super V1, V2> function) {
        }

        public Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> cellFunction() {
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<R, C, V2>> cellIterator() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V2> column(C c) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V2>> columnMap() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable
        public Collection<V2> createValues() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 get(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 put(R r, C c, V2 v2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V2> table) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 remove(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V2> row(R r) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V2>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        private static final Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> TRANSPOSE_CELL = null;
        public final Table<R, C, V> original;

        /* renamed from: com.google.common.collect.Tables$TransposeTable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> {
            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public Table.Cell<?, ?, ?> apply2(Table.Cell<?, ?, ?> cell) {
            }
        }

        public TransposeTable(Table<R, C, V> table) {
        }

        @Override // com.google.common.collect.AbstractTable
        public Iterator<Table.Cell<C, R, V>> cellIterator() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> column(R r) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> columnMap() {
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
        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V put(C c, R r, V v) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> row(C c) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Collection<V> values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Table delegate() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ Set rowKeySet() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ Map rowMap() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public RowSortedTable<R, C, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Table<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(@NullableDecl C c) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(@NullableDecl R r) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public Table<R, C, V> delegate() {
        }
    }

    private Tables() {
    }

    public static /* synthetic */ Function access$000() {
    }

    public static boolean equalsImpl(Table<?, ?, ?> table, @NullableDecl Object obj) {
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
    }

    @Beta
    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
    }

    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
    }

    @Beta
    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> table, Function<? super V1, V2> function) {
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
    }

    @Beta
    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
    }

    private static <K, V> Function<Map<K, V>, Map<K, V>> unmodifiableWrapper() {
    }
}
