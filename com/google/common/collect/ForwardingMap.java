package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        public final /* synthetic */ ForwardingMap this$0;

        public StandardEntrySet(ForwardingMap forwardingMap) {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        public Map<K, V> map() {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardKeySet extends Maps.KeySet<K, V> {
        public final /* synthetic */ ForwardingMap this$0;

        public StandardKeySet(ForwardingMap forwardingMap) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardValues extends Maps.Values<K, V> {
        public final /* synthetic */ ForwardingMap this$0;

        public StandardValues(ForwardingMap forwardingMap) {
        }
    }

    public void clear() {
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
    }

    public boolean containsValue(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Map
    public V get(@NullableDecl Object obj) {
    }

    @Override // java.util.Map
    public int hashCode() {
    }

    @Override // java.util.Map
    public boolean isEmpty() {
    }

    public Set<K> keySet() {
    }

    @CanIgnoreReturnValue
    public V put(K k2, V v) {
    }

    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
    }

    @Override // java.util.Map
    public int size() {
    }

    public void standardClear() {
    }

    @Beta
    public boolean standardContainsKey(@NullableDecl Object obj) {
    }

    public boolean standardContainsValue(@NullableDecl Object obj) {
    }

    public boolean standardEquals(@NullableDecl Object obj) {
    }

    public int standardHashCode() {
    }

    public boolean standardIsEmpty() {
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
    }

    @Beta
    public V standardRemove(@NullableDecl Object obj) {
    }

    public String standardToString() {
    }

    public Collection<V> values() {
    }
}
