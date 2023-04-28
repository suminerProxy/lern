package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: com.google.common.collect.RegularImmutableTable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Comparator<Table.Cell<R, C, V>> {
        public final /* synthetic */ Comparator val$columnComparator;
        public final /* synthetic */ Comparator val$rowComparator;

        public AnonymousClass1(Comparator comparator, Comparator comparator2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        }

        public int compare(Table.Cell<R, C, V> cell, Table.Cell<R, C, V> cell2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        public final /* synthetic */ RegularImmutableTable this$0;

        private CellSet(RegularImmutableTable regularImmutableTable) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        public /* synthetic */ CellSet(RegularImmutableTable regularImmutableTable, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public Table.Cell<R, C, V> get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Values extends ImmutableList<V> {
        public final /* synthetic */ RegularImmutableTable this$0;

        private Values(RegularImmutableTable regularImmutableTable) {
        }

        @Override // java.util.List
        public V get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        public /* synthetic */ Values(RegularImmutableTable regularImmutableTable, AnonymousClass1 anonymousClass1) {
        }
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(List<Table.Cell<R, C, V>> list, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
    }

    private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(Iterable<Table.Cell<R, C, V>> iterable, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
    }

    public final void checkNoDuplicate(R r, C c, V v, V v2) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Set createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Collection createValues() {
    }

    public abstract Table.Cell<R, C, V> getCell(int i2);

    public abstract V getValue(int i2);

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final ImmutableSet<Table.Cell<R, C, V>> createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final ImmutableCollection<V> createValues() {
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(Iterable<Table.Cell<R, C, V>> iterable) {
    }
}
