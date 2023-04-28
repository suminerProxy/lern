package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
    }

    private void addUnchecked(long timestamp, V value) {
    }

    private void clearBufferOnTimeDiscontinuity(long timestamp) {
    }

    private void doubleCapacityIfFull() {
    }

    private static <V> V[] newArray(int length) {
    }

    @Nullable
    private V popFirst() {
    }

    public synchronized void add(long timestamp, V value) {
    }

    public synchronized void clear() {
    }

    @Nullable
    public synchronized V poll(long timestamp) {
    }

    @Nullable
    public synchronized V pollFirst() {
    }

    @Nullable
    public synchronized V pollFloor(long timestamp) {
    }

    public synchronized int size() {
    }

    public TimedValueQueue(int initialBufferSize) {
    }

    @Nullable
    private V poll(long timestamp, boolean onlyOlder) {
    }
}
