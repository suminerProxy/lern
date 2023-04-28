package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ForwardingSet<E> {
        public final /* synthetic */ ConcurrentHashMultiset this$0;
        public final /* synthetic */ Set val$delegate;

        public AnonymousClass1(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<E> delegate() {
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AbstractIterator<Multiset.Entry<E>> {
        private final Iterator<Map.Entry<E, AtomicInteger>> mapEntries;
        public final /* synthetic */ ConcurrentHashMultiset this$0;

        public AnonymousClass2(ConcurrentHashMultiset concurrentHashMultiset) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public /* bridge */ /* synthetic */ Object computeNext() {
        }

        @Override // com.google.common.collect.AbstractIterator
        public Multiset.Entry<E> computeNext() {
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends ForwardingIterator<Multiset.Entry<E>> {
        @NullableDecl
        private Multiset.Entry<E> last;
        public final /* synthetic */ ConcurrentHashMultiset this$0;
        public final /* synthetic */ Iterator val$readOnlyIterator;

        public AnonymousClass3(ConcurrentHashMultiset concurrentHashMultiset, Iterator it) {
        }

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public void remove() {
        }

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        public Iterator<Multiset.Entry<E>> delegate() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public final /* synthetic */ ConcurrentHashMultiset this$0;

        private EntrySet(ConcurrentHashMultiset concurrentHashMultiset) {
        }

        private List<Multiset.Entry<E>> snapshot() {
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public /* bridge */ /* synthetic */ Multiset multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        public /* synthetic */ EntrySet(ConcurrentHashMultiset concurrentHashMultiset, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public ConcurrentHashMultiset<E> multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FieldSettersHolder {
        public static final Serialization.FieldSetter<ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = null;

        private FieldSettersHolder() {
        }
    }

    @VisibleForTesting
    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
    }

    public static /* synthetic */ ConcurrentMap access$100(ConcurrentHashMultiset concurrentHashMultiset) {
    }

    public static <E> ConcurrentHashMultiset<E> create() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private List<E> snapshot() {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Set<E> createElementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    public Set<Multiset.Entry<E>> createEntrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(@NullableDecl Object obj, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
    }

    @Beta
    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e2, int i2, int i3) {
    }
}
