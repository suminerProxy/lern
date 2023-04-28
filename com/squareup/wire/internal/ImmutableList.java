package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImmutableList<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final ArrayList<T> list;

    public ImmutableList(List<T> list) {
    }

    private Object writeReplace() throws ObjectStreamException {
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
    }
}
