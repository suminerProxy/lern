package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
    }

    public void ensureIsMutable() {
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
    }
}
