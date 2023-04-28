package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ListenerCallQueue<L> {
    private static final Logger logger = null;
    private final List<PerListenerQueue<L>> listeners;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Event<L> {
        void call(L l2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PerListenerQueue<L> implements Runnable {
        public final Executor executor;
        @GuardedBy("this")
        public boolean isThreadScheduled;
        @GuardedBy("this")
        public final Queue<Object> labelQueue;
        public final L listener;
        @GuardedBy("this")
        public final Queue<Event<L>> waitQueue;

        public PerListenerQueue(L l2, Executor executor) {
        }

        public synchronized void add(Event<L> event, Object obj) {
        }

        public void dispatch() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ Logger access$000() {
    }

    private void enqueueHelper(Event<L> event, Object obj) {
    }

    public void addListener(L l2, Executor executor) {
    }

    public void dispatch() {
    }

    public void enqueue(Event<L> event) {
    }

    public void enqueue(Event<L> event, String str) {
    }
}
