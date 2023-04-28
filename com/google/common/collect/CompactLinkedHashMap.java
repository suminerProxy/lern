package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] links;

    public CompactLinkedHashMap() {
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i2) {
    }

    private int getPredecessor(int i2) {
    }

    private void setPredecessor(int i2, int i3) {
    }

    private void setSucceeds(int i2, int i3) {
    }

    private void setSuccessor(int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i2, float f2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i2, K k2, V v, int i3) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i2) {
    }

    public CompactLinkedHashMap(int i2) {
    }

    public CompactLinkedHashMap(int i2, float f2, boolean z) {
    }
}
