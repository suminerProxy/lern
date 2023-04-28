package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CacheLoader<K, V> {

    /* renamed from: com.google.common.cache.CacheLoader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends CacheLoader<K, V> {
        public final /* synthetic */ Executor val$executor;
        public final /* synthetic */ CacheLoader val$loader;

        /* renamed from: com.google.common.cache.CacheLoader$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class CallableC00641 implements Callable<V> {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ Object val$key;
            public final /* synthetic */ Object val$oldValue;

            public CallableC00641(AnonymousClass1 anonymousClass1, Object obj, Object obj2) {
            }

            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
            }
        }

        public AnonymousClass1(CacheLoader cacheLoader, Executor executor) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k2) throws Exception {
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> reload(K k2, V v) throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Function<K, V> computingFunction;

        public FunctionToCacheLoader(Function<K, V> function) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> computingSupplier;

        public SupplierToCacheLoader(Supplier<V> supplier) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
    }

    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
    }

    public abstract V load(K k2) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k2, V v) throws Exception {
    }

    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
    }
}
