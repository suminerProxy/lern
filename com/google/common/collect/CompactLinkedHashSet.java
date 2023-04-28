package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    @MonotonicNonNullDecl
    private transient int[] predecessor;
    @MonotonicNonNullDecl
    private transient int[] successor;

    public CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create() {
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i2) {
    }

    private void succeeds(int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashSet
    public int adjustAfterRemove(int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
    }

    @Override // com.google.common.collect.CompactHashSet
    public int firstEntryIndex() {
    }

    @Override // com.google.common.collect.CompactHashSet
    public int getSuccessor(int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    public void init(int i2, float f2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    public void insertEntry(int i2, E e2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashSet
    public void moveEntry(int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    public void resizeEntries(int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
    }

    public CompactLinkedHashSet(int i2) {
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
    }

    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
    }
}
