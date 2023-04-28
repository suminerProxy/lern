package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    @Nullable
    public MapCollections<K, V> mCollections;

    /* renamed from: androidx.collection.ArrayMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends MapCollections<K, V> {
        public final /* synthetic */ ArrayMap this$0;

        public AnonymousClass1(ArrayMap arrayMap) {
        }

        @Override // androidx.collection.MapCollections
        public void colClear() {
        }

        @Override // androidx.collection.MapCollections
        public Object colGetEntry(int i2, int i3) {
        }

        @Override // androidx.collection.MapCollections
        public Map<K, V> colGetMap() {
        }

        @Override // androidx.collection.MapCollections
        public int colGetSize() {
        }

        @Override // androidx.collection.MapCollections
        public int colIndexOfKey(Object obj) {
        }

        @Override // androidx.collection.MapCollections
        public int colIndexOfValue(Object obj) {
        }

        @Override // androidx.collection.MapCollections
        public void colPut(K k2, V v) {
        }

        @Override // androidx.collection.MapCollections
        public void colRemoveAt(int i2) {
        }

        @Override // androidx.collection.MapCollections
        public V colSetValue(int i2, V v) {
        }
    }

    public ArrayMap() {
    }

    private MapCollections<K, V> getCollection() {
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
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

    public boolean removeAll(@NonNull Collection<?> collection) {
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
    }

    @Override // java.util.Map
    public Collection<V> values() {
    }

    public ArrayMap(int i2) {
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
    }
}
