package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.FlagSet;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<ListenerHolder<T>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Event<T> {
        void invoke(T listener);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface IterationFinishedEvent<T> {
        void invoke(T listener, FlagSet eventFlags);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ListenerHolder<T> {
        private FlagSet.Builder flagsBuilder;
        @Nonnull
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(@Nonnull T listener) {
        }

        public boolean equals(@Nullable Object other) {
        }

        public int hashCode() {
        }

        public void invoke(int eventFlag, Event<T> event) {
        }

        public void iterationFinished(IterationFinishedEvent<T> event) {
        }

        public void release(IterationFinishedEvent<T> event) {
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
    }

    public static /* synthetic */ boolean a(ListenerSet listenerSet, Message message) {
    }

    public static /* synthetic */ void b(CopyOnWriteArraySet copyOnWriteArraySet, int i2, Event event) {
    }

    private boolean handleMessage(Message message) {
    }

    public void add(T listener) {
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
    }

    public void flushEvents() {
    }

    public void queueEvent(int eventFlag, Event<T> event) {
    }

    public void release() {
    }

    public void remove(T listener) {
    }

    public void sendEvent(int eventFlag, Event<T> event) {
    }

    public int size() {
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T>> listeners, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
    }
}
