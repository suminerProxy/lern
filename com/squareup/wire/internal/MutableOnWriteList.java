package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MutableOnWriteList<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    public List<T> mutableList;

    public MutableOnWriteList(List<T> list) {
    }

    private Object writeReplace() throws ObjectStreamException {
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, T t) {
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i2, T t) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }
}
