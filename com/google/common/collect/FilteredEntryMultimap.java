package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    public final Predicate<? super Map.Entry<K, V>> predicate;
    public final Multimap<K, V> unfiltered;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final /* synthetic */ FilteredEntryMultimap this$0;

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1EntrySetImpl extends Maps.EntrySet<K, Collection<V>> {
            public final /* synthetic */ AsMap this$1;

            /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 extends AbstractIterator<Map.Entry<K, Collection<V>>> {
                public final Iterator<Map.Entry<K, Collection<V>>> backingIterator;
                public final /* synthetic */ C1EntrySetImpl this$2;

                public AnonymousClass1(C1EntrySetImpl c1EntrySetImpl) {
                }

                @Override // com.google.common.collect.AbstractIterator
                public /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<K, Collection<V>> computeNext() {
                }
            }

            public C1EntrySetImpl(AsMap asMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, Collection<V>> map() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1KeySetImpl extends Maps.KeySet<K, Collection<V>> {
            public final /* synthetic */ AsMap this$1;

            public C1KeySetImpl(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@NullableDecl Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1ValuesImpl  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C1ValuesImpl extends Maps.Values<K, Collection<V>> {
            public final /* synthetic */ AsMap this$1;

            public C1ValuesImpl(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@NullableDecl Object obj) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
            }
        }

        public AsMap(FilteredEntryMultimap filteredEntryMultimap) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Collection<Collection<V>> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(@NullableDecl Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Keys extends Multimaps.Keys<K, V> {
        public final /* synthetic */ FilteredEntryMultimap this$0;

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends Multisets.EntrySet<K> {
            public final /* synthetic */ Keys this$1;

            /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00661 implements Predicate<Map.Entry<K, Collection<V>>> {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ Predicate val$predicate;

                public C00661(AnonymousClass1 anonymousClass1, Predicate predicate) {
                }

                @Override // com.google.common.base.Predicate
                public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                }

                public boolean apply(Map.Entry<K, Collection<V>> entry) {
                }
            }

            public AnonymousClass1(Keys keys) {
            }

            private boolean removeEntriesIf(Predicate<? super Multiset.Entry<K>> predicate) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<K>> iterator() {
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            public Multiset<K> multiset() {
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

        public Keys(FilteredEntryMultimap filteredEntryMultimap) {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@NullableDecl Object obj, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ValuePredicate implements Predicate<V> {
        private final K key;
        public final /* synthetic */ FilteredEntryMultimap this$0;

        public ValuePredicate(FilteredEntryMultimap filteredEntryMultimap, K k2) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl V v) {
        }
    }

    public FilteredEntryMultimap(Multimap<K, V> multimap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static /* synthetic */ boolean access$000(FilteredEntryMultimap filteredEntryMultimap, Object obj, Object obj2) {
    }

    public static <E> Collection<E> filterCollection(Collection<E> collection, Predicate<? super E> predicate) {
    }

    private boolean satisfies(K k2, V v) {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Predicate<? super Map.Entry<K, V>> entryPredicate() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k2) {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> removeAll(@NullableDecl Object obj) {
    }

    public boolean removeEntriesIf(Predicate<? super Map.Entry<K, Collection<V>>> predicate) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap<K, V> unfiltered() {
    }

    public Collection<V> unmodifiableEmptyCollection() {
    }
}
