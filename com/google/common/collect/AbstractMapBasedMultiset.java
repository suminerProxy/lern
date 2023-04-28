package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    public transient ObjectCountHashMap<E> backingMap;
    public transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractMapBasedMultiset<E>.Itr<E> {
        public final /* synthetic */ AbstractMapBasedMultiset this$0;

        public AnonymousClass1(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        public E result(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>> {
        public final /* synthetic */ AbstractMapBasedMultiset this$0;

        public AnonymousClass2(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        public /* bridge */ /* synthetic */ Object result(int i2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        public Multiset.Entry<E> result(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class Itr<T> implements Iterator<T> {
        public int entryIndex;
        public int expectedModCount;
        public final /* synthetic */ AbstractMapBasedMultiset this$0;
        public int toRemove;

        public Itr(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        public abstract T result(int i2);
    }

    public AbstractMapBasedMultiset(int i2) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@NullableDecl E e2, int i2) {
    }

    public void addTo(Multiset<? super E> multiset) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
    }

    public abstract void init(int i2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@NullableDecl Object obj, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@NullableDecl E e2, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@NullableDecl E e2, int i2, int i3) {
    }
}
