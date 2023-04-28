package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    /* renamed from: com.google.common.collect.ImmutableMapValues$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends UnmodifiableIterator<V> {
        public final UnmodifiableIterator<Map.Entry<K, V>> entryItr;
        public final /* synthetic */ ImmutableMapValues this$0;

        public AnonymousClass1(ImmutableMapValues immutableMapValues) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public V next() {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMapValues$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ImmutableList<V> {
        public final /* synthetic */ ImmutableMapValues this$0;
        public final /* synthetic */ ImmutableList val$entryList;

        public AnonymousClass2(ImmutableMapValues immutableMapValues, ImmutableList immutableList) {
        }

        @Override // java.util.List
        public V get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<?, V> map;

        public SerializedForm(ImmutableMap<?, V> immutableMap) {
        }

        public Object readResolve() {
        }
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
    }

    public static /* synthetic */ ImmutableMap access$000(ImmutableMapValues immutableMapValues) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<V> iterator() {
    }
}
