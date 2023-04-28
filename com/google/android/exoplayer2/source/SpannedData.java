package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SpannedData<V> {
    private int memoizedReadIndex;
    private final Consumer<V> removeCallback;
    private final SparseArray<V> spans;

    public SpannedData() {
    }

    public static /* synthetic */ void a(Object obj) {
    }

    public void appendSpan(int startKey, V value) {
    }

    public void clear() {
    }

    public void discardFrom(int discardFromKey) {
    }

    public void discardTo(int discardToKey) {
    }

    public V get(int key) {
    }

    public V getEndValue() {
    }

    public boolean isEmpty() {
    }

    public SpannedData(Consumer<V> removeCallback) {
    }
}
