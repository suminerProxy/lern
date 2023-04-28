package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Callables {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<T> implements Callable<T> {
        public final /* synthetic */ Object val$value;

        public AnonymousClass1(Object obj) {
        }

        @Override // java.util.concurrent.Callable
        public T call() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<T> implements AsyncCallable<T> {
        public final /* synthetic */ Callable val$callable;
        public final /* synthetic */ ListeningExecutorService val$listeningExecutorService;

        public AnonymousClass2(ListeningExecutorService listeningExecutorService, Callable callable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.util.concurrent.Callables$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<T> implements Callable<T> {
        public final /* synthetic */ Callable val$callable;
        public final /* synthetic */ Supplier val$nameSupplier;

        public AnonymousClass3(Supplier supplier, Callable callable) {
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Callables$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Supplier val$nameSupplier;
        public final /* synthetic */ Runnable val$task;

        public AnonymousClass4(Supplier supplier, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Callables() {
    }

    public static /* synthetic */ boolean access$000(String str, Thread thread) {
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(Callable<T> callable, ListeningExecutorService listeningExecutorService) {
    }

    public static <T> Callable<T> returning(@NullableDecl T t) {
    }

    @GwtIncompatible
    public static <T> Callable<T> threadRenaming(Callable<T> callable, Supplier<String> supplier) {
    }

    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
    }

    @GwtIncompatible
    public static Runnable threadRenaming(Runnable runnable, Supplier<String> supplier) {
    }
}
