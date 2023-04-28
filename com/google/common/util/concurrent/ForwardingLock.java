package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingLock implements Lock {
    public abstract Lock delegate();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
    }
}
