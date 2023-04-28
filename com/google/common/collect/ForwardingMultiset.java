package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardElementSet extends Multisets.ElementSet<E> {
        public final /* synthetic */ ForwardingMultiset this$0;

        public StandardElementSet(ForwardingMultiset forwardingMultiset) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public Multiset<E> multiset() {
        }
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Multiset<E> delegate();

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    public Set<E> elementSet() {
    }

    public Set<Multiset.Entry<E>> entrySet() {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i2) {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
    }

    public boolean standardAdd(E e2) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    @Beta
    public boolean standardAddAll(Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public void standardClear() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardContains(@NullableDecl Object obj) {
    }

    @Beta
    public int standardCount(@NullableDecl Object obj) {
    }

    public boolean standardEquals(@NullableDecl Object obj) {
    }

    public int standardHashCode() {
    }

    public Iterator<E> standardIterator() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemove(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemoveAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRetainAll(Collection<?> collection) {
    }

    public int standardSetCount(E e2, int i2) {
    }

    public int standardSize() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    public String standardToString() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e2, int i2, int i3) {
    }

    public boolean standardSetCount(E e2, int i2, int i3) {
    }
}
