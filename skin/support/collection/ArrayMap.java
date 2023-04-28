package skin.support.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public MapCollections<K, V> mCollections;

    /* renamed from: skin.support.collection.ArrayMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends MapCollections<K, V> {
        public final /* synthetic */ ArrayMap this$0;

        public AnonymousClass1(ArrayMap arrayMap) {
        }

        @Override // skin.support.collection.MapCollections
        public void colClear() {
        }

        @Override // skin.support.collection.MapCollections
        public Object colGetEntry(int i2, int i3) {
        }

        @Override // skin.support.collection.MapCollections
        public Map<K, V> colGetMap() {
        }

        @Override // skin.support.collection.MapCollections
        public int colGetSize() {
        }

        @Override // skin.support.collection.MapCollections
        public int colIndexOfKey(Object obj) {
        }

        @Override // skin.support.collection.MapCollections
        public int colIndexOfValue(Object obj) {
        }

        @Override // skin.support.collection.MapCollections
        public void colPut(K k2, V v) {
        }

        @Override // skin.support.collection.MapCollections
        public void colRemoveAt(int i2) {
        }

        @Override // skin.support.collection.MapCollections
        public V colSetValue(int i2, V v) {
        }
    }

    public ArrayMap() {
    }

    private MapCollections<K, V> getCollection() {
    }

    public boolean containsAll(Collection<?> collection) {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.Map
    public Set<K> keySet() {
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    public boolean removeAll(Collection<?> collection) {
    }

    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.Map
    public Collection<V> values() {
    }

    public ArrayMap(int i2) {
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
    }
}
