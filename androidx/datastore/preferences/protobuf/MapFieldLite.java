package androidx.datastore.preferences.protobuf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite EMPTY_MAP_FIELD = null;
    private boolean isMutable;

    private MapFieldLite() {
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
    }

    private static int calculateHashCodeForObject(Object obj) {
    }

    private static void checkForNullKeysAndValues(Map<?, ?> map) {
    }

    private static Object copy(Object obj) {
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
    }

    private void ensureMutable() {
    }

    private static boolean equals(Object obj, Object obj2) {
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
    }

    public boolean isMutable() {
    }

    public void makeImmutable() {
    }

    public void mergeFrom(MapFieldLite<K, V> mapFieldLite) {
    }

    public MapFieldLite<K, V> mutableCopy() {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
    }

    private MapFieldLite(Map<K, V> map) {
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
    }

    public V put(Map.Entry<K, V> entry) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
    }
}
