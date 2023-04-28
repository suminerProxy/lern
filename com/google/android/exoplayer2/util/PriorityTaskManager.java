package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.PriorityQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PriorityTaskManager {
    private int highestPriority;
    private final Object lock;
    private final PriorityQueue<Integer> queue;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int priority, int highestPriority) {
        }
    }

    public void add(int priority) {
    }

    public void proceed(int priority) throws InterruptedException {
    }

    public boolean proceedNonBlocking(int priority) {
    }

    public void proceedOrThrow(int priority) throws PriorityTooLowException {
    }

    public void remove(int priority) {
    }
}
