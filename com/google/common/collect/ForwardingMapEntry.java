package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Map.Entry
    public K getKey() {
    }

    @Override // java.util.Map.Entry
    public V getValue() {
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
    }

    public V setValue(V v) {
    }

    public boolean standardEquals(@NullableDecl Object obj) {
    }

    public int standardHashCode() {
    }

    @Beta
    public String standardToString() {
    }
}
