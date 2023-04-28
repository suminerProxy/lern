package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MapIteratorCache<K, V> {
    private final Map<K, V> backingMap;
    @NullableDecl
    private transient Map.Entry<K, V> entrySetCache;

    /* renamed from: com.google.common.graph.MapIteratorCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSet<K> {
        public final /* synthetic */ MapIteratorCache this$0;

        /* renamed from: com.google.common.graph.MapIteratorCache$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00801 extends UnmodifiableIterator<K> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ Iterator val$entryIterator;

            public C00801(AnonymousClass1 anonymousClass1, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public K next() {
            }
        }

        public AnonymousClass1(MapIteratorCache mapIteratorCache) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<K> iterator() {
        }
    }

    public MapIteratorCache(Map<K, V> map) {
    }

    public static /* synthetic */ Map access$000(MapIteratorCache mapIteratorCache) {
    }

    public static /* synthetic */ Map.Entry access$102(MapIteratorCache mapIteratorCache, Map.Entry entry) {
    }

    public void clear() {
    }

    public void clearCache() {
    }

    public final boolean containsKey(@NullableDecl Object obj) {
    }

    public V get(@NullableDecl Object obj) {
    }

    public V getIfCached(@NullableDecl Object obj) {
    }

    public final V getWithoutCaching(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
    }

    public final Set<K> unmodifiableKeySet() {
    }
}
