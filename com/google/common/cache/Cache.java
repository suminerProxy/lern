package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K k2, Callable<? extends V> callable) throws ExecutionException;

    ImmutableMap<K, V> getAllPresent(Iterable<?> iterable);

    @NullableDecl
    V getIfPresent(@CompatibleWith("K") Object obj);

    void invalidate(@CompatibleWith("K") Object obj);

    void invalidateAll();

    void invalidateAll(Iterable<?> iterable);

    void put(K k2, V v);

    void putAll(Map<? extends K, ? extends V> map);

    long size();

    CacheStats stats();
}
