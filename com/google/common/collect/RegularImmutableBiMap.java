package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap<Object, Object> EMPTY = null;
    @VisibleForTesting
    public final transient Object[] alternatingKeysAndValues;
    private final transient RegularImmutableBiMap<V, K> inverse;
    private final transient int[] keyHashTable;
    private final transient int keyOffset;
    private final transient int size;

    private RegularImmutableBiMap() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ BiMap inverse() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
    }

    @Override // java.util.Map
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public ImmutableBiMap<V, K> inverse() {
    }

    public RegularImmutableBiMap(Object[] objArr, int i2) {
    }

    private RegularImmutableBiMap(int[] iArr, Object[] objArr, int i2, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
    }
}
