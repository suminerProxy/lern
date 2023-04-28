package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    public void add(int i2, E e2) {
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i2, Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // java.util.List
    public E get(int i2) {
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E remove(int i2) {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E set(int i2, E e2) {
    }

    public boolean standardAdd(E e2) {
    }

    public boolean standardAddAll(int i2, Iterable<? extends E> iterable) {
    }

    @Beta
    public boolean standardEquals(@NullableDecl Object obj) {
    }

    @Beta
    public int standardHashCode() {
    }

    public int standardIndexOf(@NullableDecl Object obj) {
    }

    public Iterator<E> standardIterator() {
    }

    public int standardLastIndexOf(@NullableDecl Object obj) {
    }

    public ListIterator<E> standardListIterator() {
    }

    @Beta
    public List<E> standardSubList(int i2, int i3) {
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
    }

    @Beta
    public ListIterator<E> standardListIterator(int i2) {
    }
}
