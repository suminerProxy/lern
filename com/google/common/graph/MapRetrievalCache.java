package com.google.common.graph;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
    @NullableDecl
    private transient CacheEntry<K, V> cacheEntry1;
    @NullableDecl
    private transient CacheEntry<K, V> cacheEntry2;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CacheEntry<K, V> {
        public final K key;
        public final V value;

        public CacheEntry(K k2, V v) {
        }
    }

    public MapRetrievalCache(Map<K, V> map) {
    }

    private void addToCache(K k2, V v) {
    }

    @Override // com.google.common.graph.MapIteratorCache
    public void clearCache() {
    }

    @Override // com.google.common.graph.MapIteratorCache
    public V get(@NullableDecl Object obj) {
    }

    @Override // com.google.common.graph.MapIteratorCache
    public V getIfCached(@NullableDecl Object obj) {
    }

    private void addToCache(CacheEntry<K, V> cacheEntry) {
    }
}
