package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    public final C singleColumnKey;
    public final R singleRowKey;
    public final V singleValue;

    public SingletonImmutableTable(R r, C c, V v) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Set createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.SerializedForm createSerializedForm() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Collection createValues() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableSet<Table.Cell<R, C, V>> createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableCollection<V> createValues() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
    }

    public SingletonImmutableTable(Table.Cell<R, C, V> cell) {
    }
}
