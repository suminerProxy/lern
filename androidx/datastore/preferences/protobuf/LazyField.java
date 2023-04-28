package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, LazyField> entry;

        public /* synthetic */ LazyEntry(Map.Entry entry, AnonymousClass1 anonymousClass1) {
        }

        public LazyField getField() {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
        }

        private LazyEntry(Map.Entry<K, LazyField> entry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> iterator;

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
    }

    public MessageLite getValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public int hashCode() {
    }

    public String toString() {
    }
}
