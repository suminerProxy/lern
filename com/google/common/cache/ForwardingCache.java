package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
        private final Cache<K, V> delegate;

        public SimpleForwardingCache(Cache<K, V> cache) {
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final Cache<K, V> delegate() {
        }
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Cache<K, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K k2, Callable<? extends V> callable) throws ExecutionException {
    }

    @Override // com.google.common.cache.Cache
    public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
    }

    @Override // com.google.common.cache.Cache
    @NullableDecl
    public V getIfPresent(Object obj) {
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<?> iterable) {
    }

    @Override // com.google.common.cache.Cache
    public void put(K k2, V v) {
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // com.google.common.cache.Cache
    public long size() {
    }

    @Override // com.google.common.cache.Cache
    public CacheStats stats() {
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
    }
}
