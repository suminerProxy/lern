package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExecutionSequencer {
    private final AtomicReference<ListenableFuture<Object>> ref;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1<T> implements AsyncCallable<T> {
        public final /* synthetic */ ExecutionSequencer this$0;
        public final /* synthetic */ Callable val$callable;

        public AnonymousClass1(ExecutionSequencer executionSequencer, Callable callable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2<T> implements AsyncCallable<T> {
        public final /* synthetic */ ExecutionSequencer this$0;
        public final /* synthetic */ AsyncCallable val$callable;
        public final /* synthetic */ AtomicReference val$runningState;

        public AnonymousClass2(ExecutionSequencer executionSequencer, AtomicReference atomicReference, AsyncCallable asyncCallable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Executor {
        public final /* synthetic */ ExecutionSequencer this$0;
        public final /* synthetic */ Executor val$executor;
        public final /* synthetic */ ListenableFuture val$oldFuture;

        public AnonymousClass3(ExecutionSequencer executionSequencer, ListenableFuture listenableFuture, Executor executor) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ExecutionSequencer this$0;
        public final /* synthetic */ SettableFuture val$newFuture;
        public final /* synthetic */ ListenableFuture val$oldFuture;
        public final /* synthetic */ ListenableFuture val$outputFuture;
        public final /* synthetic */ AtomicReference val$runningState;
        public final /* synthetic */ ListenableFuture val$taskFuture;

        public AnonymousClass4(ExecutionSequencer executionSequencer, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, AtomicReference atomicReference, SettableFuture settableFuture, ListenableFuture listenableFuture3) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RunningState {
        private static final /* synthetic */ RunningState[] $VALUES = null;
        public static final RunningState CANCELLED = null;
        public static final RunningState NOT_RUN = null;
        public static final RunningState STARTED = null;

        private RunningState(String str, int i2) {
        }

        public static RunningState valueOf(String str) {
        }

        public static RunningState[] values() {
        }
    }

    private ExecutionSequencer() {
    }

    public static ExecutionSequencer create() {
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
    }
}
