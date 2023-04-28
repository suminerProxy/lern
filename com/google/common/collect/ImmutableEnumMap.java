package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient EnumMap<K, V> delegate;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumMap<K, V> delegate;

        public EnumSerializedForm(EnumMap<K, V> enumMap) {
        }

        public Object readResolve() {
        }
    }

    public /* synthetic */ ImmutableEnumMap(EnumMap enumMap, AnonymousClass1 anonymousClass1) {
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> enumMap) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    public UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public UnmodifiableIterator<K> keyIterator() {
    }

    @Override // java.util.Map
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
    }

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
    }
}
