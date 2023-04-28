package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
        public final /* synthetic */ ForwardingSortedMap this$0;

        public StandardKeySet(ForwardingSortedMap forwardingSortedMap) {
        }
    }

    private int unsafeCompare(Object obj, Object obj2) {
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
    }

    @Override // java.util.SortedMap
    public K lastKey() {
    }

    @Override // com.google.common.collect.ForwardingMap
    @Beta
    public boolean standardContainsKey(@NullableDecl Object obj) {
    }

    @Beta
    public SortedMap<K, V> standardSubMap(K k2, K k3) {
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Map delegate() {
    }
}
