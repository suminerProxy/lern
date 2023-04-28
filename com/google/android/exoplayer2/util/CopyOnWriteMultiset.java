package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    @GuardedBy("lock")
    private final Map<E, Integer> elementCounts;
    @GuardedBy("lock")
    private Set<E> elementSet;
    @GuardedBy("lock")
    private List<E> elements;
    private final Object lock;

    public void add(E element) {
    }

    public int count(E element) {
    }

    public Set<E> elementSet() {
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
    }

    public void remove(E element) {
    }
}
