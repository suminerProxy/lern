package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;
        public final /* synthetic */ DenseImmutableTable this$0;

        public Column(DenseImmutableTable denseImmutableTable, int i2) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public final /* synthetic */ DenseImmutableTable this$0;

        public /* synthetic */ ColumnMap(DenseImmutableTable denseImmutableTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public /* bridge */ /* synthetic */ Object getValue(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
        }

        private ColumnMap(DenseImmutableTable denseImmutableTable) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, V> getValue(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        /* renamed from: com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Map.Entry<K, V>> {
            private int index;
            private final int maxIndex;
            public final /* synthetic */ ImmutableArrayMap this$0;

            public AnonymousClass1(ImmutableArrayMap immutableArrayMap) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<K, V> computeNext() {
            }
        }

        public ImmutableArrayMap(int i2) {
        }

        private boolean isFull() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(@NullableDecl Object obj) {
        }

        public K getKey(int i2) {
        }

        @NullableDecl
        public abstract V getValue(int i2);

        public abstract ImmutableMap<K, Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;
        public final /* synthetic */ DenseImmutableTable this$0;

        public Row(DenseImmutableTable denseImmutableTable, int i2) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public V getValue(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, Integer> keyToIndex() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public final /* synthetic */ DenseImmutableTable this$0;

        public /* synthetic */ RowMap(DenseImmutableTable denseImmutableTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public /* bridge */ /* synthetic */ Object getValue(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<R, Integer> keyToIndex() {
        }

        private RowMap(DenseImmutableTable denseImmutableTable) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public ImmutableMap<C, V> getValue(int i2) {
        }
    }

    public DenseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
    }

    public static /* synthetic */ int[] access$200(DenseImmutableTable denseImmutableTable) {
    }

    public static /* synthetic */ ImmutableMap access$300(DenseImmutableTable denseImmutableTable) {
    }

    public static /* synthetic */ Object[][] access$400(DenseImmutableTable denseImmutableTable) {
    }

    public static /* synthetic */ int[] access$500(DenseImmutableTable denseImmutableTable) {
    }

    public static /* synthetic */ ImmutableMap access$600(DenseImmutableTable denseImmutableTable) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public Table.Cell<R, C, V> getCell(int i2) {
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int i2) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
    }
}
