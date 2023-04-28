package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class JdkFutureAdapters {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        private static final Executor defaultAdapterExecutor = null;
        private static final ThreadFactory threadFactory = null;
        private final Executor adapterExecutor;
        private final Future<V> delegate;
        private final ExecutionList executionList;
        private final AtomicBoolean hasListeners;

        /* renamed from: com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ListenableFutureAdapter this$0;

            public AnonymousClass1(ListenableFutureAdapter listenableFutureAdapter) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public ListenableFutureAdapter(Future<V> future) {
        }

        public static /* synthetic */ Future access$000(ListenableFutureAdapter listenableFutureAdapter) {
        }

        public static /* synthetic */ ExecutionList access$100(ListenableFutureAdapter listenableFutureAdapter) {
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public ListenableFutureAdapter(Future<V> future, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public Future<V> delegate() {
        }
    }

    private JdkFutureAdapters() {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
    }
}
