package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.Table
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Table<R, C, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
    }

    @Override // com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
    }
}
