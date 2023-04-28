package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractTable<R, C, V> implements Table<R, C, V> {
    @MonotonicNonNullDecl
    private transient Set<Table.Cell<R, C, V>> cellSet;
    @MonotonicNonNullDecl
    private transient Collection<V> values;

    /* renamed from: com.google.common.collect.AbstractTable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TransformedIterator<Table.Cell<R, C, V>, V> {
        public final /* synthetic */ AbstractTable this$0;

        public AnonymousClass1(AbstractTable abstractTable, Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        public V transform(Table.Cell<R, C, V> cell) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public final /* synthetic */ AbstractTable this$0;

        public CellSet(AbstractTable abstractTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Table.Cell<R, C, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Values extends AbstractCollection<V> {
        public final /* synthetic */ AbstractTable this$0;

        public Values(AbstractTable abstractTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    public abstract Iterator<Table.Cell<R, C, V>> cellIterator();

    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.Table
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@NullableDecl Object obj) {
    }

    public Set<Table.Cell<R, C, V>> createCellSet() {
    }

    public Collection<V> createValues() {
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
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
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
    }

    public String toString() {
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
    }

    public Iterator<V> valuesIterator() {
    }
}
