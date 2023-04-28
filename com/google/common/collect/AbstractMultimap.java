package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> asMap;
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> entries;
    @MonotonicNonNullDecl
    private transient Set<K> keySet;
    @MonotonicNonNullDecl
    private transient Multiset<K> keys;
    @MonotonicNonNullDecl
    private transient Collection<V> values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Entries extends Multimaps.Entries<K, V> {
        public final /* synthetic */ AbstractMultimap this$0;

        public Entries(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public Multimap<K, V> multimap() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public final /* synthetic */ AbstractMultimap this$0;

        public EntrySet(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Values extends AbstractCollection<V> {
        public final /* synthetic */ AbstractMultimap this$0;

        public Values(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract Multiset<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@NullableDecl K k2, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
    }

    public String toString() {
    }

    public Iterator<V> valueIterator() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
    }
}
