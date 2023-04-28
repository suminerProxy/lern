package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ ImmutableMap build() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public /* bridge */ /* synthetic */ ImmutableMap.Builder orderEntriesByValue(Comparator comparator) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public /* bridge */ /* synthetic */ ImmutableMap.Builder putAll(Iterable iterable) {
        }

        public Builder(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Map.Entry entry) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder putAll(Map map) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k2, V v) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<?, ?> immutableBiMap) {
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Object readResolve() {
        }
    }

    public static <K, V> Builder<K, V> builder() {
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i2) {
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public /* bridge */ /* synthetic */ ImmutableCollection createValues() {
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @Deprecated
    public V forcePut(K k2, V v) {
    }

    @Override // com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ BiMap inverse() {
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ ImmutableCollection values() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v) {
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Set values() {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<V> values() {
    }

    @Beta
    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
    }
}
