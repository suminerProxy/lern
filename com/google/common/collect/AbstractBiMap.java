package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @MonotonicNonNullDecl
    private transient Map<K, V> delegate;
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> entrySet;
    @RetainedWith
    @MonotonicNonNullDecl
    public transient AbstractBiMap<V, K> inverse;
    @MonotonicNonNullDecl
    private transient Set<K> keySet;
    @MonotonicNonNullDecl
    private transient Set<V> valueSet;

    /* renamed from: com.google.common.collect.AbstractBiMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Iterator<Map.Entry<K, V>> {
        @NullableDecl
        public Map.Entry<K, V> entry;
        public final /* synthetic */ AbstractBiMap this$0;
        public final /* synthetic */ Iterator val$iterator;

        public AnonymousClass1(AbstractBiMap abstractBiMap, Iterator it) {
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
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class BiMapEntry extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> delegate;
        public final /* synthetic */ AbstractBiMap this$0;

        public BiMapEntry(AbstractBiMap abstractBiMap, Map.Entry<K, V> entry) {
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        public final Set<Map.Entry<K, V>> esDelegate;
        public final /* synthetic */ AbstractBiMap this$0;

        private EntrySet(AbstractBiMap abstractBiMap) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }

        public /* synthetic */ EntrySet(AbstractBiMap abstractBiMap, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<Map.Entry<K, V>> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        @GwtIncompatible
        private static final long serialVersionUID = 0;

        public Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        }

        @Override // com.google.common.collect.AbstractBiMap
        public K checkKey(K k2) {
        }

        @Override // com.google.common.collect.AbstractBiMap
        public V checkValue(V v) {
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @GwtIncompatible
        public Object readResolve() {
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class KeySet extends ForwardingSet<K> {
        public final /* synthetic */ AbstractBiMap this$0;

        private KeySet(AbstractBiMap abstractBiMap) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        public /* synthetic */ KeySet(AbstractBiMap abstractBiMap, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<K> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ValueSet extends ForwardingSet<V> {
        public final /* synthetic */ AbstractBiMap this$0;
        public final Set<V> valuesDelegate;

        private ValueSet(AbstractBiMap abstractBiMap) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }

        public /* synthetic */ ValueSet(AbstractBiMap abstractBiMap, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<V> delegate() {
        }
    }

    public /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Map access$100(AbstractBiMap abstractBiMap) {
    }

    public static /* synthetic */ Object access$200(AbstractBiMap abstractBiMap, Object obj) {
    }

    public static /* synthetic */ void access$500(AbstractBiMap abstractBiMap, Object obj, boolean z, Object obj2, Object obj3) {
    }

    public static /* synthetic */ void access$600(AbstractBiMap abstractBiMap, Object obj) {
    }

    private V putInBothMaps(@NullableDecl K k2, @NullableDecl V v, boolean z) {
    }

    @CanIgnoreReturnValue
    private V removeFromBothMaps(Object obj) {
    }

    private void removeFromInverseMap(V v) {
    }

    private void updateInverseMap(K k2, boolean z, V v, V v2) {
    }

    @CanIgnoreReturnValue
    public K checkKey(@NullableDecl K k2) {
    }

    @CanIgnoreReturnValue
    public V checkValue(@NullableDecl V v) {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
    }

    public AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
    }

    public void setInverse(AbstractBiMap<V, K> abstractBiMap) {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }

    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<V> values() {
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
    }
}
