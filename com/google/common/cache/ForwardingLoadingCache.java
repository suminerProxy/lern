package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {
        private final LoadingCache<K, V> delegate;

        public SimpleForwardingLoadingCache(LoadingCache<K, V> loadingCache) {
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Cache delegate() {
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final LoadingCache<K, V> delegate() {
        }
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K k2) {
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Cache delegate() {
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public abstract LoadingCache<K, V> delegate();

    @Override // com.google.common.cache.LoadingCache
    public V get(K k2) throws ExecutionException {
    }

    @Override // com.google.common.cache.LoadingCache
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K k2) {
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K k2) {
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }
}
