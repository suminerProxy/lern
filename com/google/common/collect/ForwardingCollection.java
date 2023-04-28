package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    @CanIgnoreReturnValue
    public boolean add(E e2) {
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
    }

    public void clear() {
    }

    public boolean contains(Object obj) {
    }

    public boolean containsAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
    }

    public Iterator<E> iterator() {
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.Collection
    public int size() {
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
    }

    public void standardClear() {
    }

    public boolean standardContains(@NullableDecl Object obj) {
    }

    public boolean standardContainsAll(Collection<?> collection) {
    }

    public boolean standardIsEmpty() {
    }

    public boolean standardRemove(@NullableDecl Object obj) {
    }

    public boolean standardRemoveAll(Collection<?> collection) {
    }

    public boolean standardRetainAll(Collection<?> collection) {
    }

    public Object[] standardToArray() {
    }

    public String standardToString() {
    }

    public Object[] toArray() {
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
    }

    public <T> T[] standardToArray(T[] tArr) {
    }
}
