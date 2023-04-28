package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {
    private final ExecutionList executionList;

    public ListenableFutureTask(Callable<V> callable) {
    }

    public static <V> ListenableFutureTask<V> create(Callable<V> callable) {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
    }

    public static <V> ListenableFutureTask<V> create(Runnable runnable, @NullableDecl V v) {
    }

    public ListenableFutureTask(Runnable runnable, @NullableDecl V v) {
    }
}
