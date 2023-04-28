package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Multimap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@NullableDecl Object obj) {
    }

    public Collection<V> get(@NullableDecl K k2) {
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
    public boolean put(K k2, V v) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(K k2, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
    }
}
