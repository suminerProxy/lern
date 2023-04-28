package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    boolean containsKey(@NullableDecl @CompatibleWith("K") Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith("V") Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@NullableDecl Object obj);

    Collection<V> get(@NullableDecl K k2);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    Multiset<K> keys();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k2, @NullableDecl V v);

    @CanIgnoreReturnValue
    boolean putAll(Multimap<? extends K, ? extends V> multimap);

    @CanIgnoreReturnValue
    boolean putAll(@NullableDecl K k2, Iterable<? extends V> iterable);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@NullableDecl @CompatibleWith("K") Object obj);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
