package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    private static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = null;
    private static final Comparator<Comparable> NATURAL_ORDER = null;
    private static final long serialVersionUID = 0;
    private transient ImmutableSortedMap<K, V> descendingMap;
    private final transient RegularImmutableSortedSet<K> keySet;
    private final transient ImmutableList<V> valueList;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Comparator<Map.Entry<K, V>> {
        public final /* synthetic */ Comparator val$comparator;

        public AnonymousClass1(Comparator comparator) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        }

        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1EntrySet  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1EntrySet extends ImmutableMapEntrySet<K, V> {
        public final /* synthetic */ ImmutableSortedMap this$0;

        /* renamed from: com.google.common.collect.ImmutableSortedMap$1EntrySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends ImmutableList<Map.Entry<K, V>> {
            public final /* synthetic */ C1EntrySet this$1;

            public AnonymousClass1(C1EntrySet c1EntrySet) {
            }

            @Override // java.util.List
            public /* bridge */ /* synthetic */ Object get(int i2) {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int i2) {
            }
        }

        public C1EntrySet(ImmutableSortedMap immutableSortedMap) {
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        public ImmutableMap<K, V> map() {
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        private final Comparator<? super K> comparator;
        private transient Object[] keys;
        private transient Object[] values;

        public Builder(Comparator<? super K> comparator) {
        }

        private void ensureCapacity(int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ ImmutableMap build() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        @Deprecated
        public /* bridge */ /* synthetic */ ImmutableMap.Builder orderEntriesByValue(Comparator comparator) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public /* bridge */ /* synthetic */ ImmutableMap.Builder putAll(Iterable iterable) {
        }

        private Builder(Comparator<? super K> comparator, int i2) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        @Deprecated
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Map.Entry entry) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder putAll(Map map) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k2, V v) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        public SerializedForm(ImmutableSortedMap<?, ?> immutableSortedMap) {
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Object readResolve() {
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
    }

    public static /* synthetic */ ImmutableSortedMap access$000(Comparator comparator, Object obj, Object obj2) {
    }

    public static /* synthetic */ RegularImmutableSortedSet access$100(ImmutableSortedMap immutableSortedMap) {
    }

    public static /* synthetic */ ImmutableList access$200(ImmutableSortedMap immutableSortedMap) {
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    }

    private static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    private ImmutableSortedMap<K, V> getSubMap(int i2, int i3) {
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
    }

    public static <K, V> ImmutableSortedMap<K, V> of() {
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<K, V>... entryArr) {
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
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

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap descendingMap() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
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

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@NullableDecl Object obj) {
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ ImmutableSet keySet() {
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
    public /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
    }

    @Override // java.util.Map
    public int size() {
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj) {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableCollection<V> values() {
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i2) {
    }

    private static <K, V> ImmutableSortedMap<K, V> of(Comparator<? super K> comparator, K k2, V v) {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k2) {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k2, K k3) {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k2) {
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k2, boolean z) {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k2, boolean z) {
    }

    @Beta
    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
    }
}
