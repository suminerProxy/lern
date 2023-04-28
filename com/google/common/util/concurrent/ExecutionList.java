package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExecutionList {
    private static final Logger log = null;
    @GuardedBy("this")
    private boolean executed;
    @NullableDecl
    @GuardedBy("this")
    private RunnableExecutorPair runnables;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RunnableExecutorPair {
        public final Executor executor;
        @NullableDecl
        public RunnableExecutorPair next;
        public final Runnable runnable;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
    }

    public void add(Runnable runnable, Executor executor) {
    }

    public void execute() {
    }
}
