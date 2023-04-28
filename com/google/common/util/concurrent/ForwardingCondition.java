package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingCondition implements Condition {
    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j2) throws InterruptedException {
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
    }

    public abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j2, TimeUnit timeUnit) throws InterruptedException {
    }
}
