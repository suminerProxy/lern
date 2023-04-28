package com.google.android.exoplayer2.util;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
    }

    public synchronized void block() throws InterruptedException {
    }

    public synchronized void blockUninterruptible() {
    }

    public synchronized boolean close() {
    }

    public synchronized boolean isOpen() {
    }

    public synchronized boolean open() {
    }

    public ConditionVariable(Clock clock) {
    }

    public synchronized boolean block(long timeoutMs) throws InterruptedException {
    }
}
