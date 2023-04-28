package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    @VisibleForTesting
    public transient long[] links;

    public ObjectCountLinkedHashMap() {
    }

    public static <K> ObjectCountLinkedHashMap<K> create() {
    }

    public static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i2) {
    }

    private int getPredecessor(int i2) {
    }

    private int getSuccessor(int i2) {
    }

    private void setPredecessor(int i2, int i3) {
    }

    private void setSucceeds(int i2, int i3) {
    }

    private void setSuccessor(int i2, int i3) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i2, float f2) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i2, K k2, int i3, int i4) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i2) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i2) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i2, int i3) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i2) {
    }

    public ObjectCountLinkedHashMap(int i2) {
    }

    public ObjectCountLinkedHashMap(int i2, float f2) {
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
    }
}
