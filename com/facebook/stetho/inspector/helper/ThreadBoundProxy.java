package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ThreadBoundProxy implements ThreadBound {
    private final ThreadBound mEnforcer;

    public ThreadBoundProxy(ThreadBound threadBound) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final boolean checkThreadAccess() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postDelayed(Runnable runnable, long j2) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void removeCallbacks(Runnable runnable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void verifyThreadAccess() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postAndWait(Runnable runnable) {
    }
}
