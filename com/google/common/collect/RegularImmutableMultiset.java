package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset<Object> EMPTY = null;
    public final transient ObjectCountHashMap<E> contents;
    @LazyInit
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ElementSet extends IndexedImmutableSet<E> {
        public final /* synthetic */ RegularImmutableMultiset this$0;

        private ElementSet(RegularImmutableMultiset regularImmutableMultiset) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        public /* synthetic */ ElementSet(RegularImmutableMultiset regularImmutableMultiset, AnonymousClass1 anonymousClass1) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        public SerializedForm(Multiset<?> multiset) {
        }

        public Object readResolve() {
        }
    }

    public RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i2) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSet<E> elementSet() {
    }
}
