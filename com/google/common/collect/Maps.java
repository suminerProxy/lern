package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Maps {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<K, V> extends TransformedIterator<Map.Entry<K, V>, K> {
        public AnonymousClass1(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        public K transform(Map.Entry<K, V> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* renamed from: com.google.common.collect.Maps$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass10<V1, V2> implements Function<V1, V2> {
        public final /* synthetic */ Object val$key;
        public final /* synthetic */ EntryTransformer val$transformer;

        public AnonymousClass10(EntryTransformer entryTransformer, Object obj) {
        }

        @Override // com.google.common.base.Function
        public V2 apply(@NullableDecl V1 v1) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass11<K, V1, V2> implements Function<Map.Entry<K, V1>, V2> {
        public final /* synthetic */ EntryTransformer val$transformer;

        public AnonymousClass11(EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public V2 apply(Map.Entry<K, V1> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* renamed from: com.google.common.collect.Maps$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass12<K, V2> extends AbstractMapEntry<K, V2> {
        public final /* synthetic */ Map.Entry val$entry;
        public final /* synthetic */ EntryTransformer val$transformer;

        public AnonymousClass12(Map.Entry entry, EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V2 getValue() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass13<K, V1, V2> implements Function<Map.Entry<K, V1>, Map.Entry<K, V2>> {
        public final /* synthetic */ EntryTransformer val$transformer;

        public AnonymousClass13(EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<K, V> extends TransformedIterator<Map.Entry<K, V>, V> {
        public AnonymousClass2(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        public V transform(Map.Entry<K, V> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<K, V> extends TransformedIterator<K, Map.Entry<K, V>> {
        public final /* synthetic */ Function val$function;

        public AnonymousClass3(Iterator it, Function function) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public Map.Entry<K, V> transform(K k2) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4<E> extends ForwardingSet<E> {
        public final /* synthetic */ Set val$set;

        public AnonymousClass4(Set set) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5<E> extends ForwardingSortedSet<E> {
        public final /* synthetic */ SortedSet val$set;

        public AnonymousClass5(SortedSet sortedSet) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass6<E> extends ForwardingNavigableSet<E> {
        public final /* synthetic */ NavigableSet val$set;

        public AnonymousClass6(NavigableSet navigableSet) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass7<K, V> extends AbstractMapEntry<K, V> {
        public final /* synthetic */ Map.Entry val$entry;

        public AnonymousClass7(Map.Entry entry) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass8<K, V> extends UnmodifiableIterator<Map.Entry<K, V>> {
        public final /* synthetic */ Iterator val$entryIterator;

        public AnonymousClass8(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass9<K, V1, V2> implements EntryTransformer<K, V1, V2> {
        public final /* synthetic */ Function val$function;

        public AnonymousClass9(Function function) {
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public V2 transformEntry(K k2, V1 v1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Predicate<? super Map.Entry<K, V>> predicate;
        public final Map<K, V> unfiltered;

        public AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        public boolean apply(@NullableDecl Object obj, @NullableDecl V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Function<? super K, V> function;
        private final Set<K> set;

        /* renamed from: com.google.common.collect.Maps$AsMapView$1EntrySetImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1EntrySetImpl extends EntrySet<K, V> {
            public final /* synthetic */ AsMapView this$0;

            public C1EntrySetImpl(AsMapView asMapView) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, V> map() {
            }
        }

        public AsMapView(Set<K> set, Function<? super K, V> function) {
        }

        public Set<K> backingSet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> bimap;

        public BiMapConverter(BiMap<A, B> biMap) {
        }

        private static <X, Y> Y convert(BiMap<X, Y> biMap, X x) {
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a2) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        @MonotonicNonNullDecl
        private transient Comparator<? super K> comparator;
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> entrySet;
        @MonotonicNonNullDecl
        private transient NavigableSet<K> navigableKeySet;

        /* renamed from: com.google.common.collect.Maps$DescendingMap$1EntrySetImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1EntrySetImpl extends EntrySet<K, V> {
            public final /* synthetic */ DescendingMap this$0;

            public C1EntrySetImpl(DescendingMap descendingMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, V> map() {
            }
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        public Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
        }

        public abstract NavigableMap<K, V> forward();

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<K, V> delegate() {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ EntryFunction[] $VALUES = null;
        public static final EntryFunction KEY = null;
        public static final EntryFunction VALUE = null;

        /* renamed from: com.google.common.collect.Maps$EntryFunction$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends EntryFunction {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.base.Function
            @NullableDecl
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            @NullableDecl
            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public Object apply2(Map.Entry<?, ?> entry) {
            }
        }

        /* renamed from: com.google.common.collect.Maps$EntryFunction$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends EntryFunction {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.base.Function
            @NullableDecl
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            @NullableDecl
            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public Object apply2(Map.Entry<?, ?> entry) {
            }
        }

        private EntryFunction(String str, int i2) {
        }

        public static EntryFunction valueOf(String str) {
        }

        public static EntryFunction[] values() {
        }

        public /* synthetic */ EntryFunction(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        public abstract Map<K, V> map();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(@NullableDecl K k2, @NullableDecl V1 v1);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {
        @RetainedWith
        private final BiMap<V, K> inverse;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Predicate<Map.Entry<V, K>> {
            public final /* synthetic */ Predicate val$forwardPredicate;

            public AnonymousClass1(Predicate predicate) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            }

            public boolean apply(Map.Entry<V, K> entry) {
            }
        }

        public FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        private static <K, V> Predicate<Map.Entry<V, K>> inversePredicate(Predicate<? super Map.Entry<K, V>> predicate) {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@NullableDecl K k2, @NullableDecl V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        public BiMap<K, V> unfiltered() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
        }

        private FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate, BiMap<V, K> biMap2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Set<Map.Entry<K, V>> filteredEntrySet;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public final /* synthetic */ FilteredEntryMap this$0;

            /* renamed from: com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 extends TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>> {
                public final /* synthetic */ EntrySet this$1;

                /* renamed from: com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                public class C00681 extends ForwardingMapEntry<K, V> {
                    public final /* synthetic */ AnonymousClass1 this$2;
                    public final /* synthetic */ Map.Entry val$entry;

                    public C00681(AnonymousClass1 anonymousClass1, Map.Entry entry) {
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

                public AnonymousClass1(EntrySet entrySet, Iterator it) {
                }

                @Override // com.google.common.collect.TransformedIterator
                public /* bridge */ /* synthetic */ Object transform(Object obj) {
                }

                public Map.Entry<K, V> transform(Map.Entry<K, V> entry) {
                }
            }

            private EntrySet(FilteredEntryMap filteredEntryMap) {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Object delegate() {
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            public /* synthetic */ EntrySet(FilteredEntryMap filteredEntryMap, AnonymousClass1 anonymousClass1) {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Collection delegate() {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<Map.Entry<K, V>> delegate() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class KeySet extends KeySet<K, V> {
            public final /* synthetic */ FilteredEntryMap this$0;

            public KeySet(FilteredEntryMap filteredEntryMap) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
            }
        }

        public FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        public static <K, V> boolean removeAllKeys(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
        }

        public static <K, V> boolean retainAllKeys(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        private final Predicate<? super Map.Entry<K, V>> entryPredicate;
        private final Map<K, V> filteredDelegate;
        private final NavigableMap<K, V> unfiltered;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryNavigableMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends NavigableKeySet<K, V> {
            public final /* synthetic */ FilteredEntryNavigableMap this$0;

            public AnonymousClass1(FilteredEntryNavigableMap filteredEntryNavigableMap, NavigableMap navigableMap) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        public FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        public static /* synthetic */ Predicate access$500(FilteredEntryNavigableMap filteredEntryNavigableMap) {
        }

        public static /* synthetic */ NavigableMap access$600(FilteredEntryNavigableMap filteredEntryNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<K, V>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public final /* synthetic */ FilteredEntrySortedMap this$0;

            public SortedKeySet(FilteredEntrySortedMap filteredEntrySortedMap) {
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
            }

            @Override // java.util.SortedSet
            public K first() {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k2) {
            }

            @Override // java.util.SortedSet
            public K last() {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k2, K k3) {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k2) {
            }
        }

        public FilteredEntrySortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, V> sortedMap() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public SortedSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Predicate<? super K> keyPredicate;

        public FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FilteredMapValues<K, V> extends Values<K, V> {
        public final Predicate<? super Map.Entry<K, V>> predicate;
        public final Map<K, V> unfiltered;

        public FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$IteratorBasedAbstractMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends EntrySet<K, V> {
            public final /* synthetic */ IteratorBasedAbstractMap this$0;

            public AnonymousClass1(IteratorBasedAbstractMap iteratorBasedAbstractMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, V> map() {
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        @Weak
        public final Map<K, V> map;

        public KeySet(Map<K, V> map) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        public Map<K, V> map() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        public final Map<K, MapDifference.ValueDifference<V>> differences;
        public final Map<K, V> onBoth;
        public final Map<K, V> onlyOnLeft;
        public final Map<K, V> onlyOnRight;

        public MapDifferenceImpl(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
        }

        public String toString() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {
        private final Function<? super K, V> function;
        private final NavigableSet<K> set;

        public NavigableAsMapView(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<K, V>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap<K, V> navigableMap) {
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public /* bridge */ /* synthetic */ Map map() {
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k2) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public /* bridge */ /* synthetic */ SortedMap map() {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k2, K k3) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k2) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public NavigableMap<K, V> map() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        public SortedAsMapView(SortedSet<K> sortedSet, Function<? super K, V> function) {
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public /* bridge */ /* synthetic */ Set backingSet() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public SortedSet<K> backingSet() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        public SortedKeySet(SortedMap<K, V> sortedMap) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedSet
        public K first() {
        }

        public SortedSet<K> headSet(K k2) {
        }

        @Override // java.util.SortedSet
        public K last() {
        }

        @Override // com.google.common.collect.Maps.KeySet
        public /* bridge */ /* synthetic */ Map map() {
        }

        public SortedSet<K> subSet(K k2, K k3) {
        }

        public SortedSet<K> tailSet(K k2) {
        }

        @Override // com.google.common.collect.Maps.KeySet
        public SortedMap<K, V> map() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        public SortedMapDifferenceImpl(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesDiffering() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesInCommon() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesOnlyOnRight() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        public final Map<K, V1> fromMap;
        public final EntryTransformer<? super K, ? super V1, V2> transformer;

        public TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V2>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        public TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        @NullableDecl
        private Map.Entry<K, V2> transformEntry(@NullableDecl Map.Entry<K, V1> entry) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public /* bridge */ /* synthetic */ SortedMap fromMap() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        public NavigableMap<K, V1> fromMap() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k2, boolean z) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k2, boolean z) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k2, K k3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        public SortedMap<K, V1> fromMap() {
        }

        public SortedMap<K, V2> headMap(K k2) {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, V2> subMap(K k2, K k3) {
        }

        public SortedMap<K, V2> tailMap(K k2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final BiMap<? extends K, ? extends V> delegate;
        @RetainedWith
        @MonotonicNonNullDecl
        public BiMap<V, K> inverse;
        public final Map<K, V> unmodifiableMap;
        @MonotonicNonNullDecl
        public transient Set<V> values;

        public UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, @NullableDecl BiMap<V, K> biMap2) {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k2, V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<K, V> delegate() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<V> values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        private final Collection<Map.Entry<K, V>> entries;

        public UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Map.Entry<K, V>> delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        public UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        @MonotonicNonNullDecl
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public SortedMap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        @NullableDecl
        private final V left;
        @NullableDecl
        private final V right;

        private ValueDifferenceImpl(@NullableDecl V v, @NullableDecl V v2) {
        }

        public static <V> MapDifference.ValueDifference<V> create(@NullableDecl V v, @NullableDecl V v2) {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V leftValue() {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V rightValue() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Values<K, V> extends AbstractCollection<V> {
        @Weak
        public final Map<K, V> map;

        public Values(Map<K, V> map) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        public final Map<K, V> map() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    @GwtCompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> entrySet;
        @MonotonicNonNullDecl
        private transient Set<K> keySet;
        @MonotonicNonNullDecl
        private transient Collection<V> values;

        public abstract Set<Map.Entry<K, V>> createEntrySet();

        public Set<K> createKeySet() {
        }

        public Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
        }
    }

    private Maps() {
    }

    public static /* synthetic */ Map access$100(Map map) {
    }

    public static /* synthetic */ Set access$200(Set set) {
    }

    public static /* synthetic */ SortedSet access$300(SortedSet sortedSet) {
    }

    public static /* synthetic */ NavigableSet access$400(NavigableSet navigableSet) {
    }

    public static /* synthetic */ Map.Entry access$800(Map.Entry entry) {
    }

    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
    }

    public static <K, V1, V2> Function<Map.Entry<K, V1>, Map.Entry<K, V2>> asEntryToEntryFunction(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    public static <K, V1, V2> Function<Map.Entry<K, V1>, V2> asEntryToValueFunction(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    public static <K, V1, V2> EntryTransformer<K, V1, V2> asEntryTransformer(Function<? super V1, V2> function) {
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
    }

    public static <K, V> Iterator<Map.Entry<K, V>> asMapEntryIterator(Set<K> set, Function<? super K, V> function) {
    }

    public static <K, V1, V2> Function<V1, V2> asValueToValueFunction(EntryTransformer<? super K, V1, V2> entryTransformer, K k2) {
    }

    public static int capacity(int i2) {
    }

    public static <K, V> boolean containsEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
    }

    public static boolean containsKeyImpl(Map<?, ?> map, @NullableDecl Object obj) {
    }

    public static boolean containsValueImpl(Map<?, ?> map, @NullableDecl Object obj) {
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
    }

    private static <K, V> void doDifference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, MapDifference.ValueDifference<V>> map6) {
    }

    public static boolean equalsImpl(Map<?, ?> map, Object obj) {
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
    }

    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@NullableDecl K k2, @NullableDecl V v) {
    }

    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
    }

    public static <E> ImmutableMap<E, Integer> indexMap(Collection<E> collection) {
    }

    public static <K> Function<Map.Entry<K, ?>, K> keyFunction() {
    }

    public static <K, V> Iterator<K> keyIterator(Iterator<Map.Entry<K, V>> it) {
    }

    @NullableDecl
    public static <K> K keyOrNull(@NullableDecl Map.Entry<K, ?> entry) {
    }

    public static <K> Predicate<Map.Entry<K, ?>> keyPredicateOnEntries(Predicate<? super K> predicate) {
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i2) {
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i2) {
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
    }

    public static <E> Comparator<? super E> orNaturalOrder(@NullableDecl Comparator<? super E> comparator) {
    }

    public static <K, V> void putAllImpl(Map<K, V> map, Map<? extends K, ? extends V> map2) {
    }

    public static <K, V> boolean removeEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
    }

    @GwtIncompatible
    private static <E> NavigableSet<E> removeOnlyNavigableSet(NavigableSet<E> navigableSet) {
    }

    private static <E> Set<E> removeOnlySet(Set<E> set) {
    }

    private static <E> SortedSet<E> removeOnlySortedSet(SortedSet<E> sortedSet) {
    }

    public static boolean safeContainsKey(Map<?, ?> map, Object obj) {
    }

    public static <V> V safeGet(Map<?, V> map, @NullableDecl Object obj) {
    }

    public static <V> V safeRemove(Map<?, V> map, Object obj) {
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
    }

    public static String toStringImpl(Map<?, ?> map) {
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    public static <V2, K, V1> Map.Entry<K, V2> transformEntry(EntryTransformer<? super K, ? super V1, V2> entryTransformer, Map.Entry<K, V1> entry) {
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
    }

    public static <K, V> Map.Entry<K, V> unmodifiableEntry(Map.Entry<? extends K, ? extends V> entry) {
    }

    public static <K, V> UnmodifiableIterator<Map.Entry<K, V>> unmodifiableEntryIterator(Iterator<Map.Entry<K, V>> it) {
    }

    public static <K, V> Set<Map.Entry<K, V>> unmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
    }

    private static <K, V> Map<K, V> unmodifiableMap(Map<K, ? extends V> map) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
    }

    @NullableDecl
    private static <K, V> Map.Entry<K, V> unmodifiableOrNull(@NullableDecl Map.Entry<K, ? extends V> entry) {
    }

    public static <V> Function<Map.Entry<?, V>, V> valueFunction() {
    }

    public static <K, V> Iterator<V> valueIterator(Iterator<Map.Entry<K, V>> it) {
    }

    @NullableDecl
    public static <V> V valueOrNull(@NullableDecl Map.Entry<?, V> entry) {
    }

    public static <V> Predicate<Map.Entry<?, V>> valuePredicateOnEntries(Predicate<? super V> predicate) {
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, Function<? super V, K> function) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
    }

    private static <K, V> SortedMap<K, V> filterFiltered(FilteredEntrySortedMap<K, V> filteredEntrySortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(@NullableDecl Comparator<C> comparator) {
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    private static <K, V> NavigableMap<K, V> filterFiltered(FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
    }

    private static <K, V> BiMap<K, V> filterFiltered(FilteredEntryBiMap<K, V> filteredEntryBiMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }
}
