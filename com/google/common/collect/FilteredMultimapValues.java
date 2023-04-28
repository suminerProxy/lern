package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {
    @Weak
    private final FilteredMultimap<K, V> multimap;

    public FilteredMultimapValues(FilteredMultimap<K, V> filteredMultimap) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }
}
