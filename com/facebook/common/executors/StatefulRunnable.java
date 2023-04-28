package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class StatefulRunnable<T> implements Runnable {
    public static final int STATE_CANCELLED = 2;
    public static final int STATE_CREATED = 0;
    public static final int STATE_FAILED = 4;
    public static final int STATE_FINISHED = 3;
    public static final int STATE_STARTED = 1;
    public final AtomicInteger mState;

    public void cancel() {
    }

    public void disposeResult(@Nullable T result) {
    }

    @Nullable
    public abstract T getResult() throws Exception;

    public void onCancellation() {
    }

    public void onFailure(Exception e2) {
    }

    public void onSuccess(@Nullable T result) {
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
